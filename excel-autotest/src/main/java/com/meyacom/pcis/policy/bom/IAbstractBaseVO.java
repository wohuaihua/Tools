package com.meyacom.pcis.policy.bom;

import java.util.Date;

/**
 * AbstractBaseVO entity - Base definition for BaseVO and BasAppeVO .
 * 
 * @author jiangqf@isoftstone-ai.com
 */

public class IAbstractBaseVO  {

    // Fields

    /** web_ply_base or web_app_base*/ 
    private String CAppNo;//C_APP_NO 申请单号
    /** */
    private String CAppTyp;//C_APP_TYP  保单类型 'A' 投保单,'E'批改申请单,'Q'报价单,'O'开口保单
    /** */
    private String CPlyNo;//C_PLY_NO 保单号 Policy No
    /** */
    private Long NEdrPrjNo;//N_EDR_PRJ_NO 批改次数 
    /** */
    private String CEdrNo;//C_EDR_NO 批单号
    /** */
    private String CRelPlyNo;//C_REL_PLY_NO 依赖关联保单号 ，如财产险与利损险，车险商业与交强险
    /** */
    private String CProdNo;//C_PROD_NO 产品代码 
    /** */
    private String CDptCde;//C_DPT_CDE 机构代码 
    /** */
    private String CSlsCde;//C_SLS_CDE 业务员
    /** */
    private String CBsnsTyp;//C_BSNS_TYP 业务来源 
    /** */
    private String CBsnsSubtyp;//C_BSNS_SUBTYP 业务来源细分 
    /** */
    private String CBrkrCde;//C_BRKR_CDE 代理人/经纪人 
    /** */
    private String CAgtAgrNo;//C_AGT_AGR_NO 代理协议或合作协议号 
    /** */
    private String NSubCoNo;//N_SUB_CO_NO 补充协议号
    /** */
    private Double NCommRate;//N_COMM_RATE 手续费比例
    /** */
    private String CRenewMrk;//C_RENEW_MRK 续保标志:'0'新保;'1'续保 
    /** */
    private String COrigPlyNo;//C_ORIG_PLY_NO 续保单上年保单号
    /** */
    private String COrigInsurer;//C_ORIG_INSURER 上年保险公司
    /** */
    private String CAmtCur;//C_AMT_CUR 保额币种
    /** */
    private Double NAmt;//N_AMT 保额合计
    /** */
    private Double NAmtRmbExch;//N_AMT_RMB_EXCH 保费汇率
    /** */
    private String CPrmCur;//C_PRM_CUR 保费币种
    /** */
    private Double NCalcPrm;//N_CALC_PRM 计算保费合计,系统自动计算的保费金额
    /** */
    private Double NPrm;//N_PRM 保费合计
    /** */
    private Double NPrmRmbExch;//N_PRM_RMB_EXCH 保费人民币汇率
    /** */
    private Double NIndemLmt;//N_INDEM_LMT 赔偿限额合计
    /** */
    private String CRatioTyp;//C_RATIO_TYP 短期费率方式
    /** */
    private Double NRatioCoef;//N_RATIO_COEF 短期系数
    /** */
    private Double NSavingAmt;//N_SAVING_AMT 储金
    /** */
    private Double NPrmDisc;//N_Prm_Disc 折扣系数
    /** */
    private String CPlySts;//C_PLY_STS 保单状态 Policy Status，I: 非终止(有效或满期) T: Terminated 终止(注退)
    /** */
    private Date TTermnTm;//T_TERMN_TM 保单终止时间 
    /** */
    private String CInwdMrk;//C_INWD_MRK 分入业务标志('0'非分入;'1'分入)
    /** */
    private String CCiMrk;//C_CI_MRK 共保标志('0'非共保'1'共保)
    /** @deprecated 合并使用CCiMrk */
    @Deprecated
    private String CCiTyp;//C_CI_TYP 共保方式代码 
    /** */
    private Double NCiJntAmt;//N_CI_JNT_AMT 共保总保额 
    /** */
    private Double NCiJntPrm;//N_CI_JNT_PRM 共保总保费
    /** */
    private String CLongTermMrk;//C_LONG_TERM_MRK 多年期标志('0'短期;'1'多年期)
    /** */
    private Date TAppTm;//T_APP_TM 投保日期
    /** */
    private String COprTyp;//C_OPR_TYP 保单号生成方式,'0' 自动,'1' 手动
    /** */
    private String CPrnNo;//C_PRN_NO 印刷号
    /** */
    private Date TInsrncBgnTm;//T_INSRNC_BGN_TM 保险起期
    /** */
    private Date TInsrncEndTm;//T_INSRNC_END_TM 保险止期
    /** */
    private String CTmSysCde;//C_TM_SYS_CDE 时制(0-24时/12-12时)
    /** */
    private String CUnfixSpc;//C_UNFIX_SPC 非固定特别约定
    /** */
    private String CGrpMrk;//C_GRP_MRK 团单标志('0'个单;'1'团单)
    /** */
    private String CListorcolMrk;//C_LISTORCOL_MRK 清单/汇总标志('0'输入清单,'1'输入汇总  ; )
    /** */
    private String CMasterMrk;//C_MASTER_MRK 统括保单标志
    /** */
    private String CPkgMrk;//C_PKG_MRK 套餐标志'0'否,'1'是
    /** */
    private String CPkgNo;//C_PKG_NO 套餐编号
    /** */
    private String CRegMrk;//C_REG_MRK 记名标志:'0'不记名;'1'记名
    /** */
    private String CDecMrk;//C_DEC_MRK 法定申报标志(0非申报;1申报)
    /** */
    private String CJuriCde;//C_JURI_CDE 司法管辖代码
    /** */
    private String CAgriMrk;//C_AGRI_MRK 涉农标志 
    /** */
    private String CForeignMrk;//C_FOREIGN_MRK 境内外标志(0:境内;1:境外)
    /** */
    private String CImporexpMrk;//C_IMPOREXP_MRK 		
    /** */
    private String CManualMrk;//C_MANUAL_MRK 手工出单标志(0非手工1手工)
    /** */
    private String CInstMrk;//C_INST_MRK 分期付款标志
    /** */
    private String CVipMrk;//C_VIP_MRK VIP标志
    /** */
    private String COpenCoverNo;//C_OPEN_COVER_NO 预约协议
    /** */
    private String CDisptSttlCde;//C_DISPT_STTL_CDE 诉讼方式
    /** */
    private String CDisptSttlOrg;//C_DISPT_STTL_ORG 仲裁机构
    /** */
    private String COprCde;//C_OPR_CDE 操作员代码
    /** */
    private Date TOprTm;//T_OPR_TM 操作日期
    /** */
    private String CChkCde;//C_CHK_CDE 复核人代码
    /** */
    private Date TIssueTm;//T_ISSUE_TM 签单日期
    /** */
    private Date TUdrTm;//T_UDR_TM 核保日期
    /** */
    private String CUdrDptCde;//C_UDR_DPT_CDE 核保机构
    /** */
    private String CUdrCde;//C_UDR_CDE 核保人代码
    /** */
    private String CUdrMrk;//C_UDR_MRK 核保标志
    /** */
    private String CRiFacMrk;//C_RI_FAC_MRK 临分标志
    /** */
    private String CRiChkCde;//C_RI_CHK_CDE 再保审核人代码
    /** */
    private String CRiMrk;//C_RI_MRK 再保确认标志
    /** */
    private Date TNextEdrBgnTm;//T_NEXT_EDR_BGN_TM 批改生效起期
    /** */
    private Date TNextEdrEndTm;//T_NEXT_EDR_END_TM 批改生效止期
    /** */
    private Date TNextEdrUdrTm;//T_NEXT_EDR_UDR_TM 下次批改核保日期
    /** */
    private String CRemark;//C_REMARK 备注
    /** */
    private String CLatestMrk;//C_LATEST_MRK 是否最新保单'0'否,'1'是

