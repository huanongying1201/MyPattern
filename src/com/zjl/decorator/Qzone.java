package com.zjl.decorator;

public class Qzone extends Icon {
   
    public Qzone(Card card) {
    	super(card);
    }

	@Override
	public void showIcon() {
		qzoneIcon();
		super.showIcon();
	}

	private void qzoneIcon() {
		System.out.println("QQ空间");
	}
}