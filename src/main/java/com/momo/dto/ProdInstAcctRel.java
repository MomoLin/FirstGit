package com.momo.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 * 
 */
public class ProdInstAcctRel implements Serializable {
    private Long prodInstAcctRelId;

    private Long acctId;

    private Long agreeId;

    private Long prodInstId;

    private Long paymentLimit;

    private Date effDate;

    private Date expDate;

    private Integer acctItemGroupId;

    private Integer statusCd;

    private Integer priority;

    private Integer paymentLimitType;

    private Integer ifDefaultAcctId;

    private Long createStaff;

    private Long updateStaff;

    private Long upperAmount;

    private Date statusDate;

    private Date createDate;

    private Date updateDate;

    private Long lanId;

    private Long lastOrderItemId;

    private Integer segmentId;

    private static final long serialVersionUID = 1L;

    public Long getProdInstAcctRelId() {
        return prodInstAcctRelId;
    }

    public void setProdInstAcctRelId(Long prodInstAcctRelId) {
        this.prodInstAcctRelId = prodInstAcctRelId;
    }

    public Long getAcctId() {
        return acctId;
    }

    public void setAcctId(Long acctId) {
        this.acctId = acctId;
    }

    public Long getAgreeId() {
        return agreeId;
    }

    public void setAgreeId(Long agreeId) {
        this.agreeId = agreeId;
    }

    public Long getProdInstId() {
        return prodInstId;
    }

    public void setProdInstId(Long prodInstId) {
        this.prodInstId = prodInstId;
    }

    public Long getPaymentLimit() {
        return paymentLimit;
    }

