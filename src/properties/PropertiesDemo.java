package properties;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesDemo {
	
	public static void main(String[] args) {
		try {
			//create an object of FileInputStream class by providing the path of the file
			FileInputStream fis = new FileInputStream(".\\config.properties");
			//create an object of Properties class
			Properties prop = new Properties();
			//load file from fis to prop
			prop.load(fis);
			//read the property from the file using getProperty(String key)
			String url =prop.getProperty("url");
			String username = prop.getProperty("username");
			String password = prop.getProperty("password", "sunshine");
			String browserName = prop.getProperty("browser", "chrome");
			System.out.println(url+"\n"+username+"\n"+password+"\n"+browserName);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
