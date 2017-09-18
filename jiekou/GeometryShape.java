package jiekou;

/**
 * Created by j00406054 on 2017/9/15.
 * 定义一个计算圆的面积、周长以及画圆的接口。
 */
public interface GeometryShape {
    final float PI = 3.14159f;
    float getArea(float r);
    float getCircumference(float r);
    void draw();
}
