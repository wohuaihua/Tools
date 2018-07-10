package com.meyacom.pcis.policy.bom;

import java.util.Date;

/**
 * 【快速出单】新增固定特约表 WEB_APP_FIX_SPEC WEB_PLY_FIX_SPEC
 * 
 * @author pxg 2012-09-06
 */

public class IAbstractFixSpecVO {

	private String CPkId; // C_PK_ID 主键
	private String CAppNo; // C_APP_NO 申请单号
	private String CPlyNo; // C_PLY_NO 保单号
	private String CEdrNo; // C_EDR_NO 批单号
	private Long NEdrPrjNo; // C_EDR_PRJ_NO 批改序号
	private Long NSeqNo; // N_SEQ_NO 序号
	private String CSpecNo; // C_SPEC_NO 特别约定代码
	private String CSpecContent; // C_SPEC_CONTENT 特别约定代码
	private String CSysSpecContent; // C_SYS_SPEC_CONTENT 特别约定内容(客户可修改的特约)
	private String CChgMrk; // C_CHG_MRK "是否变更(Y：是N：否)默认为N"
	private String CCrtCde; // C_CRT_CDE 创建人
	private Date TCrtTm; // T_CRT_TM 创建时间
	private String CUpdCde; // C_UPD_CDE 修改人
	private Date TUpdTm; // T_UPD_TM 修改时间

	private String CLatestMrk; // 最新标志
	private String CRowId;



	public Long getNEdrPrjNo() {
		return NEdrPrjNo;
	}

	public void setNEdrPrjNo(Long nEdrPrjNo) {
		NEdrPrjNo = nEdrPrjNo;
	}

	public String getCRowId() {
		return CRowId;
	}

	public void setCRowId(String cRowId) {
		CRowId = cRowId;
	}

	public String getCLatestMrk() {
		return CLatestMrk;
	}

	public void setCLatestMrk(String cLatestMrk) {
		CLatestMrk = cLatestMrk;
	}

	public String getCPkId() {
		return CPkId;
	}

	public void setCPkId(String pkId) {
		CPkId = pkId;
	}

	public String getCAppNo() {
		return CAppNo;
	}

	public void setCAppNo(String appNo) {
		CAppNo = appNo;
	}

	public String getCPlyNo() {
		return CPlyNo;
	}

	public void setCPlyNo(String plyNo) {
		CPlyNo = plyNo;
	}

	public String getCEdrNo() {
		return CEdrNo;
	}

	public void setCEdrNo(String edrNo) {
		CEdrNo = edrNo;
	}

	public Long getNSeqNo() {
		return NSeqNo;
	}

	public void setNSeqNo(Long seqNo) {
		NSeqNo = seqNo;
	}

	public String getCSpecNo() {
		return CSpecNo;
	}

	public void setCSpecNo(String specNo) {
		CSpecNo = specNo;
	}

	public String getCSpecContent() {
		return CSpecContent;
	}

	public void setCSpecContent(String specContent) {
		CSpecContent = specContent;
	}

	public String getCSysSpecContent() {
		return CSysSpecContent;
	}

	public void setCSysSpecContent(String sysSpecContent) {
		CSysSpecContent = sysSpecContent;
	}

	public String getCChgMrk() {
		return CChgMrk;
	}

	public void setCChgMrk(String chgMrk) {
		CChgMrk = chgMrk;
	}

	public String getCCrtCde() {
		return CCrtCde;
	}

	public void setCCrtCde(String crtCde) {
		CCrtCde = crtCde;
	}

	public Date getTCrtTm() {
		return TCrtTm;
	}

	public void setTCrtTm(Date crtTm) {
		TCrtTm = crtTm;
	}

	public String getCUpdCde() {
		return CUpdCde;
	}

	public void setCUpdCde(String updCde) {
		CUpdCde = updCde;
	}

	public Date getTUpdTm() {
		return TUpdTm;
	}

	public void setTUpdTm(Date updTm) {
		TUpdTm = updTm;
	}

}