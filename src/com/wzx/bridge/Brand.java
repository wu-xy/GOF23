package com.wzx.bridge;

public interface Brand {
	void sale();
}

class Dell implements Brand{
	@Override
	public void sale() {
		System.out.println("������");
		
	}	
}
class ShenZhou implements Brand{
	@Override
	public void sale() {
		System.out.println("������");
		
	}	
}
class LianXiang implements Brand{
	@Override
	public void sale() {
		System.out.println("������");
		
	}	
}