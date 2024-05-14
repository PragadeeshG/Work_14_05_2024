package com.test1;

public class HierarchyEntityDetailsModel {
	private Integer hierarchyKey;
	private String countryCode;
	private String customConfigAdopted;
	private String criteria1;
	private String criteria2;
	private String criteria3;
	private String criteria4;
	private String criteria5;
	private String submitted;
	private String countryLapse;
	private String stagingReq;
	private String stagingIdentity;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public HierarchyEntityDetailsModel() {

	}

	public HierarchyEntityDetailsModel(Integer hierarchyKey, String countryCode, String customConfigAdopted,
			String criteria1, String criteria2, String criteria3, String criteria4, String criteria5, String submitted,
			String countryLapse, String stagingReq, String stagingIdentity, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.hierarchyKey = hierarchyKey;
		this.countryCode = countryCode;
		this.customConfigAdopted = customConfigAdopted;
		this.criteria1 = criteria1;
		this.criteria2 = criteria2;
		this.criteria3 = criteria3;
		this.criteria4 = criteria4;
		this.criteria5 = criteria5;
		this.submitted = submitted;
		this.countryLapse = countryLapse;
		this.stagingReq = stagingReq;
		this.stagingIdentity = stagingIdentity;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getHierarchyKey() {
		return hierarchyKey;
	}

	public void setHierarchyKey(Integer hierarchyKey) {
		this.hierarchyKey = hierarchyKey;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCustomConfigAdopted() {
		return customConfigAdopted;
	}

	public void setCustomConfigAdopted(String customConfigAdopted) {
		this.customConfigAdopted = customConfigAdopted;
	}

	public String getCriteria1() {
		return criteria1;
	}

	public void setCriteria1(String criteria1) {
		this.criteria1 = criteria1;
	}

	public String getCriteria2() {
		return criteria2;
	}

	public void setCriteria2(String criteria2) {
		this.criteria2 = criteria2;
	}

	public String getCriteria3() {
		return criteria3;
	}

	public void setCriteria3(String criteria3) {
		this.criteria3 = criteria3;
	}

	public String getCriteria4() {
		return criteria4;
	}

	public void setCriteria4(String criteria4) {
		this.criteria4 = criteria4;
	}

	public String getCriteria5() {
		return criteria5;
	}

	public void setCriteria5(String criteria5) {
		this.criteria5 = criteria5;
	}

	public String getSubmitted() {
		return submitted;
	}

	public void setSubmitted(String submitted) {
		this.submitted = submitted;
	}

	public String getCountryLapse() {
		return countryLapse;
	}

	public void setCountryLapse(String countryLapse) {
		this.countryLapse = countryLapse;
	}

	public String getStagingReq() {
		return stagingReq;
	}

	public void setStagingReq(String stagingReq) {
		this.stagingReq = stagingReq;
	}

	public String getStagingIdentity() {
		return stagingIdentity;
	}

	public void setStagingIdentity(String stagingIdentity) {
		this.stagingIdentity = stagingIdentity;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
