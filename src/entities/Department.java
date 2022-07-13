package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
	
	private String name;
	private Integer payDay;
	
	private Address address;
	
	private List<Employee> employee = new ArrayList<>();
	
	public Department() {}

	public Department(String name, Integer payDay, Address address) {
		this.name = name;
		this.payDay = payDay;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPayDay() {
		return payDay;
	}

	public void setPayDay(Integer payDay) {
		this.payDay = payDay;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void addEmployee(Employee emp) {
		employee.add(emp);
	}

	public void removeEmployee(Employee emp) {
		employee.remove(emp);
	}
	
	public String getEmployee() {
		StringBuilder sb = new StringBuilder();
		
		for (Employee e : employee) {
			
			sb.append(String.format("%s %n",e.getName()));
		}
		
		return sb.toString(); 
	}
	
	
	public double payroll() {
		double sum = 0.0;
		
		for (Employee e : employee) {
			sum += e.getSalary();
		}
		return sum;
	}
	
	
}
