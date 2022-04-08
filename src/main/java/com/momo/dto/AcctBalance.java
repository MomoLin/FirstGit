package com.momo.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author
 *
 */
public class AcctBalance implements Serializable {
    /**
     * 主键id,pk
     */
    private Long acctBalanceId;

    private Integer balanceTypeId;

    private Date effDate;

    private Date expDate;

    private double balance;

    private double cycleUpper;

    private double cycleLower;

    private Integer statusCd;

    private Date statusDate;

    private double needInvoiceAmount;

    private Integer regionId;

    private Long acctId;

    private double reserveBalance;

    private Integer shareRuleFlag;

    private Long offerInstId;

    private double percent;

    private double initBalance;

    private String remark;

    private Date createDate;

    private Integer cycleType;

    private static final long serialVersionUID = 1L;

    public Long getAcctBalanceId() {
        return acctBalanceId;
    }

    public void setAcctBalanceId(Long acctBalanceId) {
        this.acctBalanceId = acctBalanceId;
    }

    public Integer getBalanceTypeId() {
        return balanceTypeId;
    }

    public void setBalanceTypeId(Integer balanceTypeId) {
        this.balanceTypeId = balanceTypeId;
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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCycleUpper() {
        return cycleUpper;
    }

    public void setCycleUpper(double cycleUpper) {
        this.cycleUpper = cycleUpper;
    }

    public double getCycleLower() {
        return cycleLower;
    }

    public void setCycleLower(double cycleLower) {
        this.cycleLower = cycleLower;
    }

    public Integer getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(Integer statusCd) {
        this.statusCd = statusCd;
    }

    public Date getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }

    public double getNeedInvoiceAmount() {
        return needInvoiceAmount;
    }

    public void setNeedInvoiceAmount(double needInvoiceAmount) {
        this.needInvoiceAmount = needInvoiceAmount;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public Long getAcctId() {
        return acctId;
    }

    public void setAcctId(Long acctId) {
        this.acctId = acctId;
    }

    public double getReserveBalance() {
        return reserveBalance;
    }

    public void setReserveBalance(double reserveBalance) {
        this.reserveBalance = reserveBalance;
    }

    public Integer getShareRuleFlag() {
        return shareRuleFlag;
    }

    public void setShareRuleFlag(Integer shareRuleFlag) {
        this.shareRuleFlag = shareRuleFlag;
    }

    public Long getOfferInstId() {
        return offerInstId;
    }

    public void setOfferInstId(Long offerInstId) {
        this.offerInstId = offerInstId;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public double getInitBalance() {
        return initBalance;
    }

    public void setInitBalance(double initBalance) {
        this.initBalance = initBalance;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getCycleType() {
        return cycleType;
    }

    public void setCycleType(Integer cycleType) {
        this.cycleType = cycleType;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", acctBalanceId=").append(acctBalanceId);
        sb.append(", balanceTypeId=").append(balanceTypeId);
        sb.append(", effDate=").append(effDate);
        sb.append(", expDate=").append(expDate);
        sb.append(", balance=").append(balance);
        sb.append(", cycleUpper=").append(cycleUpper);
        sb.append(", cycleLower=").append(cycleLower);
        sb.append(", statusCd=").append(statusCd);
        sb.append(", statusDate=").append(statusDate);
        sb.append(", needInvoiceAmount=").append(needInvoiceAmount);
        sb.append(", regionId=").append(regionId);
        sb.append(", acctId=").append(acctId);
        sb.append(", reserveBalance=").append(reserveBalance);
        sb.append(", shareRuleFlag=").append(shareRuleFlag);
        sb.append(", offerInstId=").append(offerInstId);
        sb.append(", percent=").append(percent);
        sb.append(", initBalance=").append(initBalance);
        sb.append(", remark=").append(remark);
        sb.append(", createDate=").append(createDate);
        sb.append(", cycleType=").append(cycleType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}