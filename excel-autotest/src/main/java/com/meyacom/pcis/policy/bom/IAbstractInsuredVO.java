package com.meyacom.pcis.policy.bom;

import java.util.Date;

/**
 * AbstractInsuredVO entity - Base definition for InsuredVO and InsAppuredVO .
 *
 * @author jiangqf@isoftstone-ai.com
 */

public class IAbstractInsuredVO {

    // Fields

    /**WEB_PLY_INSURED */
    private String CPkId;//C_PK_ID PKID 主键
    /** */
    private String CAppNo;//C_APP_NO 申请单号,批改申请单号
    /** */
    private String CPlyNo;//C_PLY_NO 保单号 
    /** */
    private String CEdrNo;//C_EDR_NO 批单号
	private Long NEdrPrjNo;//N_EDR_PRJ_NO 批改序号,批改次数
    /** */
    private String CLatestMrk;////C_LATEST_MRK 最新保单标志,'0'否,'1'是
    private Long NSeqNo;//N_SEQ_NO 序号
    /** */
    private String CInsuredCde;//C_INSURED_CDE 被保人编码
    /** */
    private String CInsuredNme;//C_INSURED_NME 被保人名称
    /** */
    private String CCertfCls;//C_CERTF_CLS 证件类型
    /** */
    private String CCertfCde;//C_CERTF_CDE 证件号码
    /** */
   // private String CStkMrk;//C_STK_MRK 股东客户标志
    /** */
    private String CCusLvl;//C_CUS_LVL 客户等级
    /** */
    private String CClntMrk;//C_CLNT_MRK 客户分类,客户分类,0 法人，1 个人
    /** */
    private String CCntrNme;//C_CNTR_NME 联系人,投保人联系人
    /** */
    private String CTel;//C_TEL 固定电话,电话
    /** */
    private String CMobile;//C_MOBILE 移动电话
    /** */
    private String CEmail;//C_EMAIL EMAIL
    /** */
    private String CCountry;//C_COUNTRY 国家
    /** */
    private String CProvince;//C_PROVINCE 省份
    /** */
    private String CCity;//C_CITY 地市
    /** */
    private String CCounty;// C_COUNTY 县
    /** */
    private String CSuffixAddr;//C_SUFFIX_ADDR 街
    /** */
    private String CClntAddr;//C_CLNT_ADDR 地址
    /** */
    private String CZipCde;// C_ZIP_CDE 邮编
    /** */
    private String CResidAddr;//C_RESID_ADDR 居住地址
    /** */
    private String CResidZip;//C_RESID_ZIP 居住地址邮编
    /** */
    private String CWorkDpt;//C_WORK_DPT 工作单位
    /** */
    private String CWorkDptAddr;//C_WORK_DPT_ADDR 工作单位地址
    /** */
    private String CWorkDptZip;//C_WORK_DPT_ZIP 工作单位邮编
    /** */
    private String CSex;//C_SEX 性别
    /** */
    private Date TBirthday;//T_BIRTHDAY 出生日期,出生年月
    /** */
    private String CHealthCde;//C_HEALTH_CDE 健康状况代码
    /** */
    private String CHealthDesc;//C_HEALTH_DESC 健康状况说明
    /** */
    private String CTrdCde;//C_TRD_CDE 行业代码
    /** */
    private String CSubTrdCde;//C_SUB_TRD_CDE 行业细分代码
    /** */
    private String COccupCde;//C_OCCUP_CDE 职业代码
    /** */
    private String CSidelineMrk;//C_SIDELINE_MRK 副业标志
    /** */
    private String CPosition;//C_POSITION 职位
    /** */
    private String CDuty;//C_DUTY 职务,职务内容
    /** */
    private Double NIncome;//N_INCOME 年收入,年薪
    /** */
    private String CEduLvlCde;//C_EDU_LVL_CDE 文化程度代码,文化程度
    /** */
    private String CMrgCde;//C_MRG_CDE 婚姻状况代码,婚姻状况
    /** */
    private String CChldStsCde;//C_CHLD_STS_CDE 子女状况
    /** */
    private String CConveyanceCde;//C_CONVEYANCE_CDE 日常主要代步工具代码
    /** */
    private String CInsHistory;//C_INS_HISTORY 以住三年保险记录
    
