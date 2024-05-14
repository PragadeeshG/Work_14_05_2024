package com.test1;

public class HierarchyEntity {
	private Integer hierarchyKey;
	private Integer normalizedIndicator;
	private String effectiveDate;
	private String nameOfNormalization;
	private String atomicId;
	private String globalId;
	private String riskType;
	private String riskElements;
	private String entityState;
	private String modifiedDate;
	private String remarks;

	public HierarchyEntity() {

	}

	public HierarchyEntity(Integer hierarchyKey, Integer normalizedIndicator, String effectiveDate,
			String nameOfNormalization, String atomicId, String globalId, String riskType, String riskElements,
			String entityState, String modifiedDate, String remarks) {
		super();
		this.hierarchyKey = hierarchyKey;
		this.normalizedIndicator = normalizedIndicator;
		this.effectiveDate = effectiveDate;
		this.nameOfNormalization = nameOfNormalization;
		this.atomicId = atomicId;
		this.globalId = globalId;
		this.riskType = riskType;
		this.riskElements = riskElements;
		this.entityState = entityState;
		this.modifiedDate = modifiedDate;
		this.remarks = remarks;
	}

	public Integer getHierarchyKey() {
		return hierarchyKey;
	}

	public void setHierarchyKey(Integer hierarchyKey) {
		this.hierarchyKey = hierarchyKey;
	}

	public Integer getNormalizedIndicator() {
		return normalizedIndicator;
	}

	public void setNormalizedIndicator(Integer normalizedIndicator) {
		this.normalizedIndicator = normalizedIndicator;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getNameOfNormalization() {
		return nameOfNormalization;
	}

	public void setNameOfNormalization(String nameOfNormalization) {
		this.nameOfNormalization = nameOfNormalization;
	}

	public String getAtomicId() {
		return atomicId;
	}

	public void setAtomicId(String atomicId) {
		this.atomicId = atomicId;
	}

	public String getGlobalId() {
		return globalId;
	}

	public void setGlobalId(String globalId) {
		this.globalId = globalId;
	}

	public String getRiskType() {
		return riskType;
	}

	public void setRiskType(String riskType) {
		this.riskType = riskType;
	}

	public String getRiskElements() {
		return riskElements;
	}

	public void setRiskElements(String riskElements) {
		this.riskElements = riskElements;
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

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
