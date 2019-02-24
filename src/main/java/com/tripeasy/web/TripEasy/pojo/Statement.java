package com.tripeasy.web.TripEasy.pojo;

import java.time.LocalDateTime;
public class Statement {
	private Integer statementId;
	private Wallet wallet;
	private String transactionType;
	private Double amount;
	private LocalDateTime dateTime;
	private Integer transactionId;
	private String transactionRemarks;

	public Statement() {
	}

	public Statement(Integer statementId, Wallet wallet, String transactionType, Double amount, LocalDateTime dateTime,
			Integer transactionId, String transactionRemarks) {
		super();
		this.statementId = statementId;
		this.wallet = wallet;
		this.transactionType = transactionType;
		this.amount = amount;
		this.dateTime = dateTime;
		this.transactionId = transactionId;
		this.transactionRemarks = transactionRemarks;
	}

	public Integer getStatementId() {
		return statementId;
	}

	public void setStatementId(Integer statementId) {
		this.statementId = statementId;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public Double getAmount() {
		return amount;
	}

	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public Integer gettransactionId() {
		return transactionId;
	}

	public void settransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransactionRemarks() {
		return transactionRemarks;
	}

	public void setTransactionRemarks(String transactionRemarks) {
		this.transactionRemarks = transactionRemarks;
	}

	@Override
	public String toString() {
		return "Statement [statementId=" + statementId + ", Wallet=" + wallet + ", transactionType=" + transactionType
				+ ", amount=" + amount + ", dateTime=" + dateTime + ", transactionId=" + transactionId + ", transactionRemarks="
				+ transactionRemarks + "]";
	}

}

//
//import java.time.LocalDateTime;
//
//import javax.persistence.Column;
//import javax.persistence.Embeddable;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//
//import com.fasterxml.jackson.annotation.JsonBackReference;
//
//
//@Embeddable
//public class Statement {
//	
//	@Id
//	@Column(name="TransactionId")
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@JoinColumn(name = "TransactionId")
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JsonBackReference
//	private Integer transactionId;
//	@Column(name="TransactionType")
//	private String transactionType;
//	@Column(name="Amount")
//	private Double amount;
//	@Column(name="DateTime")
//	private LocalDateTime dateTime;
//	@Column(name="Remark")
//	private String Remark;
//
//
//	public Statement() {
//	}
//	
//	public Statement(Integer transactionId, String transactionType, Double amount, LocalDateTime dateTime,
//			String remark) {
//		super();
//		this.transactionId = transactionId;
//		this.transactionType = transactionType;
//		this.amount = amount;
//		this.dateTime = dateTime;
//		Remark = remark;
//	}
//
//	/*
//	 * public Statement(Integer profileId, Wallet wallet, String transactionType,
//	 * Double amount, LocalDateTime dateTime, Integer transactionId, String Remark) {
//	 * super(); this.profileId = profileId; this.wallet = wallet;
//	 * this.transactionType = transactionType; this.amount = amount; this.dateTime =
//	 * dateTime; this.Remark = Remark; }
//	 */
//	 public Integer getTransactionId() {
//		return transactionId;
//	}
//
//	public void setTransactionId(Integer transactionId) {
//		this.transactionId = transactionId;
//	}
//
//	public String getTransactionType() {
//		return transactionType;
//	}
//
//	public void setTransactionType(String transactionType) {
//		this.transactionType = transactionType;
//	}
//
//	public Double getAmount() {
//		return amount;
//	}
//
//	public void setAmount(Double amount) {
//		this.amount = amount;
//	}
//
//	public LocalDateTime getDateTime() {
//		return dateTime;
//	}
//
//	public void setDateTime(LocalDateTime dateTime) {
//		this.dateTime = dateTime;
//	}
//
//	public String getRemark() {
//		return Remark;
//	}
//
//	public void setRemark(String remark) {
//		Remark = remark;
//	}
//
//}
