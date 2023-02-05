package staticProxy.forceProxy;

public class Client {
    public static void main(String[] args) {
        //必须使用get方法获得指定代理！
        GamePlayer player = new GamePlayer();
        IGamePlayer proxy = player.getProxy();

        proxy.login("zhangsan","password");
        proxy.upgrade();
        proxy.killBoss();
    }
}
