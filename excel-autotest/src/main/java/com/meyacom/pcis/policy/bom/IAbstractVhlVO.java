package com.meyacom.pcis.policy.bom;

import java.io.Serializable;
import java.util.Date;

/**
 * AbstractWebPlyVhl generated by MyEclipse Persistence Tools
 */

public class IAbstractVhlVO implements Serializable{

    // Fields
	private static final long serialVersionUID = 5207198250281480711L;
	private String CAppNo;
    private String CPlyNo;
    private Long NEdrPrjNo;
    private String CEdrNo;
    private String CRegOwner;
    private String CMortgageMrk;
    private String CProdPlace;
    private String CPlateNo;
    private String CPlateColor;
    private String CBodyColor;
    private String CEngNo;
    private String CFrmNo;
    private String CVin;
    private String CModelCde;
    private String CModelNme;
    private String CBizMrk;
    private String CUsageCde;
    private String CVhlTyp;
    private String CUsageCdeBk;//为兼容联合投保交强险商业险使用性质备用字段
    private String CVhlTypBk;//为兼容联合投保交强险商业险车辆种类备用字段
    private Double NNewPurchaseValue;
    private String CMfgYear;
    private String CFstRegYm;
    private Long NSeatNum;
    private Double NTonage;
    private String CDisplacementLvl;
    private Double NDisplacement;
    private Double NMonDespRate;
    private Double NActualValue;
    private String CDductPrefCde;
    private String CFixedParkCde;
    private String CTravelAreaCde;
    private String CGlassTyp;
    private String CDevice1Mrk;
    private String CDevice2Mrk;
    private String CDevice3Mrk;
    private String CDevice4Mrk;
    private String CDevice5Mrk;
    private String CDevice6Mrk;
    private String CDevice7Mrk;
    private String CDevice8Mrk;
    private String CDevice9Mrk;
    private String CDevice10Mrk;
    private String CInspectionCde;
    private Date CInspectTm;
    private String CInspectorNme;
    private String CInspectRec;
    private String CPlateTyp;
    private String CQryCde;
    private String CAffirmCde;
    private Long NLastYearClmTms;
    private Double NLastYearNcd;
    private Double NNcdRate;
    private String CRegVhlTyp;
    private String CEcdemicMrk;
    private String CGrpBuyContractNo;
    private String CSpecDeclCauseCde;
    private String CQuestNo;
    private String CRemark;
    private String CResvTxt1;
    private String CResvTxt2;
    private String CResvTxt3;
    private String CResvTxt4;
    private String CResvTxt5;
    private Double NResvNum1;
    private Double NResvNum2;
    private Date TResvTm1;
    private Date TResvTm2;
    private String CLatestMrk;
    private String CCrtCde;
    private Date TCrtTm;
    private String CUpdCde;
    private Date TUpdTm;
    private String CCurModelNme;  //打印车型名称
    private String CUseYear;
    private String CTfiSpecialMrk;
    private String CTfiReinsureMrk;
    private String CShortRsn;
    private String CLicenseTyp;
    private String CIdcardTyp;
    private Date TTransferTm;
    private String COldLcnNo;
    private String CProconfirmNo;//车型查询码
    private String CSearchCode;//投保预确认码（上海平台）
    private String CBrandId;
    private String CNameChoice;
    private String CAliasId;
    private String CNewMrk;
    private String CResvTxt6;
    private String CResvTxt7;
    private String CResvTxt8;
    private String CResvTxt9;
    private String CResvTxt10;
    //平台返回多出来的属性(但不在hbm文件中配置)
    private String CCrtNme;//制造厂名称
    private String CNinsTm;//最近定检日期-
    private String CBzEndTm;//强制有效期止
    private String CcarSts;//机动车状态
    private Double Ngo;//准牵引总质量
    //浙江、上海平台需要增加字段 2010.01.08 zhaomeng
    private String CRiskFlag;//车型风险标志
    private String CUseTypSrc;//使用性质来源
    private String CChgOwnerFlag;//过户车辆标志
    private String CLoanVehicleFlag;//是否车贷投保多年标志
    private String CStatus;//机动车状态
    private Date TTransferDate;//转移登记日期
    private String CCarYear;//车龄(月)
   

	/*永安  新增字段添加处理 kwcheng@isoftstone.com 2010-12-14*/
    private String CPlateBrandId;
    private String CPlateModelCde;
    private String CRiskDesc;
    private String CVhlInsuredRel;
    private String CFleetMrk;
    private Double NDespRate;
    private String CResvTxt11;
    private String CVhlSubTyp;
    private Double NNewPurchaseRate;
    private String CInvoNo;
    private String CDrvDirec;
    private String CVhlPkgNO;
    
