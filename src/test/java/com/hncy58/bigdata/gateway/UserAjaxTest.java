package com.hncy58.bigdata.gateway;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

public class UserAjaxTest {

	static String BASE_URI = "http://127.0.0.1:9000/local/api/";
//	static String BASE_URI = "http://127.0.0.1:9000/local/test/";

	public static void main(String[] args) throws Exception {

//		add("user/add");
//		get("login?userCode=1002&password=88888888");
		get("user/getBySession");
//		get("/logout");
//		get("json");
//		get("hello");
//		modify("/user/update/11");
//		delete("user/delete/11");
	}

	private static void get(String path) throws Exception {
		String urlStr = BASE_URI + path;
		URL url = new URL(urlStr);

		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setDoInput(true);
		connection.setDoOutput(true);
		connection.setRequestMethod("GET");
		connection.setUseCaches(false);
		connection.setInstanceFollowRedirects(true);
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setRequestProperty("Cookie", "SESSION=e88ce191-f172-4b7e-b0d6-1eae2a8c03d3");
		connection.connect();

		DataInputStream in = new DataInputStream(connection.getInputStream());

		int len = in.available();
		byte[] b = new byte[len];
		in.readFully(b, 0, len);

		System.out.println(new String(b));

		in.close();
	}

	private static void delete(String path) throws Exception {
		String urlStr = BASE_URI + path;
		URL url = new URL(urlStr);

		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setDoInput(true);
		connection.setDoOutput(true);
		connection.setRequestMethod("GET");
		connection.setUseCaches(false);
		connection.setInstanceFollowRedirects(true);
		connection.setRequestProperty("Content-Type", "application/json");
		connection.connect();

		DataInputStream in = new DataInputStream(connection.getInputStream());

		int len = in.available();
		byte[] b = new byte[len];
		in.readFully(b, 0, len);

		System.out.println(new String(b));

		in.close();
	}

	private static void modify(String path) throws Exception {
		String urlStr = BASE_URI + path;
		URL url = new URL(urlStr);

		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setDoInput(true);
		connection.setDoOutput(true);
		connection.setRequestMethod("GET");
		connection.setUseCaches(false);
		connection.setInstanceFollowRedirects(true);
		connection.setRequestProperty("Content-Type", "application/json");
		connection.connect();

		DataOutputStream out = new DataOutputStream(connection.getOutputStream());
		JSONObject obj = new JSONObject();
		obj.put("userName", "测试资源更新");
		obj.put("userCode", "1014");
		obj.put("password", "2");
		obj.put("deptCode", "2");
		obj.put("mark", "测试update");
		obj.put("updateTime", System.currentTimeMillis());
		obj.put("createTime", System.currentTimeMillis());
		System.out.println(obj.toString());
		out.write(obj.toString().getBytes());
		out.flush();
		out.close();

		DataInputStream in = new DataInputStream(connection.getInputStream());

		int len = in.available();
		byte[] b = new byte[len];
		in.readFully(b, 0, len);

		System.out.println(new String(b));

		in.close();
	}

	private static void add(String path) throws Exception {
		String urlStr = BASE_URI + path;
		URL url = new URL(urlStr);

		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setDoInput(true);
		connection.setDoOutput(true);
		connection.setRequestMethod("GET");
		connection.setUseCaches(false);
		connection.setInstanceFollowRedirects(true);
		connection.setRequestProperty("Content-Type", "application/json");
		connection.connect();

		DataOutputStream out = new DataOutputStream(connection.getOutputStream());
		JSONObject obj = new JSONObject();
		obj.put("userName", "测试资源更新");
		obj.put("userCode", "1014");
		obj.put("password", "2");
		obj.put("deptCode", "2");
		obj.put("mark", "测试update");
		obj.put("updateTime", System.currentTimeMillis());
		obj.put("createTime", System.currentTimeMillis());
		System.out.println(obj.toString());
		out.write(obj.toString().getBytes());
		out.flush();
		out.close();

		DataInputStream in = new DataInputStream(connection.getInputStream());

		int len = in.available();
		byte[] b = new byte[len];
		in.readFully(b, 0, len);

		System.out.println(new String(b));

		in.close();
	}
}
