package com.momo.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 * 
 */
public class Customer implements Serializable {
    private Long custId;

    private Long taxPayerId;

    private Date effDate;

    private Date expDate;

    private Long regionId;

    private Long lanId;

    private Long industryTypeId;

    private Integer chargeLatnId;

    private String custType;

    private String chargeProvinceCode;

    private String custNumber;

    private String statusCd;

    private String isVip;

    private Long partyId;

    private Long custSourceId;

    private BigDecimal custOrderId;

    private Long createStaff;

    private Long updateStaff;

    private BigDecimal lastOrderItemId;

    private Date enterDate;

    private Date statusDate;

    private Date createDate;

    private Date updateDate;

    private String extCustId;

    private Long distributorId;

    private Integer isInstead;

    private Integer isRealname;

    private String remark;

    private String custName;

    private String custAddr;

    private String secrecyLevel;

    private String custSubType;

    private String custAreaGrade;

    private String custControlLevel;

    private Long agreementId;

    private String typeFlag;

    private String ext1CustId;

    private String ext2CustId;

    private String ext3CustId;

    private String groupCustId;

    private Integer segmentId;

    private static final long serialVersionUID = 1L;

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public Long getTaxPayerId() {
        return taxPayerId;
    }

    public void setTaxPayerId(Long taxPayerId) {
        this.taxPayerId = taxPayerId;
    }

    public Date getEffDate() {
        return effDate;
    }

    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public Long getLanId() {
        return lanId;
    }

    public void setLanId(Long lanId) {
        this.lanId = lanId;
    }

    public Long getIndustryTypeId() {
        return industryTypeId;
    }

    public void setIndustryTypeId(Long industryTypeId) {
        this.industryTypeId = industryTypeId;
    }

    public Integer getChargeLatnId() {
        return chargeLatnId;
    }

    public void setChargeLatnId(Integer chargeLatnId) {
        this.chargeLatnId = chargeLatnId;
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }

    public String getChargeProvinceCode() {
        return chargeProvinceCode;
    }

    public void setChargeProvinceCode(String chargeProvinceCode) {
        this.chargeProvinceCode = chargeProvinceCode;
    }

    public String getCustNumber() {
        return custNumber;
    }

    public void setCustNumber(String custNumber) {
        this.custNumber = custNumber;
    }

    public String getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(String statusCd) {
        this.statusCd = statusCd;
    }

    public String getIsVip() {
        return isVip;
    }

    public void setIsVip(String isVip) {
        this.isVip = isVip;
    }

    public Long getPartyId() {
        return partyId;
    }

    public void setPartyId(Long partyId) {
        this.partyId = partyId;
    }

    public Long getCustSourceId() {
        return custSourceId;
    }

    public void setCustSourceId(Long custSourceId) {
        this.custSourceId = custSourceId;
    }

    public BigDecimal getCustOrderId() {
        return custOrderId;
    }

    public void setCustOrderId(BigDecimal custOrderId) {
        this.custOrderId = custOrderId;
    }

    public Long getCreateStaff() {
        return createStaff;
    }

    public void setCreateStaff(Long createStaff) {
        this.createStaff = createStaff;
    }

    public Long getUpdateStaff() {
        return updateStaff;
    }

