package com.wzx.flyweight;

/**
 * ��Ԫģʽ
 * ��ʱ�任�ռ䣬���ⴴ�������ظ��Ķ���
 * �ڲ�״̬����������ɫ�����ⲿ״̬����������λ�ã�
 * @author Administrator
 *
 */
public class Tset {
	public static void main(String[] args) {
		ChessFlyWeight chess = ChessFlyWeightFactory.getChess("��ɫ");
		ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("��ɫ");
		System.out.println(chess);
		System.out.println(chess2);
		chess.dsiplay(new Position(10, 10));
		chess2.dsiplay(new Position(20, 20));
	}
}
