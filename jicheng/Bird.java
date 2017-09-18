package jicheng;

/**
 * Created by yldbg on 2017/9/12.
 * 定义一个继承自“动物”类的“鸟”类，隐藏了父类的成员变量skin，覆盖了成员方法move()。
 */
public class Bird extends Animal {
    public String skin = "羽毛";
    public void move() {
        System.out.println("鸟会飞翔");
    }
}
