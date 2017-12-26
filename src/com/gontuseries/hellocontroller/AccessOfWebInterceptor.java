package com.gontuseries.hellocontroller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AccessOfWebInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse resp, Object handler) throws Exception {
		Calendar cal = Calendar.getInstance();
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

		if (dayOfWeek == 1) {
			resp.getWriter().write("Website is not accessible in Wed");
			return false;
		}

		return true;
	}

	// @Override
	// public void postHandle(HttpServletRequest request,
	// HttpServletResponse response, Object handler,
	// ModelAndView modelAndView) throws Exception {
	// System.out.println("Post-handle");
	// }
	//
	// @Override
	// public void afterCompletion(HttpServletRequest request,
	// HttpServletResponse response, Object handler, Exception ex)
	// throws Exception {
	// System.out.println("After completion handle");
	// }

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out
				.println("HandlerInterceptor: Spring MVC called postHandle method for"
						+ request.getRequestURI().toString());
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out
				.println("HandlerInterceptor: Spring MVC called afterCompletion method for"
						+ request.getRequestURI().toString());

	}

	// @Override
	// public void afterCompletion(HttpServletRequest request,
	// HttpServletResponse response, Object handler, Exception ex)
	// throws Exception {
	// System.out.println("After completion handle");
	// }

}
