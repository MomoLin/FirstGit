package com.momo.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author
 */
public class AcctItemOwe implements Serializable {
    /**
     * 帐目标识
     */
    private Long acctItemId;

    /**
     * 帐户ID
     */
    private Long acctId;

    /**
     * 销帐流水
     */
    private Long billId;

    /**
     * 帐期标识
     */
    private Integer billingCycleId;

    /**
     * 帐目类型标识
     */
    private Integer acctItemTypeId;

    /**
     * 设备标识
     */
    private Long prodInstId;

    /**
     * 金额
     */
    private Double amount;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 费用帐期标识
     */
    private Integer feeCycleId;

    /**
     * 状态
     */
    private Integer statusCd;

    /**
     * 状态时间
     */
    private Date statusDate;

    /**
     * 冲减金额
     */
    private Double balancePaid;

    /**
     * 付款方式
     */
    private Integer paymentMethod;

    /**
     * 分片标识
     */
    private Integer frgId;

    /**
     * 优惠前费用
     */
    private Double oldAmount;

    /**
     * 跳次次数
     */
    private Integer unitNum;

    /**
     * 优惠标识
     */
    private Integer disctExpressId;

    /**
     * 通话时长
     */
    private Integer duration;

    private Long rateDuration;

    /**
     * 区号标识
     */
    private Integer areaId;

    /**
     * 未提供发票金额
     */
    private Double noInvoiceAmount;

    /**
     * 跳次数
     */
    private Long meterReading;

    /**
     * 销售品实例标识
     */
    private Long offerInstId;

    /**
     * 定价计划标识
     */
    private Integer pricingPlanId;

    /**
     * 事件定价策略标识
     */
    private Integer eventPricingStrategyId;

    /**
     * 已提供发票金额
     */
    private Double hadInvoiceAmount;

    /**
     * 缴费账期
     */
    private Integer payCycleId;

    /**
     * 摊分后金额
     */
    private Double partitionCharge;

    /**
     * 主产品来源实例标识
     */
    private Long sourceProdInstId;

    /**
     * 产品标识
     */
    private Integer prodId;

    /**
     * 业务号码
     */
    private String accNum;

    /**
     * 虚增标志
     */
    private String pseudoFlag;

    /**
     * 虚增金额
     */
    private Double pseudoAmount;

    /**
     * 业务标识
     */
    private Integer serviceId;

    /**
     * 客户标识
     */
    private Long custId;

    /**
     * 字节总数
     */
    private Long byteAll;

    /**
     * 子定价标识
     */
    private Integer repositoryId;

    /**
     * 列收业务代码
     */
    private String cpid;

    /**
     * 冲减金额税额
     */
    private Double balancePaidDuty;

    /**
     * 冲减金额单价
     */
    private Double balancepaidAfter;

    /**
     * 税额
     */
    private Double chargeDuty;

    /**
     * 单价
     */
    private Double chargeAfter;

    /**
     * 赠款冲减不提供发票金额税额
     */
    private Double noinvoiceAmountDuty;

    /**
     * 赠款冲减不提供发票金额单价
     */
    private Double noinvoiceAmountAfter;

    /**
     * 税率
     */
    private Double dutyFlag;

    /**
     * 税目
     */
    private Integer dutyItem;

    /**
     * 摊分后的冲减金额
     */
    private Double partitionBalancePaid;

    /**
     * 本地网标识
     */
    private Integer regionId;

    /**
     * 源帐目标识
     */
    private Long oriAcctItemId;

    /**
     * 一次性费用帐目标识
     */
    private Long oneAcctItemId;

    /**
     * 抵收入金额
     */
    private Double presentAmount;

    /**
     * 摊分后帐目类型
     */
    private Integer partitionItemType;

    /**
     * 帐目来源标识
     */
    private Integer itemSourceId;

    /**
     * 重庆增加：功能产品标识
     */
    private Long servProductId;

    private Long mastOfferInstId;

    private Long grpAcctItemTypeNbr;

    /**
     * 重庆增加：税率配置标识
     */
    private Integer taxRateConfigId;

