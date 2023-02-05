package model_01.model;

public abstract class HummerModel {
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();

    public void run(){
        this.start();
        this.engineBoom();
        this.alarm();
        this.stop();
    }
}
