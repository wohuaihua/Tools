package com.meyacom.pcis.policy.bom;

import java.util.Date;

/**
 * AbstractAppPrmCoef entity provides the base persistence definition of the
 * AppPrmCoef entity.
 *
 * @author MyEclipse Persistence Tools
 */

public  class IAbstractPrmCoefVO {
    // Fields

	private String CAppNo;
    private String CPlyNo;
    private String CEdrNo;
    private String CVhlAge;
    private String CAppDrv;
    private String CAppDrv1;
    private String CDrvSex;
    private String CDrvSex1;
	private Long NEdrPrjNo;
    private String CDrvDrvage;
    private String CDrvDrvage1;
    private String CDrvAge;
    private String CDrvAge1;
    private String CCusLoy;
    private String CCusLoy1;
    private String CLatestMrk;
    private String COwnAttr;
    private String CTrafIrr;
    private String CTrafIrr1;
    private String CTrafAccdt;
    private String CRunArea;
    private String CRunArea1;
    private String CRunMil;
    private String CAgoClmRec;
    private String CAgoClmRec1;
    private String CVhlMod;
    private String CVhlMod1;
    private String CPlyQty;
    private String CPlyQty1;
    private Double NMulRdr;
    private Double NMulRdr1;
    private String CMtcMng;
    private String CMtcMng1;
    private String CSafeDev;
    private Double NChaCoef;
    private String CInfoTrue;
    private String CLossRatio;
    private String CLossRatio1;
    private Double NBidCoef;
    private Double NNclmDisc;
    private Date TCalStrtTm;
    private Date TCalEndTm;
    private String CNdiscRsn;
    private String CNdiscRsn1;
    private Double NTotDisc;
    private String CCrtCde;
    private Date TCrtTm;
    private String CUpdCde;
    private Date TUpdTm;
    private String CResvTxt1;
    private String CResvTxth1;
    private String CResvTxt2;
    private String CResvTxth2;
    private String CResvTxt3;
    private String CResvTxt4;
    private String CResvTxt5;
    private Double NResvNum1;
    private Double NResvNumh1;
    private Double NResvNum2;
    private Double NResvNum3;
    private Double NResvNum4;
    //折扣规则改造，占用系数NResvNum5 存储折扣返回信息
    private Double NResvNum5;
    private String CYearRunMil;
    private String CYearRunMil1;
    private String CTfiMrk;
    private String CTfiCompany;
    private String CTfiPlyNo;

    // 新增添加字段
    //系数需求改造，添加属性 ：是否手工调整标志页面只做显示，存数据库
    private String CResvTxt6;
    private String CResvTxt7;
    private String CResvTxth7;
    private String CResvTxt8;
  

	private String CResvTxth8;
    private Double NResvNum6;
    private Double NResvNum7;
  //系数需求改造，添加属性 ：自主系数，页面只做显示，存数据库
    private Double NResvNum8;
    //商改新增字段
    private Double NResvNum;//交通违法
    private Double NAutoChaCoef;//自主渠道系数
    private Double NAutoCheCoef;//自主核保系数
    private Double NAddRate;//附加费用率
    private String   CLocalFacilitie; //定位设施配置系数
    private String   CDriveSafeConf;//行驶安全配置系数
    private String   CDriveHabitScore;//驾驶习惯评分
    private String   CPayRateLevel;//赔付率等级系数
    private String   CExpectPayRate;//经验预期赔付率系数
    private String   CTruckTypeAgio ;//货车类型系数
    private String   CSingleMileAgio;//单次行驶里程
    private String   CVhlKindAgio; //车系系数
    private String CUndrQryNo;//自主核保系数查询码
  
    

    /**需求编号：RBJCAR201005-172浙江商业险在系数信息表中显示出来无赔款优待不浮动原因和客户忠诚度不浮动原因 by maxia 2010-09-28 开始**/
	private String CNoClaimRes;//无赔款优待不浮动原因
	private String CNoLoyaltyRes;//客户忠诚度不浮动原因    
    
