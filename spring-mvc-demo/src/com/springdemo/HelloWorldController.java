package com.springdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm()
	{	
		return "helloworld-form";	
	}
	
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String letshoutdude(HttpServletRequest request,Model model) {
		
		//Read the request parameter from the HTML form
		String theName=request.getParameter("studentName");
		
		
		//convert data to all caps
		theName=theName.toUpperCase();
		
		//Create message
     	String result="yo! "+theName;
		
		//add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
		
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName,Model model) {
		
		//Read the request parameter from the HTML form
	///	String theName=request.getParameter("studentName");
		
		
		//convert data to all caps
		theName=theName.toUpperCase();
		
		//Create message
     	String result="Hey my friend "+theName;
		
		//add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
		
	}
	
	
}
