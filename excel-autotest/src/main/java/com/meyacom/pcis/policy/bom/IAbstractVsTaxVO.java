package com.meyacom.pcis.policy.bom;

import java.io.Serializable;
import java.util.Date;

/**
 * AbstractVsTaxVO entity - Base definition for VsTaxVO and VsTAppaxVO .
 * 
 * @author jiangqf@isoftstone-ai.com
 */

public  class IAbstractVsTaxVO  implements Serializable{

	// Fields

	/** */
	private String CAppNo;
	/** */
	private String CPlyNo;
	/** */
	private String CEdrNo;
	/** */
	private Long NEdrPrjNo;
	private String CVsTaxMrk;
	/** */
	private String CAbateMrk;
	/** */
	private Double CAbateProp;
	/** */
	private Double CAbateAmt;
    private String CLatestMrk;
	/** */
	private Double NCurbWt;
	/** */
	private String CTaxpayerId;
	/** */
	private String CTaxItemCde;
	/** */
	private Double NAnnUnitTaxAmt;
	/** */
	private Date TLastSaliEndDate;
	/** */
	private String CLastSaliInsurerCde;
	/** */
	private String CLastSaliPlyNo;
	/** */
	private Date TSaliAppDate;
	/** */
	private Long NTaxableMonths;
	/** */
	private Double NTaxableAmt;
	/** */
	private String CTaxYear;
	/** */
	private String CLastTaxYear;
	/** */
	private Long NLastYearTaxableMonths;
	/** */
	private Double NLastYear;
	/** */
	private Long NOverdueDays;
	/** */
	private Double NOverdueFineProp;
	/** */
	private Double NAggTax;
	/** */
	private Double NChargeProp;
	/** */
	private Double NChargeAmt;
	/** */
	private String CTaxPaymentRecptNo;
	/** */
	private String CTaxAuthorities;
	/** */
	private String CTaxReliefCertNo;
	/** */
	private String CTaxpayerCertTyp;//纳税人证件类型
	/** */
	private String CTaxpayerCertNo;//纳税人证件号码
	/** */
	private String CTaxpayerNme;
	/** */
	private String CTaxpayerAddr;
	/** */
	private String CCrtCde;
	/** */
	private Date TCrtTm;
	/** */
	private String CUpdCde;
	/** */
	private Date TUpdTm;
	/** */
	private String CPaytaxTyp;
	/** */
	private String CAbateRsn;
	/** */
	private String CNotpayNo;
	/** */
	private String CSubTaxItemCde;
	/** */
	private String CTaxUnit;
	/** */
	private String CTaxableTyp;
	/** */
	private String CShortTyp;
	/** */
	private String CTaxdptVhltyp;
	/** */
	private String CTaxBelongTm;
	/** */
	private String CTaxVchNo;
	/** */
	private String CTaxVchTyp;
	/** */
	private Date TLastSaliBgnDate;
	/** */
	private Date TTaxEffBgnTm;
	/** */
	private Date TTaxEffEndTm;
	/** */
	private Long NNewCarMon;
	/** */
	private Long NShortMon;
	/** */
	private Double NOverdueAmt;
	
	
	 //以下为新增字段
    private String CTaxAuthCde;
    private String CIsCommissionTax;
    private String CTaxfreeVhltyp;
    private String CTaxFreeCertNo;
    private String CFreeTaxOrg;
    private String CComTaxOrg;
    private String CTaxpayerComId;
    private String CVehicleNumber;
    private Date TCertificateDate;
    private Double NBalanceTax;
   	private Double NAggTaxVar;
   	private Double NBefEdrTax;
    
    /*永安  新增字段添加处理 kwcheng@isoftstone.com 2010-12-14*/
   	private String CAreaCde;
   	private String CCountry;
   	private String CProvince;
   	private String CCity;
   	private String CCounty;
   	private String CTaxAddr;
   	private String CLastYearTaxTyp;
   	
   	private String CDeclareStatusIA;//车船税申报状态 0-未申报 1-已申报 2-完税
   	private String CCalcTaxFlag;//算税标识 1-税源平台算税 2-车险平台算税 3-公司算税
   	
   	private String CTaxPrintNo;//车船税打印码
   	
   	private Date TDeclareDate;//车船税申报时间
	// Constructors
   	
