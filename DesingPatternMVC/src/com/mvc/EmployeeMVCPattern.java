package com.mvc;

class Employee {

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class EmployeeView {
	void printEmployeeDetails(int id, String name) {
		System.out.println("Student Id: " + id);
		System.out.println("Student Name: " + name);
	}
}

class EmployeeController {
	private Employee model;
	private EmployeeView view;

	public EmployeeController(Employee model, EmployeeView view) {
		this.model = model;
		this.view = view;
	}
	
	public void updateView() {
		view.printEmployeeDetails(model.getId(), model.getName());
	}


	public int getEmployeeId() {
//		return id;
		return model.getId();
	}

	public void setEmployeeId(int id) {
//		this.id = id;
		model.setId(id);
	}

	public String getEmployeeName() {
//		return name;
		return model.getName();
	}

	public void setEmployeeName(String name) {
//		this.name = name;
		model.setName(name);
	}
	
}

public class EmployeeMVCPattern {

	private static Employee getEmployeeFromDatabase() {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Dinga");
		return employee;
	}

	public static void main(String[] args) {
		Employee model = getEmployeeFromDatabase();
		EmployeeView view = new EmployeeView();
		EmployeeController controller = new EmployeeController(model,view);
//		controller.updateView();
		
		controller.setEmployeeName("Vikram");
		controller.updateView();
	}

}