    private Double NDrvAge;//N_DRV_AGE 驾龄
    /** */
    private Date TUpdTm;//T_UPD_TM 修改时间
    /** */
    private String CUpdCde;//C_UPD_CDE 修改人代码
    /** */
    private Date TCrtTm;//T_CRT_TM 创建时间
    /** */
    private String CCrtCde;//C_CRT_CDE 创建人代码
    /** */
    private String CRowId;//C_ROW_ID "记录唯一标识号,投保时为投保单的PKID，批改申请时如非新增记录则为原投保单的PKID,如为新增记录则为批改申请单的PKID"
    private String CWorkArea;//C_WORK_AREA 经营区域
   
    //以下为新增字段
    private String CCusRiskLvl; //客户风险等级
    /*永安 新增字段添加处理 kwcheng@isoftstone.com 2010-12-14*/
    private Date TCertfEndDate;//T_CERTF_END_DATE 证件有效期止
    private String CCusTyp;//C_CUS_TYP 客户类型
   // Constructors
    private String CResvTxt2;  // 税务登记号 2011-11-08 add by baidong
    
    private String CWorkCtt;   //经营范围 2011-11-08 add by baidong
    
    private Date CCertValid;   // 税务有效期  2011-11-08 add by baidong
    
    private String CCustRiskRank;  // 反洗钱客户风险等级  2011-11-08 add by baidong
    
    private String CResvTxt1;  //组织机构代码   2011-11-16 add by baidong
    
    private String CResvTxt3;    //营业执照号     2011-11-16 add by baidong
    
    private Date COrgValid;          // 组织机构代码有效期   2011-11-16 add by baidong
    
    private Date CBuslicenceValid;    // 营业执照号有效期     2011-11-16 add by baidong
    
    private String CLegalNme ;       // 法人代表 2011-11-16 add by baidong
    
    private String CLegalCertfCde;  // 法人代表证件号码 2011-11-16 add by baidong
    
    private Date  TLegalCertfEndTm;   // 法人代表证件号码有效期 2011-11-16 add by baidong
    
    private String CLegalCertfCls ; // 法人代表证件类型 2011-11-16 add by baidong
    
    private String CResvTxt20 ; // 被保险人与车辆的关系
    String CResvTxt11 ;//是否有营业执照
	String CResvTxt12 ;//是否有税务登记号
	Date CResvTxt13 ;//营业执照有效止期
	Date CResvTxt14 ;//税务登记号有效止期
	String CResvTxt15 ;//负责人证件类型
	String CResvTxt16 ;//负责人证件号码
	Date CResvTxt17 ;//负责人证件有效止期
	
	
	/** 身份证信息采集相关字段  北京客户身份信息采集需求   add by LiuHuan 2016-4-29  */
    private String CNation;				 //民族
    private String CGivenDpt;			 //签发机构
    private String CAddress;			 //住址
    private Date TCertfBgnDate;			 //身份证有效期起期
    private String CIdCollectionMachine; //身份证采集器编码
    
    
    
    public String getCNation() {
		return CNation;
	}

	public void setCNation(String cNation) {
		CNation = cNation;
	}

	public String getCGivenDpt() {
		return CGivenDpt;
	}

	public void setCGivenDpt(String cGivenDpt) {
		CGivenDpt = cGivenDpt;
	}

	public String getCAddress() {
		return CAddress;
	}

	public void setCAddress(String cAddress) {
		CAddress = cAddress;
	}

	public Date getTCertfBgnDate() {
		return TCertfBgnDate;
	}

	public void setTCertfBgnDate(Date tCertfBgnDate) {
		TCertfBgnDate = tCertfBgnDate;
	}

	

	public String getCIdCollectionMachine() {
		return CIdCollectionMachine;
	}

	public void setCIdCollectionMachine(String cIdCollectionMachine) {
		CIdCollectionMachine = cIdCollectionMachine;
	}

	public String getCResvTxt11() {
		return CResvTxt11;
	}

	public void setCResvTxt11(String cResvTxt11) {
		CResvTxt11 = cResvTxt11;
	}

	public String getCResvTxt12() {
		return CResvTxt12;
	}

	public void setCResvTxt12(String cResvTxt12) {
		CResvTxt12 = cResvTxt12;
	}

	public String getCResvTxt15() {
		return CResvTxt15;
	}

