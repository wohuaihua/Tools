package com.huaihua.www.action.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.huaihua.www.action.ConnectResAction;


public class ConnectionResActionImpl implements ConnectResAction{
	
	 /**
     * JSON Mapper
     */
    protected ObjectMapper jsonMapper = new ObjectMapper();
	
	@Override
	public String executeRule(String ruleName, String reqestObj) {
		if(reqestObj==null) {
			return "reqestObj is null !";
		}
		
		InputStream input =null;
		PrintWriter printWriter =null;
		
		try {
			String jsonRequest = "{\"PolicyBom\":" + reqestObj
					+ " ,\"__DecisionID__\": \"string\"}";
			
			/**
			 * TODO
			 */
			String urlPath="http://127.0.0.1:8080" + "/DecisionService/rest/v1"
					+ "/JX_UWPOWERAPP/JX_UWPOWER";
			URL url = new URL(urlPath);
			HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
			httpConn.setRequestProperty("Content-Type", "application/json");
			httpConn.setConnectTimeout(10000);
			httpConn.setReadTimeout(15000);
			httpConn.setRequestMethod("POST");
			httpConn.setDoOutput(true);
			httpConn.setDoInput(true);
			httpConn.setAllowUserInteraction(false);
			httpConn.connect();

			printWriter = new PrintWriter(new OutputStreamWriter(
					httpConn.getOutputStream(), "utf-8"));
			printWriter.write(jsonRequest.toString());
			printWriter.flush();
			input = httpConn.getInputStream();
			int responseCode = httpConn.getResponseCode();
			printWriter.close();
			
			JsonNode mapRoot = jsonMapper.readTree(input);
			JsonNode resultNode = mapRoot.findValue("Result");
			System.out.println(resultNode.toString());
			return resultNode.toString();
			
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(input!=null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if(printWriter!=null) {
				printWriter.close();
			}
		}
		return "";
	}

}
