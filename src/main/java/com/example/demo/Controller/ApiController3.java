package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ApiController3 {
	@Value("${colour}")
	private String yourFavcolour;
	@GetMapping("/col")
	public String getMyFav()
	{
		return "My Favourite colour is "+yourFavcolour;
	}
}