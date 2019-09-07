package com.wzx.flyweight;

/**
 * 享元模式
 * 用时间换空间，避免创建大量重复的对象
 * 内部状态共享（棋子颜色），外部状态不共享（棋子位置）
 * @author Administrator
 *
 */
public class Tset {
	public static void main(String[] args) {
		ChessFlyWeight chess = ChessFlyWeightFactory.getChess("黑色");
		ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("黑色");
		System.out.println(chess);
		System.out.println(chess2);
		chess.dsiplay(new Position(10, 10));
		chess2.dsiplay(new Position(20, 20));
	}
}
