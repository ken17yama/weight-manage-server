package com.yamada.springboot.app.common.payload.request;

import java.util.Date;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class WeightRequest {
	
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
}
