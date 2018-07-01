package com.meyacom.result;

import java.io.Serializable;
import java.util.*;

/**
 * 校验结果
 */
public class Result implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8628918275743697660L;

	/**
	 * 返回规则集合信息
	 */
	private List<RuleResult> ruleResult=new ArrayList<RuleResult>();

	/**
	 * 最高权限
	 */
	private String maxPower;

	/**
	 * 核保标示
	 */
	private String uwMark;

	public List<RuleResult> getRuleResult() {
		return ruleResult;
	}
	public void setRuleResult(List<RuleResult> ruleResult) {
		this.ruleResult = ruleResult;
	}

	public String getMaxPower() {
		return maxPower;
	}
	public void setMaxPower(String maxPower) {
		this.maxPower = maxPower;
	}

	public String getUwMark() {
		return uwMark;
	}
	public void setUwMark(String uwMark) {
		this.uwMark = uwMark;
	}
	public void addPower(String ruleId,String uwPower){
		this.ruleResult.add(new RuleResult(ruleId, uwPower));
		
	}

}