package staticProxy.proxyGamePlay;

public class GamePlayProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;
    public GamePlayProxy(String name) {
        try {
            gamePlayer = new GamePlayer(this, name);
        }catch (Exception e){
            e.printStackTrace();
        }
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
    public void before(){
        System.out.println("代理收费！");
    }
}
