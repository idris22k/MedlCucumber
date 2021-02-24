package com.utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport1 {

	public static void generateJVMReport(String js) {

		File reportDir = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Report");
		Configuration config = new Configuration(reportDir, "Amazon");
		config.addClassifications("AppName","Amazon");
		config.addClassifications("platformName","Android");
		config.addClassifications("platformVersion","8.1.0");
		
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(js);
		
		ReportBuilder builder = new ReportBuilder(jsonFiles, config);
		builder.generateReports();
		
		
}
	
	
	
}
