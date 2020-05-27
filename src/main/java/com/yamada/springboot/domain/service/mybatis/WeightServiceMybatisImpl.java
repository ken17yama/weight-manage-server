package com.yamada.springboot.domain.service.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yamada.springboot.domain.model.Weight;
import com.yamada.springboot.domain.repository.mybatis.WeightMapper;
import com.yamada.springboot.domain.service.WeightService;

@Transactional
@Service("WeightServiceMybatisImpl")
public class WeightServiceMybatisImpl implements WeightService {
	
	@Autowired
	WeightMapper weightMapper;

	@Override
	public boolean insertOne(Weight weight) {
		return weightMapper.insertOne(weight);
	}
	
	@Override
	public List<Weight> selectMany(Integer userId){
		return weightMapper.selectMany(userId);
	}
	
	@Override
	public boolean updateOne(Weight weight){
		return weightMapper.updateOne(weight);
	}
	
	@Override
	public boolean deleteOne(Integer weightId){
		return weightMapper.deleteOne(weightId);
	}
	

	

}
