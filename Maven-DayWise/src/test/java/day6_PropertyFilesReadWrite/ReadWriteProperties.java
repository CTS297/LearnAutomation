package day6_PropertyFilesReadWrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class ReadWriteProperties {
	
	
	static Properties prop = new Properties();
	
//	static String ProjectPath = System.getProperty("user.dir");
//	public static void main(String[] args) {
//		
//		String b = ReadProperties();
//		System.out.println(b);
//		
//		WriteProperties();
//	}

	public static String ReadProperties(String FilePath, String Property) 
	{		
		String Browser="";
		
		try {
			InputStream inStream = new FileInputStream(FilePath);
			prop.load(inStream);
			Browser = prop.getProperty(Property);
		}
		catch (Exception e) {
			System.out.println("File not found");
		}
		return Browser;
	}
	
	public static void WriteProperties(String FilePath, String PropertyName, String Value)
	{
		 
		try {
		OutputStream output = new FileOutputStream(FilePath);
		prop.setProperty(PropertyName, Value);
		prop.store(output, null);
		}
		catch (Exception e) {
			System.out.println("File not found");
		}
	}
}
