package com.bhavna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bhavna.bean.Department;
import com.bhavna.service.DepartmentService;
@RestController
public class DepartmentController {
	@Autowired
	private DepartmentService service;
	
	@RequestMapping("/display")
	public String display() {
		String message = "Hello world";
		return message;
	}
	
	@RequestMapping(value= "/addemployee",method=RequestMethod.POST)
	public String addDepartment(@RequestBody Department department) {
		String message = service.addDepartment(department);
		return message;
	}
}
