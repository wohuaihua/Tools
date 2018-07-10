package com.meyacom.pcis.policy.bom;

import java.io.Serializable;
import java.util.Map;


/**
 * 承保主险对应附加险的条款信息对象--验车/批增判断
 * @author gongjian
 * @date 2017年12月15日20:47:38
 */
public class CvrgAddInfo implements Serializable{

    private static final long serialVersionUID = -3625102231250050720L;
    
	private String addCvrgNo;// 承保主险对应附加险的条款
    private Double nAmtVar;// 险别保额变化量
    private String isAddItemFlag;// 是否为新增险别(1:是，0:否)
    private Map<String, Object> spaceAddMap;//预留字段
    
	public String getAddCvrgNo() {
		return addCvrgNo;
	}
	public void setAddCvrgNo(String addCvrgNo) {
		this.addCvrgNo = addCvrgNo;
	}
	public Double getnAmtVar() {
		return nAmtVar;
	}
	public void setnAmtVar(Double nAmtVar) {
		this.nAmtVar = nAmtVar;
	}
	public String getIsAddItemFlag() {
		return isAddItemFlag;
	}
	public void setIsAddItemFlag(String isAddItemFlag) {
		this.isAddItemFlag = isAddItemFlag;
	}
	public Map<String, Object> getSpaceAddMap() {
		return spaceAddMap;
	}
	public void setSpaceAddMap(Map<String, Object> spaceAddMap) {
		this.spaceAddMap = spaceAddMap;
	}
	
}
