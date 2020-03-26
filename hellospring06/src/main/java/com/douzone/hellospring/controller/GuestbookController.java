package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * @RequestMapping
 * Class 단독 매핑
 */

@Controller
@RequestMapping("/guestbook")
public class GuestbookController {
	
	@ResponseBody
	@RequestMapping("/list") // 매핑지정
	public String list() {
		return "GuestbookController:list";
	}
	@ResponseBody
	@RequestMapping("/delete") // 매핑지정
	public String delete() {
		return "GuestbookController:delete";
	}
}
