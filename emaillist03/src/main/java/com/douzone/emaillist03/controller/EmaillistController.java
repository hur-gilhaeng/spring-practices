package com.douzone.emaillist03.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;

import com.douzone.emaillist03.repository.EmaillistRepository;
import com.douzone.emaillist03.vo.EmaillistVo;

@Controller
public class EmaillistController {
	
	@Autowired
	private EmaillistRepository emaillistRepository;
	
	//@ResponseBody
	@RequestMapping("")
	public String index(Model model) {
		List<EmaillistVo> list = emaillistRepository.findAll();
		model.addAttribute("list",list);
		return "index";
	}
	
	@RequestMapping(value ="/add", method = RequestMethod.GET)
	public String add() {
		return "add";
	}
	
	@RequestMapping(value ="/add", method = RequestMethod.POST)
	public String add(EmaillistVo vo) {
		emaillistRepository.insert(vo);
		return "redirect:/";
	}
}