   	private String CDepartmentNonLocal;//北京易宝平台Version 2.95外地车开具税务机关 xingzhou 2011.10.24 
   	

   	private String vsTaxInfo;//xingzhou 2011.11.29 北京车船税拒缴信息 -当前应缴-滞纳金-税款合计-

    private String CTaxConditionCde;//山西车船税v3.0升级 平台纳税类型
    private String CDeductionDueCde;//山西车船税v3.0升级 平台减免税原因
    
    private String COldVhlTax;//不缴2012车船税但是否补缴2011车船税标志
    
    private String COldTaxdptVhltyp;//2011车船税计税车辆分类 
    
    //xingzhou 2012.02.05 ADD 08年完税标识  TAX_FLAG_2008 (上海平台)
    private String CTaxFlag2008;

	private Double NStdCurbWt; //标准整备质量(千克)
	
	/* 车船税字段补充*/
	private Double NTaxDue;//当期应纳税额
	private Double NCurTotalAmount;//本期合计(平台)
	
	public String getCOldVhlTax() {
		return COldVhlTax;
	}


	public void setCOldVhlTax(String oldVhlTax) {
		COldVhlTax = oldVhlTax;
	}



	public String getCTaxFlag2008() {
		return CTaxFlag2008;
	}


	public void setCTaxFlag2008(String taxFlag2008) {
		CTaxFlag2008 = taxFlag2008;
	}


	public String getVsTaxInfo() {
		return vsTaxInfo;
	}

	public void setVsTaxInfo(String vsTaxInfo) {
		this.vsTaxInfo = vsTaxInfo;
	}

	public String getCTaxConditionCde() {
		return CTaxConditionCde;
	}

	public void setCTaxConditionCde(String taxConditionCde) {
		CTaxConditionCde = taxConditionCde;
	}

	public String getCDeductionDueCde() {
		return CDeductionDueCde;
	}

	public void setCDeductionDueCde(String deductionDueCde) {
		CDeductionDueCde = deductionDueCde;
	}

	public String getCDepartmentNonLocal() {
		return CDepartmentNonLocal;
	}

	public void setCDepartmentNonLocal(String departmentNonLocal) {
		CDepartmentNonLocal = departmentNonLocal;
	}

	public Date getTDeclareDate() {
		return TDeclareDate;
	}

	public void setTDeclareDate(Date declareDate) {
		TDeclareDate = declareDate;
	}

	public String getCTaxPrintNo() {
		return CTaxPrintNo;
	}

	public void setCTaxPrintNo(String taxPrintNo) {
		CTaxPrintNo = taxPrintNo;
	}

	/** default constructor */
	public IAbstractVsTaxVO() {
	}

	// Property accessors

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

	public String getCVsTaxMrk() {
		return this.CVsTaxMrk;
	}

	public void setCVsTaxMrk(String CVsTaxMrk) {
		this.CVsTaxMrk = CVsTaxMrk;
	}

	public String getCAbateMrk() {
		return this.CAbateMrk;
	}

	public void setCAbateMrk(String CAbateMrk) {
		this.CAbateMrk = CAbateMrk;
	}

	public Double getCAbateProp() {
		return this.CAbateProp;
	}

	public void setCAbateProp(Double CAbateProp) {
		this.CAbateProp = CAbateProp;
	}

	public Double getCAbateAmt() {
		return this.CAbateAmt;
	}

	public void setCAbateAmt(Double CAbateAmt) {
		this.CAbateAmt = CAbateAmt;
	}

	public Double getNCurbWt() {
		return this.NCurbWt;
	}

	public void setNCurbWt(Double NCurbWt) {
		this.NCurbWt = NCurbWt;
	}

	public String getCTaxpayerId() {
		return this.CTaxpayerId;
	}

	public void setCTaxpayerId(String CTaxpayerId) {
		this.CTaxpayerId = CTaxpayerId;
	}

	public String getCTaxItemCde() {
		return this.CTaxItemCde;
	}

	public void setCTaxItemCde(String CTaxItemCde) {
		this.CTaxItemCde = CTaxItemCde;
	}

	public Double getNAnnUnitTaxAmt() {
		return this.NAnnUnitTaxAmt;
	}

