package com.wzx.bridge;

/**
 * ге╫сдёй╫
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
