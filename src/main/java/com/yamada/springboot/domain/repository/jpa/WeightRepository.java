package com.yamada.springboot.domain.repository.jpa;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.yamada.springboot.domain.model.Weight;

@Repository
public interface WeightRepository extends JpaRepository<Weight, Long> {
	List<Weight> findByUserIdOrderByRecordDate(Long userId);
	
	@Query(value = "SELECT user_id FROM weights WHERE id = ?1", nativeQuery=true)
	Long getUserIdById(Long id);
	
	Boolean existsByRecordDate(Date recordDate);
}