	public void setNAnnUnitTaxAmt(Double NAnnUnitTaxAmt) {
		this.NAnnUnitTaxAmt = NAnnUnitTaxAmt;
	}

	public Date getTLastSaliEndDate() {
		return this.TLastSaliEndDate;
	}

	public void setTLastSaliEndDate(Date TLastSaliEndDate) {
		this.TLastSaliEndDate = TLastSaliEndDate;
	}

	public String getCLastSaliInsurerCde() {
		return this.CLastSaliInsurerCde;
	}

	public void setCLastSaliInsurerCde(String CLastSaliInsurerCde) {
		this.CLastSaliInsurerCde = CLastSaliInsurerCde;
	}

	public String getCLastSaliPlyNo() {
		return this.CLastSaliPlyNo;
	}

	public void setCLastSaliPlyNo(String CLastSaliPlyNo) {
		this.CLastSaliPlyNo = CLastSaliPlyNo;
	}

	public Date getTSaliAppDate() {
		return this.TSaliAppDate;
	}

	public void setTSaliAppDate(Date TSaliAppDate) {
		this.TSaliAppDate = TSaliAppDate;
	}

	public Long getNTaxableMonths() {
		return this.NTaxableMonths;
	}

	public void setNTaxableMonths(Long NTaxableMonths) {
		this.NTaxableMonths = NTaxableMonths;
	}

	public Double NAnnUnitTaxAmt() {
		return this.NTaxableAmt;
	}

	public void setNTaxableAmt(Double NTaxableAmt) {
		this.NTaxableAmt = NTaxableAmt;
	}

	public String getCTaxYear() {
		return this.CTaxYear;
	}

	public void setCTaxYear(String CTaxYear) {
		this.CTaxYear = CTaxYear;
	}

	public String getCLastTaxYear() {
		return this.CLastTaxYear;
	}

	public void setCLastTaxYear(String CLastTaxYear) {
		this.CLastTaxYear = CLastTaxYear;
	}

	public Long getNLastYearTaxableMonths() {
		return this.NLastYearTaxableMonths;
	}

	public void setNLastYearTaxableMonths(Long NLastYearTaxableMonths) {
		this.NLastYearTaxableMonths = NLastYearTaxableMonths;
	}

	public Double getNLastYear() {
		return this.NLastYear;
	}

	public void setNLastYear(Double NLastYear) {
		this.NLastYear = NLastYear;
	}

	public Long getNOverdueDays() {
		return this.NOverdueDays;
	}

	public void setNOverdueDays(Long NOverdueDays) {
		this.NOverdueDays = NOverdueDays;
	}

	public Double getNOverdueFineProp() {
		return this.NOverdueFineProp;
	}

	public void setNOverdueFineProp(Double NOverdueFineProp) {
		this.NOverdueFineProp = NOverdueFineProp;
	}

	public Double getNAggTax() {
		return this.NAggTax;
	}

	public void setNAggTax(Double NAggTax) {
		this.NAggTax = NAggTax;
	}

	public Double getNChargeProp() {
		return this.NChargeProp;
	}

	public void setNChargeProp(Double NChargeProp) {
		this.NChargeProp = NChargeProp;
	}

	public Double getNChargeAmt() {
		return this.NChargeAmt;
	}

	public void setNChargeAmt(Double NChargeAmt) {
		this.NChargeAmt = NChargeAmt;
	}

	public String getCTaxPaymentRecptNo() {
		return this.CTaxPaymentRecptNo;
	}

	public void setCTaxPaymentRecptNo(String CTaxPaymentRecptNo) {
		this.CTaxPaymentRecptNo = CTaxPaymentRecptNo;
	}

	public String getCTaxAuthorities() {
		return this.CTaxAuthorities;
	}

	public void setCTaxAuthorities(String CTaxAuthorities) {
		this.CTaxAuthorities = CTaxAuthorities;
	}

	public String getCTaxReliefCertNo() {
		return this.CTaxReliefCertNo;
	}

	public void setCTaxReliefCertNo(String CTaxReliefCertNo) {
		this.CTaxReliefCertNo = CTaxReliefCertNo;
	}

	public String getCTaxpayerCertTyp() {
		return this.CTaxpayerCertTyp;
	}

