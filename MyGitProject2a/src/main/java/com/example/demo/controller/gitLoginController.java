package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class gitLoginController {

	@RequestMapping(path = "/gitpralogin", method = RequestMethod.GET)
	public String doLoginGet() {

		return "gitLogin";
	}

	@RequestMapping(path = "/gitlogin", method = RequestMethod.POST)
	public String doLoginPost() {

		//if ("kokuri".equals(parameter1) && "1920".equals(parameter2))

		return "gitLogin";
	}

}
