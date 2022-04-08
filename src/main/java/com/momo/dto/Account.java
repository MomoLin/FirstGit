package com.momo.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 * 
 */
public class Account implements Serializable {
    private Long acctId;

    private Long custId;

    private Long partyId;

    private Long partyIdLocked;

    private Date statusDate;

    private Integer statusCd;

    private Long regionId;

    private Long lanId;

    private Integer segmentId;

    private Long staffLocked;

    private Integer acctBillingType;

    private String chargeProvinceCode;

    private String acctType;

    private String acctCd;

    private Long createStaff;

    private Long updateStaff;

    private Date effDate;

    private Date expDate;

    private Date createDate;

    private Date updateDate;

    private String remark;

    private String acctName;

    private String acctLoginName;

    private String loginPassword;

    private String extAcctId;

    private Long agreementId;

    private String ext1AcctId;

    private String ext2AcctId;

    private String ext3AcctId;

    private String groupAcctId;

    private Long prodInstId;

    private String hbInvoicePrintType;

    private Integer creditCtrlRule;

    private static final long serialVersionUID = 1L;

    public Long getAcctId() {
        return acctId;
    }

    public void setAcctId(Long acctId) {
        this.acctId = acctId;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public Long getPartyId() {
        return partyId;
    }

    public void setPartyId(Long partyId) {
        this.partyId = partyId;
    }

    public Long getPartyIdLocked() {
        return partyIdLocked;
    }

    public void setPartyIdLocked(Long partyIdLocked) {
        this.partyIdLocked = partyIdLocked;
    }

    public Date getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }

    public Integer getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(Integer statusCd) {
        this.statusCd = statusCd;
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

    public Integer getSegmentId() {
        return segmentId;
    }

    public void setSegmentId(Integer segmentId) {
        this.segmentId = segmentId;
    }

    public Long getStaffLocked() {
        return staffLocked;
    }

    public void setStaffLocked(Long staffLocked) {
        this.staffLocked = staffLocked;
    }

    public Integer getAcctBillingType() {
        return acctBillingType;
    }

    public void setAcctBillingType(Integer acctBillingType) {
        this.acctBillingType = acctBillingType;
    }

    public String getChargeProvinceCode() {
        return chargeProvinceCode;
    }

    public void setChargeProvinceCode(String chargeProvinceCode) {
        this.chargeProvinceCode = chargeProvinceCode;
    }

    public String getAcctType() {
        return acctType;
    }

    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }

    public String getAcctCd() {
        return acctCd;
    }

