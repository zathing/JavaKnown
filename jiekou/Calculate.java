package jiekou;

/**
 * Created by yldbg on 2017/9/15.
 * 定义一个计算圆的秒级和周长的接口。
 */
public interface Calculate {
    final float PI = 3.14159f;
    float getArea(float r);
    float getCircumference(float r);
}
