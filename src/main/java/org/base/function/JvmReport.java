package org.base.function;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	public static void generateJvmReport(String json) {
		File loc = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JvmReport");
        Configuration con = new Configuration(loc, "Amazon");
        
        List<String> jsonFiles = new LinkedList<>();
        jsonFiles.add(json);
        ReportBuilder r = new ReportBuilder(jsonFiles, con);
        r.generateReports();
	}

}
