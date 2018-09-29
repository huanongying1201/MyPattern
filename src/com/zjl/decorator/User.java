package com.zjl.decorator;

public class User implements Card {

	public User(String nickName) {
		System.out.println(nickName + "点亮了以下图标：");
	}

	@Override
	public void showIcon() {
		// TODO
	}

}
