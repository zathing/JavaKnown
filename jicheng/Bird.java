package jicheng;

/**
 * Created by yldbg on 2017/9/12.
 * 定义一个继承自“动物”类的“鸟”类，重写“运动”方法。
 */
public class Bird extends Animal {
    public String skin = "羽毛";
    public void move() {
        System.out.println("鸟会飞翔");
    }
}
