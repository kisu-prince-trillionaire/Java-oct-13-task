package com.bhavna.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhavna.bean.Department;
import com.bhavna.dao.DepartmentDao;
import com.bhavna.entity.DepartmentEntity;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentDao dao;

	public String addDepartment(Department department) {
		DepartmentEntity departmentEntity = new DepartmentEntity();
		
		departmentEntity.setId(department.getId());
		departmentEntity.setName(department.getName());
		departmentEntity.setNoOfStaff(department.getNoOfStaff());
		dao.save(departmentEntity);
		return "Department Added Successfuly";
	}
}
