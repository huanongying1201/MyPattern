package com.zjl.decorator;

/**
 * 
 * 描述:QQ游戏图标
 * @author  zhoujialin
 * @created 2018年9月30日 上午10:24:14
 * @since   v1.0.0
 */
public class QQGame extends Icon {
   
    public QQGame(Card card) {
    	super(card);
    }

	@Override
	public void showIcon() {
		card.showIcon();
		QQGameIcon();
	}

	private void QQGameIcon() {
		System.out.println("QQ游戏");
	}
}