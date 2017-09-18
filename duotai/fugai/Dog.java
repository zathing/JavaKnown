package duotai.fugai;

/**
 * Created by yldbg on 2017/9/18.
 * 定义一个Dog类继承自Animal类，覆盖cry()方法。
 */
public class Dog extends Animal {
    public Dog() {}
    public void cry() {
        System.out.println("狗发出'汪汪汪'声！");
    }
}
