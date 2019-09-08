package com.wzx.templateMethod;
/**
 * 模板方法
 * 一般使用在步骤比较固定，只有某个环节有所变化
 * 像去银行办理业务，挂号排队，服务评价等步骤都是比较固定的
 * 只有办理的业务有所不同
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
