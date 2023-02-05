package staticProxy.gamePlay;

public class Client {
    public static void main(String[] args) {
        GamePlayer player = new GamePlayer("张三");
        player.login("zhangsan","password");
        player.killBoss();
        player.upgrade();
    }
}
