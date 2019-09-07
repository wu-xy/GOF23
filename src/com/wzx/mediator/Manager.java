package com.wzx.mediator;

import java.util.HashMap;
import java.util.Map;

public class Manager {
	Map<String, DepartMent> map =new HashMap<String, DepartMent>();
	
	public void register(String name,DepartMent d) {
		map.put(name, d);
	}
	public void command(String name) {
		map.get(name).outAction();
	}
	
}
