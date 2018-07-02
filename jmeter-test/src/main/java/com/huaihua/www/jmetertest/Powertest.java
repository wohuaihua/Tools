package com.huaihua.www.jmetertest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.huaihua.www.action.ConnectResAction;
import com.huaihua.www.util.DubboInit;

public class Powertest extends AbstractJavaSamplerClient {  
	  
    //需要测试的接口  
    @Autowired 
    private ConnectResAction ruleService;
    
    @Value("#{res.resUri}")
    private String requestJson;
  
    private long start = 0;//记录测试开始时间；  
    private long end = 0;//记录测试结束时间；  
    private String hosCode = "T113411";  
    private String cardNo = "98000001004327";  
  
  
    //初始化操作  
    @Override  
    public void setupTest(JavaSamplerContext arg0) {  
        DubboInit init = DubboInit.getInstance();  
        DubboInit.initApplicationContext();  
        ruleService = (ConnectResAction) init.getBean("resConnection");  
    }  
  
    /** 
     * 
     * 设置默认值 
     * 
     * @return 
     */  
    public Arguments getDefaultParameters() {  
        Arguments params = new Arguments();  
        params.addArgument("hosCode", hosCode);  
        params.addArgument("cardNo", cardNo);  
        return params;  
    }  
  
    /** 
     * 获取jmeter输入的参数值 
     * 
     * @return 
     */  
    public void setValues(JavaSamplerContext arg0) {  
        hosCode = arg0.getParameter("hosCode",hosCode);  
        cardNo = arg0.getParameter("cardNo",cardNo);  
    }  
  
    public SampleResult runTest(JavaSamplerContext javaSamplerContext) {  
        SampleResult sr = new SampleResult();  
        setValues(javaSamplerContext);  
        sr.sampleStart();  
        start = System.currentTimeMillis();  
        try {
        	Person person=ModelTools.getPerson();
        	Map<String,Object> map=new HashMap<String,Object>();
        	map.put("bom", person);
            Result result = ruleService.execute("", map);  
            if (result != null&&result.getResultCode().equals("1")) { 
            	sr.setResponseData("结果是：" + result, null);
                sr.setSuccessful(true);  
                sr.setDataType(SampleResult.TEXT);  
            } else {  
                sr.setSuccessful(false); 
                getNewLogger().error("Powertest response is null"); 
            }  
        } catch (Exception e) {  
        	getNewLogger().error("Powertest response error : " + e.getMessage()); 
            sr.setSuccessful(false);  
        } finally {  
            sr.sampleEnd();  
        }  
        return sr;  
    }  
  
    @Override  
    public void teardownTest(JavaSamplerContext arg0) {  
        end = System.currentTimeMillis();  
        getNewLogger().info("    cost time: " + (end - start) + "ms");  
    }  
}  
