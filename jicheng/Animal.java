package jicheng;

/**
 * Created by yldbg on 2017/9/12.
 * 定义一个“动物”类，内部定义了“吃”、“运动”、带参数和不带参数的构造方法。
 */
public class Animal {
    public boolean live = true;
    public String skin = "";
    public void eat() {
        System.out.println("动物需要吃食物");
    }
    public void move() {
        System.out.println("动物会运动");
    }
    public Animal() {}
    public Animal(String strSkin) {
        skin = strSkin;
    }
}
