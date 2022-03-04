package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesReader {

	private static Properties configFile;

	static {

		try {
			// giving a file path
			String filePath = Constants.CONFIGURATION_FILEPATH;
			// open a path to read file
			FileInputStream input = new FileInputStream(filePath);
			// init object
			configFile = new Properties();
			// load all files and put files to configFile
			configFile.load(input);
			//close connection
			input.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	//method to call the file 
	public static String getProperty(String keyName) {
		return configFile.getProperty(keyName);
	}
	
	
	
	
}
