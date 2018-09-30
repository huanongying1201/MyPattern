package com.zjl.decorator;

/**
 * 
 * 描述:点亮的图标
 * @author  zhoujialin
 * @created 2018年9月30日 上午10:22:42
 * @since   v1.0.0
 */
public abstract class Icon implements Card {
	
    protected Card card;
    
    public Icon(Card card) {
        this.card = card;
    }
}
