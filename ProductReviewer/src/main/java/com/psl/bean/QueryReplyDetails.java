package com.psl.bean;

import java.util.Date;

public class QueryReplyDetails {

	private String qReplyId;
	private String qQueryId;
	private String qReplyMessage;
	private Date qReplyDate;
	public QueryReplyDetails() {
		
	}
	public String getqReplyId() {
		return qReplyId;
	}
	public void setqReplyId(String qReplyId) {
		this.qReplyId = qReplyId;
	}
	public String getqQueryId() {
		return qQueryId;
	}
	public void setqQueryId(String qQueryId) {
		this.qQueryId = qQueryId;
	}
	public String getqReplyMessage() {
		return qReplyMessage;
	}
	public void setqReplyMessage(String qReplyMessage) {
		this.qReplyMessage = qReplyMessage;
	}
	public Date getqReplyDate() {
		return qReplyDate;
	}
	public void setqReplyDate(Date qReplyDate) {
		this.qReplyDate = qReplyDate;
	}
	
}
