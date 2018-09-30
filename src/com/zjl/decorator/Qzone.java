package com.zjl.decorator;

/**
 * 
 * 描述:QQ空间图标
 * @author  zhoujialin
 * @created 2018年9月30日 上午10:23:55
 * @since   v1.0.0
 */
public class Qzone extends Icon {
   
    public Qzone(IIcon icon) {
    	super(icon);
    }

	@Override
	public void showIcon() {
		icon.showIcon();
		qzoneIcon();
	}

	private void qzoneIcon() {
		System.out.println("QQ空间");
	}
}