    /** */
    private Date TEdrAppTm;//T_EDR_APP_TM 批改申请日期
    /** */
    private Date TEdrBgnTm;//T_EDR_BGN_TM 批改生效起期
    /** */
    private Date TEdrEndTm;//T_EDR_END_TM 批改生效止期
    /** */
    private String CEdrMrk;//C_EDR_MRK 申请类型,1 内部批单，2 客户申请
    /** */
    private String CEdrType;//C_EDR_TYPE 批改类型,1 一般批改，2 注销，3退保  4、组合批改  5 满期返还  9 批单撤销
    /** */
    private Double NAmtVar;//N_AMT_VAR	NUMBER 保额变化，批单保额-上一批单（保单）保额
    /** */
    private Double NCalcPrmVar;//N_CALC_PRM_VAR 计算保费变化
    /** */
    private Double NPrmVar;//N_PRM_VAR 保费变化，批单保费上一批单（保单）保费
    /** */
    private Double NIndemLmtVar;//N_INDEM_LMT_VAR 赔偿限额变化
    /** */
    private String CAppPrsnCde;//C_APP_PRSN_CDE 申请人代码
    /** */
    private String CAppPrsnNme;//C_APP_PRSN_NME 申请人名称
    /** */
    private String CEdrCtnt;//C_EDR_CTNT 批文	

    private Double NBefEdrAmt;//N_BEF_EDR_AMT 批改前保额

    private Double NBefEdrPrm;//N_BEF_EDR_PRM 批改前保费

    private String COcPlyNo;//C_OC_PLY_NO 开口保单业务的预约保单号

    private Double NRate;//N_RATE  整张保单的费率

    private String CEdrRsnBundleCde;//C_EDR_RSN_BUNDLE_CDE 批改原因或组合代码

    private Long NBefEdrPrjNo;//N_BEF_EDR_PRJ_NO 批改业务原保单记录序批改号 ;

    /** */
    private String CCrtCde;//C_CRT_CDE 创建人员
    /** */
    private Date TCrtTm;//T_CRT_TM 创建时间
    /** */
    private String CUpdCde;//C_UPD_CDE 修改人员
    /** */
    private Date TUpdTm;//T_UPD_TM 修改时间
    /** */
    private String CResvTxt1;//C_RESV_TXT_1	 原始申请单号
    /** */
    private String CResvTxt2;//C_RESV_TXT_2	 预留
    /** */
    private String CResvTxt3;//C_RESV_TXT_3	 预留
    /** */
    private String CResvTxt4;//C_RESV_TXT_4	 预留

    private String CBidMrk = "0";//C_BID_MRK 投标业务标志'

    private Double NDiscRate;//N_DISC_RATE 整张单的折扣率
    private String CLargeBusiness;//C_LARGE_BUSINESS 大额交易标记 0非大额 1 是大额交易
    private String CChaType;//C_CHA_TYPE 渠道中级分类
    private String CChaSubtype;//C_CHA_SUBTYPE 渠道子类
    
    private String CNoendclmMrk;//  C_NOENDCLM_MRK	CHAR(1)	Y	'0'		有在途赔案标记 1 有 0 没有
    
    private String CUnfixSpcIlog;//hjt add 20120709 特别约定按照:特约编号---特约内容###特约编号---特约内容,传递给ilog
    
    private String CBJPlateMrk = "0";//是否北京0326平台计算前的保单 1是  0不是
    
    private String CQuickFlag = "0";//是否快速出单
    private String CIsilogBack = "0"; //是否ilog返回修改，1为ilog返回修改，0为自核通过，或者自核转人工
    private String CPurePrmFlag = "";
    private String CReceiHs;
   
    public String getCBJPlateMrk() {
		return CBJPlateMrk;
	}
	public void setCBJPlateMrk(String cBJPlateMrk) {
		CBJPlateMrk = cBJPlateMrk;
	}

	//以下为新添增字段
    private Double NMaxFeeProp;
    private String CFinTyp;
    private Long NOrigTimes;
    private String CSlsId;
    private String CSlsTel;
    private String CSlsNme;
    private String CBrkSlsName;
    private String CSalegrpCde;
    private String CSalegrpNme;
    private String CDptAttr;
    private String CVipCus;
    private String CGrantDptCde;
    private String CMinUndrDpt;
    private String CMinUndrCls;
    private String CFeeCalTyp;
    private String CRateNo;
    private String CSaveMrk;
    private Double NBefEdrSaving;
    private Double NSavingVar;
    private String CCommonFlag;
    private String CImmeffMrk;//即时生效
    private String CDataSrc;//数据来源
    //add 显示平台退保公式liuq
    private String CSurFormula;
    /*永安系统 添加新字段*/
    private Double NAllPrm;
    private Double NIrrRatio;
    private String CQuotaMrk;
    private String CSusBusiness;
    private Double NBasePrm;
    private String CTransMrk;//数据迁移标志 1 是迁移的老数据
    
    ///报停展期 添加字段 zhanghj
    private Date TRepStopExtBgnTm;//报停展期的 起期
    private Date TRepStopExtEndTm;//报停展期的 止期
    private String CRepStopExtRleAppNo;//展停关联单号即是做报停展期时的最新保单所对应的投保单号
    private Date TRepstopExtLastEndTm;//上次展期
    private Date TSrcInsrncBgnTm;//原始保单起期
    private Date  TSrcInsrncEndSTm;//原始保单止期
    private String CRepstopextStatus;//停展状态  是 停T 还是展Z 的状态 N 非停展状态
    private String CRepstopextSrcAppNo;//做报停展期批改前的 最新投保单，如果是做第二此报停展期批改则还是 原来的 最新投保单号
    
    
    private Double  NTaxAmt;//车船税
    private String  CBrkSlsCde;//代理业务员
    
