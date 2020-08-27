package com.xh.lesson.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HttpsURLConnection;

public class GenerateTokenSample {

	/**
	 * 基于rest协议获取访问token
	 * @param tokenUrl
	 * @param key
	 * @param secret
	 * @return
	 */
	 
	public static String getAccessTokenOfRest(String restTokenUrl, String key, String secret){
		String lineData;
		String result = "";
		URL postUrl = null;
		OutputStream output = null;
		BufferedReader reader = null;
		InputStreamReader isr = null;
		HttpsURLConnection connection = null;
		try {
			postUrl = new URL(restTokenUrl);
			connection = (HttpsURLConnection) postUrl.openConnection();
			connection.setRequestMethod("POST");
			connection.setDoOutput(true);
			connection.setUseCaches(false);
			connection.setInstanceFollowRedirects(true);
			connection.setConnectTimeout(20000);
			connection.setRequestProperty("Authorization", "Basic "+ getBaseEcode64(key, secret).trim());
			connection.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
			output = connection.getOutputStream();
			output.write(("grant_type=client_credentials").getBytes());// 请求输入内容,grant_type为固定值
			output.flush();
			isr = new InputStreamReader(connection.getInputStream());
			reader = new BufferedReader(isr);
			while ((lineData = reader.readLine()) != null) {
				result = lineData + result;
			}
			connection.disconnect();
		} catch (MalformedURLException e) {
			//由项目组处理①log.error(e.getMessage()); ②throw new XXException(e);
		} catch (IOException e) {
			//由项目组处理①log.error(e.getMessage()); ②throw new XXException(e);
		}finally{
			if(null != output){
				try {
					output.close();
				} catch (IOException e) {
					output = null;
				}
			}
			if(null != reader){
				try {
					reader.close();
				} catch (IOException e) {
					isr = null;
				}
			}
			if(null != isr){
				try {
					isr.close();
				} catch (IOException e) {
					isr = null;
				}
			}
			if(null != connection){
				connection.disconnect();
			}
		}
		return result;
	}
	/**
	 * 基于soap协议获取token
	 * @param tokenUrl
	 * @param key
	 * @param secret
	 * @return
	 */
	
	public static String getAccessTokenOfSOAP(String soapTokenUrl, String key, String secret){
		URL postUrl = null;
		String dataLine;
		String result = "";
		BufferedReader reader = null;
		OutputStream output = null;
		InputStreamReader isr = null;
		HttpsURLConnection connection = null;
		try {
			postUrl = new URL(soapTokenUrl);
			connection = (HttpsURLConnection) postUrl.openConnection();
			connection.setRequestMethod("POST");
			connection.setDoOutput(true);
			connection.setUseCaches(false);
			connection.setInstanceFollowRedirects(true);
			connection.setConnectTimeout(20000);
			connection.addRequestProperty("SOAPAction", "");
			output = connection.getOutputStream();
			output.write(getSOAPRequestBody(key,secret).getBytes());
			isr = new InputStreamReader(connection.getInputStream());
			reader = new BufferedReader(isr);
			while ((dataLine = reader.readLine()) != null) {
				result = dataLine + result;
			}
		} catch (MalformedURLException e) {
			//由项目组处理①log.error(e.getMessage()); ②throw new XXException(e);
		} catch (IOException e) {
			//由项目组处理①log.error(e.getMessage()); ②throw new XXException(e);
		}finally{
			if(null != output){
				try {
					output.close();
				} catch (IOException e) {
					output = null;
				}
			}
			if(null != reader){
				try {
					reader.close();
				} catch (IOException e) {
					isr = null;
				}
			}
			if(null != isr){
				try {
					isr.close();
				} catch (IOException e) {
					isr = null;
				}
			}
			if(null != connection){
				connection.disconnect();
			}
		}
		return result;
	}
	/**
	 * 封装soap请求的报文体
	 * @param key
	 * @param secret
	 * @return
	 */
	public static String getSOAPRequestBody(String key,String secret){
		StringBuilder soap= new StringBuilder();
    	//定义soap 请求xml格式字符：
  		soap.append("&lt;soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:oaut=\"http://oauth2soap.openapi.huawei.com/\"&gt;");
    	soap.append("&lt;soapenv:Header&gt;&lt;/soapenv:Header&gt;");
    	soap.append("&lt;soapenv:Body&gt;");
    	soap.append("&lt;oaut:getToken&gt;");
    	soap.append("&lt;consumer_key&gt;").append(key).append("&lt;/consumer_key&gt;");
    	soap.append("&lt;consumer_secret&gt;").append(secret).append("&lt;/consumer_secret&gt;");
    	soap.append("&lt;/oaut:getToken&gt;");
    	soap.append("&lt;/soapenv:Body&gt;");
    	soap.append("&lt;/soapenv:Envelope&gt;");
		return soap.toString();
	}
	/**
	 * 根据base64加密
	 * @param key
	 * @param secury
	 * @return
	 */
	private static String getBaseEcode64(String key, String secury) {
		return new sun.misc.BASE64Encoder().encode((key + ":" + secury).getBytes()).trim();
	}
	public static void main(String[] args) throws KeyManagementException, NoSuchAlgorithmException, IOException {
		
		String uat_addr_rest = "https://api-beta.huawei.com:443/oauth2/token";
		String uat_addr_soap = "https://api-beta.huawei.com/oauth2soap/services/token";
		
		String key = "SCS_021498!";
		String secret = "Dcba3214!";
		System.out.println(getAccessTokenOfRest(uat_addr_rest,key, secret));
		System.out.println(getAccessTokenOfSOAP(uat_addr_soap,key, secret));
	}

}