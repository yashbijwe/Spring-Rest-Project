package com.nit.rest;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.model.Company;
import com.nit.model.Employee;

@RestController
public class CompanyRestOperationRestController {
	
	@GetMapping("/details")
	public ResponseEntity<Company> showCompanyDetails(){
		Company company=new Company(1001,"HCL","Hyd");
		return new ResponseEntity<Company>(company,HttpStatus.OK);
	}
	
	@GetMapping("/emp-details")
	public ResponseEntity<Employee> showEmployeeDetails(){

	    //create employee data
	    Employee emp = new Employee(
	            1001,
	            "raja",
	            new String[]{"ravi","suresh"},
	            true,
	            List.of("kind","raj"),
	            Set.of(99999999L,88888888L),
	            Map.of("aadhar","454545555454","pan","54545455"),
	            new Company(1001,"HCL","hyd")
	    );

	    return new ResponseEntity<Employee>(emp, HttpStatus.OK);
	}
	
	@GetMapping("/all-companies")
	public ResponseEntity<List<Company>> showAllCompanies(){
		
		Company company=new Company(1001,"HCL","Hyd");
		Company company2=new Company(1002,"infosys","pune");
		Company company3=new Company(1003,"TCS","Nagpur");
		Company company4=new Company(1004,"wipro","delhi");
		
		List<Company> list=List.of(company,company2,company3,company4);
		
		return new ResponseEntity<List<Company>>(list,HttpStatus.OK);
	}

}
