package com.zjl.decorator;

public class Cf extends Icon {
   
    public Cf(Card card) {
    	super(card);
    }

	@Override
	public void showIcon() {
		cfIcon();
		super.showIcon();
	}

	private void cfIcon() {
		System.out.println("CF");
	}
}