    /**
     * 重庆增加：单价
     */
    private Double price;

    /**
     * 重庆增加：税费
     */
    private Double tax;

    /**
     * 重庆增加：税率
     */
    private Double taxRate;

    private static final long serialVersionUID = 1L;

    public Long getAcctItemId() {
        return acctItemId;
    }

    public void setAcctItemId(Long acctItemId) {
        this.acctItemId = acctItemId;
    }

    public Long getAcctId() {
        return acctId;
    }

    public void setAcctId(Long acctId) {
        this.acctId = acctId;
    }

    public Long getBillId() {
        return billId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
    }

    public Integer getBillingCycleId() {
        return billingCycleId;
    }

    public void setBillingCycleId(Integer billingCycleId) {
        this.billingCycleId = billingCycleId;
    }

    public Integer getAcctItemTypeId() {
        return acctItemTypeId;
    }

    public void setAcctItemTypeId(Integer acctItemTypeId) {
        this.acctItemTypeId = acctItemTypeId;
    }

    public Long getProdInstId() {
        return prodInstId;
    }

    public void setProdInstId(Long prodInstId) {
        this.prodInstId = prodInstId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getFeeCycleId() {
        return feeCycleId;
    }

    public void setFeeCycleId(Integer feeCycleId) {
        this.feeCycleId = feeCycleId;
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

    public Double getBalancePaid() {
        return balancePaid;
    }

    public void setBalancePaid(Double balancePaid) {
        this.balancePaid = balancePaid;
    }

    public Integer getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Integer paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Integer getFrgId() {
        return frgId;
    }

    public void setFrgId(Integer frgId) {
        this.frgId = frgId;
    }

    public Double getOldAmount() {
        return oldAmount;
    }

    public void setOldAmount(Double oldAmount) {
        this.oldAmount = oldAmount;
    }

    public Integer getUnitNum() {
        return unitNum;
    }

    public void setUnitNum(Integer unitNum) {
        this.unitNum = unitNum;
    }

    public Integer getDisctExpressId() {
        return disctExpressId;
    }

    public void setDisctExpressId(Integer disctExpressId) {
        this.disctExpressId = disctExpressId;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Long getRateDuration() {
        return rateDuration;
    }

    public void setRateDuration(Long rateDuration) {
        this.rateDuration = rateDuration;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Double getNoInvoiceAmount() {
        return noInvoiceAmount;
    }

    public void setNoInvoiceAmount(Double noInvoiceAmount) {
        this.noInvoiceAmount = noInvoiceAmount;
    }

    public Long getMeterReading() {
        return meterReading;
    }

    public void setMeterReading(Long meterReading) {
        this.meterReading = meterReading;
    }

    public Long getOfferInstId() {
        return offerInstId;
    }

    public void setOfferInstId(Long offerInstId) {
        this.offerInstId = offerInstId;
    }

    public Integer getPricingPlanId() {
        return pricingPlanId;
    }

    public void setPricingPlanId(Integer pricingPlanId) {
        this.pricingPlanId = pricingPlanId;
    }

    public Integer getEventPricingStrategyId() {
        return eventPricingStrategyId;
    }

    public void setEventPricingStrategyId(Integer eventPricingStrategyId) {
        this.eventPricingStrategyId = eventPricingStrategyId;
    }

    public Double getHadInvoiceAmount() {
        return hadInvoiceAmount;
    }

    public void setHadInvoiceAmount(Double hadInvoiceAmount) {
        this.hadInvoiceAmount = hadInvoiceAmount;
    }

    public Integer getPayCycleId() {
        return payCycleId;
    }

    public void setPayCycleId(Integer payCycleId) {
        this.payCycleId = payCycleId;
    }

    public Double getPartitionCharge() {
        return partitionCharge;
    }

    public void setPartitionCharge(Double partitionCharge) {
        this.partitionCharge = partitionCharge;
    }

    public Long getSourceProdInstId() {
        return sourceProdInstId;
    }

    public void setSourceProdInstId(Long sourceProdInstId) {
        this.sourceProdInstId = sourceProdInstId;
    }

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public String getAccNum() {
        return accNum;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public String getPseudoFlag() {
        return pseudoFlag;
    }

    public void setPseudoFlag(String pseudoFlag) {
        this.pseudoFlag = pseudoFlag;
    }

    public Double getPseudoAmount() {
        return pseudoAmount;
    }

    public void setPseudoAmount(Double pseudoAmount) {
        this.pseudoAmount = pseudoAmount;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public Long getByteAll() {
        return byteAll;
    }

    public void setByteAll(Long byteAll) {
        this.byteAll = byteAll;
    }

    public Integer getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    public String getCpid() {
        return cpid;
    }

    public void setCpid(String cpid) {
        this.cpid = cpid;
    }

    public Double getBalancePaidDuty() {
        return balancePaidDuty;
    }

    public void setBalancePaidDuty(Double balancePaidDuty) {
        this.balancePaidDuty = balancePaidDuty;
    }

    public Double getBalancepaidAfter() {
        return balancepaidAfter;
    }

    public void setBalancepaidAfter(Double balancepaidAfter) {
        this.balancepaidAfter = balancepaidAfter;
    }

    public Double getChargeDuty() {
        return chargeDuty;
    }

    public void setChargeDuty(Double chargeDuty) {
        this.chargeDuty = chargeDuty;
    }

    public Double getChargeAfter() {
        return chargeAfter;
    }

    public void setChargeAfter(Double chargeAfter) {
        this.chargeAfter = chargeAfter;
    }

    public Double getNoinvoiceAmountDuty() {
        return noinvoiceAmountDuty;
    }

    public void setNoinvoiceAmountDuty(Double noinvoiceAmountDuty) {
        this.noinvoiceAmountDuty = noinvoiceAmountDuty;
    }

    public Double getNoinvoiceAmountAfter() {
        return noinvoiceAmountAfter;
    }

    public void setNoinvoiceAmountAfter(Double noinvoiceAmountAfter) {
        this.noinvoiceAmountAfter = noinvoiceAmountAfter;
    }

    public Double getDutyFlag() {
        return dutyFlag;
    }

    public void setDutyFlag(Double dutyFlag) {
        this.dutyFlag = dutyFlag;
    }

    public Integer getDutyItem() {
        return dutyItem;
    }

    public void setDutyItem(Integer dutyItem) {
        this.dutyItem = dutyItem;
    }

    public Double getPartitionBalancePaid() {
        return partitionBalancePaid;
    }

    public void setPartitionBalancePaid(Double partitionBalancePaid) {
        this.partitionBalancePaid = partitionBalancePaid;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public Long getOriAcctItemId() {
        return oriAcctItemId;
    }

    public void setOriAcctItemId(Long oriAcctItemId) {
        this.oriAcctItemId = oriAcctItemId;
    }

    public Long getOneAcctItemId() {
        return oneAcctItemId;
    }

    public void setOneAcctItemId(Long oneAcctItemId) {
        this.oneAcctItemId = oneAcctItemId;
    }

    public Double getPresentAmount() {
        return presentAmount;
    }

    public void setPresentAmount(Double presentAmount) {
        this.presentAmount = presentAmount;
    }

    public Integer getPartitionItemType() {
        return partitionItemType;
    }

    public void setPartitionItemType(Integer partitionItemType) {
        this.partitionItemType = partitionItemType;
    }

    public Integer getItemSourceId() {
        return itemSourceId;
    }

    public void setItemSourceId(Integer itemSourceId) {
        this.itemSourceId = itemSourceId;
    }

    public Long getServProductId() {
        return servProductId;
    }

    public void setServProductId(Long servProductId) {
        this.servProductId = servProductId;
    }

    public Long getMastOfferInstId() {
        return mastOfferInstId;
    }

    public void setMastOfferInstId(Long mastOfferInstId) {
        this.mastOfferInstId = mastOfferInstId;
    }

    public Long getGrpAcctItemTypeNbr() {
        return grpAcctItemTypeNbr;
    }

    public void setGrpAcctItemTypeNbr(Long grpAcctItemTypeNbr) {
        this.grpAcctItemTypeNbr = grpAcctItemTypeNbr;
    }

    public Integer getTaxRateConfigId() {
        return taxRateConfigId;
    }

    public void setTaxRateConfigId(Integer taxRateConfigId) {
        this.taxRateConfigId = taxRateConfigId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", acctItemId=").append(acctItemId);
        sb.append(", acctId=").append(acctId);
        sb.append(", billId=").append(billId);
        sb.append(", billingCycleId=").append(billingCycleId);
        sb.append(", acctItemTypeId=").append(acctItemTypeId);
        sb.append(", prodInstId=").append(prodInstId);
        sb.append(", amount=").append(amount);
        sb.append(", createDate=").append(createDate);
        sb.append(", feeCycleId=").append(feeCycleId);
        sb.append(", statusCd=").append(statusCd);
        sb.append(", statusDate=").append(statusDate);
        sb.append(", balancePaid=").append(balancePaid);
        sb.append(", paymentMethod=").append(paymentMethod);
        sb.append(", frgId=").append(frgId);
        sb.append(", oldAmount=").append(oldAmount);
        sb.append(", unitNum=").append(unitNum);
        sb.append(", disctExpressId=").append(disctExpressId);
        sb.append(", duration=").append(duration);
        sb.append(", rateDuration=").append(rateDuration);
        sb.append(", areaId=").append(areaId);
        sb.append(", noInvoiceAmount=").append(noInvoiceAmount);
        sb.append(", meterReading=").append(meterReading);
        sb.append(", offerInstId=").append(offerInstId);
        sb.append(", pricingPlanId=").append(pricingPlanId);
        sb.append(", eventPricingStrategyId=").append(eventPricingStrategyId);
        sb.append(", hadInvoiceAmount=").append(hadInvoiceAmount);
        sb.append(", payCycleId=").append(payCycleId);
        sb.append(", partitionCharge=").append(partitionCharge);
        sb.append(", sourceProdInstId=").append(sourceProdInstId);
        sb.append(", prodId=").append(prodId);
        sb.append(", accNum=").append(accNum);
        sb.append(", pseudoFlag=").append(pseudoFlag);
        sb.append(", pseudoAmount=").append(pseudoAmount);
        sb.append(", serviceId=").append(serviceId);
        sb.append(", custId=").append(custId);
        sb.append(", byteAll=").append(byteAll);
        sb.append(", repositoryId=").append(repositoryId);
        sb.append(", cpid=").append(cpid);
        sb.append(", balancePaidDuty=").append(balancePaidDuty);
        sb.append(", balancepaidAfter=").append(balancepaidAfter);
        sb.append(", chargeDuty=").append(chargeDuty);
        sb.append(", chargeAfter=").append(chargeAfter);
        sb.append(", noinvoiceAmountDuty=").append(noinvoiceAmountDuty);
        sb.append(", noinvoiceAmountAfter=").append(noinvoiceAmountAfter);
        sb.append(", dutyFlag=").append(dutyFlag);
        sb.append(", dutyItem=").append(dutyItem);
        sb.append(", partitionBalancePaid=").append(partitionBalancePaid);
        sb.append(", regionId=").append(regionId);
        sb.append(", oriAcctItemId=").append(oriAcctItemId);
        sb.append(", oneAcctItemId=").append(oneAcctItemId);
        sb.append(", presentAmount=").append(presentAmount);
        sb.append(", partitionItemType=").append(partitionItemType);
        sb.append(", itemSourceId=").append(itemSourceId);
        sb.append(", servProductId=").append(servProductId);
        sb.append(", mastOfferInstId=").append(mastOfferInstId);
        sb.append(", grpAcctItemTypeNbr=").append(grpAcctItemTypeNbr);
        sb.append(", taxRateConfigId=").append(taxRateConfigId);
        sb.append(", price=").append(price);
        sb.append(", tax=").append(tax);
        sb.append(", taxRate=").append(taxRate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}