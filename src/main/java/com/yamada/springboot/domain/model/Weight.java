package com.yamada.springboot.domain.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
@Entity
@Table(name = "weights")
public class Weight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//	体重
	@NotBlank
	@Min(0)
	@Max(500)
	private double weight;

	//	体脂肪
	@NotBlank
	@Digits(integer=3, fraction=1)
	private double bodyFat;

	//	皮下脂肪
	@NotBlank
	@Digits(integer=3, fraction=1)
	private double subcutaneousFat;

	//	記録日
	@NotBlank
	private Date recordDate;

	//	ユーザー
	@NotBlank
	private Long userId;

	//	登録日
	@NotBlank
	private Timestamp createdAt;

	//	更新日
	@NotBlank
	private Timestamp updatedAt;

}
