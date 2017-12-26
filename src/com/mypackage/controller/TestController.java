package com.mypackage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	@RequestMapping(value = "/myController", method = RequestMethod.GET)
	public ModelAndView myTest() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Student");
		return mv;

	}
}
