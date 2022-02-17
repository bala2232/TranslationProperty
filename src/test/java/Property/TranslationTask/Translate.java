package Property.TranslationTask;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.Map.Entry;

public class Translate {
	public static void main(String[] args) throws IOException {
		Properties prop=new Properties();  
		FileInputStream propFile = new FileInputStream("C:\\Users\\Luffy\\eclipse-workspace\\TranslationTask\\Translation.properties");
		//FileInputStream propFile = new FileInputStream("C:\\Users\\Luffy\\eclipse-workspace\\TranslationTask\\target\\trans.properties");

		prop.load(propFile); 
	    
		
		/*Map<String, String> map = new HashMap<String, String>();
		for(Entry<Object,Object> entry: prop.entrySet()) {
			map.put((String)entry.getKey(), (String)entry.getValue());
			System.out.println((String)entry.getKey()+ " : "+ (String)entry.getValue());
		}
		*/
	    Set<Object> keysInFile = prop.keySet();
		for(Object datas: keysInFile) {
			String keyDatas =(String)datas;
			System.out.println(keyDatas);
		}
		
		
	}

}
