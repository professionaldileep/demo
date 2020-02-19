package com.app.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckException {
public boolean yesh(int[] a,int b) {
	boolean flag=false;
	for(int i=0;i<a.length;i+=2) {
		if(a[i]==b) {
			flag=true;
		}else {
			flag=false;
			break;
		}
	}
	
	return flag;
	
}

	public void m1() {
		Arrays.asList(1,2,3,4).forEach(System.out::print);
		
	}
		public static void main(String[] args) {
			
			Map<String, Integer> map= new HashMap<>();
			map.put("dileep", 20);
			map.put("Yesh", 20);
			map.put("Rajesh", 20);
			for(Map.Entry<String, Integer> a:map.entrySet()) {
				System.out.println(a.getKey()+a.getValue());
			}
			
			map.forEach((k,v)->System.out.println(k+v));
			CheckException c=new CheckException();
			c.m1();
		/*
		 * System.out.println(c.yesh(a, b)); System.out.println(c.yesh(e, b));
		 * System.out.println(c.yesh(d, b));
		 */
			
			
		}
}
