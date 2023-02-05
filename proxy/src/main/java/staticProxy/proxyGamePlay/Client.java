package staticProxy.proxyGamePlay;

public class Client {
    public static void main(String[] args) {
        GamePlayProxy proxy = new GamePlayProxy("张三");

        proxy.before();
        proxy.login("zhangsan","password");
        proxy.upgrade();
        proxy.killBoss();
    }
}
