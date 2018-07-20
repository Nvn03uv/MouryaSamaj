package com.bussiness.logic.mouryasamaj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MouryaSamajController {
	@RequestMapping("/")
	public String index() {
		return "index";
	}

}