    private String CTenderNo;//招标编号 针对 国库支付

    //xingzhou 2011.07.07 北京平台北京职场内出具中介业务：保险公司审批人员代码
    private String CApproveCde;//C_APPROVE_CDE 保险公司审批人员代码
    
    //xingzhou 2011.07.07 北京平台：减免保费-减免保费计算公式-减免总天数
    private String CPreferential;//C_PREFERENTIAL 减免信息
    
    //宁波手续费上传 ： COMMISSION_RATE_UPPER 数值 5,4 手续费支付比例上限 ADD xingzhou 2011.07.22
    private Double NCommissionRateUpper; //手续费支付比例上限
    
    //xingzhou 2011.08.10 共享平台：浙江、辽宁机构：C_AREA_FLAG 地区标识
    private String CAreaFlag;//C_AREA_FLAG 地区标识
    
    private String CCertfNo ;
    
    //xingzhou 2011.11.02 是否修改特别约定（是否走自核）：0-否；1-是；C_Unfix_Spc_Change
    private String CUnfixSpcChange; 
    
    private String CEffectiveApp;//xingzhou 2011.11.07 ADD HBM文件中有，但是类里面没有 ADD 
    
    private String CUnfixSpcHidden;//xingzhou 2011.11.08 隐藏特别约定 修改特别约定不能走自核 ADD 
    
    private String CDanzhengTyp ;   //车险单证类型  add by baidong 2011-11-14
    
    private String CMonitorId ; //xingzhou 2011.12.26 时间监控ID
    
    private String CUndrOpn;  // ilog申请核保返回修改原因
    
    private String CQteTyp;//C_QTE_TYP  保单类型 'X' 报价单转投保单
    
    private Double NFundRate;// 计提救助基金比例	FUND_RATE
    
    private Double NFundAmount;// 计提救助基金金额	FUND_AMOUNT

    private String CCountryFlag;//保单归属地 县/区
    private String CCountryflag;//保单归属地 县/区(非车使用的字段)
    private String CAppAreaCode; //指定查询区域
    
    private String CSysRes;   //系统来源  ADD BY LIUREN 2015-07-20
    
    private String CPlyTyp;   //保单形式  guanzeyu
    private String CProvince;//保单归属省CProvince
    //营改增增加字段
    private Double NVat; //N_vat 增值税额
    private Double NPrice;//    保费收入
    private Double NVatVar; // 增值税变化值
    private Double NPriceVar;// 保费收入变化值
    private String CChaVatType;//手续费纳税类型
    
    private String CNeedfeeFlag ;//是否非见费标识
    private String COrderNo;// 订单号
    private String CCreator;//用户账号
  	private String CResvTxt9;//引流渠道代码
  	private String CResvTxt10;//引流渠道名称
    
  	//深圳地区批改添加
	// 深圳机构 区分普通停驶/绿色出行停驶
	private String CStopTravelReason;
	
	private String CResvTxt13;//C_RESV_TXT_13	 预留:平台上年保险起期
	private String CResvTxt14;//C_RESV_TXT_14	 预留:平台上年保险止期
	
	private String CResvTxt11;
	private String CResvTxt12;
	private String CResvTxt15;//能否停复驶标志 0：否,1：是
	private String CResvTxt16;
	private String CResvTxt17;//上年保单承保公司名称
	private String CResvTxt18;//重复投保标志
	private String CResvTxt19;
	private String CResvTxt20;
	private String CInvType;  //发票类型
	//add by 2017-05-31
	private String CResvTxt6;//提前复驶标记
		
	
    
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
	public String getCResvTxt17() {
		return CResvTxt17;
	}
	public void setCResvTxt17(String cResvTxt17) {
		CResvTxt17 = cResvTxt17;
	}
	public String getCResvTxt18() {
		return CResvTxt18;
	}
	public void setCResvTxt18(String cResvTxt18) {
		CResvTxt18 = cResvTxt18;
	}
	public String getCResvTxt19() {
		return CResvTxt19;
	}
	public void setCResvTxt19(String cResvTxt19) {
		CResvTxt19 = cResvTxt19;
	}
	public String getCResvTxt20() {
		return CResvTxt20;
	}
	public void setCResvTxt20(String cResvTxt20) {
		CResvTxt20 = cResvTxt20;
	}
	public String getCResvTxt13() {
		return CResvTxt13;
	}
	public void setCResvTxt13(String cResvTxt13) {
		CResvTxt13 = cResvTxt13;
	}
	public String getCResvTxt14() {
		return CResvTxt14;
	}
	public void setCResvTxt14(String cResvTxt14) {
		CResvTxt14 = cResvTxt14;
	}
	public String getCCreator() {
		return CCreator;
	}
	public void setCCreator(String cCreator) {
		CCreator = cCreator;
	}
	public String getCOrderNo() {
		return COrderNo;
	}
	public void setCOrderNo(String cOrderNo) {
		COrderNo = cOrderNo;
	}
	public String getCCountryflag() {
		return CCountryflag;
	}
	public void setCCountryflag(String cCountryflag) {
		CCountryflag = cCountryflag;
	}
	public String getCChaVatType() {
		return CChaVatType;
	}
	public void setCChaVatType(String cChaVatType) {
		CChaVatType = cChaVatType;
	}
	public Double getNVat() {
		return NVat;
	}
	public void setNVat(Double nVat) {
		NVat = nVat;
	}
	public Double getNPrice() {
		return NPrice;
	}
	public void setNPrice(Double nPrice) {
		NPrice = nPrice;
	}
	public Double getNVatVar() {
		return NVatVar;
	}
	public void setNVatVar(Double nVatVar) {
		NVatVar = nVatVar;
	}
	public Double getNPriceVar() {
		return NPriceVar;
	}
	public void setNPriceVar(Double nPriceVar) {
		NPriceVar = nPriceVar;
	}
	public String getCProvince() {
		return CProvince;
	}
	public void setCProvince(String cProvince) {
		CProvince = cProvince;
	}
	public String getCPlyTyp() {
		return CPlyTyp;
	}
	public void setCPlyTyp(String cPlyTyp) {
		CPlyTyp = cPlyTyp;
	}
	public String getCSysRes() {
		return CSysRes;
	}
	public void setCSysRes(String cSysRes) {
		CSysRes = cSysRes;
	}
	public String getCAppAreaCode() {
		return CAppAreaCode;
	}
	public void setCAppAreaCode(String cAppAreaCode) {
		CAppAreaCode = cAppAreaCode;
	}

	public String getCEffectiveApp() {
		return CEffectiveApp;
	}

	public void setCEffectiveApp(String effectiveApp) {
		CEffectiveApp = effectiveApp;
	}

