package org.sele.task;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Listt {
	public static void main(String[] args) {
	//1D witjout header or 1D list
//	List<String> l1 = new LinkedList<>();
//	l1.add("karthick");
//	l1.add("1234567890");
//	
//	List<String> l2 = new LinkedList<>();
//	l2.add("kiki@gmail.com");
//	l2.add("2345jhg");
//	
//	List<String> l3 = new LinkedList<>();
//	l3.add("kiki@gmail.com");
//	l3.add("2345jhg");
//	
//	Listt ll = new Listt();
//	ll.hello(l1, l2, l3);
//	
//	}
//	public void hello(List<String> l1, List<String> l2, List<String> l3) {
//		List<List<String>> li = new LinkedList<>();
//		li.add(l1);
//		li.add(l2);
//		li.add(l3);
//		System.out.println(li.get(0).get(0));
//		List<String> kar = li.get(0);
//		String string = kar.get(0);
//		System.out.println(string);
		
		
		
		//1d with header or 1d map
		Map<String,String> mp1 = new LinkedHashMap<>();
		mp1.put("gmail", "karthick@gmail.com");
		mp1.put("password", "789664897");
		
		Map<String,String> mp2 = new LinkedHashMap<>();
		mp2.put("gmail", "kiki@gmail.com");
		mp2.put("password", "shldghghjk");
		
		Map<String,String> mp3 = new LinkedHashMap<>();
		mp3.put("gmail", "karthi@gmail.com");
		mp3.put("password", "lghfjl8570");
		
		List<Map<String, String>> li = new LinkedList<>();
		li.add(mp1);
		li.add(mp2);
		li.add(mp3);
		
		System.out.println(li.get(1).get("gmail"));
        System.out.println(li.get(1).get("password")); 
		
		
	}
	

}
