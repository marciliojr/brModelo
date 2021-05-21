package util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {
	
	
	
	public static Properties getProp() throws IOException
	{
		Properties props = new Properties();
		FileInputStream file = new FileInputStream("configuracao.properties");
		props.load(file);
		return props;
	}
	
	public static Properties setProp(String propertie) {
		Properties props = new Properties();
		try {
			FileInputStream in = new FileInputStream("configuracao.properties");;
			props.load(in);
			in.close();

			FileOutputStream out = new FileOutputStream("configuracao.properties");
			props.setProperty("lookandfeel", propertie);
			props.store(out, null);
			out.close();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return props;

	}


}
