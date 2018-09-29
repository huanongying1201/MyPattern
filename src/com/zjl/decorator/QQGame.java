package com.zjl.decorator;

public class QQGame extends Icon {
   
    public QQGame(Card card) {
    	super(card);
    }

	@Override
	public void showIcon() {
		QQGameIcon();
		super.showIcon();
	}

	private void QQGameIcon() {
		System.out.println("QQ游戏");
	}
}