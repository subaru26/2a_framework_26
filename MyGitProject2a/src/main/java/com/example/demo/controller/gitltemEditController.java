package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class gitltemEditController {

	@RequestMapping(path = "/gititemedit", method = RequestMethod.GET)
	public String eidht(Model model) {
		return "gititemedit";
	}

	@RequestMapping(path = "/gititemedit1", method = RequestMethod.GET)
	public String eidht1(Model model) {
		return "gititemedit1";
	}
}