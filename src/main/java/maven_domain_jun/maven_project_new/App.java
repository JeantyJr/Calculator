package maven_domain_jun.maven_project_new;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class App
{
    public static void main( String[] args ) throws JsonProcessingException
    {
    	
    	Calculator cal = new Calculator();
    	
    	int result = cal.multiplicate(4, 6);
    	int add1 = cal.add(3, 5);
    	
       
    	ObjectMapper mapper = new ObjectMapper();
    	User user = new User (14, "Alex");
    	
    	String jsonInput = "{\"id\": 2, \"name\":\"Sam\"}";
    	
    	User userFromJson = mapper.readValue(jsonInput, User.class);
    	
    	String json = mapper.writeValueAsString(user);
    	
    	System.out.println(json);
    	
    	 System.out.println("-----------");
    	 
    	 System.out.println(userFromJson);
    	 
    	 System.out.println(add1);
    }
}
