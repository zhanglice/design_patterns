package model_02.model;

public abstract class HummerModel {
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();

    protected boolean isAlarm(){
        return true;
    }
    public final void run(){
        this.start();
        this.engineBoom();

        if(this.isAlarm()){  //控制响铃
            this.alarm();
        }

        this.stop();
    }
}
