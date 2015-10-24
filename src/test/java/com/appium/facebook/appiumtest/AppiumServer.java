package com.appium.facebook.appiumtest;

import java.io.IOException;

public class AppiumServer {
	
	public static Process process;
	public static String APPIUMSERVERSTART="C:\\Program Files (x86)\\Appium\\node.exe C:\\Program Files (x86)\\Appium\\node_modules\\appium\\bin\\appium.js";
	
	public static void startAppiumServer() throws IOException, InterruptedException{
		Runtime  runtime=Runtime.getRuntime();
		process=runtime.exec(APPIUMSERVERSTART);
		Thread.sleep(5000);
		if(process!=null)
			System.out.println("Appium Server Started...");
	}
	
	
	public static void stopAppiumServer(){
			if(process!=null){
			process.destroy();
		}
	}
	


}
