package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.douzone.hellospring.vo.UserVo;

/*
 *  RequestMapping
 *  Class + Method
 */

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping(value = {"/join","/j"}, method = RequestMethod.GET)
	public String join() {
		return "join";
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(UserVo userVo) {
		System.out.println(userVo);
		return "redirect:/";
	}
	
	@ResponseBody
	@RequestMapping(value = "/update")
	public String update(@RequestParam("n") String name) {
		/**
		 * 만약 'n'이라는 이름의 파라미터가 없는경우 400 Bad Rquest 오류발생
		 */
		System.out.println(name);
		return "UserController:update";
	}
	
	@ResponseBody
	@RequestMapping(value = "/update2")
	public String update2(
			@RequestParam(value="n", required=true, defaultValue="") String name,
			@RequestParam(value="a", required=true, defaultValue="0") int age) {
		System.out.println("--"+name+"--"+age+"--");
		return "UserController:update2";
	}
	
}