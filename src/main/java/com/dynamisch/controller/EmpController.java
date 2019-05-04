package com.dynamisch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.dynamisch.model.Employee;
import com.dynamisch.service.EmpService;



@Controller
public class EmpController {

	@Autowired
	EmpService empService;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String register(Model model) {
		model.addAttribute("emp",new Employee());
		return "index";
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public @ResponseBody Employee create(@RequestBody Employee emp) {
		Employee response=empService.create(emp);
		return response; 
	}
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public @ResponseBody List<Employee> list(Model model) {
		List<Employee>emp=empService.getAll();
		return emp;	
	}
	@RequestMapping(value="/edit/{id}",method=RequestMethod.PUT)
	public @ResponseBody Employee edit(@PathVariable("id") int id,@RequestBody Employee emp) {
		Employee empid=empService.find(id);
		empid.setName(emp.getName());
		empid.setPassword(emp.getPassword());
		empid.setGender(emp.getGender());
		empid.setAddress(emp.getAddress());
		Employee response = empService.update(empid);
		return response;	
	}
	@RequestMapping(value="delete/{id}",method=RequestMethod.DELETE)
	public @ResponseBody void delete(@PathVariable("id") int id,Employee emp) {
		empService.delete(emp);	
	}
}
