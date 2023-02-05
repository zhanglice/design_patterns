package decorator_01;

public class SugerFouthGradeSchoolReport extends FouthGradeSchoolReport{
    private void reportHighScore(){
        System.out.println("这次考试语文最高：75，数学最高：85，体育最高：100");
    }
    private void reportSort(){
        System.out.println("我的排名38");
    }
    @Override
    public void report(){
        this.reportHighScore();
        super.report();
        this.reportSort();
    }
}
