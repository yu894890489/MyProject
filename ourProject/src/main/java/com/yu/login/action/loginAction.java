package com.yu.login.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class loginAction {
	@RequestMapping("getLogin")
	@ResponseBody
	public ModelAndView getLogin(){
		return null;
	}
}
