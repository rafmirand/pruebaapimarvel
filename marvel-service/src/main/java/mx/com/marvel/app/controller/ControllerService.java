package mx.com.marvel.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import mx.com.consumer.app.service.IConsumeService;
import mx.com.marvel.common.model.Root;

import java.util.*; 
import java.io.*;

@Controller
public class ControllerService {
	
	@Autowired
	private IConsumeService service;
	
	@GetMapping("/getcharacters")
	@ResponseBody
	public Root getCharacteres(){
		return service.getRootCharacteres();
	}
	
		  
}
