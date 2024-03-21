package com.main.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CustomerOperationController
{
	 @GetMapping("/getComplexCustomerData")
	 public ResponseEntity<Customer> getCustomerDetails()
	 {
		 Customer cust = new Customer();
		  cust.setCno(1001);
		  cust.setCname("Sukanta");
		  cust.setBillAmt(10000f);
		  cust.setFavColors(new String[] {"Blue","Red","Green","Marron"});
		  cust.setIdDetails(Map.of("aadhar",475363254581l,"pan","MZCPS1641E","voter","XYZ54BBS"));
		  cust.setPhoneNumbers(Set.of(7783889933l,8894999994l,8992882890l));
		  cust.setStudies(List.of("10th","ITI","Diploma","B-Tech"));
		  Company c1 = new Company();
		  c1.setCid(20001);
		  c1.setCname("I-Exceed");
		  c1.setCompanyCode("IXE-77838000");
		  c1.setTotalEmployee(1000);
		  cust.setCompany(c1);
		  
		  Address homeAddress = new Address();
		  homeAddress.setArea("Roopena Agrahara");
		  homeAddress.setCity("Bangalore");
		  homeAddress.setLandmark("Near Neha Passion");
		  homeAddress.setPincode(560068);
		  homeAddress.setPs("Roopena Agrahara");
		  homeAddress.setState("Karnataka");
		  homeAddress.setStretNo("babu reddy road 3rd cross 3rd main");
		  
		  Address officialAddress = new Address();
		  officialAddress.setArea("Marathali Belandur");
		  officialAddress.setCity("Bangalore");
		  officialAddress.setLandmark("Near D-Mart Mall");
		  officialAddress.setPincode(560037);
		  officialAddress.setPs("Belandur");
		  officialAddress.setState("Karnataka");
		  officialAddress.setStretNo("Deloitte tower2");
		  cust.setAddresses(List.of(homeAddress,officialAddress));
		  
		 return new ResponseEntity<Customer>(cust,HttpStatus.OK);
	 }
	 @PostMapping("/register")
	 public ResponseEntity<Customer> registerCustomer(@RequestBody Customer cust)
	 {
		 
		 return new ResponseEntity<Customer>(cust,HttpStatus.OK);
	 }
}
