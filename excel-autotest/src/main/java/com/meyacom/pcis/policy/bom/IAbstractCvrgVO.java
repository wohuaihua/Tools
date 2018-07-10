package com.meyacom.pcis.policy.bom;

import java.util.Date;

/**
 * AbstractCvrgVO entity - Base definition for CvrgVO and CvrAppgVO .
 *
 * @author jiangqf@isoftstone-ai.com
 */

public class IAbstractCvrgVO {

    // Fields

    /**WEB_PLY_CVRG or WEB_app_CVRG */
    private String CPkId;//C_PK_ID 主键
    /** */
    private String CAppNo;//C_APP_NO 申请单号
    /** */
    private String CPlyNo;//C_PLY_NO 保单号 
    /** */
    private String CEdrNo;//C_EDR_NO 批单号
    private Long NEdrPrjNo;//N_EDR_PRJ_NO 批改序号,批改次数 
    /** */
    private Long NSeqNo;//N_SEQ_NO 序号,序号
    private String CLatestMrk;//C_LATEST_MRK 最新保单标志,'0'否,'1'是
    /** */
    private String CCvrgNo;//C_CVRG_NO 险别编号 
    /** */
    private String CCustCvrgNme;//C_CUST_CVRG_NME 自定义险别名称,自定义险别名称
    /** */
    private String CCustClCtnt;//C_CUST_CL_CTNT 自定义条款内容,自定义条款内容
    /** */
    private Double NAmt = 0.0;//N_AMT 保额,保额 
    /** */
    private Double NRate = 0.0;//N_RATE 费率,费率
    /** */
    private Double NBasePrm;//N_BASE_PRM 基本保费,基本保费 
    /** */
    private Double NBefPrm = 0.0;//N_BEF_PRM 折前保费,折前保费
    /** */
    private Double NDisCoef;//N_DIS_COEF 折扣系数,优惠系数
    /** */
    private Double NCalcPrm = 0.0;//N_CALC_PRM 折后保费,计算保费
    /** */
    private Double NPrm = 0.0;//N_PRM 实际保费,保费
    /** */
    private Double NBefAnnPrm = 0.0;//N_BEF_ANN_PRM 年折前保费,年折前保费
    /** */
    private Double NCalcAnnPrm = 0.0;//N_CALC_ANN_PRM 年折后保费,年计算保费
    /** */
    private Date TPrmChgTm;//T_PRM_CHG_TM 保费变化时间 
    /** */
    private Double NDutPrm;//N_DUT_PRM 变化前已了责任保费,已了责任保费，缺省为0
    /** */
    private String CRemark;//C_REMARK 备注
    /** */
    private String CTgtTyp;//C_TGT_TYP 标的类型代码
    /** */
    private String CTgtNme;//C_TGT_NME 标的名称
    /** */
    private Long NTgtQty;//N_TGT_QTY 标的数量
    /** */
    private Double NIndemLmt;//N_INDEM_LMT 赔偿限额
    /** */
    private Double NDductRate;//N_DDUCT_RATE 免赔率,免赔率
    /** */
    private String CDductDesc;//C_DDUCT_DESC 免赔说明
    /** */
    private Double NDductAmt;//N_DDUCT_AMT 绝对免赔额
    /** */
    private String CCancelMrk;//C_CANCEL_MRK 退保标志  缺省为'1'，当批改退保时为‘0’
    /** */
    private String CIndemLmtLvl;//C_INDEM_LMT_LVL 赔偿限额档次,赔偿限额档次(车险) 
    /** */
    private Long NLiabDaysLmt;//N_LIAB_DAYS_LMT "责任天数,责任时限(车险)车上人员责任险作为乘客座位数"
    /** */
    private Double NPerAmt;//N_PER_AMT "每标的保额,每标的保额 车上人员责任险作为司机保额"
    /** */
    private Double NPerIndemLmt;//N_PER_INDEM_LMT "每标的赔偿限额,每标的赔偿限额 车上人员责任险作为乘客保额"
    /** */
    private Double NPerPrm;//N_PER_PRM 每标的保费,每标的保费 
    /** */
    private Double NOnceIndemLmt;//N_ONCE_INDEM_LMT 单次赔偿限额,单次赔偿限额
    /** */
    private Double NSavingAmt;//N_SAVING_AMT 储金 
    /** */
    private Date TBgnTm;//T_BGN_TM 有效起期,险别的有效起期，保单为保单的保险起期，批单为批单的生效起期
    /** */
    private Date TEndTm;//T_END_TM 有效止期,险别的有效起期，保单为保单的保险止期，批单为批单的生效止期
    /** */
    private Double NAmtVar = 0.0;//N_AMT_VAR 保额变化
    /** */
    private Double NPrmVar = 0.0;//N_PRM_VAR 保费变化
    /** */
    private Double NCalcPrmVar;//N_CALC_PRM_VAR 计算保费变化,计算保费
    /** */
    private Double NIndemVar;//N_INDEM_VAR 赔偿限额变化
    /** */
    private String CCrtCde;//C_CRT_CDE 创建人代码
    /** */
    private Date TCrtTm;//T_CRT_TM 创建时间
    /** */
    private String CUpdCde;//C_UPD_CDE 修改人代码
    /** */
    private Date TUpdTm;//T_UPD_TM 修改时间
    /** */
    private String CResvTxt1;//C_RESV_TXT_1 预留字符串字段1,预留
    /** */
    private String CResvTxt2;//C_RESV_TXT_2 预留字符串字段2,预留
    /** */
    private String CResvTxt3;//C_RESV_TXT_3 预留字符串字段3,预留
    /** */
    private String CResvTxt4;//C_RESV_TXT_4 预留字符串字段4,预留
    /** */
    private String CResvTxt5;//C_RESV_TXT_5 预留字符串字段5,预留
    /** */
    private String CResvTxt6;//C_RESV_TXT_6 预留字符串字段6,预留
    /** */
    private String CResvTxt7;//C_RESV_TXT_7 预留字符串字段7,预留
    /** */
    private String CResvTxt8;//C_RESV_TXT_8 预留字符串字段8,预留
    /** */
    private String CResvTxt9;//C_RESV_TXT_9 预留字符串字段9,预留
    /** */
    private String CResvTxt10;//C_RESV_TXT_10 预留字符串字段10,预留
    /** */
    private String CResvTxt11;//C_RESV_TXT_11 预留字符串字段11,预留
    /** */
    private String CResvTxt12;//C_RESV_TXT_12 预留字符串字段12,预留
    /** */
    private String CResvTxt13;//C_RESV_TXT_13 预留字符串字段13,预留
    /** */
    private String CResvTxt14;//C_RESV_TXT_14 预留字符串字段14,预留
    /** */
    private String CResvTxt15;//C_RESV_TXT_15 预留字符串字段15,预留
    /** */
    private String CResvTxt16;//C_RESV_TXT_16 预留字符串字段16,预留
    /** */
    private String CResvTxt17;//C_RESV_TXT_17 预留字符串字段17,预留
    /** */
    private String CResvTxt18;//C_RESV_TXT_18 预留字符串字段18,预留
    /** */
    private String CResvTxt19;//C_RESV_TXT_19 预留字符串字段19,预留
    /** */
    private String CResvTxt20;//C_RESV_TXT_20 预留字符串字段20,预留
    /** */
    private String CResvTxt21;//C_RESV_TXT_21 预留字符串字段21,预留
    /** */
    private String CResvTxt22;//C_RESV_TXT_22 预留字符串字段22,预留
    /** */
    private String CResvTxt23;//C_RESV_TXT_23 预留字符串字段23,预留
    /** */
    private String CResvTxt24;//C_RESV_TXT_24 预留字符串字段24,预留
    /** */
    private String CResvTxt25;//C_RESV_TXT_25 预留字符串字段25,预留
    /** */
    private String CResvTxt26;//C_RESV_TXT_26 预留字符串字段26,预留
    /** */
    private String CResvTxt27;//C_RESV_TXT_27 预留字符串字段27,预留
    /** */
    private String CResvTxt28;//C_RESV_TXT_28 预留字符串字段28,预留
    /** */
    private String CResvTxt29;//C_RESV_TXT_29 预留字符串字段29,预留
    /** */
    private String CResvTxt30;//C_RESV_TXT_30 预留字符串字段30,预留
    /** */
    private Double NResvNum1;//N_RESV_NUM_1 预留数值字段1,预留
    /** */
    private Double NResvNum2;//N_RESV_NUM_2 预留数值字段2,预留
    /** */
    private Double NResvNum3;//N_RESV_NUM_3 预留数值字段3,预留
    /** */
    private Double NResvNum4;//N_RESV_NUM_4 预留数值字段4,预留
    /** */
    private Double NResvNum5;//N_RESV_NUM_5 预留数值字段5,预留
    /** */
    private Double NResvNum6;//N_RESV_NUM_6 预留数值字段6,预留
    /** */
    private Double NResvNum7;//N_RESV_NUM_7 预留数值字段7,预留
    /** */
    private Double NResvNum8;//N_RESV_NUM_8 预留数值字段8,预留
    /** */
    private Double NResvNum9;//N_RESV_NUM_9 预留数值字段9,预留
    /** */
    private Double NResvNum10;//N_RESV_NUM_10 预留数值字段10,预留
    /** */
    private Double NResvNum11;//N_RESV_NUM_11 预留数值字段11,预留
    /** */
    private Double NResvNum12;//N_RESV_NUM_12 预留数值字段12,预留
    /** */
    private Double NResvNum13;//N_RESV_NUM_13 预留数值字段13,预留
    /** */
    private Double NResvNum14;//N_RESV_NUM_14 预留数值字段14,预留
    /** */
    private Double NResvNum15;//N_RESV_NUM_15 预留数值字段15,预留
    /** */
    private Double NResvNum16;//N_RESV_NUM_16 预留数值字段16,预留
    /** */
    private Double NResvNum17;//N_RESV_NUM_17 预留数值字段17,预留
    /** */
    private Double NResvNum18;//N_RESV_NUM_18 预留数值字段18,预留
    /** */
    private Double NResvNum19;//N_RESV_NUM_19 预留数值字段19,预留
    /** */
    private Double NResvNum20;//N_RESV_NUM_20 预留数值字段20,预留
    /** */
    private Double NResvNum21;//N_RESV_NUM_21 预留数值字段21,预留
    /** */
    private Double NResvNum22;//N_RESV_NUM_22 预留数值字段22,预留
    /** */
    private Double NResvNum23;//N_RESV_NUM_23 预留数值字段23,预留
    /** */
    private Double NResvNum24;//N_RESV_NUM_24 预留数值字段24,预留
    /** */
    private Double NResvNum25;//N_RESV_NUM_25 预留数值字段25,预留
    /** */
    private Double NResvNum26;//N_RESV_NUM_26 预留数值字段26,预留
    /** */
    private Double NResvNum27;//N_RESV_NUM_27 预留数值字段27,预留
    /** */
    private Double NResvNum28;//N_RESV_NUM_28 预留数值字段28,预留
    /** */
    private Double NResvNum29;//N_RESV_NUM_29 预留数值字段29,预留
    /** */
    private Double NResvNum30;//N_RESV_NUM_30 预留数值字段30,预留
    /** */
    private Date TResvTm1;//T_RESV_TM_1	预留时间字段1,预留
    /** */
    private Date TResvTm2;//T_RESV_TM_2预留时间字段2,预留
    /** */
    private Date TResvTm3;//T_RESV_TM_3 预留时间字段3,预留
    /** */
    private Date TResvTm4;//T_RESV_TM_4 预留时间字段4,预留
    /** */
    private Date TResvTm5;//T_RESV_TM_5 预留时间字段5,预留
    /** */
    private String CDductMrk;//C_DDUCT_MRK 不计免赔标志,'0' 否,'1' 是
    /** */
    private String CRowId;//C_ROW_ID "记录唯一标识号,投保时为投保单的PKID，批改申请时如非新增记录则为原投保单的PKID,如为新增记录则为批改申请单的PKID"

    
    private Double NDductPrm;//N_DDUCT_PRM 不计免赔保费
    // Constructors
    
