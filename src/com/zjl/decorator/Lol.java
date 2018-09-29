package com.zjl.decorator;

public class Lol extends Icon {
   
    public Lol(Card card) {
    	super(card);
    }

	@Override
	public void showIcon() {
		lolIcon();
		super.showIcon();
	}

	private void lolIcon() {
		System.out.println("LOL");
	}
}