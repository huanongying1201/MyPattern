<p>饰者模式类图：<br />（1）抽象构件（Component）角色：给出一个抽象接口，以规范准备接收附加责任的对象，对应Card<br />（2）具体构件（Concrete Component）角色：定义一个将要接收附加责任的类，对应User<br />（3）装饰（Decorator）角色：持有一个构件（Component）对象的实例，并实现一个与抽象构件接口一致的接口，对应Icon<br />（4）具体装饰（Concrete Decorator）角色：负责给构件对象添加上附加的责任，对应Cf、Lol、QQGame、Qzone<br />![Image text](https://github.com/huanongying1201/MyPattern/blob/master/img/%E8%A3%85%E9%A5%B0%E8%80%85%E6%A8%A1%E5%BC%8F%E7%B1%BB%E5%9B%BE.png?raw=true)</p>