	public String getCUnfixSpcChange() {
		return CUnfixSpcChange;
	}

	public void setCUnfixSpcChange(String unfixSpcChange) {
		CUnfixSpcChange = unfixSpcChange;
	}

	public Double getNCommissionRateUpper() {
		return NCommissionRateUpper;
	}

	public void setNCommissionRateUpper(Double commissionRateUpper) {
		NCommissionRateUpper = commissionRateUpper;
	}

	public String getCSurFormula() {
		return CSurFormula;
	}

	public void setCSurFormula(String surFormula) {
		CSurFormula = surFormula;
	}

	public String getCImmeffMrk() {
		return this.CImmeffMrk;
	}

	public void setCImmeffMrk(String immeffMrk) {
		this.CImmeffMrk = immeffMrk;
	}

	public String getCMinUndrDpt() {
		return CMinUndrDpt;
	}

	public void setCMinUndrDpt(String minUndrDpt) {
//		this.assertThreadAndSession("AbstractBaseVO.TUdrTm",this.CMinUndrDpt,minUndrDpt);
		CMinUndrDpt = minUndrDpt;
	}

	public String getCMinUndrCls() {
		return CMinUndrCls;
	}

	public void setCMinUndrCls(String minUndrCls) {
		CMinUndrCls = minUndrCls;
	}

	public String getCBidMrk() {
        return this.CBidMrk;
    }

    public void setCBidMrk(String bidMrk) {
        this.CBidMrk = bidMrk;
    }

    // Constructors
    /** default constructor */
    public IAbstractBaseVO() {
    }

    // Property accessors

    public String getCAppNo() {
        return this.CAppNo;
    }

    public void setCAppNo(String CAppNo) {
        this.CAppNo = CAppNo;
    }

    public String getCAppTyp() {
        return this.CAppTyp;
    }

    public void setCAppTyp(String CAppTyp) {
        this.CAppTyp = CAppTyp;
    }

    public String getCPlyNo() {
        return this.CPlyNo;
    }

    public void setCPlyNo(String CPlyNo) {
        this.CPlyNo = CPlyNo;
    }

    public Long getNEdrPrjNo() {
        return this.NEdrPrjNo;
    }

    public void setNEdrPrjNo(Long NEdrPrjNo) {
        this.NEdrPrjNo = NEdrPrjNo;
    }

    public String getCEdrNo() {
        return this.CEdrNo;
    }

    public void setCEdrNo(String CEdrNo) {
        this.CEdrNo = CEdrNo;
    }

    public String getCRelPlyNo() {
        return this.CRelPlyNo;
    }

    public void setCRelPlyNo(String CRelPlyNo) {
        this.CRelPlyNo = CRelPlyNo;
    }

    public String getCProdNo() {
        return this.CProdNo;
    }

    public void setCProdNo(String CProdNo) {
        this.CProdNo = CProdNo;
    }

    public String getCDptCde() {
        return this.CDptCde;
    }

    public void setCDptCde(String CDptCde) {
        this.CDptCde = CDptCde;
    }

    public String getCBsnsTyp() {
        return this.CBsnsTyp;
    }

    public void setCBsnsTyp(String CBsnsTyp) {
        this.CBsnsTyp = CBsnsTyp;
    }

    public String getCBsnsSubtyp() {
        return this.CBsnsSubtyp;
    }

    public void setCBsnsSubtyp(String CBsnsSubtyp) {
        this.CBsnsSubtyp = CBsnsSubtyp;
    }

    public String getCBrkrCde() {
        return this.CBrkrCde;
    }

    public void setCBrkrCde(String CBrkrCde) {
        this.CBrkrCde = CBrkrCde;
    }

    public String getCAgtAgrNo() {
        return this.CAgtAgrNo;
    }

    public void setCAgtAgrNo(String CAgtAgrNo) {
        this.CAgtAgrNo = CAgtAgrNo;
    }

    public String getNSubCoNo() {
        return this.NSubCoNo;
    }

    public void setNSubCoNo(String NSubCoNo) {
        this.NSubCoNo = NSubCoNo;
    }

    public Double getNCommRate() {
        return this.NCommRate;
    }

    public void setNCommRate(Double NCommRate) {
        this.NCommRate = NCommRate;
    }

    public String getCRenewMrk() {
        return this.CRenewMrk;
    }

    public void setCRenewMrk(String CRenewMrk) {
        this.CRenewMrk = CRenewMrk;
    }

    public String getCOrigPlyNo() {
        return this.COrigPlyNo;
    }

    public void setCOrigPlyNo(String COrigPlyNo) {
        this.COrigPlyNo = COrigPlyNo;
    }

    public String getCOrigInsurer() {
        return this.COrigInsurer;
    }

    public void setCOrigInsurer(String COrigInsurer) {
        this.COrigInsurer = COrigInsurer;
    }

    public String getCAmtCur() {
        return this.CAmtCur;
    }

    public void setCAmtCur(String CAmtCur) {
        this.CAmtCur = CAmtCur;
    }

    public Double getNAmt() {
        return this.NAmt;
    }

    public void setNAmt(Double NAmt) {
        this.NAmt = NAmt;
    }

    public Double getNAmtRmbExch() {
        return this.NAmtRmbExch;
    }

    public void setNAmtRmbExch(Double NAmtRmbExch) {
        this.NAmtRmbExch = NAmtRmbExch;
    }

    public String getCPrmCur() {
        return this.CPrmCur;
    }

    public void setCPrmCur(String CPrmCur) {
        this.CPrmCur = CPrmCur;
    }

    public Double getNCalcPrm() {
        return this.NCalcPrm;
    }

    public void setNCalcPrm(Double NCalcPrm) {
        this.NCalcPrm = NCalcPrm;
    }

    public Double getNPrm() {
        return this.NPrm;
    }

    public void setNPrm(Double NPrm) {
        this.NPrm = NPrm;
    }

    public Double getNPrmRmbExch() {
        return this.NPrmRmbExch;
    }

    public void setNPrmRmbExch(Double NPrmRmbExch) {
        this.NPrmRmbExch = NPrmRmbExch;
    }

    public Double getNIndemLmt() {
        return this.NIndemLmt;
    }

    public void setNIndemLmt(Double NIndemLmt) {
        this.NIndemLmt = NIndemLmt;
    }

    public String getCRatioTyp() {
        return this.CRatioTyp;
    }

    public void setCRatioTyp(String CRatioTyp) {
        this.CRatioTyp = CRatioTyp;
    }

    public Double getNRatioCoef() {
        return this.NRatioCoef;
    }

    public void setNRatioCoef(Double NRatioCoef) {
        this.NRatioCoef = NRatioCoef;
    }

    public Double getNSavingAmt() {
        return this.NSavingAmt;
    }

    public void setNSavingAmt(Double NSavingAmt) {
        this.NSavingAmt = NSavingAmt;
    }

