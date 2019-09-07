package com.wzx.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ChessFlyWeightFactory {
	public static Map<String, ChessFlyWeight> map=new HashMap<String, ChessFlyWeight>();
	public static ChessFlyWeight getChess(String color) {		
		if(map.get(color)==null) {			//���ж��������Ƿ����
			map.put(color, new Chess(color));
		}
		
		return map.get(color);
		
	}
}
