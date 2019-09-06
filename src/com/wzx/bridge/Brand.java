package com.wzx.bridge;

public interface Brand {
	void sale();
}

class Dell implements Brand{
	@Override
	public void sale() {
		System.out.println("´÷¶ûÅÆ");
		
	}	
}
class ShenZhou implements Brand{
	@Override
	public void sale() {
		System.out.println("ÉñÖÛÅÆ");
		
	}	
}
class LianXiang implements Brand{
	@Override
	public void sale() {
		System.out.println("ÁªÏëÅÆ");
		
	}	
}