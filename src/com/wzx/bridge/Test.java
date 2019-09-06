package com.wzx.bridge;

/**
 * 桥接模式
 * 取消多层继承结构
 * @author Administrator
 *
 */
public class Test {
			
	public static void main(String[] args) {
		Computer c1=new TaiShi(new LianXiang()) ;
		Computer c2=new BiJiBen(new ShenZhou()) ;
		c1.sale();
		c2.sale();
	}
}