	public void setCResvTxt15(String cResvTxt15) {
		CResvTxt15 = cResvTxt15;
	}

	public String getCResvTxt16() {
		return CResvTxt16;
	}

	public void setCResvTxt16(String cResvTxt16) {
		CResvTxt16 = cResvTxt16;
	}

	public Date getCResvTxt13() {
		return CResvTxt13;
	}

	public void setCResvTxt13(Date cResvTxt13) {
		CResvTxt13 = cResvTxt13;
	}

	public Date getCResvTxt14() {
		return CResvTxt14;
	}

	public void setCResvTxt14(Date cResvTxt14) {
		CResvTxt14 = cResvTxt14;
	}

	public Date getCResvTxt17() {
		return CResvTxt17;
	}

	public void setCResvTxt17(Date cResvTxt17) {
		CResvTxt17 = cResvTxt17;
	}

	/** default constructor */
    public IAbstractInsuredVO() {
    }

    // Property accessors

    public String getCPkId() {
        return this.CPkId;
    }

    public void setCPkId(String CPkId) {
        this.CPkId = CPkId;
    }

    public String getCAppNo() {
        return this.CAppNo;
    }

    public void setCAppNo(String CAppNo) {
        this.CAppNo = CAppNo;
    }

    public String getCPlyNo() {
        return this.CPlyNo;
    }

    public void setCPlyNo(String CPlyNo) {
        this.CPlyNo = CPlyNo;
    }

    public String getCEdrNo() {
        return this.CEdrNo;
    }

    public void setCEdrNo(String CEdrNo) {
        this.CEdrNo = CEdrNo;
    }

    public Long getNSeqNo() {
        return this.NSeqNo;
    }

    public void setNSeqNo(Long NSeqNo) {
        this.NSeqNo = NSeqNo;
    }

    public String getCInsuredCde() {
        return this.CInsuredCde;
    }

    public void setCInsuredCde(String CInsuredCde) {
        this.CInsuredCde = CInsuredCde;
    }

    public String getCInsuredNme() {
        return this.CInsuredNme;
    }

    public void setCInsuredNme(String CInsuredNme) {
        this.CInsuredNme = CInsuredNme;
    }

  

    public String getCCntrNme() {
        return this.CCntrNme;
    }

    public void setCCntrNme(String CCntrNme) {
        this.CCntrNme = CCntrNme;
    }

    public String getCTel() {
        return this.CTel;
    }

    public void setCTel(String CTel) {
        this.CTel = CTel;
    }

   
    public String getCEmail() {
        return this.CEmail;
    }

    public void setCEmail(String CEmail) {
        this.CEmail = CEmail;
    }

    

    public String getCCertfCls() {
		return CCertfCls;
	}

	public void setCCertfCls(String certfCls) {
		CCertfCls = certfCls;
	}

	public String getCCertfCde() {
		return CCertfCde;
	}

	public void setCCertfCde(String certfCde) {
		CCertfCde = certfCde;
	}

	//public String getCStkMrk() {
	//	return CStkMrk;
	//}

	//public void setCStkMrk(String stkMrk) {
	//	CStkMrk = stkMrk;
	//}

	public String getCCusLvl() {
		return CCusLvl;
	}

	public void setCCusLvl(String cusLvl) {
		CCusLvl = cusLvl;
	}

	public String getCClntMrk() {
		return CClntMrk;
	}

	public void setCClntMrk(String clntMrk) {
		CClntMrk = clntMrk;
	}

	public String getCMobile() {
		return CMobile;
	}

	public void setCMobile(String mobile) {
		CMobile = mobile;
	}

	public String getCCountry() {
		return CCountry;
	}

	public void setCCountry(String country) {
		CCountry = country;
	}

	public String getCProvince() {
		return CProvince;
	}

	public void setCProvince(String province) {
		CProvince = province;
	}

	public String getCCity() {
		return CCity;
	}

	public void setCCity(String city) {
		CCity = city;
	}

	public String getCCounty() {
		return CCounty;
	}

	public void setCCounty(String county) {
		CCounty = county;
	}

	public String getCSuffixAddr() {
		return CSuffixAddr;
	}

	public void setCSuffixAddr(String suffixAddr) {
		CSuffixAddr = suffixAddr;
	}

	
    public String getCClntAddr() {
		return CClntAddr;
	}

