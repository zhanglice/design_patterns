package staticProxy.forceProxy;

public class GamePlayProxy implements IGamePlayer{
    private IGamePlayer gamePlayer = null;

    public GamePlayProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user,password);
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public IGamePlayer getProxy() {
        return this;
    }
}