    public void setAcctCd(String acctCd) {
        this.acctCd = acctCd;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public String getAcctLoginName() {
        return acctLoginName;
    }

    public void setAcctLoginName(String acctLoginName) {
        this.acctLoginName = acctLoginName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getExtAcctId() {
        return extAcctId;
    }

    public void setExtAcctId(String extAcctId) {
        this.extAcctId = extAcctId;
    }

    public Long getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(Long agreementId) {
        this.agreementId = agreementId;
    }

    public String getExt1AcctId() {
        return ext1AcctId;
    }

    public void setExt1AcctId(String ext1AcctId) {
        this.ext1AcctId = ext1AcctId;
    }

    public String getExt2AcctId() {
        return ext2AcctId;
    }

    public void setExt2AcctId(String ext2AcctId) {
        this.ext2AcctId = ext2AcctId;
    }

    public String getExt3AcctId() {
        return ext3AcctId;
    }

    public void setExt3AcctId(String ext3AcctId) {
        this.ext3AcctId = ext3AcctId;
    }

    public String getGroupAcctId() {
        return groupAcctId;
    }

    public void setGroupAcctId(String groupAcctId) {
        this.groupAcctId = groupAcctId;
    }

    public Long getProdInstId() {
        return prodInstId;
    }

    public void setProdInstId(Long prodInstId) {
        this.prodInstId = prodInstId;
    }

    public String getHbInvoicePrintType() {
        return hbInvoicePrintType;
    }

    public void setHbInvoicePrintType(String hbInvoicePrintType) {
        this.hbInvoicePrintType = hbInvoicePrintType;
    }

    public Integer getCreditCtrlRule() {
        return creditCtrlRule;
    }

    public void setCreditCtrlRule(Integer creditCtrlRule) {
        this.creditCtrlRule = creditCtrlRule;
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
        Account other = (Account) that;
        return (this.getAcctId() == null ? other.getAcctId() == null : this.getAcctId().equals(other.getAcctId()))
            && (this.getCustId() == null ? other.getCustId() == null : this.getCustId().equals(other.getCustId()))
            && (this.getPartyId() == null ? other.getPartyId() == null : this.getPartyId().equals(other.getPartyId()))
            && (this.getPartyIdLocked() == null ? other.getPartyIdLocked() == null : this.getPartyIdLocked().equals(other.getPartyIdLocked()))
            && (this.getStatusDate() == null ? other.getStatusDate() == null : this.getStatusDate().equals(other.getStatusDate()))
            && (this.getStatusCd() == null ? other.getStatusCd() == null : this.getStatusCd().equals(other.getStatusCd()))
            && (this.getRegionId() == null ? other.getRegionId() == null : this.getRegionId().equals(other.getRegionId()))
            && (this.getLanId() == null ? other.getLanId() == null : this.getLanId().equals(other.getLanId()))
            && (this.getSegmentId() == null ? other.getSegmentId() == null : this.getSegmentId().equals(other.getSegmentId()))
            && (this.getStaffLocked() == null ? other.getStaffLocked() == null : this.getStaffLocked().equals(other.getStaffLocked()))
            && (this.getAcctBillingType() == null ? other.getAcctBillingType() == null : this.getAcctBillingType().equals(other.getAcctBillingType()))
            && (this.getChargeProvinceCode() == null ? other.getChargeProvinceCode() == null : this.getChargeProvinceCode().equals(other.getChargeProvinceCode()))
            && (this.getAcctType() == null ? other.getAcctType() == null : this.getAcctType().equals(other.getAcctType()))
            && (this.getAcctCd() == null ? other.getAcctCd() == null : this.getAcctCd().equals(other.getAcctCd()))
            && (this.getCreateStaff() == null ? other.getCreateStaff() == null : this.getCreateStaff().equals(other.getCreateStaff()))
            && (this.getUpdateStaff() == null ? other.getUpdateStaff() == null : this.getUpdateStaff().equals(other.getUpdateStaff()))
            && (this.getEffDate() == null ? other.getEffDate() == null : this.getEffDate().equals(other.getEffDate()))
            && (this.getExpDate() == null ? other.getExpDate() == null : this.getExpDate().equals(other.getExpDate()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getAcctName() == null ? other.getAcctName() == null : this.getAcctName().equals(other.getAcctName()))
            && (this.getAcctLoginName() == null ? other.getAcctLoginName() == null : this.getAcctLoginName().equals(other.getAcctLoginName()))
            && (this.getLoginPassword() == null ? other.getLoginPassword() == null : this.getLoginPassword().equals(other.getLoginPassword()))
            && (this.getExtAcctId() == null ? other.getExtAcctId() == null : this.getExtAcctId().equals(other.getExtAcctId()))
            && (this.getAgreementId() == null ? other.getAgreementId() == null : this.getAgreementId().equals(other.getAgreementId()))
            && (this.getExt1AcctId() == null ? other.getExt1AcctId() == null : this.getExt1AcctId().equals(other.getExt1AcctId()))
            && (this.getExt2AcctId() == null ? other.getExt2AcctId() == null : this.getExt2AcctId().equals(other.getExt2AcctId()))
            && (this.getExt3AcctId() == null ? other.getExt3AcctId() == null : this.getExt3AcctId().equals(other.getExt3AcctId()))
            && (this.getGroupAcctId() == null ? other.getGroupAcctId() == null : this.getGroupAcctId().equals(other.getGroupAcctId()))
            && (this.getProdInstId() == null ? other.getProdInstId() == null : this.getProdInstId().equals(other.getProdInstId()))
            && (this.getHbInvoicePrintType() == null ? other.getHbInvoicePrintType() == null : this.getHbInvoicePrintType().equals(other.getHbInvoicePrintType()))
            && (this.getCreditCtrlRule() == null ? other.getCreditCtrlRule() == null : this.getCreditCtrlRule().equals(other.getCreditCtrlRule()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAcctId() == null) ? 0 : getAcctId().hashCode());
        result = prime * result + ((getCustId() == null) ? 0 : getCustId().hashCode());
        result = prime * result + ((getPartyId() == null) ? 0 : getPartyId().hashCode());
        result = prime * result + ((getPartyIdLocked() == null) ? 0 : getPartyIdLocked().hashCode());
        result = prime * result + ((getStatusDate() == null) ? 0 : getStatusDate().hashCode());
        result = prime * result + ((getStatusCd() == null) ? 0 : getStatusCd().hashCode());
        result = prime * result + ((getRegionId() == null) ? 0 : getRegionId().hashCode());
        result = prime * result + ((getLanId() == null) ? 0 : getLanId().hashCode());
        result = prime * result + ((getSegmentId() == null) ? 0 : getSegmentId().hashCode());
        result = prime * result + ((getStaffLocked() == null) ? 0 : getStaffLocked().hashCode());
        result = prime * result + ((getAcctBillingType() == null) ? 0 : getAcctBillingType().hashCode());
        result = prime * result + ((getChargeProvinceCode() == null) ? 0 : getChargeProvinceCode().hashCode());
        result = prime * result + ((getAcctType() == null) ? 0 : getAcctType().hashCode());
        result = prime * result + ((getAcctCd() == null) ? 0 : getAcctCd().hashCode());
        result = prime * result + ((getCreateStaff() == null) ? 0 : getCreateStaff().hashCode());
        result = prime * result + ((getUpdateStaff() == null) ? 0 : getUpdateStaff().hashCode());
        result = prime * result + ((getEffDate() == null) ? 0 : getEffDate().hashCode());
        result = prime * result + ((getExpDate() == null) ? 0 : getExpDate().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getAcctName() == null) ? 0 : getAcctName().hashCode());
        result = prime * result + ((getAcctLoginName() == null) ? 0 : getAcctLoginName().hashCode());
        result = prime * result + ((getLoginPassword() == null) ? 0 : getLoginPassword().hashCode());
        result = prime * result + ((getExtAcctId() == null) ? 0 : getExtAcctId().hashCode());
        result = prime * result + ((getAgreementId() == null) ? 0 : getAgreementId().hashCode());
        result = prime * result + ((getExt1AcctId() == null) ? 0 : getExt1AcctId().hashCode());
        result = prime * result + ((getExt2AcctId() == null) ? 0 : getExt2AcctId().hashCode());
        result = prime * result + ((getExt3AcctId() == null) ? 0 : getExt3AcctId().hashCode());
        result = prime * result + ((getGroupAcctId() == null) ? 0 : getGroupAcctId().hashCode());
        result = prime * result + ((getProdInstId() == null) ? 0 : getProdInstId().hashCode());
        result = prime * result + ((getHbInvoicePrintType() == null) ? 0 : getHbInvoicePrintType().hashCode());
        result = prime * result + ((getCreditCtrlRule() == null) ? 0 : getCreditCtrlRule().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", acctId=").append(acctId);
        sb.append(", custId=").append(custId);
        sb.append(", partyId=").append(partyId);
        sb.append(", partyIdLocked=").append(partyIdLocked);
        sb.append(", statusDate=").append(statusDate);
        sb.append(", statusCd=").append(statusCd);
        sb.append(", regionId=").append(regionId);
        sb.append(", lanId=").append(lanId);
        sb.append(", segmentId=").append(segmentId);
        sb.append(", staffLocked=").append(staffLocked);
        sb.append(", acctBillingType=").append(acctBillingType);
        sb.append(", chargeProvinceCode=").append(chargeProvinceCode);
        sb.append(", acctType=").append(acctType);
        sb.append(", acctCd=").append(acctCd);
        sb.append(", createStaff=").append(createStaff);
        sb.append(", updateStaff=").append(updateStaff);
        sb.append(", effDate=").append(effDate);
        sb.append(", expDate=").append(expDate);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", remark=").append(remark);
        sb.append(", acctName=").append(acctName);
        sb.append(", acctLoginName=").append(acctLoginName);
        sb.append(", loginPassword=").append(loginPassword);
        sb.append(", extAcctId=").append(extAcctId);
        sb.append(", agreementId=").append(agreementId);
        sb.append(", ext1AcctId=").append(ext1AcctId);
        sb.append(", ext2AcctId=").append(ext2AcctId);
        sb.append(", ext3AcctId=").append(ext3AcctId);
        sb.append(", groupAcctId=").append(groupAcctId);
        sb.append(", prodInstId=").append(prodInstId);
        sb.append(", hbInvoicePrintType=").append(hbInvoicePrintType);
        sb.append(", creditCtrlRule=").append(creditCtrlRule);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}