	public void setCClntAddr(String clntAddr) {
		CClntAddr = clntAddr;
	}

	public String getCZipCde() {
        return this.CZipCde;
    }

    public void setCZipCde(String CZipCde) {
        this.CZipCde = CZipCde;
    }

    public String getCResidAddr() {
        return this.CResidAddr;
    }

    public void setCResidAddr(String CResidAddr) {
        this.CResidAddr = CResidAddr;
    }

    public String getCResidZip() {
        return this.CResidZip;
    }

    public void setCResidZip(String CResidZip) {
        this.CResidZip = CResidZip;
    }

    public String getCWorkDpt() {
        return this.CWorkDpt;
    }

    public void setCWorkDpt(String CWorkDpt) {
        this.CWorkDpt = CWorkDpt;
    }

    public String getCWorkDptAddr() {
        return this.CWorkDptAddr;
    }

    public void setCWorkDptAddr(String CWorkDptAddr) {
        this.CWorkDptAddr = CWorkDptAddr;
    }

    public String getCWorkDptZip() {
        return this.CWorkDptZip;
    }

    public void setCWorkDptZip(String CWorkDptZip) {
        this.CWorkDptZip = CWorkDptZip;
    }

    public String getCSex() {
        return this.CSex;
    }

    public void setCSex(String CSex) {
        this.CSex = CSex;
    }

    public Date getTBirthday() {
        return this.TBirthday;
    }

    public void setTBirthday(Date TBirthday) {
        this.TBirthday = TBirthday;
    }

    public String getCHealthCde() {
        return this.CHealthCde;
    }

    public void setCHealthCde(String CHealthCde) {
        this.CHealthCde = CHealthCde;
    }

    public String getCHealthDesc() {
        return this.CHealthDesc;
    }

    public void setCHealthDesc(String CHealthDesc) {
        this.CHealthDesc = CHealthDesc;
    }

    public String getCTrdCde() {
        return this.CTrdCde;
    }

    public void setCTrdCde(String CTrdCde) {
        this.CTrdCde = CTrdCde;
    }

    public String getCSubTrdCde() {
        return this.CSubTrdCde;
    }

    public void setCSubTrdCde(String CSubTrdCde) {
        this.CSubTrdCde = CSubTrdCde;
    }

    public String getCOccupCde() {
        return this.COccupCde;
    }

    public void setCOccupCde(String COccupCde) {
        this.COccupCde = COccupCde;
    }

    public String getCSidelineMrk() {
        return this.CSidelineMrk;
    }

    public void setCSidelineMrk(String CSidelineMrk) {
        this.CSidelineMrk = CSidelineMrk;
    }

    public String getCPosition() {
        return this.CPosition;
    }

    public void setCPosition(String CPosition) {
        this.CPosition = CPosition;
    }

    public String getCDuty() {
        return this.CDuty;
    }

    public void setCDuty(String CDuty) {
        this.CDuty = CDuty;
    }

    public Double getNIncome() {
        return this.NIncome;
    }

    public void setNIncome(Double NIncome) {
        this.NIncome = NIncome;
    }

    public String getCEduLvlCde() {
        return this.CEduLvlCde;
    }

    public void setCEduLvlCde(String CEduLvlCde) {
        this.CEduLvlCde = CEduLvlCde;
    }

    public String getCMrgCde() {
        return this.CMrgCde;
    }

    public void setCMrgCde(String CMrgCde) {
        this.CMrgCde = CMrgCde;
    }

    public String getCChldStsCde() {
        return this.CChldStsCde;
    }

    public void setCChldStsCde(String CChldStsCde) {
        this.CChldStsCde = CChldStsCde;
    }

    public String getCConveyanceCde() {
        return this.CConveyanceCde;
    }

    public void setCConveyanceCde(String CConveyanceCde) {
        this.CConveyanceCde = CConveyanceCde;
    }

    public String getCInsHistory() {
        return this.CInsHistory;
    }

    public void setCInsHistory(String CInsHistory) {
        this.CInsHistory = CInsHistory;
    }

    public Date getTUpdTm() {
        return this.TUpdTm;
    }

    public void setTUpdTm(Date TUpdTm) {
        this.TUpdTm = TUpdTm;
    }

