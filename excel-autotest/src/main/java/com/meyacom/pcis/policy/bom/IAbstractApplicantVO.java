package com.meyacom.pcis.policy.bom;

import java.io.Serializable;
import java.util.Date;

/**
 * AbstractApplicantVO entity - Base definition for ApplicantVO and
 * AppApplicantVO .C
 *
 * @author jiangqf@isoftstone-ai.com
 */

public class IAbstractApplicantVO implements Serializable{

    // Fields

    /** */
    private String CAppNo;//C_APP_NO 申请单号,批改申请单号
    /** */
    private String CPlyNo;//C_PLY_NO 保单号
    /** */
    private String CEdrNo;//C_EDR_NO 批单号
    /** */
    private String CAppCde;//C_APP_CDE 投保人代码
    /** */
    private String CAppNme;//C_APP_NME 投保人名称
    /** */
    private String CCertfCls;//C_CERTF_CLS 证件类型
    private Long NEdrPrjNo;//N_EDR_PRJ_NO 批改序号
    private String CCertfCde;//C_CERTF_CDE 证件号码
    /** */
    private String CClntMrk;//C_CLNT_MRK 客户分类0 法人，1 个人
    /** */
    private String CCusLvl;//C_CUS_LVL 客户等级
    /** */
  //  private String CStkMrk;//C_STK_MRK 股东客户标志
    /** */
    private String CTrdCde;//C_TRD_CDE 行业代码
    /** */
    private String CSubTrdCde;//C_SUB_TRD_CDE 行业细分代码
    /** */
    private String CCntrNme;//C_CNTR_NME 联系人,投保人联系人
    /** */
    private String CTel;//C_TEL 固定电话,电话
    /** */
    private String CMobile;//C_MOBILE 移动电话
    /** */
    private String CCountry;//C_COUNTRY 国家
    /** */
    private String CProvince ;//C_PROVINCE 省份
    /** */
    private String CCity;//C_CITY 地市
    /** */
    private String CCounty;//C_COUNTY 县
    /** */
    private String CSuffixAddr;//C_SUFFIX_ADDR 街
    /** */
    private String CClntAddr;//C_CLNT_ADDR 地址
    /** */
    private String CLatestMrk;//C_LATEST_MRK 最新保单标志,'0'否,'1'是
    private String CZipCde;//C_ZIP_CDE 邮编
    /** */
    private String CEmail;//C_EMAIL 电子邮箱
    /** */
    private String CWorkDpt;//C_WORK_DPT 工作单位
    /** */
    private String CMrgCde;//C_MRG_CDE 婚姻状况
    private String CFax;//C_FAX 联系传真
    private Double NAppSum;//N_APP_SUM 投保人数
    private String CAppWay;//C_APP_WAY 投保方式
    private Double NJobSum;//N_JOB_SUM 在职员工数
    private Double NRetSum;//N_RET_SUM 退休员工数
    private String CWorkCtt;//C_WORK_CTT 经营内容
    private String CAppDptNme;//C_APP_DPT_NME 投保部门
    private String CWorkArea;//C_WORK_AREA 经营区域
    private String CWebAddr;//C_WEB_ADDR 单位网址
    
    /** */
    private String CCrtCde;//C_CRT_CDE 创建人代码
    /** */
    private Date TCrtTm;//T_CRT_TM 创建时间
    /** */
    private String CUpdCde;//C_UPD_CDE 修改人代码
    /** */
    private Date TUpdTm;//T_UPD_TM 修改时间
    
    
    //新增字段
    private String CRelCde;//C_REL_CDE 与被保人关系
    private String CCusRiskLvl; //C_CUS_RISK_LVL 客户风险等级,新客户、普通客户等
    
    //增加06大类产品的客户信息所需使用的字段 
    private String CSex;//C_SEX 性别
    private String COccupCde;//C_OCCUP_CDE 职业代码
    private Date TBirthday;//T_BIRTHDAY 出生日期
    /*永安 新增字段处理   kwcheng@isoftstone.com 2010-12-14*/
    private Date TCertfEndDate;//T_CERTF_END_DATE 证件有效期止
    // Constructors
    
    private String CResvTxt2;  // 税务登记号 2011-11-08 add by baidong
    
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
    