    /*新增平台返回的行业车型信息 2015-03-17 by marui*/
    private String CModelIDCode;//车型识别编码
    private String CTradeName;//厂商名称
    private String CTradeCode;//厂商编码
    private String CBrandCode;//品牌编码
    private String CSeriesCode;//车系编码
    private String CCarName;//车款名称
    private String CNoticeType;//公告型号
    private String CConfigType;//配置款型编码
    private String CCategoryName;//类别名称
    private String CCategoryCode;//类别编码
    private String CSeriesKindName;//系别名称
    private String CSeriesKindCode;//系别编码
    
    /*平台需求变更添加字段 huangjt*/
    private String CRenewalFlag;//转保标志
    private String CNewVhlFlag;//新旧车
    
    //为使用精友车型库地区增加字段 at 2011-5-17 by zhj
    private String  CBrandCnmJY;
    private String CModelNmeJY;
	// 车型库类型-包括广信、精友等
    private String CModelLibraryTyp;
    
    //xingzhou 2011.05.25 ADD 精友：车型代码（车型编码）
    private String CPlateRecde;
    //kwcheng 车辆信息中添加确认码字段
    private String VehForCode;
    
    //xingzhou 2011.07.06 ADD 跨省首年投保未出险证明的年数
    private Long NNoDamageYears;
    
    //xingzhou 2011.07.07 ADD 整备质量(北京平台商业险特有)
    private Double NPoWeight;
    
    //集中平台升级v3.0
    private String CFuelType; //能源种类
    // Constructors
	
    //xingzhou 2011.10.27 ADD 车辆来历凭证种类	CERTIFICATE_TYPE (北京平台)
    private String CCertificateType;
    //xingzhou 2011.10.27 ADD 车辆来历凭证编号	CERTIFICATE_NO (北京平台)
    private String CCertificateNo;
    //xingzhou 2011.10.27 ADD 开具车辆来历凭证所载日期	CERTIFICATE_DATE (北京平台) 
    //xingzhoui 2012.02.05 ADD 购车发票日期             CERTIFICATE_DATE (上海平台)
    private Date TCertificateDate;

    //xingzhou 2011.10.31 发证日期(北京平台拖拉机交强险使用) ADD
    private Date TResvTm3;
    
    //xingzhou 2012.02.05 ADD 预约码	BOOKING_CODE (上海平台)
    private String CBookingCode;
    
    //xingzhou 2012.02.05 ADD 团车业务编号	GROUP_CODE (上海平台)
    private String CGroupCode;
    
    //xingzhou 2012.03.01 ADD 团车业务序号	SINGLE_BUSINESS_NO (上海平台)
    private String CSingleBusinessNo;
    
    //xingzhou 2012.02.08 ADD 平台交易号 CIRC_PAYMENT_NO (上海平台)
    private String CCircPaymentNo;
    
  //xingzhou 2012.03.30 ADD 预确认有效期起 PROCONFIRM_START_DATE (上海平台)
    private Date TProconfirmStartDate;//T_PROCONFIRM_START_DATE
    //xingzhou 2012.03.30 ADD 预确认有效期止 PROCONFIRM_END_DATE (上海平台)
    private Date TProconfirmEndDate;//T_PROCONFIRM_END_DATE
    //xingzhou 2012.03.30 ADD  缴费有效期起 PAYMENT_START_DATE (上海平台)
    private Date TPaymentStartDate;//T_PAYMENT_START_DATE
    //xingzhou 2012.03.30 ADD 缴费有效期止	 PAYMENT_END_DATE (上海平台)
    private Date TPaymentEndDate;//T_PAYMENT_END_DATE
    
    //xingzhou 2012.09.04 ADD CFamilyNme 车系名称 C_FAMILY_NME 
    private String CFamilyNme;
    
    //业务类型。0：新车；1：续保；2：转保		-- added by jschena@isoftstone.com
	private String CBusType;
	private String CIsFullEdr; //是否全程批改
	private Double NNagoActualValue;//协商车辆实际价值
	private String CRiskLevel;

	//private String seriesNme;//车系名称
	private String modelNme;//本地库车辆型号
	private String CAppValidateNo;//承保验证码 add liuhuan

	//新增系统标准字段
    private Long NStdSeatNum; //系统标准载客数  
	private Double NStdTonage; //标准核定载质量(千克)
	private Double NStdDisplacement;//标准排气量(L)
	
