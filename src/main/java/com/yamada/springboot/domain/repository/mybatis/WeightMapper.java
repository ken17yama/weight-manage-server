package com.yamada.springboot.domain.repository.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yamada.springboot.domain.model.Weight;

@Mapper
public interface WeightMapper {
	
	public boolean insertOne(Weight weight);
	
	public List<Weight> selectMany(Integer userId);
	
	public boolean updateOne(Weight weight);
	
	public boolean deleteOne(Integer weightId);

}