    private String CAppCate;//投保人类别  
    String CResvTxt11 ;//是否有营业执照
	String CResvTxt12 ;//是否有税务登记号
	Date CResvTxt13 ;//营业执照有效止期
	Date CResvTxt14 ;//税务登记号有效止期
	String CResvTxt15 ;//负责人证件类型
	String CResvTxt16 ;//负责人证件号码
	Date CResvTxt17 ;//负责人证件有效止期
   

	/** 省份证信息采集相关字段  北京客户身份信息采集需求   add by LiuHuan 2016-4-29  */
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
    public IAbstractApplicantVO() {
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

    public String getCAppCde() {
        return this.CAppCde;
    }

    public void setCAppCde(String CAppCde) {
        this.CAppCde = CAppCde;
    }

    public String getCAppNme() {
        return this.CAppNme;
    }

    public void setCAppNme(String CAppNme) {
        this.CAppNme = CAppNme;
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

    public String getCEmail() {
        return this.CEmail;
    }

    public void setCEmail(String CEmail) {
        this.CEmail = CEmail;
    }

    public String getCWorkDpt() {
        return this.CWorkDpt;
    }

    public void setCWorkDpt(String CWorkDpt) {
        this.CWorkDpt = CWorkDpt;
    }

    public String getCMrgCde() {
        return this.CMrgCde;
    }

    public void setCMrgCde(String CMrgCde) {
        this.CMrgCde = CMrgCde;
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

	

	public String getCClntMrk() {
		return CClntMrk;
	}

	public void setCClntMrk(String clntMrk) {
		CClntMrk = clntMrk;
	}

	public String getCCusLvl() {
		return CCusLvl;
	}

	public void setCCusLvl(String cusLvl) {
		CCusLvl = cusLvl;
	}

	//public String getCStkMrk() {
	//	return CStkMrk;
	//}

	//public void setCStkMrk(String stkMrk) {
	//	CStkMrk = stkMrk;
	//}

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

	public String getCFax() {
		return CFax;
	}

	public void setCFax(String fax) {
		CFax = fax;
	}

	public Double getNAppSum() {
		return NAppSum;
	}

	public void setNAppSum(Double appSum) {
		NAppSum = appSum;
	}

	public String getCAppWay() {
		return CAppWay;
	}

	public void setCAppWay(String appWay) {
		CAppWay = appWay;
	}

	public Double getNJobSum() {
		return NJobSum;
	}

	public void setNJobSum(Double jobSum) {
		NJobSum = jobSum;
	}

	public Double getNRetSum() {
		return NRetSum;
	}

	public void setNRetSum(Double retSum) {
		NRetSum = retSum;
	}

	public String getCWorkCtt() {
		return CWorkCtt;
	}

	public void setCWorkCtt(String workCtt) {
		CWorkCtt = workCtt;
	}

	public String getCAppDptNme() {
		return CAppDptNme;
	}

	public void setCAppDptNme(String appDptNme) {
		CAppDptNme = appDptNme;
	}

	public String getCWorkArea() {
		return CWorkArea;
	}

	public void setCWorkArea(String workArea) {
		CWorkArea = workArea;
	}

	public String getCWebAddr() {
		return CWebAddr;
	}

	public void setCWebAddr(String webAddr) {
		CWebAddr = webAddr;
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

	public String getCRelCde() {
		return CRelCde;
	}

	public void setCRelCde(String relCde) {
		CRelCde = relCde;
	}

    public String getCCusRiskLvl() {
        return CCusRiskLvl;
    }

    public void setCCusRiskLvl(String cusRiskLvl) {
        CCusRiskLvl = cusRiskLvl;
    }

	public String getCSex() {
		return CSex;
	}

	public void setCSex(String sex) {
		CSex = sex;
	}

	public String getCOccupCde() {
		return COccupCde;
	}

	public void setCOccupCde(String occupCde) {
		COccupCde = occupCde;
	}

	public Date getTBirthday() {
		return TBirthday;
	}

	public void setTBirthday(Date birthday) {
		TBirthday = birthday;
	}

	public Date getTCertfEndDate() {
		return TCertfEndDate;
	}

	public void setTCertfEndDate(Date certfEndDate) {
		TCertfEndDate = certfEndDate;
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

	public String getCResvTxt3() {
		return CResvTxt3;
	}

	public void setCResvTxt3(String resvTxt3) {
		CResvTxt3 = resvTxt3;
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

	 public String getCAppCate() {
			return CAppCate;
		}

		public void setCAppCate(String cAppCate) {
			CAppCate = cAppCate;
		}
}