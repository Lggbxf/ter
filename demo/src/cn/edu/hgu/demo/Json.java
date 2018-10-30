package cn.edu.hgu.demo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

public class Json {
	
	/*public Json(){
		JsonArray();
	}*/
	/*public static void main(String[] args) {
		JsonArray();
	}*/

	public String JsonArray() {
		JSONObject jsonOne = new JSONObject();
		jsonOne.put("name", "kewen");
		jsonOne.put("age", "24");
		JSONObject jsonTwo = new JSONObject();
		jsonTwo.put("hobbit", "Doto");
		jsonTwo.put("hobbit2", "wow");
		JSONObject jsonThree = new JSONObject();
		jsonThree.putAll(jsonOne);
		jsonThree.putAll(jsonTwo);
		System.out.println(jsonThree.toString());
		return jsonThree.toString();
	}

}
