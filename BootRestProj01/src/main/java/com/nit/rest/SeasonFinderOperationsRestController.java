package com.nit.rest;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeasonFinderOperationsRestController {

	@GetMapping("/display")
	 public ResponseEntity<String> showSeasonName(){
		 
		 System.out.println("SeasonFinderOperationsRestController.showSeasonName()");
		 
		 LocalDate date=LocalDate.now();
		 
		 int month=date.getMonthValue();
		 String seasonName=null;
		 if(month>=3 &&month<=6) {
			 seasonName="Summer Season";
		 }else if (month>=7 && month<=10) {
			 seasonName="Rainy Season";
			 
		 }else {
			 seasonName="Winter Season";
		 }
		 return new ResponseEntity<String>(seasonName,HttpStatus.OK );
	 }
}
