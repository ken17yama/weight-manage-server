package com.yamada.springboot.domain.repository.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yamada.springboot.domain.model.Weight;

@Repository
public interface WeightRepository extends JpaRepository<Weight, Long> {
	List<Weight> findByUserId(Integer userId);

	Boolean existsByUserId(Integer userId);
}