package com.test1;

public class HierarchyEntityInfoModel {
	private Integer hierarchyKey;
	private String e2eApplicable;
	private String integrationMode;
	private String integrationStatus;
	private String downStreamName;
	private String downStreamContact;
	private String dataTypeToFeed;
	private String mandatoryData;
	private String remarks;
	private String additionalInfo;
	private String creationDate;
	private String entityState;
	private String modifiedDate;

	public HierarchyEntityInfoModel() {

	}

	public HierarchyEntityInfoModel(Integer hierarchyKey, String e2eApplicable, String integrationMode,
			String integrationStatus, String downStreamName, String downStreamContact, String dataTypeToFeed,
			String mandatoryData, String remarks, String additionalInfo, String creationDate, String entityState,
			String modifiedDate) {
		super();
		this.hierarchyKey = hierarchyKey;
		this.e2eApplicable = e2eApplicable;
		this.integrationMode = integrationMode;
		this.integrationStatus = integrationStatus;
		this.downStreamName = downStreamName;
		this.downStreamContact = downStreamContact;
		this.dataTypeToFeed = dataTypeToFeed;
		this.mandatoryData = mandatoryData;
		this.remarks = remarks;
		this.additionalInfo = additionalInfo;
		this.creationDate = creationDate;
		this.entityState = entityState;
		this.modifiedDate = modifiedDate;
	}

	public Integer getHierarchyKey() {
		return hierarchyKey;
	}

	public void setHierarchyKey(Integer hierarchyKey) {
		this.hierarchyKey = hierarchyKey;
	}

	public String getE2eApplicable() {
		return e2eApplicable;
	}

	public void setE2eApplicable(String e2eApplicable) {
		this.e2eApplicable = e2eApplicable;
	}

	public String getIntegrationMode() {
		return integrationMode;
	}

	public void setIntegrationMode(String integrationMode) {
		this.integrationMode = integrationMode;
	}

	public String getIntegrationStatus() {
		return integrationStatus;
	}

	public void setIntegrationStatus(String integrationStatus) {
		this.integrationStatus = integrationStatus;
	}

	public String getDownStreamName() {
		return downStreamName;
	}

	public void setDownStreamName(String downStreamName) {
		this.downStreamName = downStreamName;
	}

	public String getDownStreamContact() {
		return downStreamContact;
	}

	public void setDownStreamContact(String downStreamContact) {
		this.downStreamContact = downStreamContact;
	}

	public String getDataTypeToFeed() {
		return dataTypeToFeed;
	}

	public void setDataTypeToFeed(String dataTypeToFeed) {
		this.dataTypeToFeed = dataTypeToFeed;
	}

	public String getMandatoryData() {
		return mandatoryData;
	}

	public void setMandatoryData(String mandatoryData) {
		this.mandatoryData = mandatoryData;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
