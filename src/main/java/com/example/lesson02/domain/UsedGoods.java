package com.example.lesson02.domain;

import java.util.Date;

// DTO, model, domain이라고도 불리는 객체
public class UsedGoods {
	// 필드 : DB에 있는 필드명들
	private int id; // null이 허용되는 숫자인 경우 int가 못 들어감, null이 허용될 경우 Integer로! 확인하기
	private int sellerId;
	private String title;
	private String description;
	private int price;
	private String pictureUrl;
	private Date createdAt;
	private Date updatedAt;
	
	
	// 메소드
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPictureUrl() {
		return pictureUrl;
	}
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
}