	/** pxg 新增添加字段 start **/
    private String CCusLoyQuick;	//续保情况(快速出单专用)
    private String CNdiscRsnQuick;	//不浮动原因(快速出单专用)
    private String CAgoClmRecQuick;	//无赔款优待及上年赔款记录(快速出单专用)
    private Double  NHopeRate;//  期望折扣
    /** pxg 新增添加字段 and **/
    private Long NClaimTime;//上年理赔次数
    private Double NTotalClaimAmount;//上年结案金额
   // Constructors
    private String CRateInputFlag;
    //private Double addRate      ; //附加费用率
	//private String undrQryNo    ; //自主核保系数查询码
	private String undrFactor01 ; //承保记录系数因子代码
	private String undrFactor02 ; //  同时投保系数因子代码
	private String undrFactor03 ; //  指定驾驶人系数因子代码
	private String undrFactor04 ; //  驾驶人性别系数因子代码
	private String undrFactor05 ; //  驾驶人年龄系数因子代码
	private String undrFactor06 ; //  驾驶人驾龄系数因子代码
	private String undrFactor017;// 货车吨位系数因子代码
	private String undrFactor018;// 特种车类型系数因子代码
    private String CDeprotectionFlag ;    //是否脱保0:否,1:是
    
    //系数需求改造，添加属性 ：自主系数，页面只做显示，不存数据库
  	private Double NAutonomyCoef;
  	//系数需求改造，添加属性 ：是否手工调整标志页面只做显示，不存数据库
  	private String IsModifyRatio;
  	//系数需求改造,添加属性：险别信息 列表下面NCD页面只做显示，不存数据库
  	private Double NCD;
    //系数需求改造,添加属性：交通违法系数 列表下面交通违法系数页面只做显示，不存数据库
  	private Double NTrafficCoef;
  //系数需求改造,添加属性：签单折扣 列表下面签单折扣页面只做显示，不存数据库
  	private Double IssuRatio;
  	
  	public Double getIssuRatio() {
		return IssuRatio;
	}
	public void setIssuRatio(Double issuRatio) {
		IssuRatio = issuRatio;
	}
	public Double getNCD() {
  		return NCD;
  	}
  	public void setNCD(Double nCD) {
  		NCD = nCD;
  	}
  	public Double getNTrafficCoef() {
  		return NTrafficCoef;
  	}
  	public void setNTrafficCoef(Double nTrafficCoef) {
  		NTrafficCoef = nTrafficCoef;
  	}
  	public Double getNAutonomyCoef() {
  		return NAutonomyCoef;
  	}
  	public void setNAutonomyCoef(Double nAutonomyCoef) {
  		NAutonomyCoef = nAutonomyCoef;
  	}
  	public String getIsModifyRatio() {
  		return IsModifyRatio;
  	}
  	public void setIsModifyRatio(String isModifyRatio) {
  		IsModifyRatio = isModifyRatio;
  	}
    
	

	public String getCDeprotectionFlag() {
		return CDeprotectionFlag;
	}

	public void setCDeprotectionFlag(String cDeprotectionFlag) {
		CDeprotectionFlag = cDeprotectionFlag;
	}

	public String getUndrFactor01() {
		return undrFactor01;
	}

	public void setUndrFactor01(String undrFactor01) {
		this.undrFactor01 = undrFactor01;
	}

	public String getUndrFactor02() {
		return undrFactor02;
	}

	public void setUndrFactor02(String undrFactor02) {
		this.undrFactor02 = undrFactor02;
	}

	public String getUndrFactor03() {
		return undrFactor03;
	}

	public void setUndrFactor03(String undrFactor03) {
		this.undrFactor03 = undrFactor03;
	}

	public String getUndrFactor04() {
		return undrFactor04;
	}

	public void setUndrFactor04(String undrFactor04) {
		this.undrFactor04 = undrFactor04;
	}

	public String getUndrFactor05() {
		return undrFactor05;
	}

