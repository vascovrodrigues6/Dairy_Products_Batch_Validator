package org.engcia.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONObject;

public class JsonReader {
	
	public JsonReader() {}
	
	public static String readJsonFileTagValueString(String filename, String tagname) {
        JSONParser parser = new JSONParser();
        try {     
            Object obj = parser.parse(new FileReader(filename));
            JSONObject jsonObject =  (JSONObject) obj;
            String result = (String) jsonObject.get(tagname);
            return result;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
	}
	
	public static Float readJsonFileTagValueFloat(String filename, String tagname) {
		JSONParser parser = new JSONParser();
        try {     
            Object obj = parser.parse(new FileReader(filename));
            JSONObject jsonObject =  (JSONObject) obj;
            String resultString = (String) jsonObject.get(tagname);
            return Float.valueOf(resultString);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
	}

}
