package com.gontuseries.hellocontroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {

	@RequestMapping(value = "/adminForm.html", method = RequestMethod.GET)
	public ModelAndView getForm() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("form");
		return mv;
	}

	@RequestMapping(value = "/submitForm.html", method = RequestMethod.POST)
	public ModelAndView submitForm(@RequestParam Map<String, String> reqPar) {
		String name = reqPar.get("userName");
		String course = reqPar.get("userCourse");

		Student st = new Student();
		st.setStudentName(name);
		st.setStudentCourse(course);

		ModelAndView mv = new ModelAndView();
		mv.addObject("studentInfo", st);
		mv.addObject("headerObject", "Success!!!");
		mv.setViewName("submitForm");
		return mv;
	}

	@RequestMapping(value = "/submitFormModel.html", method = RequestMethod.POST)
	public ModelAndView submitFormModel(
			@ModelAttribute("studentInfo") Student studentInfo) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("submitForm");

		// mv.addObject("studentInfo", st);
//		mv.addObject("headerObject","Success!!! using ModelAttribute Annotation");
		return mv;
	}

	@ModelAttribute
	public void addObjectModel(Model mv) {
		mv.addAttribute("headerObject", "Using @modelAttribute annotation");
	}

}
