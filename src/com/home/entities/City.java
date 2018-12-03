package com.home.entities;

// Generated Mar 30, 2016 10:31:21 PM by Hibernate Tools 4.3.1

/**
 * City generated by hbm2java
 */
public class City implements java.io.Serializable {

	private Integer id;
	private String cityCode;
	private String cityName;

	public City() {
	}

	public City(String cityCode, String cityName) {
		this.cityCode = cityCode;
		this.cityName = cityName;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCityCode() {
		return this.cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

}