    private String CUnderInsuranceFlag;//xingazhou 2011.05.25 不足额投保标志:0:足额投保,1:不足额投保 C_UNDER_INSURANCE_FLAG

  	private String CFormula;//xingzhou 2012.02.20 保费计算过程
  	
  	private String CGlassTyp;//hjt 20120707 玻璃单独破碎的玻璃类型
  	
  	private String CExtAreaRad;//扩展区域半径字段（机动车出境保险 使用）
  	private String CAccidentTyp;//事故类型 字段（约定区域通行费特约 使用）
  	private String CAgreementRatio;//协定比例 字段（新车特约A，新车特约B 使用）
  	
  	private Double NBasePurePrm;//2015-04-02 add by marui 基准纯风险保费
  	private Double NFranchiseRate;// 可选免赔额费率
  	
  	private Double NDductBefPrm;//N_DDUCT_BEF_PRM不计免赔折前保费
  	private Double NDductPrmVar;//N_DDUCT_PRM_VAR不计免赔保费变化量
  	private Double NAutoCheCoef;//自主核保系数
  	private String indemLmtLvl;//保额限额档次代码
	private Double indemLmt;//保额限额金额
	//private String dductAmtLvl;//可选绝对免赔额档次代码--->>CResvTxt12
	 //营改增增加字段
    private Double NVat; //N_vat 增值税额
    private Double NPrice;//    保费收入
    private Double NVatVar; // 增值税变化值
    private Double NPriceVar;// 保费收入变化值
    

