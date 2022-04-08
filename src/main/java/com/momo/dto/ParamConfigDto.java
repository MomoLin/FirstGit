package com.momo.dto;

import java.io.Serializable;

/**
 * <p>
 * Title:
 * </p>
 * <p>
 * Description: PARAM_CONFIG表的Dto对象
 * </p>
 * <p>
 * Copyright: Copyright (c) 2011
 * </p>
 * <p>
 * Company: ztesoft
 * </p>
 * <p>
 * Created on 2011-4-13 上午11:39:52
 * </p>
 *
 * @author 宋成好
 */
public class ParamConfigDto implements Serializable {

    /** 参数标识：主键 **/
    private int paramId;

    /** 参数名：唯一索引 **/
    private String paramName;

    /** 生效：只读，立即，定时，重启 **/
    private String effectRule;

    /** 最小值 **/
    private String minValue;

    /** 最大值 **/
    private String maxValue;

    /** 默认值 **/
    private String defaultValue;

    /** 枚举值 **/
    private String enumValue;

    /** 参数组，同一组的参数需同时修改，单独修改时报错，-1表示不分组 **/
    private int paramGroup = -1;

    private String paramGroupName;

    /**
     * SERVICE:业务类 MEMORY:内存类 RESOURCE:资源类 OTHER:其他类
     **/
    private String paramType = "SERVICE";

    /**
     * 1：全局参数 2：本地参数
     **/
    private String paramScope = "1";

    /**
     * 0：不需加密 1：DES加密
     **/
    private String encryptType = "0";

    /**
     * 0：不校验 1：增长的，只能改大，不能改小。
     **/
    private String increased = "0";

    /** 参数描述 **/
    private String remark;

    /**
     * 参数状态：00A有效 ，00X失效
     **/
    private String state;


    public int getParamId() {
        return paramId;
    }

    public void setParamId(int paramId) {
        this.paramId = paramId;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public String getEffectRule() {
        return effectRule;
    }

    public void setEffectRule(String effectRule) {
        this.effectRule = effectRule;
    }

    public String getMinValue() {
        return minValue;
    }

    public void setMinValue(String minValue) {
        this.minValue = minValue;
    }

    public String getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(String maxValue) {
        this.maxValue = maxValue;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getEnumValue() {
        return enumValue;
    }

    public void setEnumValue(String enumValue) {
        this.enumValue = enumValue;
    }

    public int getParamGroup() {
        return paramGroup;
    }

    public void setParamGroup(int paramGroup) {
        this.paramGroup = paramGroup;
    }

    public String getParamGroupName() {
        return paramGroupName;
    }

    public void setParamGroupName(String paramGroupName) {
        this.paramGroupName = paramGroupName;
    }

    public String getParamType() {
        return paramType;
    }

    public void setParamType(String paramType) {
        this.paramType = paramType;
    }

    public String getParamScope() {
        return paramScope;
    }

    public void setParamScope(String paramScope) {
        this.paramScope = paramScope;
    }

    public String getEncryptType() {
        return encryptType;
    }

    public void setEncryptType(String encryptType) {
        this.encryptType = encryptType;
    }

    public String getIncreased() {
        return increased;
    }

    public void setIncreased(String increased) {
        this.increased = increased;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

	@Override
	public String toString() {
		return "ParamConfigDto{" +
				"paramId=" + paramId +
				", paramName='" + paramName + '\'' +
				", effectRule='" + effectRule + '\'' +
				", minValue='" + minValue + '\'' +
				", maxValue='" + maxValue + '\'' +
				", defaultValue='" + defaultValue + '\'' +
				", enumValue='" + enumValue + '\'' +
				", paramGroup=" + paramGroup +
				", paramGroupName='" + paramGroupName + '\'' +
				", paramType='" + paramType + '\'' +
				", paramScope='" + paramScope + '\'' +
				", encryptType='" + encryptType + '\'' +
				", increased='" + increased + '\'' +
				", remark='" + remark + '\'' +
				", state='" + state + '\'' +
				'}';
	}
}
