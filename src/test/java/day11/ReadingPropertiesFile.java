package day11;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {

		// Location of properties
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testData\\configure.properties");

		// Loading properties file
		Properties propertiesobj = new Properties();
		propertiesobj.load(file);

		// Reading data from properties file
		String url = propertiesobj.getProperty("appurl");
		String email = propertiesobj.getProperty("email");
		String pwd = propertiesobj.getProperty("password");
		String oird = propertiesobj.getProperty("orderid");
		String custid = propertiesobj.getProperty("customerid");

		System.out.println(url + " " + email + " " + pwd + " " + oird + " " + custid);

		// reading all the keys from property file
		// Set<String> keys= propertiesobj.stringPropertyNames();
		// System.out.println(keys);

		// Or

		Set<Object> keys = propertiesobj.keySet();
		System.out.println(keys);

		// reading all the values from property file
		Collection<Object> values = propertiesobj.values();
		System.out.println(values);

	}

}
