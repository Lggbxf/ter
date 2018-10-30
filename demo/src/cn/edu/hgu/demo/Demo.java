package cn.edu.hgu.demo;

import net.sf.json.JSONObject;

public class Demo {

	public static void main(String[] args) {
		/*Json json = new Json();
		String str = json.JsonArray();
		System.out.println("Demo.class:");
		System.out.println(str);*/
     
		JSONObject obj = getJSONOject();
		System.out.println(obj.toString());
		String str = obj.toString();
		String resolve = resolveJson(str);
		
	}
	
	
	public static JSONObject getJSONOject(){
		 JSONObject obj = new JSONObject();
	        obj.put("name", "John");
	        obj.put("sex", "male");
	        obj.put("age", 22);
	        obj.put("is_student", true);
	        obj.put("hobbies", new String[] {"hiking", "swimming"});
	        //调用toString()方法可直接将其内容打印出来
	        //System.out.println(obj.toString());
	        return obj;
	}
	
	public static String resolveJson(String jsonString){
		/*JSONObject jsonObject = new JSONObject(jsonString);
        JSONObject personObject = jsonObject.getJSONObject("person");
        person.setId(personObject.getInt("id"));
        person.setName(personObject.getString("name"));
        person.setAddress(personObject.getString("address"));*/
		return "";
	}
}
