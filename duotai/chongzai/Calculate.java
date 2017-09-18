package duotai.chongzai;

/**
 * Created by yldbg on 2017/9/12.
 * 通过“方法的重载”实现多态，参数个数/参数类型不同。
 * getArea：通过参数个数不同，分别实现求圆和长方形的面积
 * draw：通过参数类型不同，分别实现画n个任意形状的图形和画一个x图形。
 */
public class Calculate {
    final float PI = 3.14159f;
    public float getArea(float r) {
        float area = PI*r*r;
        return area;
    }
    public float getArea(float I, float w) {
        float area = I*w;
        return area;
    }
    public void draw(int num) {
        System.out.println("画"+num+"个任意形状的图形");
    }
    public void draw(String shape) {
        System.out.println("画一个"+shape);
    }
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        float I = 20;
        float w = 30;
        float areaRectangle = calculate.getArea(I, w);
        System.out.println("长方形面积为："+areaRectangle);
        float r = 7;
        float areaCirc = calculate.getArea(r);
        System.out.println("圆形面积为："+areaCirc);
        int num = 7;
        String shape = "三角形";
        calculate.draw(num);
        calculate.draw(shape);
    }
}