    public String getCPlySts() {
        return this.CPlySts;
    }

    public void setCPlySts(String CPlySts) {
        this.CPlySts = CPlySts;
    }

    public Date getTTermnTm() {
        return this.TTermnTm;
    }

    public void setTTermnTm(Date TTermnTm) {
        this.TTermnTm = TTermnTm;
    }

    public String getCInwdMrk() {
        return this.CInwdMrk;
    }

    public void setCInwdMrk(String CInwdMrk) {
        this.CInwdMrk = CInwdMrk;
    }

    public String getCCiMrk() {
        return this.CCiMrk;
    }

    public void setCCiMrk(String CCiMrk) {
        this.CCiMrk = CCiMrk;
    }

    public String getCCiTyp() {
        return this.CCiTyp;
    }

    public void setCCiTyp(String CCiTyp) {
        this.CCiTyp = CCiTyp;
    }

    public Double getNCiJntAmt() {
        return this.NCiJntAmt;
    }

    public void setNCiJntAmt(Double NCiJntAmt) {
        this.NCiJntAmt = NCiJntAmt;
    }

    public Double getNCiJntPrm() {
        return this.NCiJntPrm;
    }

    public void setNCiJntPrm(Double NCiJntPrm) {
        this.NCiJntPrm = NCiJntPrm;
    }

    public String getCLongTermMrk() {
        return this.CLongTermMrk;
    }

    public void setCLongTermMrk(String CLongTermMrk) {
        this.CLongTermMrk = CLongTermMrk;
    }

    public Date getTAppTm() {
        return this.TAppTm;
    }

    public void setTAppTm(Date TAppTm) {
        this.TAppTm = TAppTm;
    }

    public String getCOprTyp() {
        return this.COprTyp;
    }

    public void setCOprTyp(String COprTyp) {
        this.COprTyp = COprTyp;
    }

    public String getCPrnNo() {
        return this.CPrnNo;
    }

    public void setCPrnNo(String CPrnNo) {
        this.CPrnNo = CPrnNo;
    }

    public Date getTInsrncBgnTm() {
        return this.TInsrncBgnTm;
    }

    public void setTInsrncBgnTm(Date TInsrncBgnTm) {
        this.TInsrncBgnTm = TInsrncBgnTm;
    }

    public Date getTInsrncEndTm() {
        return this.TInsrncEndTm;
    }

    public void setTInsrncEndTm(Date TInsrncEndTm) {
        this.TInsrncEndTm = TInsrncEndTm;
    }

    public String getCTmSysCde() {
        return this.CTmSysCde;
    }

    public void setCTmSysCde(String CTmSysCde) {
        this.CTmSysCde = CTmSysCde;
    }

    public String getCUnfixSpc() {
        return this.CUnfixSpc;
    }

    public void setCUnfixSpc(String CUnfixSpc) {
        this.CUnfixSpc = CUnfixSpc;
    }

    public String getCGrpMrk() {
        return this.CGrpMrk;
    }

    public void setCGrpMrk(String CGrpMrk) {
        this.CGrpMrk = CGrpMrk;
    }

    public String getCListorcolMrk() {
        return this.CListorcolMrk;
    }

    public void setCListorcolMrk(String CListorcolMrk) {
        this.CListorcolMrk = CListorcolMrk;
    }

    public String getCMasterMrk() {
        return this.CMasterMrk;
    }

    public void setCMasterMrk(String CMasterMrk) {
        this.CMasterMrk = CMasterMrk;
    }

    public String getCPkgNo() {
        return this.CPkgNo;
    }

    public void setCPkgNo(String CPkgNo) {
        this.CPkgNo = CPkgNo;
    }

    public String getCRegMrk() {
        return this.CRegMrk;
    }

    public void setCRegMrk(String CRegMrk) {
        this.CRegMrk = CRegMrk;
    }

    public String getCDecMrk() {
        return this.CDecMrk;
    }

    public void setCDecMrk(String CDecMrk) {
        this.CDecMrk = CDecMrk;
    }

    public String getCJuriCde() {
        return this.CJuriCde;
    }

    public void setCJuriCde(String CJuriCde) {
        this.CJuriCde = CJuriCde;
    }

    public String getCAgriMrk() {
        return this.CAgriMrk;
    }

    public void setCAgriMrk(String CAgriMrk) {
        this.CAgriMrk = CAgriMrk;
    }

    public String getCForeignMrk() {
        return this.CForeignMrk;
    }

    public void setCForeignMrk(String CForeignMrk) {
        this.CForeignMrk = CForeignMrk;
    }

    public String getCImporexpMrk() {
        return this.CImporexpMrk;
    }

    public void setCImporexpMrk(String CImporexpMrk) {
        this.CImporexpMrk = CImporexpMrk;
    }

    public String getCManualMrk() {
        return this.CManualMrk;
    }

    public void setCManualMrk(String CManualMrk) {
        this.CManualMrk = CManualMrk;
    }

    public String getCInstMrk() {
        return this.CInstMrk;
    }

    public void setCInstMrk(String CInstMrk) {
        this.CInstMrk = CInstMrk;
    }

    public String getCVipMrk() {
        return this.CVipMrk;
    }

    public void setCVipMrk(String CVipMrk) {
        this.CVipMrk = CVipMrk;
    }

    public String getCOpenCoverNo() {
        return this.COpenCoverNo;
    }

    public void setCOpenCoverNo(String COpenCoverNo) {
        this.COpenCoverNo = COpenCoverNo;
    }

    public String getCDisptSttlCde() {
        return this.CDisptSttlCde;
    }

    public void setCDisptSttlCde(String CDisptSttlCde) {
        this.CDisptSttlCde = CDisptSttlCde;
    }

    public String getCDisptSttlOrg() {
        return this.CDisptSttlOrg;
    }

    public void setCDisptSttlOrg(String CDisptSttlOrg) {
        this.CDisptSttlOrg = CDisptSttlOrg;
    }

    public String getCOprCde() {
        return this.COprCde;
    }

    public void setCOprCde(String COprCde) {
        this.COprCde = COprCde;
    }

    public Date getTOprTm() {
        return this.TOprTm;
    }

    public void setTOprTm(Date TOprTm) {
        this.TOprTm = TOprTm;
    }

    public String getCChkCde() {
        return this.CChkCde;
    }

    public void setCChkCde(String CChkCde) {
        this.CChkCde = CChkCde;
    }

    public Date getTIssueTm() {
        return this.TIssueTm;
    }

    public void setTIssueTm(Date TIssueTm) {
        this.TIssueTm = TIssueTm;
    }

    public Date getTUdrTm() {
        return this.TUdrTm;
    }

    public void setTUdrTm(Date TUdrTm) {
    	this.TUdrTm = TUdrTm;
    }

