package staticProxy.gamePlay;

public interface IGamePlayer {
    //登录
    void login(String user, String password);
    //升级
    void upgrade();
    //杀怪
    void killBoss();
}
