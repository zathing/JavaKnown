package jiekou;

/**
 * Created by j00406054 on 2017/9/15.
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

