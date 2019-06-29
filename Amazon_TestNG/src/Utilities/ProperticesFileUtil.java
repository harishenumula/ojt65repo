package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ProperticesFileUtil {
	public static String getProperty(String key) throws Throwable, Throwable {
		Properties config_propertices = new Properties();
		config_propertices
				.load(new FileInputStream("E:\\Selenium\\Amazon_TestNG\\PropertiesFile\\Environment.properties"));

		return config_propertices.getProperty(key);
	}
}
