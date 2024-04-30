package com.suyad.Entities;

import java.util.Date;

import lombok.Data;

@Data
public class CustomerData
{
	private String name;
	private Date dob;
	private String gender;
	private Long ssn;
	
	
}
