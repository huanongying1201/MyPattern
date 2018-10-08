package com.zjl.decorator;

/**
 * 
 * 描述:测试类
 * @author  zhoujialin
 * @created 2018年9月30日 上午10:22:19
 * @since   v1.0.0
 */
public class Main {
	
	public static void main(String[] args) {
		//lilei点亮的qq图标
    	Card liLei = new User("lilei");
        liLei = new Lol(liLei);
        liLei = new Qzone(liLei);
        liLei.showIcon();
        
        System.out.println("");
        
        //hanmei点亮的qq图标
        Card hanMei = new User("hanmei");
        hanMei = new QQGame(hanMei);
        hanMei = new Qzone(hanMei);
        hanMei = new Lol(hanMei);
        hanMei = new Cf(hanMei);
        hanMei.showIcon();
	}

}
