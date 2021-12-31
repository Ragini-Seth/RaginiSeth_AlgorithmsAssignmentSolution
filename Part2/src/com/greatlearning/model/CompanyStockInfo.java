package com.greatlearning.model;

//Model class for holding the company's stock info
public class CompanyStockInfo {
	private double stockPrice;
	private boolean isStockGreater;
	
	public double getStockPrice() {
		return stockPrice;
	}
	
	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}
	
	public boolean isStockGreater() {
		return isStockGreater;
	}
	
	public void setStockGreater(boolean isStockGreater) {
		this.isStockGreater = isStockGreater;
	}
}
