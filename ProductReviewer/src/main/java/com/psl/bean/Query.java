package com.psl.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "QUERY")
public class Query {

	
	private String queryId;
	private String queryMessage;
	private Date queryDate;
	private String productId;
	
	public Query() {
	}
	public String getQueryId() {
		return queryId;
	}
	public void setQueryId(String queryId) {
		this.queryId = queryId;
	}
	public String getQueryMessage() {
		return queryMessage;
	}
	public void setQueryMessage(String queryMessage) {
		this.queryMessage = queryMessage;
	}
	public Date getQueryDate() {
		return queryDate;
	}
	public void setQueryDate(Date queryDate) {
		this.queryDate = queryDate;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	
	
	
}
