package com.yamada.springboot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.yamada.springboot.domain.model.Weight;
import com.yamada.springboot.domain.service.WeightService;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
public class WeightRestController {
	
	@Autowired
	@Qualifier("WeightServiceMybatisImpl")
	WeightService weightService;
	
	@GetMapping("/api/weight/{userId:.+}")
	public List<Weight> getWeightMany(@PathVariable("userId") Integer userId){
		return weightService.selectMany(userId);
	}
	
	@GetMapping("/api")
	public String getHello(){
		return "Hello!";
	}

}