	private String CMarketDate; //车辆上市年份
	private String CSpecialCarFlat;//是否特殊业务  0否 1是
	private Long NMinStdSeatNum;//标准核定最小载客数(座)
	
	private String JYPowerTypeCode; //精友燃料类型编码
	
	private String CVehicleCode;//北京车型代码
	
	private String CCertificateDate;//驾照发证日期
	
	public String getCCertificateDate() {
		return CCertificateDate;
	}

	public void setCCertificateDate(String cCertificateDate) {
		CCertificateDate = cCertificateDate;
	}

	public String getCVehicleCode() {
		return CVehicleCode;
	}

	public void setCVehicleCode(String cVehicleCode) {
		CVehicleCode = cVehicleCode;
	}

	public Long getNMinStdSeatNum() {
		return NMinStdSeatNum;
	}

	public void setNMinStdSeatNum(Long nMinStdSeatNum) {
		NMinStdSeatNum = nMinStdSeatNum;
	}
	

	public String getCSpecialCarFlat() {
		return CSpecialCarFlat;
	}

	public void setCSpecialCarFlat(String cSpecialCarFlat) {
		CSpecialCarFlat = cSpecialCarFlat;
	}

	public Double getNNagoActualValue() {
		return NNagoActualValue;
	}

	public void setNNagoActualValue(Double nNagoActualValue) {
		NNagoActualValue = nNagoActualValue;
	}

	public Date getTResvTm3() {
		return TResvTm3;
	}

	public void setTResvTm3(Date resvTm3) {
		TResvTm3 = resvTm3;
	}

	public String getCCertificateType() {
		return CCertificateType;
	}

	public void setCCertificateType(String certificateType) {
		CCertificateType = certificateType;
	}

	public String getCCertificateNo() {
		return CCertificateNo;
	}

	public void setCCertificateNo(String certificateNo) {
		CCertificateNo = certificateNo;
	}

	public Date getTCertificateDate() {
		return TCertificateDate;
	}

	public void setTCertificateDate(Date certificateDate) {
		TCertificateDate = certificateDate;
	}

	public String getCFuelType() {
		return CFuelType;
	}

	public void setCFuelType(String fuelType) {
		CFuelType = fuelType;
	}

	public String getCPlateRecde() {
		return CPlateRecde;
	}

	public void setCPlateRecde(String plateRecde) {
		CPlateRecde = plateRecde;
	}

	public String getCModelLibraryTyp() {
		return CModelLibraryTyp;
	}

	public void setCModelLibraryTyp(String modelLibraryTyp) {
		CModelLibraryTyp = modelLibraryTyp;
	}
	
	public String getCBrandCnmJY() {
		return CBrandCnmJY;
	}

	public String getCModelNmeJY() {
		return CModelNmeJY;
	}

	public void setCBrandCnmJY(String brandCnmJY) {
		CBrandCnmJY = brandCnmJY;
	}

	public void setCModelNmeJY(String modelNmeJY) {
		CModelNmeJY = modelNmeJY;
	}
	
    public String getCNewVhlFlag() {
		return CNewVhlFlag;
	}

	public void setCNewVhlFlag(String newVhlFlag) {
		CNewVhlFlag = newVhlFlag;
	}

	public String getCRenewalFlag() {
		return CRenewalFlag;
	}

	public void setCRenewalFlag(String renewalFlag) {
		CRenewalFlag = renewalFlag;
	}

	public String getCModelIDCode() {
		return CModelIDCode;
	}

	public void setCModelIDCode(String cModelIDCode) {
		CModelIDCode = cModelIDCode;
	}

	public String getCTradeName() {
		return CTradeName;
	}

	public void setCTradeName(String cTradeName) {
		CTradeName = cTradeName;
	}

	public String getCTradeCode() {
		return CTradeCode;
	}

	public void setCTradeCode(String cTradeCode) {
		CTradeCode = cTradeCode;
	}

	public String getCBrandCode() {
		return CBrandCode;
	}

	public void setCBrandCode(String cBrandCode) {
		CBrandCode = cBrandCode;
	}

	public String getCSeriesCode() {
		return CSeriesCode;
	}

	public void setCSeriesCode(String cSeriesCode) {
		CSeriesCode = cSeriesCode;
	}

	public String getCCarName() {
		return CCarName;
	}

	public void setCCarName(String cCarName) {
		CCarName = cCarName;
	}

	public String getCNoticeType() {
		return CNoticeType;
	}

	public void setCNoticeType(String cNoticeType) {
		CNoticeType = cNoticeType;
	}

	public String getCConfigType() {
		return CConfigType;
	}

