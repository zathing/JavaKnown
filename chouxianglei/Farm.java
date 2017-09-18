package chouxianglei;

/**
 * Created by yldbg on 2017/9/15.
 * 定义一个“农场”类，实例化一个苹果和橘子对象并调用其“收获”方法。
 */
public class Farm {
    public static void main(String[] args) {
        System.out.println("调用Apple类的harvest()方法的结果：");
        Fruit apple = new Apple();
        apple.harvest();
        System.out.println("调用Orange类的harvest()方法的结果：");
        Orange orange = new Orange();
        orange.harvest();
    }
}
