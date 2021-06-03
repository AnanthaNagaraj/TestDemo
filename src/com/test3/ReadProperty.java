package com.test3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
public static void main(String[] args) throws IOException {
	Properties pro = new Properties();
	FileInputStream fis = new FileInputStream("C:\\Anantha\\Eclipse\\July102020\\SelSample\\data.properties");
	pro.load(fis);
	
	System.out.println(pro.getProperty("browser"));
	System.out.println(pro.getProperty("url"));
	
	pro.setProperty("browser", "Safari");
	System.out.println(pro.getProperty("browser"));
	FileOutputStream fos = new FileOutputStream("C:\\Anantha\\Eclipse\\July102020\\SelSample\\data.properties");
	pro.store(fos, null);
}
}
