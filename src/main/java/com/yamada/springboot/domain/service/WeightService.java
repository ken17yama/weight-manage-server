package com.yamada.springboot.domain.service;

import java.util.List;

import com.yamada.springboot.domain.model.Weight;

public interface WeightService {
	
	public boolean insertOne(Weight weight);
	
	public List<Weight> selectMany(Integer userId);
	
	public boolean updateOne(Weight weight);
	
	public boolean deleteOne(Integer weightId);

}
