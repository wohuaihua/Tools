/**
 * 
 */
package com.meyacom.ruleapp.ext.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author MAXiaoqiang
 *
 */
public class Result implements Serializable{

    /**
     * 
     */
    protected String resultCode;

    /**
     * 
     */
    protected Map<String, Object> parameters;

    /**
     * 
     */
    protected List<RuleResult> results;

    /**
     * 
     */
    public Result() {
        parameters = new java.util.HashMap<String, Object>();
        results = new java.util.ArrayList<RuleResult>();
    }

    /**
     * @return the resultCode
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * @param resultCode
     *            the resultCode to set
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /**
     * @return the parameters
     */
    public Map<String, Object> getParameters() {
        return parameters;
    }

    /**
     * @param parameters
     *            the parameters to set
     */
    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
    }

    /**
     * @return the results
     */
    public List<RuleResult> getResults() {
        return results;
    }

    /**
     * @param results
     *            the results to set
     */
    public void setResults(List<RuleResult> results) {
        this.results = results;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Result [resultCode=" + resultCode + ", parameters="
                + parameters + ", results=" + results + "]";
    }

}
