package com.aia.join.qa.beans;

public class PCInformationBean {
	
	//Your personal  information section
	String prefix;
	
    String firstName;
	
	String middleInitial;
	
	String lastName;
	
	String  suffix;
	
	//Your contact information section
	
	String primaryContactInformation; //Home or Mobile or work	
	
	String country;
	
	String phoneNumber;
	
	
	//register your membership location  Home or work
	
	
	String membershipLocation;
	
	
	//Your address inforamation
	
	//If user selects Home
	
	String homeCountry;
	
	String homeAddressLine1;
	
	String homeAddressLine2;
	
	String homeAddressCity;
	
	String homeAddressState;
	
	public String getHomeAddressState() {
		return homeAddressState;
	}

	public void setHomeAddressState(String homeAddressState) {
		this.homeAddressState = homeAddressState;
	}

	public String getIsHomePrimaryMailingAddress() {
		return isHomePrimaryMailingAddress;
	}

	public void setIsHomePrimaryMailingAddress(String isHomePrimaryMailingAddress) {
		this.isHomePrimaryMailingAddress = isHomePrimaryMailingAddress;
	}

	public String getIsWorkPrimaryMailingAddress() {
		return isWorkPrimaryMailingAddress;
	}

	public void setIsWorkPrimaryMailingAddress(String isWorkPrimaryMailingAddress) {
		this.isWorkPrimaryMailingAddress = isWorkPrimaryMailingAddress;
	}

	String homeAddressZipcode;
	
	String isHomePrimaryMailingAddress;
	
	//If user selects Work
	
	String workLookupName;
	
	String isWorkPrimaryMailingAddress;
	
    public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleInitial() {
		return middleInitial;
	}

	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getPrimaryContactInformation() {
		return primaryContactInformation;
	}

	public void setPrimaryContactInformation(String primaryContactInformation) {
		this.primaryContactInformation = primaryContactInformation;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMembershipLocation() {
		return membershipLocation;
	}

	public void setMembershipLocation(String membershipLocation) {
		this.membershipLocation = membershipLocation;
	}

	public String getHomeCountry() {
		return homeCountry;
	}

	public void setHomeCountry(String homeCountry) {
		this.homeCountry = homeCountry;
	}

	public String getHomeAddressLine1() {
		return homeAddressLine1;
	}

	public void setHomeAddressLine1(String homeAddressLine1) {
		this.homeAddressLine1 = homeAddressLine1;
	}

	public String getHomeAddressLine2() {
		return homeAddressLine2;
	}

	public void setHomeAddressLine2(String homeAddressLine2) {
		this.homeAddressLine2 = homeAddressLine2;
	}

	public String getHomeAddressCity() {
		return homeAddressCity;
	}

	public void setHomeAddressCity(String homeAddressCity) {
		this.homeAddressCity = homeAddressCity;
	}

	public String getHomeAddressZipcode() {
		return homeAddressZipcode;
	}

	public void setHomeAddressZipcode(String homeAddressZipcode) {
		this.homeAddressZipcode = homeAddressZipcode;
	}

	public String isHomePrimaryMailingAddress() {
		return isHomePrimaryMailingAddress;
	}

	public void setHomePrimaryMailingAddress(String isHomePrimaryMailingAddress) {
		this.isHomePrimaryMailingAddress = isHomePrimaryMailingAddress;
	}

	public String getWorkLookupName() {
		return workLookupName;
	}

	public void setWorkLookupName(String workLookupName) {
		this.workLookupName = workLookupName;
	}

	public String isWorkPrimaryMailingAddress() {
		return isWorkPrimaryMailingAddress;
	}

	public void setWorkPrimaryMailingAddress(String isWorkPrimaryMailingAddress) {
		this.isWorkPrimaryMailingAddress = isWorkPrimaryMailingAddress;
	}

	
	
	
	
	
	
	
	
	
	
	

}
