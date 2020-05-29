package com.yamada.springboot.domain.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name = "weights")
public class Weight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//	体重
	@NotNull
	@Digits(integer=3, fraction=1)
	private double weight;

	//	体脂肪
	@NotNull
	@Digits(integer=3, fraction=1)
	private double bodyFat;

	//	皮下脂肪
	@NotNull
	@Digits(integer=3, fraction=1)
	private double subcutaneousFat;

	//	記録日
	@NotNull
	private Date recordDate;

	//	ユーザー
	@NotNull
	private Long userId;

	//	登録日
	private Timestamp createdAt;

	//	更新日
	@NotNull
	private Timestamp updatedAt;

}