	public void setCConfigType(String cConfigType) {
		CConfigType = cConfigType;
	}

	public String getCCategoryName() {
		return CCategoryName;
	}

	public void setCCategoryName(String cCategoryName) {
		CCategoryName = cCategoryName;
	}

	public String getCCategoryCode() {
		return CCategoryCode;
	}

	public void setCCategoryCode(String cCategoryCode) {
		CCategoryCode = cCategoryCode;
	}


	public String getCSeriesKindName() {
		return CSeriesKindName;
	}

	public void setCSeriesKindName(String cSeriesKindName) {
		CSeriesKindName = cSeriesKindName;
	}

	public String getCSeriesKindCode() {
		return CSeriesKindCode;
	}

	public void setCSeriesKindCode(String cSeriesKindCode) {
		CSeriesKindCode = cSeriesKindCode;
	}

	public String getCInvoNo() {
		return CInvoNo;
	}

	public void setCInvoNo(String invoNo) {
		CInvoNo = invoNo;
	}

	public String getCDrvDirec() {
		return CDrvDirec;
	}

	public void setCDrvDirec(String drvDirec) {
		CDrvDirec = drvDirec;
	}

	public String getCRiskFlag() {
		return CRiskFlag;
	}

	public void setCRiskFlag(String riskFlag) {
		CRiskFlag = riskFlag;
	}

	public String getCUseTypSrc() {
		return CUseTypSrc;
	}

	public void setCUseTypSrc(String useTypSrc) {
		CUseTypSrc = useTypSrc;
	}

	public String getCChgOwnerFlag() {
		return CChgOwnerFlag;
	}

	public void setCChgOwnerFlag(String chgOwnerFlag) {
		CChgOwnerFlag = chgOwnerFlag;
	}

	public String getCLoanVehicleFlag() {
		return CLoanVehicleFlag;
	}

	public void setCLoanVehicleFlag(String loanVehicleFlag) {
		CLoanVehicleFlag = loanVehicleFlag;
	}

	public String getCStatus() {
		return CStatus;
	}

	public void setCStatus(String status) {
		CStatus = status;
	}

	public Date getTTransferDate() {
		return TTransferDate;
	}

	public void setTTransferDate(Date transferDate) {
		TTransferDate = transferDate;
	}

