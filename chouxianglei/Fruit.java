package chouxianglei;

/**
 * Created by yldbg on 2017/9/12.
 * 定义一个抽象类（abstract），内部定义一个“收获”抽象方法。
 */
abstract class Fruit {
    public String color;
    public Fruit() {
        color = "绿色";
    }
    public abstract void harvest();
}