    public String getCUpdCde() {
        return this.CUpdCde;
    }

    public void setCUpdCde(String CUpdCde) {
        this.CUpdCde = CUpdCde;
    }

    public Date getTCrtTm() {
        return this.TCrtTm;
    }

    public void setTCrtTm(Date TCrtTm) {
        this.TCrtTm = TCrtTm;
    }

    public String getCCrtCde() {
        return this.CCrtCde;
    }

    public void setCCrtCde(String CCrtCde) {
        this.CCrtCde = CCrtCde;
    }

	public Long getNEdrPrjNo() {
		return NEdrPrjNo;
	}

	public void setNEdrPrjNo(Long edrPrjNo) {
		NEdrPrjNo = edrPrjNo;
	}

	public String getCLatestMrk() {
		return CLatestMrk;
	}

	public void setCLatestMrk(String latestMrk) {
		CLatestMrk = latestMrk;
	}

	public Double getNDrvAge() {
		return NDrvAge;
	}

	public void setNDrvAge(Double drvAge) {
		NDrvAge = drvAge;
	}

	public String getCRowId() {
		return CRowId;
	}

	public void setCRowId(String rowId) {
		CRowId = rowId;
	}

	public String getCResvTxt1() {
        return CResvTxt1;
    }

    public void setCResvTxt1(String resvTxt1) {
        CResvTxt1 = resvTxt1;
    }

    public String getCResvTxt2() {
        return CResvTxt2;
    }

    public void setCResvTxt2(String resvTxt2) {
        CResvTxt2 = resvTxt2;
    }

    public String getCResvTxt3() {
        return CResvTxt3;
    }

    public void setCResvTxt3(String resvTxt3) {
        CResvTxt3 = resvTxt3;
    }

    public String getCCusRiskLvl() {
        return CCusRiskLvl;
    }

    public void setCCusRiskLvl(String cusRiskLvl) {
        CCusRiskLvl = cusRiskLvl;
    }

	public Date getTCertfEndDate() {
		return TCertfEndDate;
	}

	public void setTCertfEndDate(Date certfEndDate) {
		TCertfEndDate = certfEndDate;
	}

	public String getCCusTyp() {
		return CCusTyp;
	}

	public void setCCusTyp(String cusTyp) {
		CCusTyp = cusTyp;
	}

	public Date getCCertValid() {
		return CCertValid;
	}

	public void setCCertValid(Date certValid) {
		CCertValid = certValid;
	}

	public String getCCustRiskRank() {
		return CCustRiskRank;
	}

	public void setCCustRiskRank(String custRiskRank) {
		CCustRiskRank = custRiskRank;
	}
	public Date getCOrgValid() {
		return COrgValid;
	}

	public void setCOrgValid(Date orgValid) {
		COrgValid = orgValid;
	}

	public Date getCBuslicenceValid() {
		return CBuslicenceValid;
	}

	public void setCBuslicenceValid(Date buslicenceValid) {
		CBuslicenceValid = buslicenceValid;
	}

	public String getCLegalNme() {
		return CLegalNme;
	}

	public void setCLegalNme(String legalNme) {
		CLegalNme = legalNme;
	}

	public String getCLegalCertfCde() {
		return CLegalCertfCde;
	}

	public void setCLegalCertfCde(String legalCertfCde) {
		CLegalCertfCde = legalCertfCde;
	}

	public Date getTLegalCertfEndTm() {
		return TLegalCertfEndTm;
	}

	public void setTLegalCertfEndTm(Date legalCertfEndTm) {
		TLegalCertfEndTm = legalCertfEndTm;
	}

	public String getCLegalCertfCls() {
		return CLegalCertfCls;
	}

	public void setCLegalCertfCls(String legalCertfCls) {
		CLegalCertfCls = legalCertfCls;
	}

	public String getCWorkCtt() {
		return CWorkCtt;
	}

	public void setCWorkCtt(String workCtt) {
		CWorkCtt = workCtt;
	}

	public String getCWorkArea() {
		return CWorkArea;
	}

	public void setCWorkArea(String workArea) {
		CWorkArea = workArea;
	}

	public String getCResvTxt20() {
		return CResvTxt20;
	}

	public void setCResvTxt20(String cResvTxt20) {
		CResvTxt20 = cResvTxt20;
	}
    
}