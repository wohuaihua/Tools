package com.meyacom.result;

import java.io.Serializable;

/**
 * 返回规则信息
 */
public class RuleResult implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1062411904236257976L;

	/**
	 * 规则名称
	 */
	private String ruleId;

	/**
	 * 核保权限
	 */
	private String uwPower;

	public String getRuleId() {
		return ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public String getUwPower() {
		return uwPower;
	}
	public void setUwPower(String uwPower) {
		this.uwPower = uwPower;
	}
	public RuleResult(String ruleId,String uwPower){
		this.ruleId=ruleId;
		this.uwPower=uwPower;
	}

}