package com.firefly.helper;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Helper {
	
	public static String getTime(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		return df.format(new Date())+"";
	}
	
	public static String getRandomID(){
		return (int)(Math.random()*1000000)+"";
	}
	
	public static String getDocPath(){
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd"); 
		String time = df.format(new Date())+"";
		return "D:\\WorkSpace\\EclipseNeon\\FireCloud\\"+time;
	}

	public static String getFileType(String fileName) {
		if(fileName.contains(".")){
			String[] s = fileName.split("\\.");
			return s[s.length-1];
		}else{
			return "empty";
		}
	}
}
