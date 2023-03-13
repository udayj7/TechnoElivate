package com.prototype;


import java.util.ArrayList;
import java.util.List;

class Students implements Cloneable {

	private List<String> studentList;
	
	public Students() {
		studentList = new ArrayList<>();
	}
	
	public Students(List<String> list) {
		this.studentList=list;
	}

	public void loadData() {
		//read all employees from database and put into the list
		studentList.add("Pankaj");
		studentList.add("Raj");
		studentList.add("David");
		studentList.add("Lisa");
	}
	
	public List<String> getEmpList(){
		return studentList;
	}
	
	public Object clone() throws CloneNotSupportedException{
		List<String> temp = new ArrayList<>();
		for(String s:this.getEmpList()) {
			temp.add(s);
		}
		return new Students(temp);
	}
} 

public class PrototypeStudentsPatternTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Students students = new Students();
		students.loadData();
		System.out.println("Students List: "+ students.getEmpList());
		
		//Use the clone method to get the Employee object
		Students studentsNew1 = (Students) students.clone();
		Students studentsNew2 = (Students) students.clone();
		
		
		List<String> list1 = studentsNew1.getEmpList();
		list1.add("John");
		System.out.println("Students List New1: "+list1);
		
		List<String> list2 = studentsNew1.getEmpList();
		list2.add("Dimple");
		System.out.println("Students List New2: "+list2);
		
		
		List<String> list3 = studentsNew2.getEmpList();
		list2.remove("Pankaj");
		System.out.println("Students List New3: "+list3);
	}

}
 