	public void setCTaxpayerCertTyp(String CTaxpayerCertTyp) {
		this.CTaxpayerCertTyp = CTaxpayerCertTyp;
	}

	public String getCTaxpayerCertNo() {
		return this.CTaxpayerCertNo;
	}

	public void setCTaxpayerCertNo(String CTaxpayerCertNo) {
		this.CTaxpayerCertNo = CTaxpayerCertNo;
	}

	public String getCTaxpayerNme() {
		return this.CTaxpayerNme;
	}

	public void setCTaxpayerNme(String CTaxpayerNme) {
		this.CTaxpayerNme = CTaxpayerNme;
	}

	public String getCTaxpayerAddr() {
		return this.CTaxpayerAddr;
	}

	public void setCTaxpayerAddr(String CTaxpayerAddr) {
		this.CTaxpayerAddr = CTaxpayerAddr;
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

	public String getCPaytaxTyp() {
		return CPaytaxTyp;
	}

	public void setCPaytaxTyp(String paytaxTyp) {
		CPaytaxTyp = paytaxTyp;
	}

	public String getCAbateRsn() {
		return CAbateRsn;
	}

	public void setCAbateRsn(String abateRsn) {
		CAbateRsn = abateRsn;
	}

	public String getCNotpayNo() {
		return CNotpayNo;
	}

	public void setCNotpayNo(String notpayNo) {
		CNotpayNo = notpayNo;
	}

	public String getCSubTaxItemCde() {
		return CSubTaxItemCde;
	}

	public void setCSubTaxItemCde(String subTaxItemCde) {
		CSubTaxItemCde = subTaxItemCde;
	}

	public String getCTaxUnit() {
		return CTaxUnit;
	}

	public void setCTaxUnit(String taxUnit) {
		CTaxUnit = taxUnit;
	}

	public String getCTaxableTyp() {
		return CTaxableTyp;
	}

	public void setCTaxableTyp(String taxAbleTyp) {
		CTaxableTyp = taxAbleTyp;
	}

	public String getCShortTyp() {
		return CShortTyp;
	}

	public void setCShortTyp(String shortTyp) {
		CShortTyp = shortTyp;
	}

	public String getCTaxdptVhltyp() {
		return CTaxdptVhltyp;
	}

	public void setCTaxdptVhltyp(String taxdptVhltyp) {
		CTaxdptVhltyp = taxdptVhltyp;
	}

	public String getCTaxBelongTm() {
		return CTaxBelongTm;
	}

	public void setCTaxBelongTm(String taxBelongTm) {
		CTaxBelongTm = taxBelongTm;
	}

	public String getCTaxVchNo() {
		return CTaxVchNo;
	}

	public void setCTaxVchNo(String taxVchNo) {
		CTaxVchNo = taxVchNo;
	}

	public String getCTaxVchTyp() {
		return CTaxVchTyp;
	}

	public void setCTaxVchTyp(String taxVchTyp) {
		CTaxVchTyp = taxVchTyp;
	}

	public Date getTLastSaliBgnDate() {
		return TLastSaliBgnDate;
	}

	public void setTLastSaliBgnDate(Date lastSaliBgnDate) {
		TLastSaliBgnDate = lastSaliBgnDate;
	}

	public Date getTTaxEffBgnTm() {
		return TTaxEffBgnTm;
	}

	public void setTTaxEffBgnTm(Date taxEffBgnTm) {
		TTaxEffBgnTm = taxEffBgnTm;
	}

	public Date getTTaxEffEndTm() {
		return TTaxEffEndTm;
	}

	public void setTTaxEffEndTm(Date taxEffEndTm) {
		TTaxEffEndTm = taxEffEndTm;
	}

	public Long getNNewCarMon() {
		return NNewCarMon;
	}

	public void setNNewCarMon(Long newCarMon) {
		NNewCarMon = newCarMon;
	}

	public Long getNShortMon() {
		return NShortMon;
	}

	public void setNShortMon(Long shortMon) {
		NShortMon = shortMon;
	}

	public Double getNOverdueAmt() {
		return NOverdueAmt;
	}

	public void setNOverdueAmt(Double overdueAmt) {
		NOverdueAmt = overdueAmt;
	}

    public String getCTaxAuthCde() {
        return CTaxAuthCde;
    }

    public void setCTaxAuthCde(String taxAuthCde) {
        CTaxAuthCde = taxAuthCde;
    }

    public String getCIsCommissionTax() {
        return CIsCommissionTax;
    }

    public void setCIsCommissionTax(String isCommissionTax) {
        CIsCommissionTax = isCommissionTax;
    }

    public String getCTaxfreeVhltyp() {
        return CTaxfreeVhltyp;
    }

    public void setCTaxfreeVhltyp(String taxfreeVhltyp) {
        CTaxfreeVhltyp = taxfreeVhltyp;
    }

    public String getCTaxFreeCertNo() {
        return CTaxFreeCertNo;
    }

    public void setCTaxFreeCertNo(String taxFreeCertNo) {
        CTaxFreeCertNo = taxFreeCertNo;
    }

    public String getCFreeTaxOrg() {
        return CFreeTaxOrg;
    }

    public void setCFreeTaxOrg(String freeTaxOrg) {
        CFreeTaxOrg = freeTaxOrg;
    }

    public String getCComTaxOrg() {
        return CComTaxOrg;
    }

    public void setCComTaxOrg(String comTaxOrg) {
        CComTaxOrg = comTaxOrg;
    }

    public String getCTaxpayerComId() {
        return CTaxpayerComId;
    }

    public void setCTaxpayerComId(String taxpayerComId) {
        CTaxpayerComId = taxpayerComId;
    }

    public String getCVehicleNumber() {
        return CVehicleNumber;
    }

    public void setCVehicleNumber(String vehicleNumber) {
        CVehicleNumber = vehicleNumber;
    }

    public Date getTCertificateDate() {
        return TCertificateDate;
    }

    public void setTCertificateDate(Date certificateDate) {
        TCertificateDate = certificateDate;
    }

    public Double getNBalanceTax() {
        return NBalanceTax;
    }

    public void setNBalanceTax(Double balanceTax) {
        NBalanceTax = balanceTax;
    }
		
		public Double getNAggTaxVar() {
        return NAggTaxVar;
    }

    public void setNAggTaxVar(Double aggTaxVar) {
        NAggTaxVar = aggTaxVar;
    }
 		
 		public Double getNBefEdrTax() {
        return NBefEdrTax;
    }

    public void setNBefEdrTax(Double befEdrTax) {
    	NBefEdrTax = befEdrTax;
    }

	public String getCAreaCde() {
		return CAreaCde;
	}

	public void setCAreaCde(String areaCde) {
		CAreaCde = areaCde;
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

	public String getCLastYearTaxTyp() {
		return CLastYearTaxTyp;
	}

	public void setCLastYearTaxTyp(String lastYearTaxTyp) {
		CLastYearTaxTyp = lastYearTaxTyp;
	}

	public String getCTaxAddr() {
		return CTaxAddr;
	}

	public void setCTaxAddr(String taxAddr) {
		CTaxAddr = taxAddr;
	}

	public String getCDeclareStatusIA() {
		return CDeclareStatusIA;
	}

	public void setCDeclareStatusIA(String declareStatusIA) {
		CDeclareStatusIA = declareStatusIA;
	}

	public String getCCalcTaxFlag() {
		return CCalcTaxFlag;
	}

	public void setCCalcTaxFlag(String calcTaxFlag) {
		CCalcTaxFlag = calcTaxFlag;
	}

	public Double getNTaxableAmt() {
		return NTaxableAmt;
	}


	public String getCOldTaxdptVhltyp() {
		return COldTaxdptVhltyp;
	}


	public void setCOldTaxdptVhltyp(String oldTaxdptVhltyp) {
		COldTaxdptVhltyp = oldTaxdptVhltyp;
	}


	public Double getNStdCurbWt() {
		return NStdCurbWt;
	}


	public void setNStdCurbWt(Double nStdCurbWt) {
		NStdCurbWt = nStdCurbWt;
	}


	public Double getNTaxDue() {
		return NTaxDue;
	}


	public void setNTaxDue(Double nTaxDue) {
		NTaxDue = nTaxDue;
	}


	public Double getNCurTotalAmount() {
		return NCurTotalAmount;
	}


	public void setNCurTotalAmount(Double nCurTotalAmount) {
		NCurTotalAmount = nCurTotalAmount;
	}
    
	
	
}