package duotai.fugai;

/**
 * Created by yldbg on 2017/9/18.
 * 定义一个Zoo类，实例化Dog、Cat、Cattle对象并分别调用cry()方法。
 */
public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("执行 dog.cry() 语句时的输出结果：");
        dog.cry();
        Cat cat = new Cat();
        System.out.println("执行 cat.cry() 语句时的输出结果：");
        cat.cry();
        Cattle cattle = new Cattle();
        System.out.println("执行 cattle.cry() 语句时的输出结果");
        cattle.cry();
    }
}
