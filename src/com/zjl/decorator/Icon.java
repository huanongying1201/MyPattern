package com.zjl.decorator;

public abstract class Icon implements Card {
    protected Card card;
    
    public Icon(Card card) {
        this.card = card;
    }

	@Override
	public void showIcon() {
		if(card != null) {
			card.showIcon();
		}	
	}
}
