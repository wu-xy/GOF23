package com.wzx.templateMethod;
/**
 * ģ�巽��
 * һ��ʹ���ڲ���ȽϹ̶���ֻ��ĳ�����������仯
 * ��ȥ���а���ҵ�񣬹Һ��Ŷӣ��������۵Ȳ��趼�ǱȽϹ̶���
 * ֻ�а����ҵ��������ͬ
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		BankTemplateMethod saveMoney = new SaveMoney();
		saveMoney.process();
		BankTemplateMethod getMoney = new GetMoney();
		getMoney.process();
	}
}
