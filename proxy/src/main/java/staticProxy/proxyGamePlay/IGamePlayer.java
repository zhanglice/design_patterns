package staticProxy.proxyGamePlay;

public interface IGamePlayer {
    //登录
    public void login(String user, String password);
    //升级
    public void upgrade();
    //杀怪
    public void killBoss();
}