    public void setUpdateStaff(Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    public BigDecimal getLastOrderItemId() {
        return lastOrderItemId;
    }

    public void setLastOrderItemId(BigDecimal lastOrderItemId) {
        this.lastOrderItemId = lastOrderItemId;
    }

    public Date getEnterDate() {
        return enterDate;
    }

    public void setEnterDate(Date enterDate) {
        this.enterDate = enterDate;
    }

    public Date getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getExtCustId() {
        return extCustId;
    }

    public void setExtCustId(String extCustId) {
        this.extCustId = extCustId;
    }

    public Long getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(Long distributorId) {
        this.distributorId = distributorId;
    }

    public Integer getIsInstead() {
        return isInstead;
    }

    public void setIsInstead(Integer isInstead) {
        this.isInstead = isInstead;
    }

    public Integer getIsRealname() {
        return isRealname;
    }

    public void setIsRealname(Integer isRealname) {
        this.isRealname = isRealname;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddr() {
        return custAddr;
    }

    public void setCustAddr(String custAddr) {
        this.custAddr = custAddr;
    }

    public String getSecrecyLevel() {
        return secrecyLevel;
    }

    public void setSecrecyLevel(String secrecyLevel) {
        this.secrecyLevel = secrecyLevel;
    }

    public String getCustSubType() {
        return custSubType;
    }

    public void setCustSubType(String custSubType) {
        this.custSubType = custSubType;
    }

    public String getCustAreaGrade() {
        return custAreaGrade;
    }

    public void setCustAreaGrade(String custAreaGrade) {
        this.custAreaGrade = custAreaGrade;
    }

    public String getCustControlLevel() {
        return custControlLevel;
    }

    public void setCustControlLevel(String custControlLevel) {
        this.custControlLevel = custControlLevel;
    }

    public Long getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(Long agreementId) {
        this.agreementId = agreementId;
    }

    public String getTypeFlag() {
        return typeFlag;
    }

    public void setTypeFlag(String typeFlag) {
        this.typeFlag = typeFlag;
    }

    public String getExt1CustId() {
        return ext1CustId;
    }

    public void setExt1CustId(String ext1CustId) {
        this.ext1CustId = ext1CustId;
    }

    public String getExt2CustId() {
        return ext2CustId;
    }

    public void setExt2CustId(String ext2CustId) {
        this.ext2CustId = ext2CustId;
    }

    public String getExt3CustId() {
        return ext3CustId;
    }

    public void setExt3CustId(String ext3CustId) {
        this.ext3CustId = ext3CustId;
    }

    public String getGroupCustId() {
        return groupCustId;
    }

    public void setGroupCustId(String groupCustId) {
        this.groupCustId = groupCustId;
    }

    public Integer getSegmentId() {
        return segmentId;
    }

    public void setSegmentId(Integer segmentId) {
        this.segmentId = segmentId;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Customer other = (Customer) that;
        return (this.getCustId() == null ? other.getCustId() == null : this.getCustId().equals(other.getCustId()))
            && (this.getTaxPayerId() == null ? other.getTaxPayerId() == null : this.getTaxPayerId().equals(other.getTaxPayerId()))
            && (this.getEffDate() == null ? other.getEffDate() == null : this.getEffDate().equals(other.getEffDate()))
            && (this.getExpDate() == null ? other.getExpDate() == null : this.getExpDate().equals(other.getExpDate()))
            && (this.getRegionId() == null ? other.getRegionId() == null : this.getRegionId().equals(other.getRegionId()))
            && (this.getLanId() == null ? other.getLanId() == null : this.getLanId().equals(other.getLanId()))
            && (this.getIndustryTypeId() == null ? other.getIndustryTypeId() == null : this.getIndustryTypeId().equals(other.getIndustryTypeId()))
            && (this.getChargeLatnId() == null ? other.getChargeLatnId() == null : this.getChargeLatnId().equals(other.getChargeLatnId()))
            && (this.getCustType() == null ? other.getCustType() == null : this.getCustType().equals(other.getCustType()))
            && (this.getChargeProvinceCode() == null ? other.getChargeProvinceCode() == null : this.getChargeProvinceCode().equals(other.getChargeProvinceCode()))
            && (this.getCustNumber() == null ? other.getCustNumber() == null : this.getCustNumber().equals(other.getCustNumber()))
            && (this.getStatusCd() == null ? other.getStatusCd() == null : this.getStatusCd().equals(other.getStatusCd()))
            && (this.getIsVip() == null ? other.getIsVip() == null : this.getIsVip().equals(other.getIsVip()))
            && (this.getPartyId() == null ? other.getPartyId() == null : this.getPartyId().equals(other.getPartyId()))
            && (this.getCustSourceId() == null ? other.getCustSourceId() == null : this.getCustSourceId().equals(other.getCustSourceId()))
            && (this.getCustOrderId() == null ? other.getCustOrderId() == null : this.getCustOrderId().equals(other.getCustOrderId()))
            && (this.getCreateStaff() == null ? other.getCreateStaff() == null : this.getCreateStaff().equals(other.getCreateStaff()))
            && (this.getUpdateStaff() == null ? other.getUpdateStaff() == null : this.getUpdateStaff().equals(other.getUpdateStaff()))
            && (this.getLastOrderItemId() == null ? other.getLastOrderItemId() == null : this.getLastOrderItemId().equals(other.getLastOrderItemId()))
            && (this.getEnterDate() == null ? other.getEnterDate() == null : this.getEnterDate().equals(other.getEnterDate()))
            && (this.getStatusDate() == null ? other.getStatusDate() == null : this.getStatusDate().equals(other.getStatusDate()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getExtCustId() == null ? other.getExtCustId() == null : this.getExtCustId().equals(other.getExtCustId()))
            && (this.getDistributorId() == null ? other.getDistributorId() == null : this.getDistributorId().equals(other.getDistributorId()))
            && (this.getIsInstead() == null ? other.getIsInstead() == null : this.getIsInstead().equals(other.getIsInstead()))
            && (this.getIsRealname() == null ? other.getIsRealname() == null : this.getIsRealname().equals(other.getIsRealname()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCustName() == null ? other.getCustName() == null : this.getCustName().equals(other.getCustName()))
            && (this.getCustAddr() == null ? other.getCustAddr() == null : this.getCustAddr().equals(other.getCustAddr()))
            && (this.getSecrecyLevel() == null ? other.getSecrecyLevel() == null : this.getSecrecyLevel().equals(other.getSecrecyLevel()))
            && (this.getCustSubType() == null ? other.getCustSubType() == null : this.getCustSubType().equals(other.getCustSubType()))
            && (this.getCustAreaGrade() == null ? other.getCustAreaGrade() == null : this.getCustAreaGrade().equals(other.getCustAreaGrade()))
            && (this.getCustControlLevel() == null ? other.getCustControlLevel() == null : this.getCustControlLevel().equals(other.getCustControlLevel()))
            && (this.getAgreementId() == null ? other.getAgreementId() == null : this.getAgreementId().equals(other.getAgreementId()))
            && (this.getTypeFlag() == null ? other.getTypeFlag() == null : this.getTypeFlag().equals(other.getTypeFlag()))
            && (this.getExt1CustId() == null ? other.getExt1CustId() == null : this.getExt1CustId().equals(other.getExt1CustId()))
            && (this.getExt2CustId() == null ? other.getExt2CustId() == null : this.getExt2CustId().equals(other.getExt2CustId()))
            && (this.getExt3CustId() == null ? other.getExt3CustId() == null : this.getExt3CustId().equals(other.getExt3CustId()))
            && (this.getGroupCustId() == null ? other.getGroupCustId() == null : this.getGroupCustId().equals(other.getGroupCustId()))
            && (this.getSegmentId() == null ? other.getSegmentId() == null : this.getSegmentId().equals(other.getSegmentId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCustId() == null) ? 0 : getCustId().hashCode());
        result = prime * result + ((getTaxPayerId() == null) ? 0 : getTaxPayerId().hashCode());
        result = prime * result + ((getEffDate() == null) ? 0 : getEffDate().hashCode());
        result = prime * result + ((getExpDate() == null) ? 0 : getExpDate().hashCode());
        result = prime * result + ((getRegionId() == null) ? 0 : getRegionId().hashCode());
        result = prime * result + ((getLanId() == null) ? 0 : getLanId().hashCode());
        result = prime * result + ((getIndustryTypeId() == null) ? 0 : getIndustryTypeId().hashCode());
        result = prime * result + ((getChargeLatnId() == null) ? 0 : getChargeLatnId().hashCode());
        result = prime * result + ((getCustType() == null) ? 0 : getCustType().hashCode());
        result = prime * result + ((getChargeProvinceCode() == null) ? 0 : getChargeProvinceCode().hashCode());
        result = prime * result + ((getCustNumber() == null) ? 0 : getCustNumber().hashCode());
        result = prime * result + ((getStatusCd() == null) ? 0 : getStatusCd().hashCode());
        result = prime * result + ((getIsVip() == null) ? 0 : getIsVip().hashCode());
        result = prime * result + ((getPartyId() == null) ? 0 : getPartyId().hashCode());
        result = prime * result + ((getCustSourceId() == null) ? 0 : getCustSourceId().hashCode());
        result = prime * result + ((getCustOrderId() == null) ? 0 : getCustOrderId().hashCode());
        result = prime * result + ((getCreateStaff() == null) ? 0 : getCreateStaff().hashCode());
        result = prime * result + ((getUpdateStaff() == null) ? 0 : getUpdateStaff().hashCode());
        result = prime * result + ((getLastOrderItemId() == null) ? 0 : getLastOrderItemId().hashCode());
        result = prime * result + ((getEnterDate() == null) ? 0 : getEnterDate().hashCode());
        result = prime * result + ((getStatusDate() == null) ? 0 : getStatusDate().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getExtCustId() == null) ? 0 : getExtCustId().hashCode());
        result = prime * result + ((getDistributorId() == null) ? 0 : getDistributorId().hashCode());
        result = prime * result + ((getIsInstead() == null) ? 0 : getIsInstead().hashCode());
        result = prime * result + ((getIsRealname() == null) ? 0 : getIsRealname().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCustName() == null) ? 0 : getCustName().hashCode());
        result = prime * result + ((getCustAddr() == null) ? 0 : getCustAddr().hashCode());
        result = prime * result + ((getSecrecyLevel() == null) ? 0 : getSecrecyLevel().hashCode());
        result = prime * result + ((getCustSubType() == null) ? 0 : getCustSubType().hashCode());
        result = prime * result + ((getCustAreaGrade() == null) ? 0 : getCustAreaGrade().hashCode());
        result = prime * result + ((getCustControlLevel() == null) ? 0 : getCustControlLevel().hashCode());
        result = prime * result + ((getAgreementId() == null) ? 0 : getAgreementId().hashCode());
        result = prime * result + ((getTypeFlag() == null) ? 0 : getTypeFlag().hashCode());
        result = prime * result + ((getExt1CustId() == null) ? 0 : getExt1CustId().hashCode());
        result = prime * result + ((getExt2CustId() == null) ? 0 : getExt2CustId().hashCode());
        result = prime * result + ((getExt3CustId() == null) ? 0 : getExt3CustId().hashCode());
        result = prime * result + ((getGroupCustId() == null) ? 0 : getGroupCustId().hashCode());
        result = prime * result + ((getSegmentId() == null) ? 0 : getSegmentId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", custId=").append(custId);
        sb.append(", taxPayerId=").append(taxPayerId);
        sb.append(", effDate=").append(effDate);
        sb.append(", expDate=").append(expDate);
        sb.append(", regionId=").append(regionId);
        sb.append(", lanId=").append(lanId);
        sb.append(", industryTypeId=").append(industryTypeId);
        sb.append(", chargeLatnId=").append(chargeLatnId);
        sb.append(", custType=").append(custType);
        sb.append(", chargeProvinceCode=").append(chargeProvinceCode);
        sb.append(", custNumber=").append(custNumber);
        sb.append(", statusCd=").append(statusCd);
        sb.append(", isVip=").append(isVip);
        sb.append(", partyId=").append(partyId);
        sb.append(", custSourceId=").append(custSourceId);
        sb.append(", custOrderId=").append(custOrderId);
        sb.append(", createStaff=").append(createStaff);
        sb.append(", updateStaff=").append(updateStaff);
        sb.append(", lastOrderItemId=").append(lastOrderItemId);
        sb.append(", enterDate=").append(enterDate);
        sb.append(", statusDate=").append(statusDate);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", extCustId=").append(extCustId);
        sb.append(", distributorId=").append(distributorId);
        sb.append(", isInstead=").append(isInstead);
        sb.append(", isRealname=").append(isRealname);
        sb.append(", remark=").append(remark);
        sb.append(", custName=").append(custName);
        sb.append(", custAddr=").append(custAddr);
        sb.append(", secrecyLevel=").append(secrecyLevel);
        sb.append(", custSubType=").append(custSubType);
        sb.append(", custAreaGrade=").append(custAreaGrade);
        sb.append(", custControlLevel=").append(custControlLevel);
        sb.append(", agreementId=").append(agreementId);
        sb.append(", typeFlag=").append(typeFlag);
        sb.append(", ext1CustId=").append(ext1CustId);
        sb.append(", ext2CustId=").append(ext2CustId);
        sb.append(", ext3CustId=").append(ext3CustId);
        sb.append(", groupCustId=").append(groupCustId);
        sb.append(", segmentId=").append(segmentId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}