    public void setPaymentLimit(Long paymentLimit) {
        this.paymentLimit = paymentLimit;
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

    public Integer getAcctItemGroupId() {
        return acctItemGroupId;
    }

    public void setAcctItemGroupId(Integer acctItemGroupId) {
        this.acctItemGroupId = acctItemGroupId;
    }

    public Integer getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(Integer statusCd) {
        this.statusCd = statusCd;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getPaymentLimitType() {
        return paymentLimitType;
    }

    public void setPaymentLimitType(Integer paymentLimitType) {
        this.paymentLimitType = paymentLimitType;
    }

    public Integer getIfDefaultAcctId() {
        return ifDefaultAcctId;
    }

    public void setIfDefaultAcctId(Integer ifDefaultAcctId) {
        this.ifDefaultAcctId = ifDefaultAcctId;
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

    public Long getUpperAmount() {
        return upperAmount;
    }

    public void setUpperAmount(Long upperAmount) {
        this.upperAmount = upperAmount;
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

    public Long getLanId() {
        return lanId;
    }

    public void setLanId(Long lanId) {
        this.lanId = lanId;
    }

    public Long getLastOrderItemId() {
        return lastOrderItemId;
    }

    public void setLastOrderItemId(Long lastOrderItemId) {
        this.lastOrderItemId = lastOrderItemId;
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
        ProdInstAcctRel other = (ProdInstAcctRel) that;
        return (this.getProdInstAcctRelId() == null ? other.getProdInstAcctRelId() == null : this.getProdInstAcctRelId().equals(other.getProdInstAcctRelId()))
            && (this.getAcctId() == null ? other.getAcctId() == null : this.getAcctId().equals(other.getAcctId()))
            && (this.getAgreeId() == null ? other.getAgreeId() == null : this.getAgreeId().equals(other.getAgreeId()))
            && (this.getProdInstId() == null ? other.getProdInstId() == null : this.getProdInstId().equals(other.getProdInstId()))
            && (this.getPaymentLimit() == null ? other.getPaymentLimit() == null : this.getPaymentLimit().equals(other.getPaymentLimit()))
            && (this.getEffDate() == null ? other.getEffDate() == null : this.getEffDate().equals(other.getEffDate()))
            && (this.getExpDate() == null ? other.getExpDate() == null : this.getExpDate().equals(other.getExpDate()))
            && (this.getAcctItemGroupId() == null ? other.getAcctItemGroupId() == null : this.getAcctItemGroupId().equals(other.getAcctItemGroupId()))
            && (this.getStatusCd() == null ? other.getStatusCd() == null : this.getStatusCd().equals(other.getStatusCd()))
            && (this.getPriority() == null ? other.getPriority() == null : this.getPriority().equals(other.getPriority()))
            && (this.getPaymentLimitType() == null ? other.getPaymentLimitType() == null : this.getPaymentLimitType().equals(other.getPaymentLimitType()))
            && (this.getIfDefaultAcctId() == null ? other.getIfDefaultAcctId() == null : this.getIfDefaultAcctId().equals(other.getIfDefaultAcctId()))
            && (this.getCreateStaff() == null ? other.getCreateStaff() == null : this.getCreateStaff().equals(other.getCreateStaff()))
            && (this.getUpdateStaff() == null ? other.getUpdateStaff() == null : this.getUpdateStaff().equals(other.getUpdateStaff()))
            && (this.getUpperAmount() == null ? other.getUpperAmount() == null : this.getUpperAmount().equals(other.getUpperAmount()))
            && (this.getStatusDate() == null ? other.getStatusDate() == null : this.getStatusDate().equals(other.getStatusDate()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getLanId() == null ? other.getLanId() == null : this.getLanId().equals(other.getLanId()))
            && (this.getLastOrderItemId() == null ? other.getLastOrderItemId() == null : this.getLastOrderItemId().equals(other.getLastOrderItemId()))
            && (this.getSegmentId() == null ? other.getSegmentId() == null : this.getSegmentId().equals(other.getSegmentId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProdInstAcctRelId() == null) ? 0 : getProdInstAcctRelId().hashCode());
        result = prime * result + ((getAcctId() == null) ? 0 : getAcctId().hashCode());
        result = prime * result + ((getAgreeId() == null) ? 0 : getAgreeId().hashCode());
        result = prime * result + ((getProdInstId() == null) ? 0 : getProdInstId().hashCode());
        result = prime * result + ((getPaymentLimit() == null) ? 0 : getPaymentLimit().hashCode());
        result = prime * result + ((getEffDate() == null) ? 0 : getEffDate().hashCode());
        result = prime * result + ((getExpDate() == null) ? 0 : getExpDate().hashCode());
        result = prime * result + ((getAcctItemGroupId() == null) ? 0 : getAcctItemGroupId().hashCode());
        result = prime * result + ((getStatusCd() == null) ? 0 : getStatusCd().hashCode());
        result = prime * result + ((getPriority() == null) ? 0 : getPriority().hashCode());
        result = prime * result + ((getPaymentLimitType() == null) ? 0 : getPaymentLimitType().hashCode());
        result = prime * result + ((getIfDefaultAcctId() == null) ? 0 : getIfDefaultAcctId().hashCode());
        result = prime * result + ((getCreateStaff() == null) ? 0 : getCreateStaff().hashCode());
        result = prime * result + ((getUpdateStaff() == null) ? 0 : getUpdateStaff().hashCode());
        result = prime * result + ((getUpperAmount() == null) ? 0 : getUpperAmount().hashCode());
        result = prime * result + ((getStatusDate() == null) ? 0 : getStatusDate().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getLanId() == null) ? 0 : getLanId().hashCode());
        result = prime * result + ((getLastOrderItemId() == null) ? 0 : getLastOrderItemId().hashCode());
        result = prime * result + ((getSegmentId() == null) ? 0 : getSegmentId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", prodInstAcctRelId=").append(prodInstAcctRelId);
        sb.append(", acctId=").append(acctId);
        sb.append(", agreeId=").append(agreeId);
        sb.append(", prodInstId=").append(prodInstId);
        sb.append(", paymentLimit=").append(paymentLimit);
        sb.append(", effDate=").append(effDate);
        sb.append(", expDate=").append(expDate);
        sb.append(", acctItemGroupId=").append(acctItemGroupId);
        sb.append(", statusCd=").append(statusCd);
        sb.append(", priority=").append(priority);
        sb.append(", paymentLimitType=").append(paymentLimitType);
        sb.append(", ifDefaultAcctId=").append(ifDefaultAcctId);
        sb.append(", createStaff=").append(createStaff);
        sb.append(", updateStaff=").append(updateStaff);
        sb.append(", upperAmount=").append(upperAmount);
        sb.append(", statusDate=").append(statusDate);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", lanId=").append(lanId);
        sb.append(", lastOrderItemId=").append(lastOrderItemId);
        sb.append(", segmentId=").append(segmentId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}