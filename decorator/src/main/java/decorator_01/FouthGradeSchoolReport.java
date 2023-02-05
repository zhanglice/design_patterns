package decorator_01;

public class FouthGradeSchoolReport extends SchoolReport{
    @Override
    public void report() {
        System.out.println("尊敬的家长：");
        System.out.println("  ......");
        System.out.println("  语文62 数学65 英语98");
        System.out.println("  ......");
        System.out.println("            家长签字：    ");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签字为："+name);
    }
}
