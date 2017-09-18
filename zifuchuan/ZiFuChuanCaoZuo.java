package zifuchuan;

/**
 * Created by yldbg on 2017/9/18.
 * 字符串常见操作
 */
import java.util.Arrays;
import java.util.Date;
public class ZiFuChuanCaoZuo {
    public static void main(String[] args){
        String str1 = "RuanJianDaDao";
        String str2 = "ruanjiandadao";
        //=================比较字符串==================
        //equals() 与 equalsIgnoreCase()
        System.out.println(str1.equals(str2));  //false
        System.out.println(str1.equalsIgnoreCase(str2));    //true
        //regionMatches()
        System.out.println(str1.regionMatches(0, str2, 0, 13)); //false
        System.out.println(str1.regionMatches(true, 0, str2, 0, 13));   //true
        //startsWith() 与 endsWith()
        System.out.println(str1.startsWith("Ruan"));    //true
        System.out.println(str1.endsWith("dao"));   //false
        //compareTo() 与 compareToIgnoreCase()
        System.out.println(str1.compareTo(str2));   //负数
        System.out.println(str2.compareTo(str1));   //正数
        System.out.println(str1.compareToIgnoreCase(str2)); //0
        //==================字符串大小写转换=============
        //toLowerCase() 与 toUpperCase()
        System.out.println(str1.toLowerCase()); //ruanjiandadao
        System.out.println(str1.toUpperCase()); //RUANJIANDADAO
        //==================查找字符串===================
        //indexOf() 与 lastIndexOf()
        System.out.println(str1.indexOf("Jian"));   //4
        System.out.println(str1.lastIndexOf("a"));  //11
        System.out.println(str2.indexOf("da", 9));  //10
        //注：lastIndexOf第二个索引参数，表示的是查找的截止索引，比如下面的1就表示只在前2个字符中查找an
        System.out.println(str2.lastIndexOf("an", 1));  //-1
        System.out.println(str2.lastIndexOf("an", 10)); //6
        //==================获取字符串的子串==============
        System.out.println(str1.substring(4, 8));   //Jian
        //==================替换字符串中的内容============
        System.out.println(str1.replace("RuanJian", "Software"));   //SoftwareDaDao
        //==================去除字符串两端的空格==========
        String str3 = "  blank ";
        System.out.println(str3.trim()); //blank
        //==================分割字符串====================
        //支持正则表达式，例如 | 表示或
        String str4 = "软件大道！101号。华为。南京研究所";
        String[] info = str4.split("！|。");
        System.out.println(Arrays.asList(info));    //[软件大道, 101号, 华为, 南京研究所]
        //==================格式化字符串==================
        String str5 = String.format("Hi,%s", "华为"); //Hi,华为
        System.out.println(str5);
        System.out.printf("字母a的大写是：%c%n", 'A'); //字母a的大写是：A
        System.out.printf("3>7 的结果是：%b%n", 3>7);    //3>7 的结果是：false
        System.out.printf("100的一半是：%d%n", 100/2);   //100的一半是：50
        System.out.printf("100的十六进制是：%x%n", 100);   //100的十六进制是：64
        System.out.printf("100的八进制是：%o%n", 100);   //100的八进制是：144
        System.out.printf("50元的书打8.5折扣是：%f元%n", 50*0.85);   //50元的书打8.5折扣是：42.500000元
        System.out.printf("上面价格的指数表示是：%e%n", 50*0.85);  //上面价格的指数表示是：4.250000e+01
        System.out.printf("上面的折扣是：%d%%%n", 85); //上面的折扣是：85%
        System.out.printf("上面的散列码是：%h%n", 'A'); //上面的散列码是：41
        //==================日期时间字符串=================
        Date date = new Date();
        System.out.printf("全部日期和时间信息：%tc%n", date); //全部日期和时间信息：星期一 九月 18 16:15:48 GMT+08:00 2017
        System.out.printf("年-月-日格式：%tF%n", date);   //年-月-日格式：2017-09-18
        System.out.printf("月/日/年格式：%tD%n", date);   //月/日/年格式：09/18/17
        System.out.printf("HH:MM:SS PM格式（12小时制）：%tr%n", date);  //HH:MM:SS PM格式（12小时制）：04:15:48 下午
        System.out.printf("HH:MM:SS格式（24小时制）：%tT%n", date); //HH:MM:SS格式（24小时制）：16:15:48
        System.out.printf("HH:MM格式（24小时制）：%tR", date);  //HH:MM格式（24小时制）：16:15
    }
}
