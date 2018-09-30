package com.zjl.decorator;

import org.junit.jupiter.api.Test;

/**
 * 
 * 描述:测试类
 * @author  zhoujialin
 * @created 2018年9月30日 上午10:22:19
 * @since   v1.0.0
 */
public class MyTest {
    
    @Test
    public void test() {
    	//lilei点亮的qq图标
        IIcon liLei = new Card("lilei");
        liLei = new Lol(liLei);
        liLei = new Qzone(liLei);
        liLei.showIcon();
        
        System.out.println("");
        
        //hanmei点亮的qq图标
        IIcon hanMei = new Card("hanmei");
        hanMei = new QQGame(hanMei);
        hanMei = new Qzone(hanMei);
        hanMei = new Lol(hanMei);
        hanMei = new Cf(hanMei);
        hanMei.showIcon();
    }

}
