package com.kmb.BankApp.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "register_data")
public class RegisterEntity {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int id;

	@Id
	@Column(name = "email_id")
	private String email;
	@Column(name = "mobile_no", nullable = false)
	private String mobile;
	@Column(name = "first_Name", nullable = false)
	private String firstName;
	@Column(name = "last_Name", nullable = false)
	private String lastName;
	@Column(nullable = false)
	private String dob;
	@Column(nullable = false)
	private String gender;
	@Column(name = "father_name", nullable = false)
	private String fatherName;
	@Column(name = "mother_name", nullable = false)
	private String motherName;
	@Column(nullable = false)
	private String aadhar;
	@Column(nullable = false)
	private String panCard;
	@Column(nullable = false)
	private String password;
	@Column(nullable = false)
	private String permanentAddress;
	@Column(name = "account_type", nullable = false)
	private String accountType;
	@Column(nullable = false)
	private String terms;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getTerms() {
		return terms;
	}

	public void setTerms(String terms) {
		this.terms = terms;
	}

	public RegisterEntity(String email, String mobile, String firstName, String lastName, String dob, String gender,
			String fatherName, String motherName, String aadhar, String panCard, String password,
			String permanentAddress, String accountType, String terms) {
		super();
		this.email = email;
		this.mobile = mobile;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.aadhar = aadhar;
		this.panCard = panCard;
		this.password = password;
		this.permanentAddress = permanentAddress;
		this.accountType = accountType;
		this.terms = terms;
	}

	public RegisterEntity() {
		super();
	}

}
