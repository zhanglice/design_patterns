package abstractFactory_01.abstractHuman;

public abstract class AbstractWhiteHuman implements Human {
    public void getColor() {
        System.out.println("白人白皮肤！");
    }
    public void talk() {
        System.out.println("白人说单字节");
    }
}