	private String NSepcRep;//指定修理厂险浮动比例
	

    public String getNSepcRep() {
		return NSepcRep;
	}

	public void setNSepcRep(String nSepcRep) {
		NSepcRep = nSepcRep;
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

	public String getIndemLmtLvl() {
		return indemLmtLvl;
	}

	public void setIndemLmtLvl(String indemLmtLvl) {
		this.indemLmtLvl = indemLmtLvl;
	}

	public Double getIndemLmt() {
		return indemLmt;
	}

	public void setIndemLmt(Double indemLmt) {
		this.indemLmt = indemLmt;
	}

	public Double getNAutoCheCoef() {
		return NAutoCheCoef;
	}

	public void setNAutoCheCoef(Double nAutoCheCoef) {
		NAutoCheCoef = nAutoCheCoef;
	}

	public Double getNDductBefPrm() {
		return NDductBefPrm;
	}

	public void setNDductBefPrm(Double nDductBefPrm) {
		NDductBefPrm = nDductBefPrm;
	}

	public Double getNDductPrmVar() {
		return NDductPrmVar;
	}

	public void setNDductPrmVar(Double nDductPrmVar) {
		NDductPrmVar = nDductPrmVar;
	}

	public Double getNFranchiseRate() {
		return NFranchiseRate;
	}

	public void setNFranchiseRate(Double nFranchiseRate) {
		NFranchiseRate = nFranchiseRate;
	}

	public Double getNBasePurePrm() {
		return NBasePurePrm;
	}

	public void setNBasePurePrm(Double nBasePurePrm) {
		NBasePurePrm = nBasePurePrm;
	}

	public String getCGlassTyp() {
		return CGlassTyp;
	}

	public void setCGlassTyp(String glassTyp) {
		CGlassTyp = glassTyp;
	}

	public String getCFormula() {
		return CFormula;
	}

	public void setCFormula(String formula) {
		CFormula = formula;
	}

	public Double getNDductPrm() {
		return NDductPrm;
	}

	public void setNDductPrm(Double dductPrm) {
		NDductPrm = dductPrm;
	}

	/** default constructor */
    public IAbstractCvrgVO() {
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

    public String getCCvrgNo() {
        return this.CCvrgNo;
    }

    public void setCCvrgNo(String CCvrgNo) {
        this.CCvrgNo = CCvrgNo;
    }

    public String getCCustCvrgNme() {
        return this.CCustCvrgNme;
    }

    public void setCCustCvrgNme(String CCustCvrgNme) {
        this.CCustCvrgNme = CCustCvrgNme;
    }

    public String getCCustClCtnt() {
        return this.CCustClCtnt;
    }

    public void setCCustClCtnt(String CCustClCtnt) {
        this.CCustClCtnt = CCustClCtnt;
    }

    public Double getNAmt() {
        return this.NAmt;
    }

    public void setNAmt(Double NAmt) {
        this.NAmt = NAmt;
    }

    public Double getNRate() {
        return this.NRate;
    }

    public void setNRate(Double NRate) {
        this.NRate = NRate;
    }

    public Double getNBasePrm() {
        return this.NBasePrm;
    }

    public void setNBasePrm(Double NBasePrm) {
        this.NBasePrm = NBasePrm;
    }

    public Double getNBefPrm() {
        return this.NBefPrm;
    }

    public void setNBefPrm(Double NBefPrm) {
        this.NBefPrm = NBefPrm;
    }

    public Double getNDisCoef() {
        return this.NDisCoef;
    }

    public void setNDisCoef(Double NDisCoef) {
        this.NDisCoef = NDisCoef;
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

    public Double getNBefAnnPrm() {
        return this.NBefAnnPrm;
    }

    public void setNBefAnnPrm(Double NBefAnnPrm) {
        this.NBefAnnPrm = NBefAnnPrm;
    }

    public Double getNCalcAnnPrm() {
        return this.NCalcAnnPrm;
    }

    public void setNCalcAnnPrm(Double NCalcAnnPrm) {
        this.NCalcAnnPrm = NCalcAnnPrm;
    }

    public Date getTPrmChgTm() {
        return this.TPrmChgTm;
    }

    public void setTPrmChgTm(Date TPrmChgTm) {
        this.TPrmChgTm = TPrmChgTm;
    }

    public Double getNDutPrm() {
        return this.NDutPrm;
    }

    public void setNDutPrm(Double NDutPrm) {
        this.NDutPrm = NDutPrm;
    }

    public String getCRemark() {
        return this.CRemark;
    }

    public void setCRemark(String CRemark) {
        this.CRemark = CRemark;
    }

    public String getCTgtTyp() {
        return this.CTgtTyp;
    }

    public void setCTgtTyp(String CTgtTyp) {
        this.CTgtTyp = CTgtTyp;
    }

    public String getCTgtNme() {
        return this.CTgtNme;
    }

    public void setCTgtNme(String CTgtNme) {
        this.CTgtNme = CTgtNme;
    }

    public Long getNTgtQty() {
        return this.NTgtQty;
    }

    public void setNTgtQty(Long NTgtQty) {
        this.NTgtQty = NTgtQty;
    }

    public Double getNIndemLmt() {
        return this.NIndemLmt;
    }

    public void setNIndemLmt(Double NIndemLmt) {
        this.NIndemLmt = NIndemLmt;
    }

    public Double getNDductRate() {
        return this.NDductRate;
    }

    public void setNDductRate(Double NDductRate) {
        this.NDductRate = NDductRate;
    }

    public String getCDductDesc() {
        return this.CDductDesc;
    }

    public void setCDductDesc(String CDductDesc) {
        this.CDductDesc = CDductDesc;
    }

    public Double getNDductAmt() {
        return this.NDductAmt;
    }

    public void setNDductAmt(Double NDductAmt) {
        this.NDductAmt = NDductAmt;
    }

    public String getCCancelMrk() {
        return this.CCancelMrk;
    }

    public void setCCancelMrk(String CCancelMrk) {
        this.CCancelMrk = CCancelMrk;
    }

    public String getCIndemLmtLvl() {
        return this.CIndemLmtLvl;
    }

    public void setCIndemLmtLvl(String CIndemLmtLvl) {
        this.CIndemLmtLvl = CIndemLmtLvl;
    }

    public Long getNLiabDaysLmt() {
        return this.NLiabDaysLmt;
    }

    public void setNLiabDaysLmt(Long NLiabDaysLmt) {
        this.NLiabDaysLmt = NLiabDaysLmt;
    }

    public Double getNPerAmt() {
        return this.NPerAmt;
    }

    public void setNPerAmt(Double NPerAmt) {
        this.NPerAmt = NPerAmt;
    }

    public Double getNPerIndemLmt() {
        return this.NPerIndemLmt;
    }

    public void setNPerIndemLmt(Double NPerIndemLmt) {
        this.NPerIndemLmt = NPerIndemLmt;
    }

    public Double getNPerPrm() {
        return this.NPerPrm;
    }

    public void setNPerPrm(Double NPerPrm) {
        this.NPerPrm = NPerPrm;
    }

    public Double getNOnceIndemLmt() {
        return this.NOnceIndemLmt;
    }

    public void setNOnceIndemLmt(Double NOnceIndemLmt) {
        this.NOnceIndemLmt = NOnceIndemLmt;
    }

    public Double getNSavingAmt() {
        return this.NSavingAmt;
    }

    public void setNSavingAmt(Double NSavingAmt) {
        this.NSavingAmt = NSavingAmt;
    }

    public Date getTBgnTm() {
        return this.TBgnTm;
    }

    public void setTBgnTm(Date TBgnTm) {
        this.TBgnTm = TBgnTm;
    }

    public Date getTEndTm() {
        return this.TEndTm;
    }

    public void setTEndTm(Date TEndTm) {
        this.TEndTm = TEndTm;
    }

    public Double getNAmtVar() {
        return this.NAmtVar;
    }

    public void setNAmtVar(Double NAmtVar) {
        this.NAmtVar = NAmtVar;
    }

    public Double getNPrmVar() {
        return this.NPrmVar;
    }

    public void setNPrmVar(Double NPrmVar) {
        this.NPrmVar = NPrmVar;
    }

    public Double getNCalcPrmVar() {
        return this.NCalcPrmVar;
    }

    public void setNCalcPrmVar(Double NCalcPrmVar) {
        this.NCalcPrmVar = NCalcPrmVar;
    }

    public Double getNIndemVar() {
        return this.NIndemVar;
    }

    public void setNIndemVar(Double NIndemVar) {
        this.NIndemVar = NIndemVar;
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

    public String getCResvTxt5() {
        return this.CResvTxt5;
    }

    public void setCResvTxt5(String CResvTxt5) {
        this.CResvTxt5 = CResvTxt5;
    }

    public String getCResvTxt6() {
        return this.CResvTxt6;
    }

    public void setCResvTxt6(String CResvTxt6) {
        this.CResvTxt6 = CResvTxt6;
    }

    public String getCResvTxt7() {
        return this.CResvTxt7;
    }

    public void setCResvTxt7(String CResvTxt7) {
        this.CResvTxt7 = CResvTxt7;
    }

    public String getCResvTxt8() {
        return this.CResvTxt8;
    }

    public void setCResvTxt8(String CResvTxt8) {
        this.CResvTxt8 = CResvTxt8;
    }

    public String getCResvTxt9() {
        return this.CResvTxt9;
    }

    public void setCResvTxt9(String CResvTxt9) {
        this.CResvTxt9 = CResvTxt9;
    }

    public String getCResvTxt10() {
        return this.CResvTxt10;
    }

    public void setCResvTxt10(String CResvTxt10) {
        this.CResvTxt10 = CResvTxt10;
    }

    public String getCResvTxt11() {
        return this.CResvTxt11;
    }

    public void setCResvTxt11(String CResvTxt11) {
        this.CResvTxt11 = CResvTxt11;
    }

    public String getCResvTxt12() {
        return this.CResvTxt12;
    }

    public void setCResvTxt12(String CResvTxt12) {
        this.CResvTxt12 = CResvTxt12;
    }

    public String getCResvTxt13() {
        return this.CResvTxt13;
    }

    public void setCResvTxt13(String CResvTxt13) {
        this.CResvTxt13 = CResvTxt13;
    }

    public String getCResvTxt14() {
        return this.CResvTxt14;
    }

    public void setCResvTxt14(String CResvTxt14) {
        this.CResvTxt14 = CResvTxt14;
    }

    public String getCResvTxt15() {
        return this.CResvTxt15;
    }

    public void setCResvTxt15(String CResvTxt15) {
        this.CResvTxt15 = CResvTxt15;
    }

    public String getCResvTxt16() {
        return this.CResvTxt16;
    }

    public void setCResvTxt16(String CResvTxt16) {
        this.CResvTxt16 = CResvTxt16;
    }

    public String getCResvTxt17() {
        return this.CResvTxt17;
    }

    public void setCResvTxt17(String CResvTxt17) {
        this.CResvTxt17 = CResvTxt17;
    }

    public String getCResvTxt18() {
        return this.CResvTxt18;
    }

    public void setCResvTxt18(String CResvTxt18) {
        this.CResvTxt18 = CResvTxt18;
    }

    public String getCResvTxt19() {
        return this.CResvTxt19;
    }

    public void setCResvTxt19(String CResvTxt19) {
        this.CResvTxt19 = CResvTxt19;
    }

    public String getCResvTxt20() {
        return this.CResvTxt20;
    }

    public void setCResvTxt20(String CResvTxt20) {
        this.CResvTxt20 = CResvTxt20;
    }

    public String getCResvTxt21() {
        return this.CResvTxt21;
    }

    public void setCResvTxt21(String CResvTxt21) {
        this.CResvTxt21 = CResvTxt21;
    }

    public String getCResvTxt22() {
        return this.CResvTxt22;
    }

    public void setCResvTxt22(String CResvTxt22) {
        this.CResvTxt22 = CResvTxt22;
    }

    public String getCResvTxt23() {
        return this.CResvTxt23;
    }

    public void setCResvTxt23(String CResvTxt23) {
        this.CResvTxt23 = CResvTxt23;
    }

    public String getCResvTxt24() {
        return this.CResvTxt24;
    }

    public void setCResvTxt24(String CResvTxt24) {
        this.CResvTxt24 = CResvTxt24;
    }

    public String getCResvTxt25() {
        return this.CResvTxt25;
    }

    public void setCResvTxt25(String CResvTxt25) {
        this.CResvTxt25 = CResvTxt25;
    }

    public String getCResvTxt26() {
        return this.CResvTxt26;
    }

    public void setCResvTxt26(String CResvTxt26) {
        this.CResvTxt26 = CResvTxt26;
    }

    public String getCResvTxt27() {
        return this.CResvTxt27;
    }

    public void setCResvTxt27(String CResvTxt27) {
        this.CResvTxt27 = CResvTxt27;
    }

    public String getCResvTxt28() {
        return this.CResvTxt28;
    }

    public void setCResvTxt28(String CResvTxt28) {
        this.CResvTxt28 = CResvTxt28;
    }

    public String getCResvTxt29() {
        return this.CResvTxt29;
    }

    public void setCResvTxt29(String CResvTxt29) {
        this.CResvTxt29 = CResvTxt29;
    }

    public String getCResvTxt30() {
        return this.CResvTxt30;
    }

    public void setCResvTxt30(String CResvTxt30) {
        this.CResvTxt30 = CResvTxt30;
    }

    public Double getNResvNum1() {
        return this.NResvNum1;
    }

    public void setNResvNum1(Double NResvNum1) {
        this.NResvNum1 = NResvNum1;
    }

    public Double getNResvNum2() {
        return this.NResvNum2;
    }

    public void setNResvNum2(Double NResvNum2) {
        this.NResvNum2 = NResvNum2;
    }

    public Double getNResvNum3() {
        return this.NResvNum3;
    }

    public void setNResvNum3(Double NResvNum3) {
        this.NResvNum3 = NResvNum3;
    }

    public Double getNResvNum4() {
        return this.NResvNum4;
    }

    public void setNResvNum4(Double NResvNum4) {
        this.NResvNum4 = NResvNum4;
    }

    public Double getNResvNum5() {
        return this.NResvNum5;
    }

    public void setNResvNum5(Double NResvNum5) {
        this.NResvNum5 = NResvNum5;
    }

    public Double getNResvNum6() {
        return this.NResvNum6;
    }

    public void setNResvNum6(Double NResvNum6) {
        this.NResvNum6 = NResvNum6;
    }

    public Double getNResvNum7() {
        return this.NResvNum7;
    }

    public void setNResvNum7(Double NResvNum7) {
        this.NResvNum7 = NResvNum7;
    }

    public Double getNResvNum8() {
        return this.NResvNum8;
    }

    public void setNResvNum8(Double NResvNum8) {
        this.NResvNum8 = NResvNum8;
    }

    public Double getNResvNum9() {
        return this.NResvNum9;
    }

    public void setNResvNum9(Double NResvNum9) {
        this.NResvNum9 = NResvNum9;
    }

    public Double getNResvNum10() {
        return this.NResvNum10;
    }

    public void setNResvNum10(Double NResvNum10) {
        this.NResvNum10 = NResvNum10;
    }

    public Double getNResvNum11() {
        return this.NResvNum11;
    }

    public void setNResvNum11(Double NResvNum11) {
        this.NResvNum11 = NResvNum11;
    }

    public Double getNResvNum12() {
        return this.NResvNum12;
    }

    public void setNResvNum12(Double NResvNum12) {
        this.NResvNum12 = NResvNum12;
    }

    public Double getNResvNum13() {
        return this.NResvNum13;
    }

    public void setNResvNum13(Double NResvNum13) {
        this.NResvNum13 = NResvNum13;
    }

    public Double getNResvNum14() {
        return this.NResvNum14;
    }

    public void setNResvNum14(Double NResvNum14) {
        this.NResvNum14 = NResvNum14;
    }

    public Double getNResvNum15() {
        return this.NResvNum15;
    }

    public void setNResvNum15(Double NResvNum15) {
        this.NResvNum15 = NResvNum15;
    }

    public Double getNResvNum16() {
        return this.NResvNum16;
    }

    public void setNResvNum16(Double NResvNum16) {
        this.NResvNum16 = NResvNum16;
    }

    public Double getNResvNum17() {
        return this.NResvNum17;
    }

    public void setNResvNum17(Double NResvNum17) {
        this.NResvNum17 = NResvNum17;
    }

    public Double getNResvNum18() {
        return this.NResvNum18;
    }

    public void setNResvNum18(Double NResvNum18) {
        this.NResvNum18 = NResvNum18;
    }

    public Double getNResvNum19() {
        return this.NResvNum19;
    }

    public void setNResvNum19(Double NResvNum19) {
        this.NResvNum19 = NResvNum19;
    }

    public Double getNResvNum20() {
        return this.NResvNum20;
    }

    public void setNResvNum20(Double NResvNum20) {
        this.NResvNum20 = NResvNum20;
    }

    public Double getNResvNum21() {
        return this.NResvNum21;
    }

    public void setNResvNum21(Double NResvNum21) {
        this.NResvNum21 = NResvNum21;
    }

    public Double getNResvNum22() {
        return this.NResvNum22;
    }

    public void setNResvNum22(Double NResvNum22) {
        this.NResvNum22 = NResvNum22;
    }

    public Double getNResvNum23() {
        return this.NResvNum23;
    }

    public void setNResvNum23(Double NResvNum23) {
        this.NResvNum23 = NResvNum23;
    }

    public Double getNResvNum24() {
        return this.NResvNum24;
    }

    public void setNResvNum24(Double NResvNum24) {
        this.NResvNum24 = NResvNum24;
    }

    public Double getNResvNum25() {
        return this.NResvNum25;
    }

    public void setNResvNum25(Double NResvNum25) {
        this.NResvNum25 = NResvNum25;
    }

    public Double getNResvNum26() {
        return this.NResvNum26;
    }

    public void setNResvNum26(Double NResvNum26) {
        this.NResvNum26 = NResvNum26;
    }

    public Double getNResvNum27() {
        return this.NResvNum27;
    }

    public void setNResvNum27(Double NResvNum27) {
        this.NResvNum27 = NResvNum27;
    }

    public Double getNResvNum28() {
        return this.NResvNum28;
    }

    public void setNResvNum28(Double NResvNum28) {
        this.NResvNum28 = NResvNum28;
    }

    public Double getNResvNum29() {
        return this.NResvNum29;
    }

    public void setNResvNum29(Double NResvNum29) {
        this.NResvNum29 = NResvNum29;
    }

    public Double getNResvNum30() {
        return this.NResvNum30;
    }

    public void setNResvNum30(Double NResvNum30) {
        this.NResvNum30 = NResvNum30;
    }

    public Date getTResvTm1() {
        return this.TResvTm1;
    }

    public void setTResvTm1(Date TResvTm1) {
        this.TResvTm1 = TResvTm1;
    }

    public Date getTResvTm2() {
        return this.TResvTm2;
    }

    public void setTResvTm2(Date TResvTm2) {
        this.TResvTm2 = TResvTm2;
    }

    public Date getTResvTm3() {
        return this.TResvTm3;
    }

    public void setTResvTm3(Date TResvTm3) {
        this.TResvTm3 = TResvTm3;
    }

    public Date getTResvTm4() {
        return this.TResvTm4;
    }

    public void setTResvTm4(Date TResvTm4) {
        this.TResvTm4 = TResvTm4;
    }

    public Date getTResvTm5() {
        return this.TResvTm5;
    }

    public void setTResvTm5(Date TResvTm5) {
        this.TResvTm5 = TResvTm5;
    }

    public boolean isSamePremCalcResult(IAbstractCvrgVO other) {
        //费率
        if (this.getNRate() != null) {
            if (!this.getNRate().equals(other.getNRate())) {
                return false;
            }
        } else {
            if (other.getNRate() != null) {
                return false;
            }
        }

        //基本保费
        if (this.getNBasePrm() != null) {
            if (!this.getNBasePrm().equals(other.getNBasePrm())) {
                return false;
            }
        } else {
            if (other.getNBasePrm() != null) {
                return false;
            }
        }

        //折前保费
        if (this.getNBefPrm() != null) {
            if (!this.getNBefPrm().equals(other.getNBefPrm())) {
                return false;
            }
        } else {
            if (other.getNBefPrm() != null) {
                return false;
            }
        }

        //折扣系数
        if (this.getNDisCoef() != null) {
            if (!this.getNDisCoef().equals(other.getNDisCoef())) {
                return false;
            }
        } else {
            if (other.getNDisCoef() != null) {
                return false;
            }
        }

        //计算保费
        if (this.getNCalcPrm() != null) {
            if (!this.getNCalcPrm().equals(other.getNCalcPrm())) {
                return false;
            }
        } else {
            if (other.getNCalcPrm() != null) {
                return false;
            }
        }

        //年折前保费
        if (this.getNBefAnnPrm() != null) {
            if (!this.getNBefAnnPrm().equals(other.getNBefAnnPrm())) {
                return false;
            }
        } else {
            if (other.getNBefAnnPrm() != null) {
                return false;
            }
        }

        //年计算保费
        if (this.getNCalcAnnPrm() != null) {
            if (!this.getNCalcAnnPrm().equals(other.getNCalcAnnPrm())) {
                return false;
            }
        } else {
            if (other.getNCalcAnnPrm() != null) {
                return false;
            }
        }

        return true;
    }

    public Long getNEdrPrjNo() {
        return this.NEdrPrjNo;
    }

    public void setNEdrPrjNo(Long edrPrjNo) {
        this.NEdrPrjNo = edrPrjNo;
    }

    public String getCDductMrk() {
        return this.CDductMrk;
    }

    public void setCDductMrk(String dductMrk) {
        this.CDductMrk = dductMrk;
    }

    public String getCLatestMrk() {
        return this.CLatestMrk;
    }

    public void setCLatestMrk(String latestMrk) {
        this.CLatestMrk = latestMrk;
    }

    public String getCRowId() {
        return this.CRowId;
    }

    public void setCRowId(String rowId) {
        this.CRowId = rowId;
    }

	public String getCUnderInsuranceFlag() {
		return CUnderInsuranceFlag;
	}

	public void setCUnderInsuranceFlag(String underInsuranceFlag) {
		CUnderInsuranceFlag = underInsuranceFlag;
	}

	public String getCExtAreaRad() {
		return CExtAreaRad;
	}

	public void setCExtAreaRad(String cExtAreaRad) {
		CExtAreaRad = cExtAreaRad;
	}

	public String getCAccidentTyp() {
		return CAccidentTyp;
	}

	public void setCAccidentTyp(String cAccidentTyp) {
		CAccidentTyp = cAccidentTyp;
	}

	public String getCAgreementRatio() {
		return CAgreementRatio;
	}

	public void setCAgreementRatio(String cAgreementRatio) {
		CAgreementRatio = cAgreementRatio;
	}



	
}