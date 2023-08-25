package com.kh.emplo;

public class EmployeeController {
	Employee e = new Employee();
	
	public void add(int empNo, String name, char gender,String phone) {
		e = new Employee(empNo, name, gender, phone);
	}
	
	public void add(int empNo, String name, char gender,String phone ,String dept ,int salray, double bonus) {
		e = new Employee(empNo, name, gender, phone, dept, salray, bonus);
	}
	
	public void modify(String phone) {
		e.setPhone(phone);
	}
	public void modify(int salary) {
		e.setSalray(salary);
	}
	public void modify(double bonus) {
		e.setBonus(bonus);
	}
	
	public Employee remove() {
		e.setBonus(0);
		e.setDept(null);
		e.setEmpNo(0);
		e.setGender(' ');
		e.setName(null);
		e.setPhone(null);
		e.setSalray(0);
		return null;
		
	}
	public String inform() {
		return e.printEmployee();
	}
	
}
