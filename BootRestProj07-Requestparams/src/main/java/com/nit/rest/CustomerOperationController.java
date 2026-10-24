package com.nit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerOperationController {
	
	/*
	 * @GetMapping("/report") public ResponseEntity<String>
	 * showReportByData(@RequestParam(required = false) Integer
	 * no,@RequestParam(required = false) String name){
	 * System.out.println("CustomerOperationController.showReportByData()");
	 * 
	 * return new ResponseEntity<String>("params: "+no+"..."+name,HttpStatus.OK);
	 * 
	 * 
	 * }
	 */
	@GetMapping("/report")
	public ResponseEntity<String> showReportByData(@RequestParam(required = false,defaultValue = "1001") Integer no,@RequestParam(required = false,defaultValue = "ramesh") String name){
		System.out.println("CustomerOperationController.showReportByData()");
		
		return new ResponseEntity<String>("params: "+no+"..."+name,HttpStatus.OK);
		
		
	}

}
