package com.zjl.decorator;

/**
 * 
 * 描述:用户资料卡
 * @author  zhoujialin
 * @created 2018年9月30日 上午10:23:41
 * @since   v1.0.0
 */
public class Card implements IIcon {

	public Card(String nickName) {
		System.out.println(nickName + "点亮了以下图标：");
	}

	@Override
	public void showIcon() {
		// Do nothing.
	}

}
