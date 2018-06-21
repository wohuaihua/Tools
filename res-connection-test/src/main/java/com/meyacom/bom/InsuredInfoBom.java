package com.meyacom.bom;

import java.io.Serializable;

/**
 * 被保人信息
 */
public class InsuredInfoBom implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8110048188540208173L;

	/**
	 * 客户名称
	 */
	private String CInsuredNme;

	/**
	 * 被保人性质
	 */
	private String CClntMrk;

	/**
	 * 证件类型
	 */
	private String CCertfCls;

	/**
	 * 证件号码
	 */
	private String CCertfCde;

	/**
	 * 通讯地址
	 */
	private String CCountry;

	/**
	 * 职业大类
	 */
	private String COccupCde;

	/**
	 * 职业明细分类
	 */
	private String CResvTxt1;

	/**
	 * 职业名称
	 */
	private String CPosition;

	/**
	 * 职业类别
	 */
	private String CDuty;

	/**
	 * 年龄
	 */
	private Double NAge;

	public String getCInsuredNme() {
		return CInsuredNme;
	}
	public void setCInsuredNme(String CInsuredNme) {
		this.CInsuredNme = CInsuredNme;
	}

	public String getCClntMrk() {
		return CClntMrk;
	}
	public void setCClntMrk(String CClntMrk) {
		this.CClntMrk = CClntMrk;
	}

	public String getCCertfCls() {
		return CCertfCls;
	}
	public void setCCertfCls(String CCertfCls) {
		this.CCertfCls = CCertfCls;
	}

	public String getCCertfCde() {
		return CCertfCde;
	}
	public void setCCertfCde(String CCertfCde) {
		this.CCertfCde = CCertfCde;
	}

	public String getCCountry() {
		return CCountry;
	}
	public void setCCountry(String CCountry) {
		this.CCountry = CCountry;
	}

	public String getCOccupCde() {
		return COccupCde;
	}
	public void setCOccupCde(String COccupCde) {
		this.COccupCde = COccupCde;
	}

	public String getCResvTxt1() {
		return CResvTxt1;
	}
	public void setCResvTxt1(String CResvTxt1) {
		this.CResvTxt1 = CResvTxt1;
	}

	public String getCPosition() {
		return CPosition;
	}
	public void setCPosition(String CPosition) {
		this.CPosition = CPosition;
	}

	public String getCDuty() {
		return CDuty;
	}
	public void setCDuty(String CDuty) {
		this.CDuty = CDuty;
	}

	public Double getNAge() {
		return NAge;
	}
	public void setNAge(Double NAge) {
		this.NAge = NAge;
	}

}