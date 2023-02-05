package decorator_02;

import decorator_01.SchoolReport;

public class HighScoreDecorator extends Decorator{

    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    private void reportHighScore(){
        System.out.println("这次考试语文最高：75，数学最高：85，体育最高：100");
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
