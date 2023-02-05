package decorator_02;

import decorator_01.FouthGradeSchoolReport;
import decorator_01.SchoolReport;

public class Father {
    public static void main(String[] args) {
        SchoolReport sr;

        sr = new FouthGradeSchoolReport();
        sr.report();
        sr.sign("张三");
        System.out.println("==========================================");
        sr = new HighScoreDecorator(sr);    //一次装饰
        sr = new SortDecorator(sr);         //二次装饰

        sr.report();
        sr.sign("张三");
    }
}
