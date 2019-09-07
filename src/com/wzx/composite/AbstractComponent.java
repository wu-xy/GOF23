package com.wzx.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象组件
 * @author wzx
 *
 */
public interface AbstractComponent {
	void killVirus();
}

class InmageFloder implements AbstractComponent{
	
	String name;
	
	public InmageFloder(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("图片文件:"+name+"----正在杀毒");
	}
	
}

class TxtFloder implements AbstractComponent{
	
	String name;
	
	public TxtFloder(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("文本文件:"+name+"----正在杀毒");
	}
	
}
class VideoFloder implements AbstractComponent{
	
	String name;
	
	public VideoFloder(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("视频文件:"+name+"----正在杀毒");
	}
	
}



class Floder implements AbstractComponent{
	
	List<AbstractComponent> list=new ArrayList<AbstractComponent>();
	String name;
			
	public Floder(String name) {
		super();
		this.name = name;
	}
	
	public void add(AbstractComponent ac) {
		list.add(ac);
	}
	public void remove(AbstractComponent ac) {
		list.remove(ac);
	}
	public AbstractComponent get(int index) {
		return list.get(index);
	}


	@Override
	public void killVirus() {
		System.out.println("文件夹:"+name+"----正在杀毒");
		for (AbstractComponent abstractComponent : list) {
			abstractComponent.killVirus();
		}
		
	}
	
}
