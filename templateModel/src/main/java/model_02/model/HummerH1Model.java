package model_02.model;

public class HummerH1Model extends HummerModel {
    private boolean alarmFlag = true;
    @Override
    protected void start() {
        System.out.println("悍马H1启动");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H1停止");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H1鸣笛");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H1引擎轰轰轰。。。");
    }

    protected boolean isAlarm(){
        return alarmFlag;
    }

    public void setAlarm(boolean isAlarm){
        this.alarmFlag = isAlarm;
    }
}
