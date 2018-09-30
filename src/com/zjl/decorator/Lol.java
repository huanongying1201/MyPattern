package com.zjl.decorator;

/**
 * 
 * 描述:LOL图标
 * @author  zhoujialin
 * @created 2018年9月30日 上午10:24:28
 * @since   v1.0.0
 */
public class Lol extends Icon {
   
    public Lol(IIcon icon) {
    	super(icon);
    }

	@Override
	public void showIcon() {
		icon.showIcon();
		lolIcon();
	}

	private void lolIcon() {
		System.out.println("LOL");
	}
}