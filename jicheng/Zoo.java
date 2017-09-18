package jicheng;

/**
 * Created by yldbg on 2017/9/12.
 * 定义一个“动物园”类，实例化一个“鸟”的对象并调用其“吃”和“运动”的方法。
 */
public class Zoo {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.eat();
        bird.move();
        System.out.println("鸟有："+bird.skin);
    }
}
