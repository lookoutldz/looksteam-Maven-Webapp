package looko.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class Test_Json {

	@Test
	public void test1()
	{
		JsonObject root = new JsonObject();
		JsonArray array = new JsonArray();
		
		//JsonObject object = new JsonObject();
		for (int i = 0; i < 7; i++) 
		{
			array.add(i);
			
		}
		root.add("root", array);
		System.out.println(array.toString());
	}
}
