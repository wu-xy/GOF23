package com.wzx.iterator;

import java.util.ArrayList;
import java.util.List;

public class Mylist {
	List<Object> list=new ArrayList<Object>();

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}
	
	public void  add(Object obj) {
		list.add(obj);
	}
	public void  remove(Object obj) {
		list.remove(obj);
	}
	
	public MyIterator createMyIterator() {
		return new MyIteratorImpl();
		
	}
	
	
	private class MyIteratorImpl implements MyIterator{
		int cursor;		//сн╠Й
		@Override
		public boolean isFirst() {			
			return cursor==0?true:false;
		}

		@Override
		public boolean isLast() {
			// TODO Auto-generated method stub
			return cursor==list.size()-1?true:false;
		}

		@Override
		public boolean hasNext() {			
			return cursor<list.size()?true:false;
		}

		@Override
		public Object next() {
			if(cursor<list.size()) {
				int i=cursor;
				cursor++;
				return list.get(i);
			}
			return null;
		}
		
	}
	
}