    public String getCUdrDptCde() {
        return this.CUdrDptCde;
    }

    public void setCUdrDptCde(String CUdrDptCde) {
        this.CUdrDptCde = CUdrDptCde;
    }

    public String getCUdrCde() {
        return this.CUdrCde;
    }

    public void setCUdrCde(String CUdrCde) {
        this.CUdrCde = CUdrCde;
    }

    public String getCUdrMrk() {
        return this.CUdrMrk;
    }

    public void setCUdrMrk(String CUdrMrk) {
        this.CUdrMrk = CUdrMrk;
    }

    public String getCRiFacMrk() {
        return this.CRiFacMrk;
    }

    public void setCRiFacMrk(String CRiFacMrk) {
        this.CRiFacMrk = CRiFacMrk;
    }

    public String getCRiChkCde() {
        return this.CRiChkCde;
    }

    public void setCRiChkCde(String CRiChkCde) {
        this.CRiChkCde = CRiChkCde;
    }

    public String getCRiMrk() {
        return this.CRiMrk;
    }

    public void setCRiMrk(String CRiMrk) {
        this.CRiMrk = CRiMrk;
    }

    public Date getTNextEdrBgnTm() {
        return this.TNextEdrBgnTm;
    }

    public void setTNextEdrBgnTm(Date TNextEdrBgnTm) {
        this.TNextEdrBgnTm = TNextEdrBgnTm;
    }

    public Date getTNextEdrEndTm() {
        return this.TNextEdrEndTm;
    }

    public void setTNextEdrEndTm(Date TNextEdrEndTm) {
        this.TNextEdrEndTm = TNextEdrEndTm;
    }

    public Date getTNextEdrUdrTm() {
        return this.TNextEdrUdrTm;
    }

    public void setTNextEdrUdrTm(Date TNextEdrUdrTm) {
        this.TNextEdrUdrTm = TNextEdrUdrTm;
    }

    public String getCRemark() {
        return this.CRemark;
    }

    public void setCRemark(String CRemark) {
        this.CRemark = CRemark;
    }

    public Date getTEdrAppTm() {
        return this.TEdrAppTm;
    }

    public void setTEdrAppTm(Date TEdrAppTm) {
        this.TEdrAppTm = TEdrAppTm;
    }

    public Date getTEdrBgnTm() {
        return this.TEdrBgnTm;
    }

    public void setTEdrBgnTm(Date TEdrBgnTm) {
        this.TEdrBgnTm = TEdrBgnTm;
    }

    public Date getTEdrEndTm() {
        return this.TEdrEndTm;
    }

    public void setTEdrEndTm(Date TEdrEndTm) {
        this.TEdrEndTm = TEdrEndTm;
    }

    public String getCEdrMrk() {
        return this.CEdrMrk;
    }

    public void setCEdrMrk(String CEdrMrk) {
        this.CEdrMrk = CEdrMrk;
    }

    public String getCEdrType() {
        return this.CEdrType;
    }

    public void setCEdrType(String CEdrType) {
        this.CEdrType = CEdrType;
    }

    /**
     * @return nBefEdrAmt
     */
    public Double getNBefEdrAmt() {
        return this.NBefEdrAmt;
    }

    /**
     * @param befEdrAmt
     */
    public void setNBefEdrAmt(Double befEdrAmt) {
        this.NBefEdrAmt = befEdrAmt;
    }

    /**
     * @return nBefEdrPrm
     */
    public Double getNBefEdrPrm() {
        return this.NBefEdrPrm;
    }

    /**
     * @param befEdrPrm
     */
    public void setNBefEdrPrm(Double befEdrPrm) {
        this.NBefEdrPrm = befEdrPrm;
    }

    public String getCLatestMrk() {
        return this.CLatestMrk;
    }

    public void setCLatestMrk(String CLatestMrk) {
        this.CLatestMrk = CLatestMrk;
    }

    public String getCCrtCde() {
        return this.CCrtCde;
    }

    public void setCCrtCde(String CCrtCde) {
        this.CCrtCde = CCrtCde;
    }

    public Date getTCrtTm() {
        return this.TCrtTm;
    }

    public void setTCrtTm(Date TCrtTm) {
        this.TCrtTm = TCrtTm;
    }

    public String getCUpdCde() {
        return this.CUpdCde;
    }

    public void setCUpdCde(String CUpdCde) {
        this.CUpdCde = CUpdCde;
    }

    public Date getTUpdTm() {
        return this.TUpdTm;
    }

    public void setTUpdTm(Date TUpdTm) {
        this.TUpdTm = TUpdTm;
    }

    public String getCResvTxt1() {
        return this.CResvTxt1;
    }

    public void setCResvTxt1(String CResvTxt1) {
        this.CResvTxt1 = CResvTxt1;
    }

    public String getCResvTxt2() {
        return this.CResvTxt2;
    }

    public void setCResvTxt2(String CResvTxt2) {
        this.CResvTxt2 = CResvTxt2;
    }

    public String getCResvTxt3() {
        return this.CResvTxt3;
    }

    public void setCResvTxt3(String CResvTxt3) {
        this.CResvTxt3 = CResvTxt3;
    }

    public String getCResvTxt4() {
        return this.CResvTxt4;
    }

    public void setCResvTxt4(String CResvTxt4) {
        this.CResvTxt4 = CResvTxt4;
    }

    public String getCSlsCde() {
        return this.CSlsCde;
    }

    public void setCSlsCde(String slsCde) {
        this.CSlsCde = slsCde;
    }

    /**
     * @return nAmtVar
     */
    public Double getNAmtVar() {
        return this.NAmtVar;
    }

    /**
     * @param amtVar
     */
    public void setNAmtVar(Double amtVar) {
        this.NAmtVar = amtVar;
    }

    /**
     * @return nCalcPrmVar
     */
    public Double getNCalcPrmVar() {
        return this.NCalcPrmVar;
    }

    /**
     * @param calcPrmVar
     */
    public void setNCalcPrmVar(Double calcPrmVar) {
        this.NCalcPrmVar = calcPrmVar;
    }

    /**
     * @return nPrmVar
     */
    public Double getNPrmVar() {
        return this.NPrmVar;
    }

    /**
     * @param prmVar
     */
    public void setNPrmVar(Double prmVar) {
        this.NPrmVar = prmVar;
    }

    /**
     * @return nIndemLmtVar
     */
    public Double getNIndemLmtVar() {
        return this.NIndemLmtVar;
    }

    /**
     * @param indemLmtVar
     */
    public void setNIndemLmtVar(Double indemLmtVar) {
        this.NIndemLmtVar = indemLmtVar;
    }

    /**
     * @return cAppPrsnCde
     */
    public String getCAppPrsnCde() {
        return this.CAppPrsnCde;
    }

