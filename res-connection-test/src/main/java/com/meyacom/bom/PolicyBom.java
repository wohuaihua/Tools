package com.meyacom.bom;

import java.io.Serializable;
import java.util.*;

/**
 * 保单
 */
public class PolicyBom implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1623251358680283511L;

	/**
	 * 基本信息
	 */
	private BaseBom baseBom;

	/**
	 * 标的信息
	 */
	private TgtInfoBom tgtInfoBom;

	/**
	 * 投保人信息
	 */
	private ApplicantInfoBom applicantInfoBom;

	/**
	 * 被保人信息
	 */
	private InsuredInfoBom insuredInfoBom;

	/**
	 * 险别信息列表
	 */
	private List<CvrgInfoBom> cvrgInfoBom;

	public BaseBom getBaseBom() {
		return baseBom;
	}
	public void setBaseBom(BaseBom baseBom) {
		this.baseBom = baseBom;
	}

	public TgtInfoBom getTgtInfoBom() {
		return tgtInfoBom;
	}
	public void setTgtInfoBom(TgtInfoBom tgtInfoBom) {
		this.tgtInfoBom = tgtInfoBom;
	}

	public ApplicantInfoBom getApplicantInfoBom() {
		return applicantInfoBom;
	}
	public void setApplicantInfoBom(ApplicantInfoBom applicantInfoBom) {
		this.applicantInfoBom = applicantInfoBom;
	}

	public InsuredInfoBom getInsuredInfoBom() {
		return insuredInfoBom;
	}
	public void setInsuredInfoBom(InsuredInfoBom insuredInfoBom) {
		this.insuredInfoBom = insuredInfoBom;
	}

	public List<CvrgInfoBom> getCvrgInfoBom() {
		return cvrgInfoBom;
	}
	public void setCvrgInfoBom(List<CvrgInfoBom> cvrgInfoBom) {
		this.cvrgInfoBom = cvrgInfoBom;
	}

}