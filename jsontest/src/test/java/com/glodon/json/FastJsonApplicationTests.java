package com.glodon.json;

import com.alibaba.fastjson.JSON;
import com.glodon.json.bean.Person;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Ignore
public class FastJsonApplicationTests {

	private List<Person> listOfPersons = new ArrayList<Person>();

	@Before
	public void setUp() {
		listOfPersons.add(new Person(15, "John Doe", "John",new Date()));
		listOfPersons.add(new Person(20, "Janette Doe", "Janette",new Date()));
	}
	@Test
	public void testJson() {
		String jsonOutput= JSON.toJSONString(listOfPersons);
		System.out.println(jsonOutput);
	}

}
