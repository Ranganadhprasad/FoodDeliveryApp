package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.BillingAddress;
import com.service.BillAddService;
@RestController
@RequestMapping("/apibill")
public class BillAddressController 
{
	@Autowired
	BillAddService billAddService;
	public BillAddressController(BillAddService billAddService)
	{
		super();
		this.billAddService=billAddService;
	}
	@PostMapping("/addBillingAddress")
	public ResponseEntity<BillingAddress> addBillingAddress(@RequestBody BillingAddress b)
	{
		BillingAddress b1= billAddService.addBillAddress(b);
		ResponseEntity<BillingAddress> bb = new ResponseEntity<BillingAddress>(b1,HttpStatus.OK);
		return bb;	
	}
	@GetMapping("/getbyid/{cid}")
	public ResponseEntity<BillingAddress> getById(@PathVariable int cid) throws Throwable
	{
		BillingAddress b1= billAddService.getById(cid);
		ResponseEntity<BillingAddress> bb=new ResponseEntity<BillingAddress>(b1,HttpStatus.OK);
		return bb;
	}
	@DeleteMapping("deletebyid/{cid}")
	public String deleteBillingAddressById(@PathVariable int cid) throws Throwable
	{
		billAddService.deleteBillAddressById(cid);
		return "Deleted Sucdessfully";
	}
	@DeleteMapping("deleteBillAddress")
	public String deleteBillingAddress(@RequestBody BillingAddress b)
	{
		billAddService.deleteBillAddress(b);
		return "Deleted Sucdessfully";
	}
}