    /**
     * @param appPrsnCde
     */
    public void setCAppPrsnCde(String appPrsnCde) {
        this.CAppPrsnCde = appPrsnCde;
    }

    /**
     * @return cAppPrsnNme
     */
    public String getCAppPrsnNme() {
        return this.CAppPrsnNme;
    }

    /**
     * @param appPrsnNme
     */
    public void setCAppPrsnNme(String appPrsnNme) {
        this.CAppPrsnNme = appPrsnNme;
    }

    /**
     * @return cEdrCtnt
     */
    public String getCEdrCtnt() {
        return this.CEdrCtnt;
    }

    /**
     * @param edrCtnt
     */
    public void setCEdrCtnt(String edrCtnt) {
        this.CEdrCtnt = edrCtnt;
    }

    public String getCOcPlyNo() {
        return this.COcPlyNo;
    }

    public void setCOcPlyNo(String ocPlyNo) {
        this.COcPlyNo = ocPlyNo;
    }

    public Double getNRate() {
        return this.NRate;
    }

    public void setNRate(Double rate) {
        this.NRate = rate;
    }

    public String getCEdrRsnBundleCde() {
        return this.CEdrRsnBundleCde;
    }

    public void setCEdrRsnBundleCde(String edrRsnBundleCde) {
        this.CEdrRsnBundleCde = edrRsnBundleCde;
    }

    public Long getNBefEdrPrjNo() {
        return this.NBefEdrPrjNo;
    }

    public void setNBefEdrPrjNo(Long befEdrPrjNo) {
        this.NBefEdrPrjNo = befEdrPrjNo;
    }

    public String getCPkgMrk() {
        return this.CPkgMrk;
    }

    public void setCPkgMrk(String pkgMrk) {
        this.CPkgMrk = pkgMrk;
    }

    public Double getNPrmDisc() {
        return this.NPrmDisc;
    }

    public void setNPrmDisc(Double prmDisc) {
        this.NPrmDisc = prmDisc;
    }

    public Double getNDiscRate() {
        return this.NDiscRate;
    }

    public void setNDiscRate(Double discRate) {
        this.NDiscRate = discRate;
    }

    public Double getNMaxFeeProp() {
        return NMaxFeeProp;
    }

    public void setNMaxFeeProp(Double maxFeeProp) {
        NMaxFeeProp = maxFeeProp;
    }

    public String getCFinTyp() {
        return CFinTyp;
    }

    public void setCFinTyp(String finTyp) {
        CFinTyp = finTyp;
    }

    public Long getNOrigTimes() {
		return NOrigTimes;
	}

	public void setNOrigTimes(Long origTimes) {
		NOrigTimes = origTimes;
	}

	public String getCSlsId() {
        return CSlsId;
    }

    public void setCSlsId(String slsId) {
        CSlsId = slsId;
    }

    public String getCSlsTel() {
        return CSlsTel;
    }

    public void setCSlsTel(String slsTel) {
        CSlsTel = slsTel;
    }

    public String getCSlsNme() {
        return CSlsNme;
    }

    public void setCSlsNme(String slsNme) {
        CSlsNme = slsNme;
    }

    public String getCSalegrpCde() {
        return CSalegrpCde;
    }

    public void setCSalegrpCde(String salegrpCde) {
        CSalegrpCde = salegrpCde;
    }

    public String getCDptAttr() {
        return CDptAttr;
    }

    public void setCDptAttr(String dptAttr) {
        CDptAttr = dptAttr;
    }

    public String getCVipCus() {
        return CVipCus;
    }

    public void setCVipCus(String vipCus) {
        CVipCus = vipCus;
    }

    public String getCGrantDptCde() {
        return CGrantDptCde;
    }

    public void setCGrantDptCde(String grantDptCde) {
        CGrantDptCde = grantDptCde;
    }

	public String getCFeeCalTyp() {
		return CFeeCalTyp;
	}

	public void setCFeeCalTyp(String feeCalTyp) {
		CFeeCalTyp = feeCalTyp;
	}

	public String getCRateNo() {
		return CRateNo;
	}

	public void setCRateNo(String rateNo) {
		CRateNo = rateNo;
	}

	public String getCSaveMrk() {
		return CSaveMrk;
	}

	public void setCSaveMrk(String saveMrk) {
		CSaveMrk = saveMrk;
	}

	public Double getNBefEdrSaving() {
		return NBefEdrSaving;
	}

	public void setNBefEdrSaving(Double befEdrSaving) {
		NBefEdrSaving = befEdrSaving;
	}

	public Double getNSavingVar() {
		return NSavingVar;
	}

	public void setNSavingVar(Double savingVar) {
		NSavingVar = savingVar;
	}

	public String getCCommonFlag() {
		return CCommonFlag;
	}

	public void setCCommonFlag(String commonFlag) {
		CCommonFlag = commonFlag;
	}

	public String getCDataSrc() {
		return CDataSrc;
	}

	public void setCDataSrc(String dataSrc) {
		CDataSrc = dataSrc;
	}

	public Double getNAllPrm() {
		return NAllPrm;
	}

	public void setNAllPrm(Double allPrm) {
		NAllPrm = allPrm;
	}

	public Double getNIrrRatio() {
		return NIrrRatio;
	}

	public void setNIrrRatio(Double irrRatio) {
		NIrrRatio = irrRatio;
	}

	public String getCLargeBusiness() {
		return CLargeBusiness;
	}

	public void setCLargeBusiness(String largeBusiness) {
		CLargeBusiness = largeBusiness;
	}

	public String getCQuotaMrk() {
		return CQuotaMrk;
	}

	public void setCQuotaMrk(String quotaMrk) {
		CQuotaMrk = quotaMrk;
	}

	public String getCSusBusiness() {
		return CSusBusiness;
	}

	public void setCSusBusiness(String susBusiness) {
		CSusBusiness = susBusiness;
	}

	public String getCChaType() {
		return CChaType;
	}

	public void setCChaType(String chaType) {
		CChaType = chaType;
	}

	public String getCChaSubtype() {
		return CChaSubtype;
	}

	public void setCChaSubtype(String chaSubtype) {
		CChaSubtype = chaSubtype;
	}

	public Double getNBasePrm() {
		return NBasePrm;
	}

	public void setNBasePrm(Double basePrm) {
		NBasePrm = basePrm;
	}

	public String getCNoendclmMrk() {
		return CNoendclmMrk;
	}

	public void setCNoendclmMrk(String noendclmMrk) {
		CNoendclmMrk = noendclmMrk;
	}

	public String getCTransMrk() {
		return CTransMrk;
	}

	public void setCTransMrk(String transMrk) {
		CTransMrk = transMrk;
	}
	
	public Date getTRepStopExtBgnTm() {
		return TRepStopExtBgnTm;
	}

	public Date getTRepStopExtEndTm() {
		return TRepStopExtEndTm;
	}

