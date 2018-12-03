package com.home.model;

import java.util.HashSet;
import java.util.Set;

// Generated Feb 24, 2016 9:17:27 PM by Hibernate Tools 4.3.1

/**
 * PromotionGift generated by hbm2java
 */
public class PromotionGift implements java.io.Serializable {

	private Integer id;
	private Gift gift;
	private Promotion promotion;
	private Integer maxQuantity;
	private Integer maxPoint;
	private Integer gift_id;
	private Integer promotion_id;
	private String unit;
	private String formula;
	private Double price;
	private Set<RegisterGift> registerGifts = new HashSet<RegisterGift>(0);

	public PromotionGift() {
	}

	public PromotionGift(Gift gift, Promotion promotion) {
		this.gift = gift;
		this.promotion = promotion;
	}

	public PromotionGift(Gift gift, Promotion promotion, Integer maxQuantity, Integer maxPoint) {
		this.gift = gift;
		this.promotion = promotion;
		this.maxQuantity = maxQuantity;
		this.maxPoint = maxPoint;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Gift getGift() {
		return this.gift;
	}

	public void setGift(Gift gift) {
		this.gift = gift;
	}

	public Promotion getPromotion() {
		return this.promotion;
	}

	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
	}

	public Integer getMaxQuantity() {
		return this.maxQuantity;
	}

	public void setMaxQuantity(Integer maxQuantity) {
		this.maxQuantity = maxQuantity;
	}

	public Integer getMaxPoint() {
		return this.maxPoint;
	}

	public void setMaxPoint(Integer maxPoint) {
		this.maxPoint = maxPoint;
	}

	public Integer getGift_id() {
		return gift_id;
	}

	public void setGift_id(Integer gift_id) {
		this.gift_id = gift_id;
	}

	public Integer getPromotion_id() {
		return promotion_id;
	}

	public void setPromotion_id(Integer promotion_id) {
		this.promotion_id = promotion_id;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getFormula() {
		return this.formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public Set<RegisterGift> getRegisterGifts() {
		return this.registerGifts;
	}

	public void setRegisterGifts(Set<RegisterGift> registerGifts) {
		this.registerGifts = registerGifts;
	}
	
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}