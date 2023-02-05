package strategy_02_enum;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        String[] cal = {"22","+","33"};
        int a = Integer.parseInt(cal[0]);
        int b = Integer.parseInt(cal[2]);
        String symbol = cal[1];

        System.out.println("输入参数：" + Arrays.toString(cal));
        System.out.println("==================Calculator计算======================");
        Calculator calculator = new Calculator();
        System.out.println("运算结果："+a+symbol+b+"="+calculator.exec(a,b,symbol));
        System.out.println("==================EnumCalculator计算======================");

        System.out.println("运算结果："+a+EnumCalculator.SUB.getValue()+b+"="+EnumCalculator.SUB.exec(a,b));
    }
}
