package com.psl.bean;

import java.util.Date;




public class ReviewReplyDetails {

	private String rReplyId;
	private String rReviewId;
	private String rReplyMessage;
	private Date rReviewDate;
	public ReviewReplyDetails() {
	}
	public String getrReplyId() {
		return rReplyId;
	}
	public void setrReplyId(String rReplyId) {
		this.rReplyId = rReplyId;
	}
	public String getrReviewId() {
		return rReviewId;
	}
	public void setrReviewId(String rReviewId) {
		this.rReviewId = rReviewId;
	}
	public String getrReplyMessage() {
		return rReplyMessage;
	}
	public void setrReplyMessage(String rReplyMessage) {
		this.rReplyMessage = rReplyMessage;
	}
	public Date getrReviewDate() {
		return rReviewDate;
	}
	public void setrReviewDate(Date rReviewDate) {
		this.rReviewDate = rReviewDate;
	}
	
}
