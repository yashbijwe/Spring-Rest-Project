package com.nit.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nit.model.Company;
import com.nit.model.Employee;

@RestController
public class CompanyOperationsrestController {

	@PostMapping("/register")
	public ResponseEntity<String> registerCompany(@RequestBody Company company) {
		System.out.println("CompanyOperationsrestController.registerCompany()");
		return new ResponseEntity<String>("Company is Register" + company, HttpStatus.CREATED);
	}
	@PostMapping("/registerEmployee")
	public ResponseEntity<String> registerEmployee(@RequestBody Employee emp) {
		System.out.println("CompanyOperationsrestController.registerEmployee()");
		return new ResponseEntity<String>("Company is Register" + emp, HttpStatus.CREATED);
	}
	
	@PostMapping("/registerCompanies")
	public ResponseEntity<String> registerMultipleCompany(@RequestBody List<Company> list){
		System.out.println("CompanyOperationsrestController.registerMultipleCompany()");
		
		return new ResponseEntity<>(list.size()+"Companies are Register"+list,HttpStatus.OK);
	}
}
