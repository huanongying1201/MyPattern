package com.zjl.decorator;

/**
 * 
 * 描述:CF图标
 * @author  zhoujialin
 * @created 2018年9月30日 上午10:23:19
 * @since   v1.0.0
 */
public class Cf extends Icon {
   
    public Cf(IIcon icon) {
    	super(icon);
    }

	@Override
	public void showIcon() {
		icon.showIcon();
		cfIcon();
	}

	private void cfIcon() {
		System.out.println("CF");
	}
}