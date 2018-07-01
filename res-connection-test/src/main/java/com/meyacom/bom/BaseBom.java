package com.meyacom.bom;

import java.io.Serializable;
import java.util.*;

/**
 * 基本信息
 */
public class BaseBom implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7314534088099902453L;

	/**
	 * 投保单号
	 */
	private String CAppNo;

	/**
	 * 保单号
	 */
	private String CPlyNo;

	/**
	 * 渠道分类
	 */
	private String CBsnsTyp;

	/**
	 * 机构部门
	 */
	private String CDptCde;

	/**
	 * 业务来源
	 */
	private String CChaType;

	/**
	 * 业务员员工号
	 */
	private String CSlsId;

	/**
	 * 投保日期
	 */
	private Date TAppTm;

	/**
	 * 保险起期
	 */
	private Date TInsrncBgnTm;

	/**
	 * 保险止期
	 */
	private Date TInsrncEndTm;

	/**
	 * 产品代码
	 */
	private String CProdNo;

	/**
	 * 是否团单
	 */
	private String CGrpMrk;

	/**
	 * 共保业务
	 */
	private String CCiTyp;

	/**
	 * 是否家庭单
	 */
	private String CFamilyMrk;

	/**
	 * 核保补录天数
	 */
	private int Reserve1;

	/**
	 * 是否允许临分
	 */
	private String CRiFacMrk;

	/**
	 * 被保险人清单平均年龄
	 */
	private int Reserve2;

	/**
	 * 历史赔付率
	 */
	private String Reserve3;

	/**
	 * 过往历史理赔记录
	 */
	private String Reserve4;

	/**
	 * 是否单投团体补充医疗保险
	 */
	private String Reserve5;

	/**
	 * 是否暂保
	 */
	private String Reserve6;

	/**
	 * 每人附加自留保额
	 */
	private Double Reserve7;

	/**
	 * 是否长途货车
	 */
	private String Reserve8;

	/**
	 * 特别约定编码
	 */
	private String Reserve9;

	public String getCAppNo() {
		return CAppNo;
	}
	public void setCAppNo(String CAppNo) {
		this.CAppNo = CAppNo;
	}

	public String getCPlyNo() {
		return CPlyNo;
	}
	public void setCPlyNo(String CPlyNo) {
		this.CPlyNo = CPlyNo;
	}

	public String getCBsnsTyp() {
		return CBsnsTyp;
	}
	public void setCBsnsTyp(String CBsnsTyp) {
		this.CBsnsTyp = CBsnsTyp;
	}

	public String getCDptCde() {
		return CDptCde;
	}
	public void setCDptCde(String CDptCde) {
		this.CDptCde = CDptCde;
	}

	public String getCChaType() {
		return CChaType;
	}
	public void setCChaType(String CChaType) {
		this.CChaType = CChaType;
	}

	public String getCSlsId() {
		return CSlsId;
	}
	public void setCSlsId(String CSlsId) {
		this.CSlsId = CSlsId;
	}

	public Date getTAppTm() {
		return TAppTm;
	}
	public void setTAppTm(Date TAppTm) {
		this.TAppTm = TAppTm;
	}

	public Date getTInsrncBgnTm() {
		return TInsrncBgnTm;
	}
	public void setTInsrncBgnTm(Date TInsrncBgnTm) {
		this.TInsrncBgnTm = TInsrncBgnTm;
	}

	public Date getTInsrncEndTm() {
		return TInsrncEndTm;
	}
	public void setTInsrncEndTm(Date TInsrncEndTm) {
		this.TInsrncEndTm = TInsrncEndTm;
	}

	public String getCProdNo() {
		return CProdNo;
	}
	public void setCProdNo(String CProdNo) {
		this.CProdNo = CProdNo;
	}

	public String getCGrpMrk() {
		return CGrpMrk;
	}
	public void setCGrpMrk(String CGrpMrk) {
		this.CGrpMrk = CGrpMrk;
	}

	public String getCCiTyp() {
		return CCiTyp;
	}
	public void setCCiTyp(String CCiTyp) {
		this.CCiTyp = CCiTyp;
	}

	public String getCFamilyMrk() {
		return CFamilyMrk;
	}
	public void setCFamilyMrk(String CFamilyMrk) {
		this.CFamilyMrk = CFamilyMrk;
	}

	public int getReserve1() {
		return Reserve1;
	}
	public void setReserve1(int Reserve1) {
		this.Reserve1 = Reserve1;
	}

	public String getCRiFacMrk() {
		return CRiFacMrk;
	}
	public void setCRiFacMrk(String CRiFacMrk) {
		this.CRiFacMrk = CRiFacMrk;
	}

	public int getReserve2() {
		return Reserve2;
	}
	public void setReserve2(int Reserve2) {
		this.Reserve2 = Reserve2;
	}

	public String getReserve3() {
		return Reserve3;
	}
	public void setReserve3(String Reserve3) {
		this.Reserve3 = Reserve3;
	}

	public String getReserve4() {
		return Reserve4;
	}
	public void setReserve4(String Reserve4) {
		this.Reserve4 = Reserve4;
	}

	public String getReserve5() {
		return Reserve5;
	}
	public void setReserve5(String Reserve5) {
		this.Reserve5 = Reserve5;
	}

	public String getReserve6() {
		return Reserve6;
	}
	public void setReserve6(String Reserve6) {
		this.Reserve6 = Reserve6;
	}

	public Double getReserve7() {
		return Reserve7;
	}
	public void setReserve7(Double Reserve7) {
		this.Reserve7 = Reserve7;
	}

	public String getReserve8() {
		return Reserve8;
	}
	public void setReserve8(String Reserve8) {
		this.Reserve8 = Reserve8;
	}

	public String getReserve9() {
		return Reserve9;
	}
	public void setReserve9(String Reserve9) {
		this.Reserve9 = Reserve9;
	}

}