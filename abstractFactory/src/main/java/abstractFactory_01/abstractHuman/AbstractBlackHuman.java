package abstractFactory_01.abstractHuman;

public abstract class AbstractBlackHuman implements Human {
    public void getColor() {
        System.out.println("黑人黑皮肤!");
    }

    public void talk() {
        System.out.println("黑人会说话，一般听不懂!");
    }
}
