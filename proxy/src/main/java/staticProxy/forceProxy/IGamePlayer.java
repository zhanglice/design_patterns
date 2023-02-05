package staticProxy.forceProxy;

public interface IGamePlayer {
    void login(String user, String password);
    void upgrade();
    void killBoss();
    IGamePlayer getProxy();
}
