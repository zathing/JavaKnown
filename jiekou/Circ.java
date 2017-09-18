package jiekou;

/**
 * Created by yldbg on 2017/9/15.
 * 接口实现：计算圆的面积、周长，并画一个圆形。
 */
public class Circ implements Calculate, GeometryShape {
    public float getArea(float r) {
        float area = Calculate.PI*r*r;
        return area;
    }
    public float getCircumference(float r) {
        float circumference = 2*Calculate.PI*r;
        return circumference;
    }
    public void draw() {
        System.out.println("画一个图形！");
    }
    public static void main(String[] args) {
        Circ circ = new Circ();
        float r = 7;
        float area = circ.getArea(r);
        System.out.println("圆的面积为："+area);
        float circumference = circ.getCircumference(r);
        System.out.println("圆的周长为："+circumference);
        circ.draw();
    }
}
