package com.suyad.Responses;

import java.util.Date;

import lombok.Data;

@Data
public class ResponseData
{
	private String name;
	private Date dob;
	private String gender;
	private Long ssn;
	private String state;
}
