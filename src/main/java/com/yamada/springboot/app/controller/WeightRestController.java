package com.yamada.springboot.app.controller;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yamada.springboot.app.common.payload.request.WeightRequest;
import com.yamada.springboot.app.common.security.jwt.JwtUtils;
import com.yamada.springboot.app.common.security.services.UserDetailsImpl;
import com.yamada.springboot.domain.model.Weight;
import com.yamada.springboot.domain.repository.jpa.WeightRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class WeightRestController {

	@Autowired
	WeightRepository weightRepository;


	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired
	JwtUtils jwtUtils;

	@GetMapping("/api")
	public String getHello(){		
		return "Hello!";
	}

	@GetMapping("/api/weight")
	public List<Weight> getUserWeight() {
		Authentication authentication = SecurityContextHolder.getContext()
				.getAuthentication();
		UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
		Long userId = userDetails.getId();

		List<Weight> list = weightRepository.findByUserIdOrderByRecordDate(userId);

		return list;
	}

	@PostMapping("/api/weight")
	public String postUserWeight(@Valid @RequestBody WeightRequest weightRequest) {
		Authentication authentication = SecurityContextHolder.getContext()
				.getAuthentication();
		UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
		Long userId = userDetails.getId();

		if (weightRepository.existsByRecordDate(weightRequest.getRecordDate())) {
			return "exist RecordDate...";
		}else {
			Weight weight = new Weight();
			weight.setWeight(weightRequest.getWeight());
			weight.setBodyFat(weightRequest.getBodyFat());
			weight.setSubcutaneousFat(weightRequest.getSubcutaneousFat());
			weight.setRecordDate(weightRequest.getRecordDate());
			weight.setUserId(userId);

			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			weight.setCreatedAt(timestamp);
			weight.setUpdatedAt(timestamp);

			weightRepository.save(weight);

			return "Successful";
		}
	}

	@PutMapping("/api/weight/{weightId}")
	public String putUserWeight(@PathVariable("weightId") Long weightId, @Valid @RequestBody WeightRequest weightRequest) {
		Authentication authentication = SecurityContextHolder.getContext()
				.getAuthentication();
		UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
		Long userId = userDetails.getId();

		Optional<Weight> reqWeight = weightRepository.findById(weightId);
		Long reqUserId = reqWeight.get().getUserId();

		if (userId == reqUserId) {
			Weight weight = new Weight();
			weight.setId(weightId);
			weight.setWeight(weightRequest.getWeight());
			weight.setBodyFat(weightRequest.getBodyFat());
			weight.setSubcutaneousFat(weightRequest.getSubcutaneousFat());
			weight.setRecordDate(weightRequest.getRecordDate());
			weight.setUserId(userId);

			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			weight.setCreatedAt(reqWeight.get().getCreatedAt());
			weight.setUpdatedAt(timestamp);

			weightRepository.save(weight);
			return "Successful";
		}else {
			return "It's not your record...";
		}
	}
	
	@DeleteMapping("/api/weight/{weightId}")
	public String deleteUserWeight(@PathVariable("weightId") Long weightId) {
		Authentication authentication = SecurityContextHolder.getContext()
				.getAuthentication();
		UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
		Long userId = userDetails.getId();
		Long reqUserId = weightRepository.getUserIdById(weightId);
		
		if (userId == reqUserId) {
			weightRepository.deleteById(weightId);
			return "Successful";
		}else {
			return "It's not your record...";
		}

	}

}