	public void setUndrFactor05(String undrFactor05) {
		this.undrFactor05 = undrFactor05;
	}

	public String getUndrFactor06() {
		return undrFactor06;
	}

	public void setUndrFactor06(String undrFactor06) {
		this.undrFactor06 = undrFactor06;
	}

	public String getUndrFactor017() {
		return undrFactor017;
	}

	public void setUndrFactor017(String undrFactor017) {
		this.undrFactor017 = undrFactor017;
	}

	public String getUndrFactor018() {
		return undrFactor018;
	}

	public void setUndrFactor018(String undrFactor018) {
		this.undrFactor018 = undrFactor018;
	}

/** default constructor */
   public IAbstractPrmCoefVO() {
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

   public String getCVhlAge() {
       return this.CVhlAge;
   }

   public void setCVhlAge(String CVhlAge) {
       this.CVhlAge = CVhlAge;
   }

   public String getCAppDrv() {
       return this.CAppDrv;
   }

   public void setCAppDrv(String CAppDrv) {
       this.CAppDrv = CAppDrv;
   }

   public String getCDrvSex() {
       return this.CDrvSex;
   }

   public void setCDrvSex(String CDrvSex) {
       this.CDrvSex = CDrvSex;
   }

   public String getCDrvDrvage() {
       return this.CDrvDrvage;
   }

   public void setCDrvDrvage(String CDrvDrvage) {
       this.CDrvDrvage = CDrvDrvage;
   }

   public String getCDrvAge() {
       return this.CDrvAge;
   }

   public void setCDrvAge(String CDrvAge) {
       this.CDrvAge = CDrvAge;
   }

   public String getCCusLoy() {
       return this.CCusLoy;
   }

   public void setCCusLoy(String CCusLoy) {
       this.CCusLoy = CCusLoy;
   }

   public String getCOwnAttr() {
       return this.COwnAttr;
   }

   public void setCOwnAttr(String COwnAttr) {
       this.COwnAttr = COwnAttr;
   }

   public String getCTrafIrr() {
       return this.CTrafIrr;
   }

   public void setCTrafIrr(String CTrafIrr) {
       this.CTrafIrr = CTrafIrr;
   }

   public String getCTrafAccdt() {
       return this.CTrafAccdt;
   }

   public void setCTrafAccdt(String CTrafAccdt) {
       this.CTrafAccdt = CTrafAccdt;
   }

   public String getCRunArea() {
       return this.CRunArea;
   }

   public void setCRunArea(String CRunArea) {
       this.CRunArea = CRunArea;
   }

   public String getCRunMil() {
       return this.CRunMil;
   }

   public void setCRunMil(String CRunMil) {
       this.CRunMil = CRunMil;
   }

   public String getCAgoClmRec() {
       return this.CAgoClmRec;
   }

   public void setCAgoClmRec(String CAgoClmRec) {
       this.CAgoClmRec = CAgoClmRec;
   }

   public String getCVhlMod() {
       return this.CVhlMod;
   }

   public void setCVhlMod(String CVhlMod) {
       this.CVhlMod = CVhlMod;
   }

   public String getCPlyQty() {
       return this.CPlyQty;
   }

   public void setCPlyQty(String CPlyQty) {
       this.CPlyQty = CPlyQty;
   }

   public Double getNMulRdr() {
       return this.NMulRdr;
   }

   public void setNMulRdr(Double NMulRdr) {
       this.NMulRdr = NMulRdr;
   }

   public String getCMtcMng() {
       return this.CMtcMng;
   }

   public void setCMtcMng(String CMtcMng) {
       this.CMtcMng = CMtcMng;
   }

   public String getCSafeDev() {
       return this.CSafeDev;
   }

   public void setCSafeDev(String CSafeDev) {
       this.CSafeDev = CSafeDev;
   }

   public Double getNChaCoef() {
       return this.NChaCoef;
   }

   public void setNChaCoef(Double NChaCoef) {
       this.NChaCoef = NChaCoef;
   }

   public String getCInfoTrue() {
       return this.CInfoTrue;
   }

   public void setCInfoTrue(String CInfoTrue) {
       this.CInfoTrue = CInfoTrue;
   }

   public String getCLossRatio() {
       return this.CLossRatio;
   }

   public void setCLossRatio(String CLossRatio) {
       this.CLossRatio = CLossRatio;
   }

   public Double getNBidCoef() {
       return this.NBidCoef;
   }

   public void setNBidCoef(Double NBidCoef) {
       this.NBidCoef = NBidCoef;
   }

   public Double getNNclmDisc() {
       return this.NNclmDisc;
   }

   public void setNNclmDisc(Double NNclmDisc) {
       this.NNclmDisc = NNclmDisc;
   }

   public Date getTCalStrtTm() {
       return this.TCalStrtTm;
   }

   public void setTCalStrtTm(Date TCalStrtTm) {
       this.TCalStrtTm = TCalStrtTm;
   }

   public Date getTCalEndTm() {
       return this.TCalEndTm;
   }

   public void setTCalEndTm(Date TCalEndTm) {
       this.TCalEndTm = TCalEndTm;
   }

   public String getCNdiscRsn() {
       return this.CNdiscRsn;
   }

   public void setCNdiscRsn(String CNdiscRsn) {
       this.CNdiscRsn = CNdiscRsn;
   }

   public Double getNTotDisc() {
       return this.NTotDisc;
   }

   public void setNTotDisc(Double NTotDisc) {
       this.NTotDisc = NTotDisc;
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

public String getCResvTxt4() {
	return CResvTxt4;
}

public void setCResvTxt4(String resvTxt4) {
	CResvTxt4 = resvTxt4;
}

public String getCResvTxt5() {
	return CResvTxt5;
}

public void setCResvTxt5(String resvTxt5) {
	CResvTxt5 = resvTxt5;
}

public Double getNResvNum1() {
	return NResvNum1;
}

public void setNResvNum1(Double resvNum1) {
	NResvNum1 = resvNum1;
}

public Double getNResvNum2() {
	return NResvNum2;
}

public void setNResvNum2(Double resvNum2) {
	NResvNum2 = resvNum2;
}

public Double getNResvNum3() {
	return NResvNum3;
}

public void setNResvNum3(Double resvNum3) {
	NResvNum3 = resvNum3;
}

public Double getNResvNum4() {
	return NResvNum4;
}

public void setNResvNum4(Double resvNum4) {
	NResvNum4 = resvNum4;
}

public Double getNResvNum5() {
	return NResvNum5;
}

public void setNResvNum5(Double resvNum5) {
	NResvNum5 = resvNum5;
}

public String getCYearRunMil() {
	return CYearRunMil;
}

public void setCYearRunMil(String yearRunMil) {
	CYearRunMil = yearRunMil;
}

public String getCTfiMrk() {
	return CTfiMrk;
}

public void setCTfiMrk(String tfiMrk) {
	CTfiMrk = tfiMrk;
}

public String getCTfiCompany() {
	return CTfiCompany;
}

public void setCTfiCompany(String tfiCompany) {
	CTfiCompany = tfiCompany;
}

public String getCTfiPlyNo() {
	return CTfiPlyNo;
}

public void setCTfiPlyNo(String tfiPlyNo) {
	CTfiPlyNo = tfiPlyNo;
}

public String getCResvTxt6() {
    return CResvTxt6;
}

public void setCResvTxt6(String resvTxt6) {
    CResvTxt6 = resvTxt6;
}

public String getCResvTxt7() {
    return CResvTxt7;
}

public void setCResvTxt7(String resvTxt7) {
    CResvTxt7 = resvTxt7;
}

public String getCResvTxt8() {
    return CResvTxt8;
}

public void setCResvTxt8(String resvTxt8) {
    CResvTxt8 = resvTxt8;
}

public Double getNResvNum6() {
    return NResvNum6;
}

public void setNResvNum6(Double resvNum6) {
    NResvNum6 = resvNum6;
}

public Double getNResvNum7() {
    return NResvNum7;
}

public void setNResvNum7(Double resvNum7) {
    NResvNum7 = resvNum7;
}

public Double getNResvNum8() {
    return NResvNum8;
}

public void setNResvNum8(Double resvNum8) {
    NResvNum8 = resvNum8;
}

public String getCNoClaimRes() {
	return CNoClaimRes;
}

public void setCNoClaimRes(String noClaimRes) {
	CNoClaimRes = noClaimRes;
}

public String getCNoLoyaltyRes() {
	return CNoLoyaltyRes;
}

public void setCNoLoyaltyRes(String noLoyaltyRes) {
	CNoLoyaltyRes = noLoyaltyRes;
}

public String getCNdiscRsn1() {
	return CNdiscRsn1;
}

public void setCNdiscRsn1(String ndiscRsn1) {
	CNdiscRsn1 = ndiscRsn1;
}

public String getCAgoClmRec1() {
	return CAgoClmRec1;
}

public void setCAgoClmRec1(String agoClmRec1) {
	CAgoClmRec1 = agoClmRec1;
}

public Double getNMulRdr1() {
	return NMulRdr1;
}

public void setNMulRdr1(Double mulRdr1) {
	NMulRdr1 = mulRdr1;
}

public String getCResvTxth7() {
	return CResvTxth7;
}

public void setCResvTxth7(String resvTxth7) {
	CResvTxth7 = resvTxth7;
}

public String getCResvTxth8() {
	return CResvTxth8;
}

public void setCResvTxth8(String resvTxth8) {
	CResvTxth8 = resvTxth8;
}

public String getCAppDrv1() {
	return CAppDrv1;
}

public void setCAppDrv1(String appDrv1) {
	CAppDrv1 = appDrv1;
}

public String getCDrvSex1() {
	return CDrvSex1;
}

public void setCDrvSex1(String drvSex1) {
	CDrvSex1 = drvSex1;
}

public String getCDrvAge1() {
	return CDrvAge1;
}

public void setCDrvAge1(String drvAge1) {
	CDrvAge1 = drvAge1;
}

public String getCDrvDrvage1() {
	return CDrvDrvage1;
}

public void setCDrvDrvage1(String drvDrvage1) {
	CDrvDrvage1 = drvDrvage1;
}

public String getCVhlMod1() {
	return CVhlMod1;
}

public void setCVhlMod1(String vhlMod1) {
	CVhlMod1 = vhlMod1;
}

public String getCCusLoy1() {
	return CCusLoy1;
}

public void setCCusLoy1(String cusLoy1) {
	CCusLoy1 = cusLoy1;
}

public String getCTrafIrr1() {
	return CTrafIrr1;
}

public void setCTrafIrr1(String trafIrr1) {
	CTrafIrr1 = trafIrr1;
}

public String getCRunArea1() {
	return CRunArea1;
}

public void setCRunArea1(String runArea1) {
	CRunArea1 = runArea1;
}

public String getCPlyQty1() {
	return CPlyQty1;
}

public void setCPlyQty1(String plyQty1) {
	CPlyQty1 = plyQty1;
}

public String getCMtcMng1() {
	return CMtcMng1;
}

public void setCMtcMng1(String mtcMng1) {
	CMtcMng1 = mtcMng1;
}

public String getCLossRatio1() {
	return CLossRatio1;
}

public void setCLossRatio1(String lossRatio1) {
	CLossRatio1 = lossRatio1;
}

public String getCResvTxth1() {
	return CResvTxth1;
}

public void setCResvTxth1(String resvTxth1) {
	CResvTxth1 = resvTxth1;
}

public String getCResvTxth2() {
	return CResvTxth2;
}

public void setCResvTxth2(String resvTxth2) {
	CResvTxth2 = resvTxth2;
}

public Double getNResvNumh1() {
	return NResvNumh1;
}

public void setNResvNumh1(Double resvNumh1) {
	NResvNumh1 = resvNumh1;
}

public String getCYearRunMil1() {
	return CYearRunMil1;
}

public void setCYearRunMil1(String yearRunMil1) {
	CYearRunMil1 = yearRunMil1;
}

public String getCCusLoyQuick() {
	return CCusLoyQuick;
}

public void setCCusLoyQuick(String cusLoyQuick) {
	CCusLoyQuick = cusLoyQuick;
}

public String getCNdiscRsnQuick() {
	return CNdiscRsnQuick;
}

public void setCNdiscRsnQuick(String ndiscRsnQuick) {
	CNdiscRsnQuick = ndiscRsnQuick;
}

public String getCAgoClmRecQuick() {
	return CAgoClmRecQuick;
}

public void setCAgoClmRecQuick(String agoClmRecQuick) {
	CAgoClmRecQuick = agoClmRecQuick;
}

public Double getNHopeRate() {
	return NHopeRate;
}

public void setNHopeRate(Double hopeRate) {
	NHopeRate = hopeRate;
}

public Double getNResvNum() {
	return NResvNum;
}

public void setNResvNum(Double nResvNum) {
	NResvNum = nResvNum;
}

public Double getNAutoChaCoef() {
	return NAutoChaCoef;
}
public void setNAutoChaCoef(Double nAutoChaCoef) {
	NAutoChaCoef = nAutoChaCoef;
}

public Double getNAutoCheCoef() {
	return NAutoCheCoef;
}

public void setNAutoCheCoef(Double nAutoCheCoef) {
	NAutoCheCoef = nAutoCheCoef;
}
public Double getNAddRate() {
	return NAddRate;
}

public void setNAddRate(Double nAddRate) {
	NAddRate = nAddRate;
}

public String getCLocalFacilitie() {
	return CLocalFacilitie;
}

public void setCLocalFacilitie(String cLocalFacilitie) {
	CLocalFacilitie = cLocalFacilitie;
}

public String getCDriveSafeConf() {
	return CDriveSafeConf;
}

public void setCDriveSafeConf(String cDriveSafeConf) {
	CDriveSafeConf = cDriveSafeConf;
}

public String getCDriveHabitScore() {
	return CDriveHabitScore;
}

public void setCDriveHabitScore(String cDriveHabitScore) {
	CDriveHabitScore = cDriveHabitScore;
}

public String getCPayRateLevel() {
	return CPayRateLevel;
}

public void setCPayRateLevel(String cPayRateLevel) {
	CPayRateLevel = cPayRateLevel;
}

public String getCExpectPayRate() {
	return CExpectPayRate;
}

public void setCExpectPayRate(String cExpectPayRate) {
	CExpectPayRate = cExpectPayRate;
}

public String getCTruckTypeAgio() {
	return CTruckTypeAgio;
}

public void setCTruckTypeAgio(String cTruckTypeAgio) {
	CTruckTypeAgio = cTruckTypeAgio;
}

public String getCSingleMileAgio() {
	return CSingleMileAgio;
}

public void setCSingleMileAgio(String cSingleMileAgio) {
	CSingleMileAgio = cSingleMileAgio;
}

public String getCVhlKindAgio() {
	return CVhlKindAgio;
}

public void setCVhlKindAgio(String cVhlKindAgio) {
	CVhlKindAgio = cVhlKindAgio;
}

public String getCUndrQryNo() {
	return CUndrQryNo;
}

public void setCUndrQryNo(String cUndrQryNo) {
	CUndrQryNo = cUndrQryNo;
}


public String getCRateInputFlag() {
	return CRateInputFlag;
}

public void setCRateInputFlag(String rateInputFlag) {
	CRateInputFlag = rateInputFlag;
}

public Long getNClaimTime() {
	return NClaimTime;
}

public void setNClaimTime(Long nClaimTime) {
	NClaimTime = nClaimTime;
}

public Double getNTotalClaimAmount() {
	return NTotalClaimAmount;
}

public void setNTotalClaimAmount(Double nTotalClaimAmount) {
	NTotalClaimAmount = nTotalClaimAmount;
}









}