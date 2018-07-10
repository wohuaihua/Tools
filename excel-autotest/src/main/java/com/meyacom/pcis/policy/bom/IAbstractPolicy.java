package com.meyacom.pcis.policy.bom;

import java.util.List;
import java.util.Map;






/**
 * AbstractPolicy: 
 *
 * @author jiangqf
 */
public class IAbstractPolicy{
	private IAbstractBaseVO base;//保单基本信息
	private IAbstractApplicantVO applicant;//投保人
	private IAbstractInsuredVO insured;	//被保险人
	private	IAbstractVhlownerVO vhlownerinfo;//车主
	private IAbstractVhlVO vehicleinfo;//车辆信息
	private List<IAbstractCvrgVO> cvrginfolist;//险别信息列表
	private IAbstractPrmCoefVO premcoefinfo;//系数
	private IAbstractVsTaxVO vhltaxinfo;//车船税
	private IAbstractAcctinfoVO acctinfo;//账户信息
	private List<IAbstractFixSpecVO> cunfixspclist;//特别约定列表
	private Map<String,Object> addtional;//附加信息
	private List<CvrgItemInfo> cvrgItemInfo;//承保主险的条款信息对象
	
	public IAbstractApplicantVO getApplicant() {
		return applicant;
	}
	public void setApplicant(IAbstractApplicantVO applicant) {
		this.applicant = applicant;
	}
	public IAbstractInsuredVO getInsured() {
		return insured;
	}
	public void setInsured(IAbstractInsuredVO insured) {
		this.insured = insured;
	}
	public IAbstractVhlownerVO getVhlownerinfo() {
		return vhlownerinfo;
	}
	public void setVhlownerinfo(IAbstractVhlownerVO vhlownerinfo) {
		this.vhlownerinfo = vhlownerinfo;
	}
	public IAbstractVhlVO getVehicleinfo() {
		return vehicleinfo;
	}
	public void setVehicleinfo(IAbstractVhlVO vehicleinfo) {
		this.vehicleinfo = vehicleinfo;
	}
	public IAbstractPrmCoefVO getPremcoefinfo() {
		return premcoefinfo;
	}
	public void setPremcoefinfo(IAbstractPrmCoefVO premcoefinfo) {
		this.premcoefinfo = premcoefinfo;
	}
	public IAbstractVsTaxVO getVhltaxinfo() {
		return vhltaxinfo;
	}
	public void setVhltaxinfo(IAbstractVsTaxVO vhltaxinfo) {
		this.vhltaxinfo = vhltaxinfo;
	}
	public IAbstractAcctinfoVO getAcctinfo() {
		return acctinfo;
	}
	public void setAcctinfo(IAbstractAcctinfoVO acctinfo) {
		this.acctinfo = acctinfo;
	}
	public IAbstractBaseVO getBase() {
		return base;
	}
	public void setBase(IAbstractBaseVO base) {
		this.base = base;
	}
	public List<IAbstractCvrgVO> getCvrginfolist() {
		return cvrginfolist;
	}
	public void setCvrginfolist(List<IAbstractCvrgVO> cvrginfolist) {
		this.cvrginfolist = cvrginfolist;
	}
	public List<IAbstractFixSpecVO> getCunfixspclist() {
		return cunfixspclist;
	}
	public void setCunfixspclist(List<IAbstractFixSpecVO> cunfixspclist) {
		this.cunfixspclist = cunfixspclist;
	}
	public Map<String, Object> getAddtional() {
		return addtional;
	}
	public void setAddtional(Map<String, Object> addtional) {
		this.addtional = addtional;
	}
	
	public Object getValue(String index){
		if(index!=null&&addtional!=null){
			return addtional.get(index);
		}
		return null;
	}
	
	 public String getValueString(String key){
		 System.out.print("12312312312");
		 if(key!=null&&addtional!=null){
				return (String)addtional.get(key);
			}
			return null;
	  }
	
	public List<CvrgItemInfo> getCvrgItemInfo() {
		return cvrgItemInfo;
	}
	public void setCvrgItemInfo(List<CvrgItemInfo> cvrgItemInfo) {
		this.cvrgItemInfo = cvrgItemInfo;
	} 
	
	
}
