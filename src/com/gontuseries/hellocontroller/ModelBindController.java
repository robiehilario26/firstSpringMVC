package com.gontuseries.hellocontroller;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModelBindController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() throws Exception {
		String exceptionOccured = "NULL_POINTER1";

		if (exceptionOccured.equalsIgnoreCase("NULL_POINTER")) {
			throw new NullPointerException("NullPointerException");
		} else if (exceptionOccured.equalsIgnoreCase("IO_EXCEPTION")) {
			throw new IOException("IOException");
		}

		ModelAndView mv = new ModelAndView();
		mv.setViewName("Student");
		return mv;
	}

	@RequestMapping(value = "/studentForm.html", method = RequestMethod.GET)
	public ModelAndView generateForm() throws Exception {

		String exceptionOccured = "HAHAHAHA1";

		if (exceptionOccured.equalsIgnoreCase("NULL_POINTER")) {
			throw new NullPointerException("Null Pointer Exception");
		} else if (exceptionOccured.equalsIgnoreCase("IO_EXCEPTION")) {
			throw new IOException("IO Exception");
		}
		else if(exceptionOccured.equalsIgnoreCase("HAHAHAHA"))
		{
			throw new Exception("HAHAHAHA");
		}

		ModelAndView mv = new ModelAndView();
		mv.setViewName("Student");
		return mv;
	}

	@RequestMapping(value = "/studentFormSubmit.html", method = RequestMethod.POST)
	public ModelAndView submitStudentForm(
			@Valid @ModelAttribute("sf") StudentForm sf, BindingResult bresult) {
		ModelAndView mv = new ModelAndView();
		if (bresult.hasErrors()) {
			mv.setViewName("Student");
			return mv;
		}

		mv.setViewName("StudentForm");
		return mv;
	}

	@InitBinder
	public void initializeBinder(WebDataBinder bind) {
		// bind.setDisallowedFields(new String[] {"sNum"});
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		bind.registerCustomEditor(Date.class, "sDate", new CustomDateEditor(
				dateFormat, false));
		bind.registerCustomEditor(String.class, "sName",
				new StudentNameFormatter());

	}

//	@ExceptionHandler(value = NullPointerException.class)
//	public String handleNullPointerException(Exception e) {
//		System.out.println("Unknown Exception found " + e);
//		return "NullPointerException";
//
//	}
//
//	@ExceptionHandler(value = IOException.class)
//	public String handleIOException(Exception e) {
//
//		System.out.println("Unknow IO Exception found " + e);
//		return "IOException";
//
//	}
//
//	@ExceptionHandler(value = Exception.class)
//	public String handleException(Exception e) {
//		System.out.println("Unknow Exception found: " + e);
//		return "Exception";
//	}
	
	
}
