package account;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Properties;

public class PropertyDemo {
private static void saveProperties(Properties p,String fileName) {
	try {
		OutputStream propsFile=new FileOutputStream(fileName);
		p.store(propsFile, "Properties File to the test Application");
		propsFile.close();
	}
	catch(IOException e) {
		System.out.println(e);
	}
}
private static Properties loadProperties(String filename) {
	Properties tempProp=new Properties();
	try {
		InputStream propsFile=new FileInputStream(filename);
		tempProp.load(propsFile);
propsFile.close();
	}
	catch(IOException e) {
		System.out.println(e);
	}
	return tempProp;
}
private static Properties createDefaultProperties() {
	Properties tempProp =new Properties();
	tempProp.setProperty("url", "jdbc:oracle:thin:@10.219.34.3:1521:orcl");
	tempProp.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
	tempProp.setProperty("username", "trg704");
	tempProp.setProperty("password","training704");
	return tempProp;
}
private static void printProperties(Properties p,String s) {
	p.list(System.out);
}
public static void main(String a[]) {
final String PROFILE="file.properties";
Properties myprop;
Properties myNewProp;

myprop=createDefaultProperties();
printProperties(myprop,"newly created properties");
saveProperties(myprop,PROFILE);

//myNewProp=loadProperties(PROFILE);
//printProperties(myNewProp,"loaded Properties");

//myNewProp=alterProperties(myprop);
//printProperties(myNewProp,"after altering");
//	saveProperties(myNewProp,PROFILE);

Properties myNewProp1=loadProperties(PROFILE);

	Enumeration<String> enPRops=(Enumeration<String>) myNewProp1.propertyNames();
	String key="";
	String param[];
	param=new String[4];
	int i=0;
	while(enPRops.hasMoreElements()) {
		key=  enPRops.nextElement();
	 System.out.println(key);	
	param[i]= myNewProp1.getProperty(key);
	System.out.println(" "+key+"->"+myNewProp1.getProperty(key));
	i++;
	}
	
}
}
