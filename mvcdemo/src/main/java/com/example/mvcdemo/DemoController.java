package com.example.mvcdemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
	
	List<Employee> employees= new ArrayList<>();
	
	public DemoController() {
		Employee emp1 =new Employee("1001","praveen","finance");
		Employee emp2 =new Employee("1002","kumar","quality");
		Employee emp3 =new Employee("1003","anil","operations");
		Employee emp4 =new Employee("1004","pavan","quality");
		employees.add(emp1);employees.add(emp2);employees.add(emp3); employees.add(emp4);
	}
	
	@GetMapping("/")
	public String login() {
		return "login";
	}
	
	@PostMapping("/validate")
	public String validate(@RequestParam String uname, @RequestParam String pwd) {
		
		if(uname.equals("admin") && pwd.equals("admin"))
			return "dashboard";
		else
			return "login";
	}
	
	@RequestMapping("/showRegPage")
	public String register()
	{
		return "register";
	}
	
	
	//@RequestMapping(value="/register", method=RequestMethod.POST)
	@PostMapping("/register")
	public String register1(@RequestParam String eid,@RequestParam String ename,
			@RequestParam String edept, Model model)
	{
		Employee emp = new Employee(eid,ename,edept);
		employees.add(emp);
		model.addAttribute("employees",employees);
		return "display";
	}
	
	//@RequestMapping(value="/test1", method=RequestMethod.GET)
	@GetMapping("/test1")
	public String test(Model model) {
		return "test";
	}
	
	//@RequestMapping(value="/login", method=RequestMethod.GET)
	@GetMapping("/display")
	public ModelAndView display() {
		
		
		return new ModelAndView("display","employees",employees);
	}
	
	//@RequestMapping(value="/logout/{name}", method=RequestMethod.GET)
	@GetMapping("/logout/{name}")
	public String logout(@PathVariable String name, Model model) {
		model.addAttribute("user",name);
		return "logout";
	}

}
