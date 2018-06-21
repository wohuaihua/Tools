package com.meyacom.bom;

import java.io.Serializable;

/**
 * 投保人信息
 */
public class ApplicantInfoBom implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7608064090833616950L;

	/**
	 * 客户名称
	 */
	private String CAppNme;

	/**
	 * 投保人性质
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
	private String CProvince;

	/**
	 * 与被保险人关系
	 */
	private String CRelCde;

	public String getCAppNme() {
		return CAppNme;
	}
	public void setCAppNme(String CAppNme) {
		this.CAppNme = CAppNme;
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

	public String getCProvince() {
		return CProvince;
	}
	public void setCProvince(String CProvince) {
		this.CProvince = CProvince;
	}

	public String getCRelCde() {
		return CRelCde;
	}
	public void setCRelCde(String CRelCde) {
		this.CRelCde = CRelCde;
	}

}