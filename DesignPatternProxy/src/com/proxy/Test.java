package com.proxy;

interface InternetAccess {
    public void grantInternetAccessToEmployees();
}  

class EmployeeInternetAccess implements InternetAccess {
    private String employeeName;

    @Override
    public void grantInternetAccessToEmployees() {
        System.out.println("Internet Access granted for employee: " + employeeName);
    }
    public EmployeeInternetAccess(String empName) {
        this.employeeName = empName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}

class ProxyEmployeeInternetAccess implements InternetAccess {
    private String employeeName;
    private EmployeeInternetAccess employeeInternetAccess;

    public ProxyEmployeeInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void grantInternetAccessToEmployees() {
        if (getRole(employeeName) > 4) {
            employeeInternetAccess = new EmployeeInternetAccess(employeeName);
            employeeInternetAccess.grantInternetAccessToEmployees();
        } else {
            System.out.println("No Internet access granted. Your job level is below 5");
        }
    }
    public int getRole(String empName) {
        //make a DB call to get the employee role and return it.
        return 31;
    }
}

public class Test {
	 public static final String EMPLOYEE_NAME = "Aayush Sharma";

	    public static void main(String[] args) {
	        InternetAccess internetAccess = new ProxyEmployeeInternetAccess(EMPLOYEE_NAME);
	        internetAccess.grantInternetAccessToEmployees();
	    }

}
