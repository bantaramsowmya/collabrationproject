package com.sowmya.web3.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController 
{
@RequestMapping("/check")
public ResponseEntity<String> checkUrl()
{
    System.out.println("at check method");
    
  
    
     return new ResponseEntity<String>("sowmya",HttpStatus.OK);
}
@GetMapping("/check2")
public ResponseEntity<String> m1()
{
	return new ResponseEntity<String>("swetha",HttpStatus.OK);
}
}
