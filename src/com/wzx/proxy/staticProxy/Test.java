package com.wzx.proxy.staticProxy;

/**
 * 静态代理模式
 * 真实对象，例如明星，只负责唱歌就行了
 * 其他工作交给代理对象，例如经纪人
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		RealStar realStar=new RealStar();
		ProxyStar proxyStar= new ProxyStar(realStar);
		proxyStar.confer();
		proxyStar.signContract();
		proxyStar.bookTickct();
		proxyStar.sing();
	}
}
