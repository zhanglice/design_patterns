package abstractFactory_01.abstractHuman;

public abstract class AbstractYellowHuman implements Human {
    public void getColor() {
        System.out.println("黄皮肤！");
    }

    public void talk() {
        System.out.println("黄种人说双字节！");
    }
}
