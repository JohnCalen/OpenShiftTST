package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class _Controller
{
	@RequestMapping("/")
	public String hello()
	{
		return "Hello";
	}

	@RequestMapping
	(
		value = "/2222",
		method = RequestMethod.GET,
		produces = "application/json"
	)
	public Integer getInt(@RequestParam("int") Integer integer)
	{
		return new Integer(integer * 9);
	}
}
