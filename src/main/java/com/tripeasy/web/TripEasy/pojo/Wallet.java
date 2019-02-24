package com.tripeasy.web.TripEasy.pojo;

import java.util.Set;

public class Wallet {
	private Integer profileId;
	private Double currentBalance;
	private Set<Statement> statements;

	public Wallet() {

	}

	public Wallet(Double currentBalance, Set<Statement> statements) {
		super();
		this.currentBalance = currentBalance;
		this.statements = statements;
	}

	public Wallet(Integer profileId, Double currentBalance) {
		super();
		this.profileId = profileId;
		this.currentBalance = currentBalance;
	}

	public Wallet(Integer profileId, Double currentBalance, Set<Statement> statements) {
		super();
		this.profileId = profileId;
		this.currentBalance = currentBalance;
		this.statements = statements;
	}

	public Integer getprofileId() {
		return profileId;
	}

	public void setprofileId(Integer profileId) {
		this.profileId = profileId;
	}

	public Double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(Double currentBalance) {
		this.currentBalance = currentBalance;
	}

	public Set<Statement> getStatements() {
		return statements;
	}

	public void setStatements(Set<Statement> statements) {
		this.statements = statements;
	}

	@Override
	public String toString() {
		return "Wallet [profileId=" + profileId + ", currentBalance=" + currentBalance + ", statements=" + statements
				+ "]";
	}

}

/*
 * import java.util.Set;
 * 
 * import javax.persistence.CascadeType; import javax.persistence.Column; import
 * javax.persistence.Entity; import javax.persistence.GeneratedValue; import
 * javax.persistence.GenerationType; import javax.persistence.Id; import
 * javax.persistence.JoinColumn; import javax.persistence.OneToMany;
 * 
 * import com.fasterxml.jackson.annotation.JsonManagedReference;
 * 
 * @Data
 * 
 * @NoArgsConstructor
 * 
 * @AllArgsConstructor
 * 
 * @Entity public class Wallet { // @OneToMany
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.AUTO) private int profileId;
 * 
 * @Column(name = "CurrentBalance") private Double currentBalance;
 * // @ElementCollection // @CollectionTable(name = "user_phone_numbers",
 * joinColumns = @JoinColumn(name // = "transactionId")) // @Embedded
 * 
 * @JoinColumn(name = "TransactionId")
 * 
 * @OneToMany(mappedBy = "wallet")
 * 
 * @JsonManagedReference private Set<Statement> statement;
 * 
 * public Wallet(Integer profileId, Double currentBalance) { super();
 * this.profileId = profileId; this.currentBalance = currentBalance; }
 * 
 * public Wallet(Integer profileId, Double currentBalance, Set<Statement>
 * statements) { super(); this.profileId = profileId; this.currentBalance =
 * currentBalance; this.statement = statements; }
 * 
 * public int getProfileId() { return profileId; }
 * 
 * public void setProfileId(int profileId) { this.profileId = profileId; }
 * 
 * public Double getCurrentBalance() { return currentBalance; }
 * 
 * public void setCurrentBalance(Double currentBalance) { this.currentBalance =
 * currentBalance; }
 * 
 * public Set<Statement> getStatement() { return statement; }
 * 
 * public void setStatement(Set<Statement> statement) { this.statement =
 * statement; }
 * 
 * }
 */