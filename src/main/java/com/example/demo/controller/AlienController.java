package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Alien;
import com.example.demo.repository.AlienRepo;

@Controller
public class AlienController {
	 @Autowired
	 AlienRepo repo;
	 @RequestMapping("/")
	 public String home()
	 {
	 return "home.jsp";
	 }
	 @RequestMapping("/addAlien")
	 public String addAlien(Alien alien)
	 {	 
		 repo.save(alien);
         return "home.jsp";

	 }

}
