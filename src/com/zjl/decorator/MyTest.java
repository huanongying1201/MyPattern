package com.zjl.decorator;

import org.junit.jupiter.api.Test;

public class MyTest {
    
    @Test
    public void test() {
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