	public String getCRepStopExtRleAppNo() {
		return CRepStopExtRleAppNo;
	}

	public void setTRepStopExtBgnTm(Date repStopExtBgnTm) {
		TRepStopExtBgnTm = repStopExtBgnTm;
	}

	public void setTRepStopExtEndTm(Date repStopExtEndTm) {
		TRepStopExtEndTm = repStopExtEndTm;
	}

	public void setCRepStopExtRleAppNo(String repStopExtRleAppNo) {
		CRepStopExtRleAppNo = repStopExtRleAppNo;
	}
	public Date getTRepstopExtLastEndTm() {
		return TRepstopExtLastEndTm;
	}

	public Date getTSrcInsrncBgnTm() {
		return TSrcInsrncBgnTm;
	}

	public Date getTSrcInsrncEndSTm() {
		return TSrcInsrncEndSTm;
	}

	public String getCRepstopextStatus() {
		return CRepstopextStatus;
	}

	public String getCRepstopextSrcAppNo() {
		return CRepstopextSrcAppNo;
	}

	public void setTRepstopExtLastEndTm(Date repstopExtLastEndTm) {
		TRepstopExtLastEndTm = repstopExtLastEndTm;
	}

	public void setTSrcInsrncBgnTm(Date srcInsrncBgnTm) {
		TSrcInsrncBgnTm = srcInsrncBgnTm;
	}

	public void setTSrcInsrncEndSTm(Date srcInsrncEndSTm) {
		TSrcInsrncEndSTm = srcInsrncEndSTm;
	}

	public void setCRepstopextStatus(String repstopextStatus) {
		CRepstopextStatus = repstopextStatus;
	}

	public void setCRepstopextSrcAppNo(String repstopextSrcAppNo) {
		CRepstopextSrcAppNo = repstopextSrcAppNo;
	}

	public Double getNTaxAmt() {
		return NTaxAmt;
	}

	public void setNTaxAmt(Double taxAmt) {
		NTaxAmt = taxAmt;
	}

	public String getCBrkSlsCde() {
		return CBrkSlsCde;
	}

	public void setCBrkSlsCde(String brkSlsCde) {
		CBrkSlsCde = brkSlsCde;
	}
	
	public String getCTenderNo() {
		return CTenderNo;
	}

	public void setCTenderNo(String tenderNo) {
		CTenderNo = tenderNo;
	}

	public String getCApproveCde() {
		return CApproveCde;
	}

	public void setCApproveCde(String approveCde) {
		CApproveCde = approveCde;
	}

	public String getCPreferential() {
		return CPreferential;
	}

	public void setCPreferential(String preferential) {
		CPreferential = preferential;
	}

	public String getCAreaFlag() {
		return CAreaFlag;
	}

	public void setCAreaFlag(String areaFlag) {
		CAreaFlag = areaFlag;
	}

	public String getCCertfNo() {
		return CCertfNo;
	}

	public void setCCertfNo(String certfNo) {
		CCertfNo = certfNo;
	}

	public String getCUnfixSpcHidden() {
		return CUnfixSpcHidden;
	}

	public String getCDanzhengTyp() {
		return CDanzhengTyp;
	}

	public void setCUnfixSpcHidden(String unfixSpcHidden) {
		CUnfixSpcHidden = unfixSpcHidden;
	}

	public void setCDanzhengTyp(String danzhengTyp) {
		CDanzhengTyp = danzhengTyp;
	}

	public String getCMonitorId() {
		return CMonitorId;
	}

	public void setCMonitorId(String monitorId) {
		CMonitorId = monitorId;
	}

	public String getCUndrOpn() {
		return CUndrOpn;
	}

	public void setCUndrOpn(String undrOpn) {
		CUndrOpn = undrOpn;
	}

	public String getCUnfixSpcIlog() {
		return CUnfixSpcIlog;
	}

	public void setCUnfixSpcIlog(String unfixSpcIlog) {
		CUnfixSpcIlog = unfixSpcIlog;
	}

	public String getCQteTyp() {
        return this.CQteTyp;
    }

    public void setCQteTyp(String CQteTyp) {
        this.CQteTyp = CQteTyp;
    }

	public String getCQuickFlag() {
		return CQuickFlag;
	}

	public void setCQuickFlag(String quickFlag) {
		CQuickFlag = quickFlag;
	}

	public String getCIsilogBack() {
		return CIsilogBack;
	}

	public void setCIsilogBack(String isilogBack) {
		CIsilogBack = isilogBack;
	}

	public String getCBrkSlsName() {
		return CBrkSlsName;
	}

	public void setCBrkSlsName(String brkSlsName) {
		CBrkSlsName = brkSlsName;
	}

	public Double getNFundRate() {
		return NFundRate;
	}

	public void setNFundRate(Double fundRate) {
		NFundRate = fundRate;
	}

	public Double getNFundAmount() {
		return NFundAmount;
	}

	public void setNFundAmount(Double fundAmount) {
		NFundAmount = fundAmount;
	}

	public String getCCountryFlag() {
		return CCountryFlag;
	}

	public void setCCountryFlag(String cCountryFlag) {
		CCountryFlag = cCountryFlag;
	}

	public String getCPurePrmFlag() {
		return CPurePrmFlag;
	}

	public void setCPurePrmFlag(String CPurePrmFlag) {
		this.CPurePrmFlag = CPurePrmFlag;
	}

	public String getCReceiHs() {
		return CReceiHs;
	}

	public void setCReceiHs(String cReceiHs) {
		CReceiHs = cReceiHs;
	}
	public String getCSalegrpNme() {
		return CSalegrpNme;
	}
	public void setCSalegrpNme(String cSalegrpNme) {
		CSalegrpNme = cSalegrpNme;
	}
	public String getCNeedfeeFlag() {
		return CNeedfeeFlag;
	}
	public void setCNeedfeeFlag(String cNeedfeeFlag) {
		CNeedfeeFlag = cNeedfeeFlag;
	}
	public String getCResvTxt9() {
		return CResvTxt9;
	}
	public void setCResvTxt9(String cResvTxt9) {
		CResvTxt9 = cResvTxt9;
	}
	public String getCResvTxt10() {
		return CResvTxt10;
	}
	public void setCResvTxt10(String cResvTxt10) {
		CResvTxt10 = cResvTxt10;
	}
	public String getCStopTravelReason() {
		return CStopTravelReason;
	}
	public void setCStopTravelReason(String stopTravelReason) {
		CStopTravelReason = stopTravelReason;
	}
	public String getCInvType() {
		return CInvType;
	}
	public void setCInvType(String cInvType) {
		CInvType = cInvType;
	}
	public String getCResvTxt6() {
		return CResvTxt6;
	}
	public void setCResvTxt6(String cResvTxt6) {
		CResvTxt6 = cResvTxt6;
	}
	
}