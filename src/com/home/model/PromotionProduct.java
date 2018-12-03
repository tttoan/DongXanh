package com.home.model;

// Generated Feb 24, 2016 9:17:27 PM by Hibernate Tools 4.3.1

/**
 * PromotionProduct generated by hbm2java
 */
public class PromotionProduct implements java.io.Serializable {

	private Integer id;
	private Product product;
	private Promotion promotion;
	private Integer maxQuantity;
	private Integer maxPoint;
	private Integer product_id;
	private Integer promotion_id;

	public PromotionProduct() {
	}

	public PromotionProduct(Product product, Promotion promotion) {
		this.product = product;
		this.promotion = promotion;
	}

	public PromotionProduct(Product product, Promotion promotion, Integer maxQuantity, Integer maxPoint) {
		this.product = product;
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

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
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
	
	public Integer getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}

	public Integer getPromotion_id() {
		return promotion_id;
	}

	public void setPromotion_id(Integer promotion_id) {
		this.promotion_id = promotion_id;
	}

}