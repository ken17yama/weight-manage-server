package com.yamada.springboot.domain.model;

import java.sql.Timestamp;
import java.util.Date;

import lombok.Data;

@Data
public class Weight {

	//	ID
	private Integer weightId;

	//	体重
	private double weight;

	//	体脂肪
	private double bodyFat;

	//	皮下脂肪
	private double subcutaneousFat;

	//	記録日
	private Date recordDate;

	//	ユーザー
	private Integer userId;

	//	登録日
	private Timestamp createdAt;

	//	更新日
	private Timestamp updatedAt;

}
