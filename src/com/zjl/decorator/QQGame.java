package com.zjl.decorator;

/**
 * 
 * 描述:QQ游戏图标
 * @author  zhoujialin
 * @created 2018年9月30日 上午10:24:14
 * @since   v1.0.0
 */
public class QQGame extends Icon {
   
    public QQGame(IIcon icon) {
    	super(icon);
    }

	@Override
	public void showIcon() {
		icon.showIcon();
		QQGameIcon();
	}

	private void QQGameIcon() {
		System.out.println("QQ游戏");
	}
}