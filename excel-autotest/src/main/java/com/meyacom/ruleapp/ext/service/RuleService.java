/**
 * 
 */
package com.meyacom.ruleapp.ext.service;

import java.util.Map;


/**
 * @author MAXiaoqiang
 *
 */
public interface RuleService {

    /**
     * 规则应用平台规则应用执行接口. 参数为:
     * 
     * <pre>
     * key: bom value: bom object 
     * key: appId value: rule application id
     * </pre>
     * 
     * @param appId
     * @param parameters
     * @return
     */
    public Result execute(String appId,
             Map<String, Object> parameters);

}
