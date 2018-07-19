package com.huaihua.www;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.meyacom.pcis.policy.bom.CvrgAddInfo;
import com.meyacom.pcis.policy.bom.CvrgItemInfo;
import com.meyacom.pcis.policy.bom.IAbstractPolicy;

public class Test {
	
	public static void main(String[] args) {
		Date date=new Date(1484582580000L);
		 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		 sdf.format(date);
	}
	
	public static boolean isFirstChange(IAbstractPolicy policy,String index){
		 String isfirst="";
	     Date tInsrncBgnTm =policy.getBase().getTInsrncBgnTm();
		 if(tInsrncBgnTm==null||policy.getVehicleinfo().getCFstRegYm()==null||
				 policy.getVehicleinfo().getCCertificateDate()==null||"".equals(policy.getVehicleinfo().getCFstRegYm())||
						 "".equals(policy.getVehicleinfo().getCCertificateDate())){
			 return false;
		 }

		 Date cFstRegYm=stringTodate(policy.getVehicleinfo().getCFstRegYm());
		 Date cCertificateDate=stringTodate(policy.getVehicleinfo().getCCertificateDate());
	
	     int dayCfs= (int)((tInsrncBgnTm.getTime()-cFstRegYm.getTime())/(1000*3600*24));
	    
	     int dayCce= (int)((tInsrncBgnTm.getTime()-cCertificateDate.getTime())/(1000*3600*24));
	     System.out.println(dayCfs);
	     System.out.println(dayCce);
	     if(dayCfs>270&&dayCce<365&&cFstRegYm.getTime()!=cCertificateDate.getTime()){
	    	 isfirst="1";
	     }else{
	    	 isfirst="0";
	     }
	     if(isfirst.equals(index)){
	    	 return true;
	     }
		return false;
	} 
	
	public static Date stringTodate(String str){
		  if(str!=null){
			  SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			  try {
				return sdf.parse(str);
			} catch (ParseException e) {
				// TODO 自动生成 catch 块
				e.printStackTrace();
			}
		  }
		return null;
	}
	
	public static String isCD(IAbstractPolicy policy){
		List<CvrgItemInfo> cvrgItems=policy.getCvrgItemInfo();
		if(cvrgItems==null){
			return "0";
		}
		for(CvrgItemInfo c:cvrgItems){
			if(c==null||c.getCvrgNo()==null){
				break;
			}
			if("1".equals(c.getIsAddItemFlag())&&rCvrgCdeMap.get(c.getCvrgNo())!=null){//增加的主险
				return "1";
			}
			if(c.getnAmtVar()>0d&&rCvrgCdeMap.get(c.getCvrgNo())!=null){//增加主险的保额
				return "1";
			}
		}
		
		for(CvrgItemInfo citem:cvrgItems){
			if(rCvrgCdeMap.get(citem.getCvrgNo())!=null){//车损、盗抢及附加险
				List<CvrgAddInfo> addInfos=citem.getCvrgAddList();
				for(CvrgAddInfo info:addInfos){
					if("1".equals(info.getIsAddItemFlag())||info.getnAmtVar()>0d){
						return "1";
					}
				}
			}
		}
		return "0";
	}
	
	private static Map<String, String> rCvrgCdeMap = new HashMap<String, String>();
	static {
		rCvrgCdeMap.put("033001", "车辆损失保险");
		rCvrgCdeMap.put("033005", "全车盗抢保险");
		rCvrgCdeMap.put("033006", "玻璃单独破碎险");
		rCvrgCdeMap.put("033007", "自燃损失险");
		rCvrgCdeMap.put("033008", "新增设备损失险");
		rCvrgCdeMap.put("033009", "修理期间费用补偿险");
		rCvrgCdeMap.put("033012", "车辆损失保险无法找到第三方特约险");
		rCvrgCdeMap.put("033013", "指定修理厂险");
		rCvrgCdeMap.put("033014", "车身划痕损失险");
		rCvrgCdeMap.put("033015", "发动机涉水损失险");
		rCvrgCdeMap.put("033016", "起重、装卸、挖掘车辆损失扩展条款");
		rCvrgCdeMap.put("033017", "特种车辆固定设备、仪器损坏扩展条款");
		rCvrgCdeMap.put("033018", "不计免赔率险");
		rCvrgCdeMap.put("033114", "不计免赔率险（车身划痕损失险）");
		rCvrgCdeMap.put("033115", "不计免赔率险（发动机涉水损失险）");
		rCvrgCdeMap.put("033019", "免赔额特约险");
	}

}
