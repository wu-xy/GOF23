package com.wzx.bridge;

public abstract class Computer {
	Brand brand;

	public Computer(Brand brand) {
		super();
		this.brand = brand;
	}
	
	abstract void sale();	
	
}
class TaiShi extends Computer{
	public TaiShi(Brand brand) {
		super(brand);

	}
	@Override
	void sale() {
		System.out.println("̨ʽ");
		brand.sale();
		
	}	
}
class BiJiBen extends Computer{
	public BiJiBen(Brand brand) {
		super(brand);

	}
	@Override
	void sale() {
		System.out.println("�ʼǱ�");
		brand.sale();
		
	}	
}
