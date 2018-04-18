package other.test.write_file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class WriteAfiFile {

	public static final String systemPath = "C://testfolder//";
	
	public static void main(String[] args) throws IOException {
		String filename = "testter";
		String fileType = "AFI";
		String fileContent = createContent();
		createFile(filename,fileType,fileContent);
	}

	public static String createContent() {
		String content = "";
		Object object = createGlobalObject();
		Object object2 = createLineOneOccupationObject();
		content += createContentByObject("GLOBAL",content,object);
		content += createContentByObject("Life 1 Occupation",content,object2);
		return content;
	}
	
	public static String createContentByObject(String headerName,String content,Object object){
		Map<String, Object> map = retrieveObjectMap(object);		
		Set<Entry<String, Object>> set = map.entrySet();
		Iterator<Entry<String, Object>> iterator = set.iterator();
		content = "[" + headerName + "]" + System.getProperty("line.separator");
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			content += mentry.getKey() + "=" + mentry.getValue() + System.getProperty("line.separator");
		}
		return content;
	}
	
	public static Map<String, Object> retrieveObjectMap(Object object){
		Map<String, Object> map = new TreeMap<String, Object>();
		for(Field field : object.getClass().getDeclaredFields()){
			field.setAccessible(true);
			String name = field.getName();
			try {
				Object value = field.get(object);
				map.put(name, value);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		return map;
	}
	
	public static Object createGlobalObject(){
		Global object = new Global();
		object.setDataSource('d');
		object.setProposalDate(12);
		object.setProposalNumber("asdasd");
		object.setSubmissionType(true);
		return object;
	}
	
	public static Object createLineOneOccupationObject(){
		LifeOneOccupations object = new LifeOneOccupations();
		object.setNatofBiz("asdasd");
		object.setOccupation("TestOcuupation");
		object.setRatingByAgent(23);
		return object;
	}

	private static void createFile(String fileName, String fileType ,String fileContent) throws IOException

	{
		String fileFullPath =  systemPath + fileName + "." + fileType;
		File file = new File(fileFullPath);

		// Create the file
		if (file.createNewFile()) {
			System.out.println("File is created!");
		} else {
			System.out.println("File already exists.");
		}

		// Write Content
		FileWriter writer = new FileWriter(file);
		writer.write(fileContent);
		writer.close();

	}

}
