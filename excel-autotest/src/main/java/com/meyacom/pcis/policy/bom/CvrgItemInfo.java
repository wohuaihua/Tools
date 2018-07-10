package com.meyacom.pcis.policy.bom;

import java.io.Serializable;
import java.util.List;
import java.util.Map;


/**
 * 承保主险的条款信息对象--验车/批增判断
 * @author gongjian
 * @date 2017年12月15日20:47:38
 */
public class CvrgItemInfo implements Serializable{

    private static final long serialVersionUID = 9023363784689465430L;
    
    private String cvrgNo;// 承保主险的条款(车损、盗抢、三者、车上人员（驾驶人）、车上人员（乘客）)
    private Double nAmtVar;// 险别保额变化量
    private String isAddItemFlag;// 是否为新增险别(1:是，0:否)
    private Map<String, Object> spaceMap;//预留字段
    private List<CvrgAddInfo> cvrgAddList;// 主险对应附加险的条款
    
	public String getCvrgNo() {
		return cvrgNo;
	}
	public void setCvrgNo(String cvrgNo) {
		this.cvrgNo = cvrgNo;
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
	public List<CvrgAddInfo> getCvrgAddList() {
		return cvrgAddList;
	}
	public void setCvrgAddList(List<CvrgAddInfo> cvrgAddList) {
		this.cvrgAddList = cvrgAddList;
	}
	public Map<String, Object> getSpaceMap() {
		return spaceMap;
	}
	public void setSpaceMap(Map<String, Object> spaceMap) {
		this.spaceMap = spaceMap;
	}
}
