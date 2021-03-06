package com.psl.bean;

public class RatingDetails {

	private String productId;
	private int noOfCustomers;
	private int rating;
	private float averageRating;
	
	public RatingDetails() {
	}

	
	public String getProductId() {
		return productId;
	}


	public void setProductId(String productId) {
		this.productId = productId;
	}


	public int getNoOfCustomers() {
		return noOfCustomers;
	}

	public void setNoOfCustomers(int noOfCustomers) {
		this.noOfCustomers = noOfCustomers;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public float getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(float averageRating) {
		this.averageRating = averageRating;
	}
	
	
}