	/** default constructor */
    public IAbstractVhlVO() {
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

    public String getCRegOwner() {
        return this.CRegOwner;
    }

    public void setCRegOwner(String CRegOwner) {
        this.CRegOwner = CRegOwner;
    }

    public String getCMortgageMrk() {
        return this.CMortgageMrk;
    }

    public void setCMortgageMrk(String CMortgageMrk) {
        this.CMortgageMrk = CMortgageMrk;
    }

    public String getCProdPlace() {
        return this.CProdPlace;
    }

    public void setCProdPlace(String CProdPlace) {
        this.CProdPlace = CProdPlace;
    }

    public String getCPlateNo() {
        return this.CPlateNo;
    }

    public void setCPlateNo(String CPlateNo) {
        this.CPlateNo = CPlateNo;
    }

    public String getCPlateColor() {
        return this.CPlateColor;
    }

    public void setCPlateColor(String CPlateColor) {
        this.CPlateColor = CPlateColor;
    }

    public String getCBodyColor() {
        return this.CBodyColor;
    }

    public void setCBodyColor(String CBodyColor) {
        this.CBodyColor = CBodyColor;
    }

    public String getCEngNo() {
        return this.CEngNo;
    }

    public void setCEngNo(String CEngNo) {
        this.CEngNo = CEngNo;
    }

    public String getCFrmNo() {
        return this.CFrmNo;
    }

    public void setCFrmNo(String CFrmNo) {
        this.CFrmNo = CFrmNo;
    }

    public String getCVin() {
        return this.CVin;
    }

    public void setCVin(String CVin) {
        this.CVin = CVin;
    }

    public String getCModelCde() {
        return this.CModelCde;
    }

    public void setCModelCde(String CModelCde) {
        this.CModelCde = CModelCde;
    }

    public String getCModelNme() {
        return this.CModelNme;
    }

    public void setCModelNme(String CModelNme) {
        this.CModelNme = CModelNme;
    }

    public String getCBizMrk() {
        return this.CBizMrk;
    }

    public void setCBizMrk(String CBizMrk) {
        this.CBizMrk = CBizMrk;
    }

    public String getCUsageCde() {
        return this.CUsageCde;
    }

    public void setCUsageCde(String CUsageCde) {
        this.CUsageCde = CUsageCde;
    }

    public String getCVhlTyp() {
        return this.CVhlTyp;
    }

    public void setCVhlTyp(String CVhlTyp) {
        this.CVhlTyp = CVhlTyp;
    }

    public Double getNNewPurchaseValue() {
        return this.NNewPurchaseValue;
    }

    public void setNNewPurchaseValue(Double NNewPurchaseValue) {
        this.NNewPurchaseValue = NNewPurchaseValue;
    }

    public String getCMfgYear() {
        return this.CMfgYear;
    }

    public void setCMfgYear(String CMfgYear) {
        this.CMfgYear = CMfgYear;
    }

    public String getCFstRegYm() {
        return this.CFstRegYm;
    }

    public void setCFstRegYm(String CFstRegYm) {
        this.CFstRegYm = CFstRegYm;
    }

    public Long getNSeatNum() {
        return this.NSeatNum;
    }

    public void setNSeatNum(Long NSeatNum) {
        this.NSeatNum = NSeatNum;
    }

    public Double getNTonage() {
        return this.NTonage;
    }

    public void setNTonage(Double NTonage) {
        this.NTonage = NTonage;
    }

    public String getCDisplacementLvl() {
        return this.CDisplacementLvl;
    }

    public void setCDisplacementLvl(String CDisplacementLvl) {
        this.CDisplacementLvl = CDisplacementLvl;
    }

    public Double getNDisplacement() {
        return this.NDisplacement;
    }

    public void setNDisplacement(Double NDisplacement) {
        this.NDisplacement = NDisplacement;
    }

    public Double getNMonDespRate() {
        return this.NMonDespRate;
    }

    public void setNMonDespRate(Double NMonDespRate) {
        this.NMonDespRate = NMonDespRate;
    }

    public Double getNActualValue() {
        return this.NActualValue;
    }

    public void setNActualValue(Double NActualValue) {
        this.NActualValue = NActualValue;
    }

    public String getCDductPrefCde() {
        return this.CDductPrefCde;
    }

    public void setCDductPrefCde(String CDductPrefCde) {
        this.CDductPrefCde = CDductPrefCde;
    }

    public String getCFixedParkCde() {
        return this.CFixedParkCde;
    }

    public void setCFixedParkCde(String CFixedParkCde) {
        this.CFixedParkCde = CFixedParkCde;
    }

    public String getCTravelAreaCde() {
        return this.CTravelAreaCde;
    }

    public void setCTravelAreaCde(String CTravelAreaCde) {
        this.CTravelAreaCde = CTravelAreaCde;
    }

    public String getCGlassTyp() {
        return this.CGlassTyp;
    }

    public void setCGlassTyp(String CGlassTyp) {
        this.CGlassTyp = CGlassTyp;
    }

    public String getCDevice1Mrk() {
        return this.CDevice1Mrk;
    }

    public void setCDevice1Mrk(String CDevice1Mrk) {
        this.CDevice1Mrk = CDevice1Mrk;
    }

    public String getCDevice2Mrk() {
        return this.CDevice2Mrk;
    }

    public void setCDevice2Mrk(String CDevice2Mrk) {
        this.CDevice2Mrk = CDevice2Mrk;
    }

    public String getCDevice3Mrk() {
        return this.CDevice3Mrk;
    }

    public void setCDevice3Mrk(String CDevice3Mrk) {
        this.CDevice3Mrk = CDevice3Mrk;
    }

    public String getCDevice4Mrk() {
        return this.CDevice4Mrk;
    }

    public void setCDevice4Mrk(String CDevice4Mrk) {
        this.CDevice4Mrk = CDevice4Mrk;
    }

    public String getCDevice5Mrk() {
        return this.CDevice5Mrk;
    }

    public void setCDevice5Mrk(String CDevice5Mrk) {
        this.CDevice5Mrk = CDevice5Mrk;
    }

    public String getCDevice6Mrk() {
        return this.CDevice6Mrk;
    }

    public void setCDevice6Mrk(String CDevice6Mrk) {
        this.CDevice6Mrk = CDevice6Mrk;
    }

    public String getCDevice7Mrk() {
        return this.CDevice7Mrk;
    }

    public void setCDevice7Mrk(String CDevice7Mrk) {
        this.CDevice7Mrk = CDevice7Mrk;
    }

    public String getCDevice8Mrk() {
        return this.CDevice8Mrk;
    }

    public void setCDevice8Mrk(String CDevice8Mrk) {
        this.CDevice8Mrk = CDevice8Mrk;
    }

    public String getCDevice9Mrk() {
        return this.CDevice9Mrk;
    }

    public void setCDevice9Mrk(String CDevice9Mrk) {
        this.CDevice9Mrk = CDevice9Mrk;
    }

    public String getCDevice10Mrk() {
        return this.CDevice10Mrk;
    }

    public void setCDevice10Mrk(String CDevice10Mrk) {
        this.CDevice10Mrk = CDevice10Mrk;
    }

    public String getCInspectionCde() {
        return this.CInspectionCde;
    }

    public void setCInspectionCde(String CInspectionCde) {
        this.CInspectionCde = CInspectionCde;
    }

    public Date getCInspectTm() {
        return this.CInspectTm;
    }

    public void setCInspectTm(Date CInspectTm) {
        this.CInspectTm = CInspectTm;
    }

    public String getCInspectorNme() {
        return this.CInspectorNme;
    }

    public void setCInspectorNme(String CInspectorNme) {
        this.CInspectorNme = CInspectorNme;
    }

    public String getCInspectRec() {
        return this.CInspectRec;
    }

    public void setCInspectRec(String CInspectRec) {
        this.CInspectRec = CInspectRec;
    }

    public String getCPlateTyp() {
        return this.CPlateTyp;
    }

    public void setCPlateTyp(String CPlateTyp) {
        this.CPlateTyp = CPlateTyp;
    }

    public String getCQryCde() {
        return this.CQryCde;
    }

    public void setCQryCde(String CQryCde) {
        this.CQryCde = CQryCde;
    }

    public String getCAffirmCde() {
        return this.CAffirmCde;
    }

    public void setCAffirmCde(String CAffirmCde) {
        this.CAffirmCde = CAffirmCde;
    }

    public Long getNLastYearClmTms() {
        return this.NLastYearClmTms;
    }

    public void setNLastYearClmTms(Long NLastYearClmTms) {
        this.NLastYearClmTms = NLastYearClmTms;
    }

    public Double getNLastYearNcd() {
        return this.NLastYearNcd;
    }

    public void setNLastYearNcd(Double NLastYearNcd) {
        this.NLastYearNcd = NLastYearNcd;
    }

    public Double getNNcdRate() {
        return this.NNcdRate;
    }

    public void setNNcdRate(Double NNcdRate) {
        this.NNcdRate = NNcdRate;
    }

    public String getCRegVhlTyp() {
        return this.CRegVhlTyp;
    }

    public void setCRegVhlTyp(String CRegVhlTyp) {
        this.CRegVhlTyp = CRegVhlTyp;
    }

    public String getCEcdemicMrk() {
        return this.CEcdemicMrk;
    }

    public void setCEcdemicMrk(String CEcdemicMrk) {
        this.CEcdemicMrk = CEcdemicMrk;
    }

    public String getCGrpBuyContractNo() {
        return this.CGrpBuyContractNo;
    }

    public void setCGrpBuyContractNo(String CGrpBuyContractNo) {
        this.CGrpBuyContractNo = CGrpBuyContractNo;
    }

    public String getCSpecDeclCauseCde() {
        return this.CSpecDeclCauseCde;
    }

    public void setCSpecDeclCauseCde(String CSpecDeclCauseCde) {
        this.CSpecDeclCauseCde = CSpecDeclCauseCde;
    }

    public String getCQuestNo() {
        return this.CQuestNo;
    }

    public void setCQuestNo(String CQuestNo) {
        this.CQuestNo = CQuestNo;
    }

    public String getCRemark() {
        return this.CRemark;
    }

    public void setCRemark(String CRemark) {
        this.CRemark = CRemark;
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

    public String getCCurModelNme() {
        return this.CCurModelNme;
    }

    public void setCCurModelNme(String CCurModelNme) {
        this.CCurModelNme = CCurModelNme;
    }

    public String getCUseYear() {
        return this.CUseYear;
    }

    public void setCUseYear(String CUseYear) {
        this.CUseYear = CUseYear;
    }

    public String getCTfiSpecialMrk() {
        return this.CTfiSpecialMrk;
    }

    public void setCTfiSpecialMrk(String CTfiSpecialMrk) {
        this.CTfiSpecialMrk = CTfiSpecialMrk;
    }

    public String getCTfiReinsureMrk() {
        return this.CTfiReinsureMrk;
    }

    public void setCTfiReinsureMrk(String CTfiReinsureMrk) {
        this.CTfiReinsureMrk = CTfiReinsureMrk;
    }

    public String getCShortRsn() {
        return this.CShortRsn;
    }

    public void setCShortRsn(String CShortRsn) {
        this.CShortRsn = CShortRsn;
    }

    public String getCLicenseTyp() {
        return this.CLicenseTyp;
    }

    public void setCLicenseTyp(String CLicenseTyp) {
        this.CLicenseTyp = CLicenseTyp;
    }

    public String getCIdcardTyp() {
        return this.CIdcardTyp;
    }

    public void setCIdcardTyp(String CIdcardTyp) {
        this.CIdcardTyp = CIdcardTyp;
    }

    public Date getTTransferTm() {
        return this.TTransferTm;
    }

    public void setTTransferTm(Date TTransferTm) {
        this.TTransferTm = TTransferTm;
    }

    public String getCOldLcnNo() {
        return this.COldLcnNo;
    }

    public void setCOldLcnNo(String COldLcnNo) {
        this.COldLcnNo = COldLcnNo;
    }

    public String getCProconfirmNo() {
        return this.CProconfirmNo;
    }

    public void setCProconfirmNo(String CProconfirmNo) {
        this.CProconfirmNo = CProconfirmNo;
    }

    public String getCSearchCode() {
        return this.CSearchCode;
    }

    public void setCSearchCode(String CSearchCode) {
        this.CSearchCode = CSearchCode;
    }

    public String getCBrandId() {
        return this.CBrandId;
    }

    public void setCBrandId(String CBrandId) {
        this.CBrandId = CBrandId;
    }

    public String getCNameChoice() {
        return this.CNameChoice;
    }

    public void setCNameChoice(String CNameChoice) {
        this.CNameChoice = CNameChoice;
    }

    public String getCAliasId() {
        return this.CAliasId;
    }

    public void setCAliasId(String CAliasId) {
        this.CAliasId = CAliasId;
    }

    public String getCNewMrk() {
        return this.CNewMrk;
    }

    public void setCNewMrk(String CNewMrk) {
        this.CNewMrk = CNewMrk;
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

    public String getCCrtNme() {
        return this.CCrtNme;
    }

    public void setCCrtNme(String crtNme) {
        this.CCrtNme = crtNme;
    }

    public String getCcarSts() {
        return this.CcarSts;
    }

    public void setCcarSts(String ccarSts) {
        this.CcarSts = ccarSts;
    }

    public String getCNinsTm() {
        return this.CNinsTm;
    }

    public void setCNinsTm(String ninsTm) {
        this.CNinsTm = ninsTm;
    }

    public String getCBzEndTm() {
        return this.CBzEndTm;
    }

    public void setCBzEndTm(String bzEndTm) {
        this.CBzEndTm = bzEndTm;
    }

    public Double getNgo() {
        return this.Ngo;
    }

    public void setNgo(Double ngo) {
        this.Ngo = ngo;
    }

	public String getCPlateBrandId() {
		return CPlateBrandId;
	}

	public void setCPlateBrandId(String plateBrandId) {
		CPlateBrandId = plateBrandId;
	}

	public String getCPlateModelCde() {
		return CPlateModelCde;
	}

	public void setCPlateModelCde(String plateModelCde) {
		CPlateModelCde = plateModelCde;
	}

	public String getCRiskDesc() {
		return CRiskDesc;
	}

	public void setCRiskDesc(String riskDesc) {
		CRiskDesc = riskDesc;
	}

	public String getCVhlInsuredRel() {
		return CVhlInsuredRel;
	}

	public void setCVhlInsuredRel(String vhlInsuredRel) {
		CVhlInsuredRel = vhlInsuredRel;
	}

	public String getCFleetMrk() {
		return CFleetMrk;
	}

	public void setCFleetMrk(String fleetMrk) {
		CFleetMrk = fleetMrk;
	}

	public Double getNDespRate() {
		return NDespRate;
	}

	public void setNDespRate(Double ndespRate) {
		NDespRate = ndespRate;
	}

	public String getCResvTxt11() {
		return CResvTxt11;
	}

	public void setCResvTxt11(String resvTxt11) {
		CResvTxt11 = resvTxt11;
	}

	public String getCVhlSubTyp() {
		return CVhlSubTyp;
	}

	public void setCVhlSubTyp(String vhlSubTyp) {
		CVhlSubTyp = vhlSubTyp;
	}

	public Double getNNewPurchaseRate() {
		return NNewPurchaseRate;
	}

	public void setNNewPurchaseRate(Double newPurchaseRate) {
		NNewPurchaseRate = newPurchaseRate;
	}

	public String getCVhlPkgNO() {
		return CVhlPkgNO;
	}

	public void setCVhlPkgNO(String vhlPkgNO) {
		CVhlPkgNO = vhlPkgNO;
	}

	public String getVehForCode() {
		return VehForCode;
	}

	public void setVehForCode(String vehForCode) {
		VehForCode = vehForCode;
	}

	public Long getNNoDamageYears() {
		return NNoDamageYears;
	}

	public void setNNoDamageYears(Long noDamageYears) {
		NNoDamageYears = noDamageYears;
	}

	public Double getNPoWeight() {
		return NPoWeight;
	}

	public void setNPoWeight(Double poWeight) {
		NPoWeight = poWeight;
	}

	public String getCBookingCode() {
		return CBookingCode;
	}

	public void setCBookingCode(String bookingCode) {
		CBookingCode = bookingCode;
	}

	public String getCGroupCode() {
		return CGroupCode;
	}

	public void setCGroupCode(String groupCode) {
		CGroupCode = groupCode;
	}

	public String getCCircPaymentNo() {
		return CCircPaymentNo;
	}

	public void setCCircPaymentNo(String circPaymentNo) {
		CCircPaymentNo = circPaymentNo;
	}

	public String getCSingleBusinessNo() {
		return CSingleBusinessNo;
	}

	public void setCSingleBusinessNo(String singleBusinessNo) {
		CSingleBusinessNo = singleBusinessNo;
	}

	public Date getTProconfirmStartDate() {
		return TProconfirmStartDate;
	}

	public void setTProconfirmStartDate(Date proconfirmStartDate) {
		TProconfirmStartDate = proconfirmStartDate;
	}

	public Date getTProconfirmEndDate() {
		return TProconfirmEndDate;
	}

	public void setTProconfirmEndDate(Date proconfirmEndDate) {
		TProconfirmEndDate = proconfirmEndDate;
	}

	public Date getTPaymentStartDate() {
		return TPaymentStartDate;
	}

	public void setTPaymentStartDate(Date paymentStartDate) {
		TPaymentStartDate = paymentStartDate;
	}

	public Date getTPaymentEndDate() {
		return TPaymentEndDate;
	}

	public void setTPaymentEndDate(Date paymentEndDate) {
		TPaymentEndDate = paymentEndDate;
	}

	public String getCFamilyNme() {
		return CFamilyNme;
	}

	public void setCFamilyNme(String familyNme) {
		CFamilyNme = familyNme;
	}

	public String getCBusType() {
		return CBusType;
	}

	public void setCBusType(String cBusType) {
		CBusType = cBusType;
	}

	public String getCUsageCdeBk() {
		return CUsageCdeBk;
	}

	public void setCUsageCdeBk(String usageCdeBk) {
		CUsageCdeBk = usageCdeBk;
	}

	public String getCVhlTypBk() {
		return CVhlTypBk;
	}

	public void setCVhlTypBk(String vhlTypBk) {
		CVhlTypBk = vhlTypBk;
	}

	public String getCIsFullEdr() {
		return CIsFullEdr;
	}

	public void setCIsFullEdr(String cIsFullEdr) {
		CIsFullEdr = cIsFullEdr;
	}

	public String getCRiskLevel() {
		return CRiskLevel;
	}

	public void setCRiskLevel(String riskLevel) {
		CRiskLevel = riskLevel;
	}

	public Long getNStdSeatNum() {
		return this.NStdSeatNum;
	}

	public void setNStdSeatNum(Long NStdSeatNum) {
		this.NStdSeatNum = NStdSeatNum;
	}

	public Double getNStdTonage() {
		return this.NStdTonage;
	}

	public void setNStdTonage(Double NStdTonage) {
		this.NStdTonage = NStdTonage;
	}

	public Double getNStdDisplacement() {
		return this.NStdDisplacement;
	}

	public void setNStdDisplacement(Double NStdDisplacement) {
		this.NStdDisplacement = NStdDisplacement;
	}

	public String getCAppValidateNo() {
		return CAppValidateNo;
	}

	public void setCAppValidateNo(String cAppValidateNo) {
		CAppValidateNo = cAppValidateNo;
	}
	public String getModelNme() {
		return modelNme;
	}

	public void setModelNme(String modelNme) {
		this.modelNme = modelNme;
	}

	public String getCMarketDate() {
		return CMarketDate;
	}

	public void setCMarketDate(String cMarketDate) {
		CMarketDate = cMarketDate;
	}
	 
    public String getCCarYear() {
		return CCarYear;
	}

	public void setCCarYear(String cCarYear) {
		CCarYear = cCarYear;
	}

	public String getJYPowerTypeCode() {
		return JYPowerTypeCode;
	}

	public void setJYPowerTypeCode(String jYPowerTypeCode) {
		JYPowerTypeCode = jYPowerTypeCode;
	}
}