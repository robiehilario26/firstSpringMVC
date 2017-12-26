package com.gontuseries.hellocontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/welcome/{country}/{user}")
	public ModelAndView helloWorld(@PathVariable java.util.Map<String, String> pv ) {

		String getCname =  pv.get("country");
		String getUname = pv.get("user");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("welcomeMessage", "Spring MVC using Annotation PathVariable Map "+"country: "+getCname +" user: "+ getUname );
		mv.setViewName("HelloPage");

		return mv;

	}

	@RequestMapping("/other/{countryName}/{userName}")
	public ModelAndView otherMap(HttpServletRequest request,
			HttpServletResponse response,
			@PathVariable("userName") String uName,
			@PathVariable("countryName") String countryName) {

		ModelAndView mv = new ModelAndView();
		mv.addObject("welcomeMessage", "Enter user name: " + uName
				+ " country enter: " + countryName);
		mv.setViewName("HelloPage");

		return mv;

	}
}
