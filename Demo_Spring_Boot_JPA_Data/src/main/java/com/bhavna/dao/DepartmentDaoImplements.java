package com.bhavna.dao;

import java.util.ArrayList;
import java.util.List;

import com.bhavna.bean.Department;

public class DepartmentDaoImplements {
	public String display() {
		return "Message from dao";
	}
	
	public Department getDepartment() {
		Department dept = new Department(101,"HR",100);
		return dept;
	}
	
	public List<Department> getAllDepartment() {
		Department dept1 = new Department(101,"HR",100);
		Department dept2 = new Department(102,"DEV",400);
		Department dept3 = new Department(103,"QA",200);
		Department dept4 = new Department(104,"FINANCE",50);
		
		List<Department> list = new ArrayList<Department>();
		list.add(dept1);
		list.add(dept2);
		list.add(dept3);
		list.add(dept4);
		
		return list;

	}
	
	public Department findEmployee() {
		Department dept = new Department(101,"HR",100);
		return dept;
	}
	
	public Department addEmployee(Department dept) {
		Department department = new Department(101,"HR",100);
		department.setId(department.getId());
		department.setName(department.getName());
		department.setNoOfStaff(department.getNoOfStaff());
		return department;
	}
}
