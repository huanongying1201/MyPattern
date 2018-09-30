package com.zjl.decorator;

/**
 * 
 * 描述:CF图标
 * @author  zhoujialin
 * @created 2018年9月30日 上午10:23:19
 * @since   v1.0.0
 */
public class Cf extends Icon {
   
    public Cf(Card card) {
    	super(card);
    }

	@Override
	public void showIcon() {
		card.showIcon();
		cfIcon();
	}

	private void cfIcon() {
		System.out.println("CF");
	}
}