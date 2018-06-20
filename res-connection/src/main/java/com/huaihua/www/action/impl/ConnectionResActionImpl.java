package com.huaihua.www.action.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.alibaba.dubbo.common.json.JSON;
import com.alibaba.dubbo.common.json.JSONObject;
import com.huaihua.www.action.ConnectResAction;


public class ConnectionResActionImpl implements ConnectResAction{
	
	 /**
     * JSON Mapper
     */
    protected ObjectMapper jsonMapper = new ObjectMapper();
	
	@Override
	public String executeRule(String ruleName, Object reqestObj) {
		if(reqestObj==null) {
			return "reqestObj is null !";
		}
		try {
			String jsonRequest=JSON.json(reqestObj);
			/**
			 * TODO
			 */
			String urlPath="http://127.0.0.1:8080" + "/DecisionService/rest/v1"
					+ "/personApp/1.0/personRule";
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

			PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(
					httpConn.getOutputStream(), "utf-8"));
			printWriter.write(jsonRequest.toString());
			printWriter.flush();
			InputStream input = httpConn.getInputStream();
			int responseCode = httpConn.getResponseCode();
			String tResult = genResult(input, responseCode);
			printWriter.close();
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return null;
	}
	
	private static String genResult(InputStream inputStream, int responseCode) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(inputStream,
					"UTF-8"));
			StringBuilder sb = new StringBuilder();
			String line = "";
			while ((line = reader.readLine()) != null) {
				sb.append(line);
			}

			return sb.toString();
		} catch (Exception e) {
			throw new RuntimeException("通过HTTP读取数据出错", e);
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					System.out.println("IO流关闭失败:" + e);
				}
			}

			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					System.out.println("IO流关闭失败:" + e);
				}
			}
		}
	}

}
