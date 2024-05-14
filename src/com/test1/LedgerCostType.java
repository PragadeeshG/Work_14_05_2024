package com.test1;

public class LedgerCostType {
	private Integer cbAccount1;
	private Integer cbAccount2;
	private String ledgerSystemVal1;
	private String ledgerSystemVal2;
	private String mapSetName;
	private String targetSystemName;
	private String targetSystemUsage;
	private String mapSetStatus;
	private String mapSetUsage;
	private String targetAttributeName;
	private String creationDate;
	private String entityState;
	private String modifiedDate;

	public LedgerCostType() {

	}

	public LedgerCostType(Integer cbAccount1, Integer cbAccount2, String ledgerSystemVal1, String ledgerSystemVal2,
			String mapSetName, String targetSystemName, String targetSystemUsage, String mapSetStatus,
			String mapSetUsage, String targetAttributeName, String creationDate, String entityState,
			String modifiedDate) {
		super();
		this.cbAccount1 = cbAccount1;
		this.cbAccount2 = cbAccount2;
		this.ledgerSystemVal1 = ledgerSystemVal1;
		this.ledgerSystemVal2 = ledgerSystemVal2;
		this.mapSetName = mapSetName;
		this.targetSystemName = targetSystemName;
		this.targetSystemUsage = targetSystemUsage;
		this.mapSetStatus = mapSetStatus;
		this.mapSetUsage = mapSetUsage;
		this.targetAttributeName = targetAttributeName;
		this.creationDate = creationDate;
		this.entityState = entityState;
		this.modifiedDate = modifiedDate;
	}

	public Integer getCbAccount1() {
		return cbAccount1;
	}

	public void setCbAccount1(Integer cbAccount1) {
		this.cbAccount1 = cbAccount1;
	}

	public Integer getCbAccount2() {
		return cbAccount2;
	}

	public void setCbAccount2(Integer cbAccount2) {
		this.cbAccount2 = cbAccount2;
	}

	public String getLedgerSystemVal1() {
		return ledgerSystemVal1;
	}

	public void setLedgerSystemVal1(String ledgerSystemVal1) {
		this.ledgerSystemVal1 = ledgerSystemVal1;
	}

	public String getLedgerSystemVal2() {
		return ledgerSystemVal2;
	}

	public void setLedgerSystemVal2(String ledgerSystemVal2) {
		this.ledgerSystemVal2 = ledgerSystemVal2;
	}

	public String getMapSetName() {
		return mapSetName;
	}

	public void setMapSetName(String mapSetName) {
		this.mapSetName = mapSetName;
	}

	public String getTargetSystemName() {
		return targetSystemName;
	}

	public void setTargetSystemName(String targetSystemName) {
		this.targetSystemName = targetSystemName;
	}

	public String getTargetSystemUsage() {
		return targetSystemUsage;
	}

	public void setTargetSystemUsage(String targetSystemUsage) {
		this.targetSystemUsage = targetSystemUsage;
	}

	public String getMapSetStatus() {
		return mapSetStatus;
	}

	public void setMapSetStatus(String mapSetStatus) {
		this.mapSetStatus = mapSetStatus;
	}

	public String getMapSetUsage() {
		return mapSetUsage;
	}

	public void setMapSetUsage(String mapSetUsage) {
		this.mapSetUsage = mapSetUsage;
	}

	public String getTargetAttributeName() {
		return targetAttributeName;
	}

	public void setTargetAttributeName(String targetAttributeName) {
		this.targetAttributeName = targetAttributeName;
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
