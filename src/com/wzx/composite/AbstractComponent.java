package com.wzx.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * �������
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
		System.out.println("ͼƬ�ļ�:"+name+"----����ɱ��");
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
		System.out.println("�ı��ļ�:"+name+"----����ɱ��");
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
		System.out.println("��Ƶ�ļ�:"+name+"----����ɱ��");
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
		System.out.println("�ļ���:"+name+"----����ɱ��");
		for (AbstractComponent abstractComponent : list) {
			abstractComponent.killVirus();
		}
		
	}
	
}
