package restAssured;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class testBase {

    public Properties prop;
	public int RESP_STATUS_CODE_200 = 200;
	public int RESP_STATUS_CODE_201 = 201;
	public int RESP_STATUS_CODE_400 = 400;
	public int RESP_STATUS_CODE_500 = 500;
	public int RESP_STATUS_CODE_203 = 203;
	
	public testBase() {
		try {
			prop = new Properties();
			FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/config.properties");
			prop.load(file);
			} catch (IOException e) {
			} 
		
				
	}


}
