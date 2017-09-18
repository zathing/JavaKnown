package chouxianglei;

/**
 * Created by yldbg on 2017/9/15.
 * 定义一个“橘子”类，集成Fruit抽象类并重写“收获”方法。
 */
public class Orange extends Fruit {
    public void harvest() {
        System.out.println("橘子已经收获！");
    }
}
