package com.hashmapcheck;

import java.util.HashMap;

public class HashMapCheck {
	public static void main(String[] args) {
		HashMap<Employee, String> hm= new HashMap<Employee, String>();	
		Employee e1= new Employee(1,"Vishu");
		Employee e2= new Employee(1,"Vishu");
		hm.put(e1, "Vishu");
		hm.put(e2, "Vishu");
		System.out.println(hm.size());
	}
}
