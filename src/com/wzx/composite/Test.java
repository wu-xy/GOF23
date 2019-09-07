package com.wzx.composite;

/**
 * 组合模式
 * 定义一个抽象组件接口
 * 叶子组件和容器组件都实现这个接口
 * 容器组件包含叶子组件
 * @author Administrator
 *
 */
public class Test {
			
	public static void main(String[] args) {
		Floder f1=new Floder("我的收藏");
		AbstractComponent f2=new InmageFloder("图片.jpg");
		AbstractComponent f3=new TxtFloder("文本.TXT");
		AbstractComponent f4=new VideoFloder("视频.mp4");
		f1.add(f2);
		f1.add(f3);
		f1.add(f4);
		
		Floder f11=new Floder("我的视频");
		AbstractComponent f5=new VideoFloder("视频1.mp4");
		AbstractComponent f6=new VideoFloder("视频2.mp4");
		f11.add(f5);
		f11.add(f6);
		f1.add(f11);
		
		f1.killVirus();
		f2.killVirus();
		
	}
}
