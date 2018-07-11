/**
 * 
 */
package com.meyacom.ruleapp.ext.service;

import java.io.Serializable;
import java.util.Map;

/**
 * @author MAXiaoqiang
 *
 */
public class RuleResult  implements Serializable{

    /**
     * 
     */
    protected String ruleId;

    /**
     * 
     */
    protected String ruleMessage;

    /**
     * 
     */
    protected Map<String, Object> values;

    /**
     * 
     */
    public RuleResult() {
        values = new java.util.HashMap<String, Object>();
    }

    /**
     * @return the ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * @param ruleId
     *            the ruleId to set
     */
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * @return the ruleMessage
     */
    public String getRuleMessage() {
        return ruleMessage;
    }

    /**
     * @param ruleMessage
     *            the ruleMessage to set
     */
    public void setRuleMessage(String ruleMessage) {
        this.ruleMessage = ruleMessage;
    }

    /**
     * @return the values
     */
    public Map<String, Object> getValues() {
        return values;
    }

    /**
     * @param values
     *            the values to set
     */
    public void setValues(Map<String, Object> values) {
        this.values = values;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "RuleResult [ruleId=" + ruleId + ", ruleMessage=" + ruleMessage
                + ", values=" + values + "]";
    }

}
