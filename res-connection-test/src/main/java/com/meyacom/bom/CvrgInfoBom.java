package com.meyacom.bom;

import java.io.Serializable;

/**
 * 险别信息
 */
public class CvrgInfoBom implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1877169253569662490L;

	/**
	 * 险别代码
	 */
	private String CCvrgNo;

	/**
	 * 保险金额
	 */
	private Double NAmt;

	/**
	 * 每人保险金额
	 */
	private Double NPerAmt;

	/**
	 * 人数
	 */
	private Double NResvNum3;

	/**
	 * 职业大类
	 */
	private String CResvTxt20;

	/**
	 * 职业明细分类
	 */
	private String CResvTxt21;

	/**
	 * 职业名称
	 */
	private String CResvTxt22;

	/**
	 * 职业类别
	 */
	private String CResvTxt23;

	/**
	 * 每日补贴金额
	 */
	private Double NResvNum4;

	public String getCCvrgNo() {
		return CCvrgNo;
	}
	public void setCCvrgNo(String CCvrgNo) {
		this.CCvrgNo = CCvrgNo;
	}

	public Double getNAmt() {
		return NAmt;
	}
	public void setNAmt(Double NAmt) {
		this.NAmt = NAmt;
	}

	public Double getNPerAmt() {
		return NPerAmt;
	}
	public void setNPerAmt(Double NPerAmt) {
		this.NPerAmt = NPerAmt;
	}

	public Double getNResvNum3() {
		return NResvNum3;
	}
	public void setNResvNum3(Double NResvNum3) {
		this.NResvNum3 = NResvNum3;
	}

	public String getCResvTxt20() {
		return CResvTxt20;
	}
	public void setCResvTxt20(String CResvTxt20) {
		this.CResvTxt20 = CResvTxt20;
	}

	public String getCResvTxt21() {
		return CResvTxt21;
	}
	public void setCResvTxt21(String CResvTxt21) {
		this.CResvTxt21 = CResvTxt21;
	}

	public String getCResvTxt22() {
		return CResvTxt22;
	}
	public void setCResvTxt22(String CResvTxt22) {
		this.CResvTxt22 = CResvTxt22;
	}

	public String getCResvTxt23() {
		return CResvTxt23;
	}
	public void setCResvTxt23(String CResvTxt23) {
		this.CResvTxt23 = CResvTxt23;
	}

	public Double getNResvNum4() {
		return NResvNum4;
	}
	public void setNResvNum4(Double NResvNum4) {
		this.NResvNum4 = NResvNum4;
	}

}