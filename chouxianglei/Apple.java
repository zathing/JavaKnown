package chouxianglei;

/**
 * Created by yldbg on 2017/9/15.
 * 定义一个“苹果”类，集成Fruit抽象类并重写“收获”方法。
 */
public class Apple extends Fruit {
    public void harvest() {
        System.out.println("苹果已经收获！");
    }
}
