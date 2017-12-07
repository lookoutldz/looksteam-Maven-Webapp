package looko.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

@Controller
@RequestMapping("/Test")
public class TestController 
{
	@RequestMapping("/jsArray")
	public String test_jsArray(HttpServletRequest request, HttpServletResponse response)
	{
		JsonObject root = new JsonObject();
		JsonArray array = new JsonArray();
		
		JsonObject object = new JsonObject();
		for (int i = 0; i < 7; i++) 
		{
			array.add(i);
		}
		root.add("root", array);
		System.out.println(root.toString());
		
		return null;
	}
}
