package com.wzx.factory.abstractfactory;

public interface CarFactory {		//汽车工厂
	LunTai luntai();	//轮胎
	YiQing yinqing();	//引擎
	Sea zuoyi();	//座椅
}
