package duotai.fugai;

/**
 * Created by yldbg on 2017/9/18.
 * 定义一个Cat类继承Animal类，覆盖cry()方法。
 */
public class Cat extends Animal {
    public Cat() {}
    public void cry() {
        System.out.println("猫发出'喵喵喵'声");
    }
}
