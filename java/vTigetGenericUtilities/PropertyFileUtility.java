package vTigetGenericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * This class consist of generic methods related to property file
 * @author Admin
 *
 */
public class PropertyFileUtility {
	/**
	 * This method will read data from property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String ReadDataFromProperyFile(String key) throws IOException
	{
		FileInputStream fis= new FileInputStream(AutoConstant.Propertyfilepath);
		Properties p= new 	Properties();
		p.load(fis);
		return p.getProperty(key);
	}

}
