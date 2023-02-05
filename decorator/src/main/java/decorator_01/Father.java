package decorator_01;

public class Father {
    public static void main(String[] args) {
        SchoolReport sr = new SugerFouthGradeSchoolReport();
        sr.report();
        sr.sign("张三");
    }
}
