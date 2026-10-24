package com.nit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerOperationController {
	
	/*
	 * @GetMapping("/report/{cno}/{cname}") public ResponseEntity<String>
	 * showReportByData(@PathVariable("cno") Integer no,@PathVariable("cname")
	 * String name){
	 * System.out.println("CustomerOperationController.showReportByData()"+no+
	 * "....."+name);
	 * 
	 * return new ResponseEntity<String>("params: "+no+"..."+name,HttpStatus.OK);
	 * 
	 * 
	 * }
	 */
	@GetMapping("/report/{no}/{name}")
	public ResponseEntity<String> showReportByData(@PathVariable Integer no,@PathVariable String name){
		System.out.println("CustomerOperationController.showReportByData()"+no+"....."+name);
		
		return new ResponseEntity<String>("params: "+no+"..."+name,HttpStatus.OK);
		
		
	} 

}
