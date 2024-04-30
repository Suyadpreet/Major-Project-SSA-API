package com.suyad.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.suyad.Entities.CustomerData;
import com.suyad.Responses.ResponseData;

@RestController
public class SSNController 
{
	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcome()
	{
		return new ResponseEntity<>("Welcome to SSN",HttpStatus.CREATED);
	}
	@PostMapping("/getState")
	public ResponseEntity<ResponseData> getStat(@RequestBody CustomerData d)
	{
		ResponseData r = new ResponseData();
		BeanUtils.copyProperties(d, r);
		String ls = d.getSsn().toString();		
		if('1'==ls.charAt(0))
		{
			r.setState("New Jersey");
		}
		else if('2'==ls.charAt(0))
		{
			r.setState("Ohio");
		}
		else if('3'==ls.charAt(0))
		{
			r.setState("Texas");
		}
		else if('4'==ls.charAt(0))
		{
			r.setState("California");
		}
		else if('5'==ls.charAt(0))
		{
			r.setState("Rhode Island");
		}
		else if('6'==ls.charAt(0))
		{
			r.setState("Kenttucky");
		}
		else
		{
			r.setState("Invalid SSN");
		}
		
		return new ResponseEntity<>(r,HttpStatus.CREATED);
	}
}
