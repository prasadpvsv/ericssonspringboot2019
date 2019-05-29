package com.ericsson.globalinsurance.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
@Table(name="Vehicle")
public class Vehicle {
	@Id	
	@Column(name="EngineNo")
	private long engineNo;
	@Column(name="RegNo",nullable=false,length=50)
	private String regNo;
	@Column(name="Model",nullable=false,length=50)
	private String model;
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="yyyy-MMM-dd",shape=Shape.STRING)
	@Column(name="RegDate")
	private Date regDate;
	@Column(name="Color")
	private String color;
	public long getEngineNo() {
		return engineNo;
	}
	public void setEngineNo(long engineNo) {
		this.engineNo = engineNo;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	

}
