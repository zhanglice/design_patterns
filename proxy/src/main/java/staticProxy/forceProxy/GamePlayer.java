package staticProxy.forceProxy;

public class GamePlayer implements IGamePlayer{
    private String name = "";
    private IGamePlayer proxy = null;  //指定代理

    @Override
    public void login(String user, String password) {
        if(isProxy()){
            System.out.println("登录成功！");
        }else {
            System.out.println("使用指定的代理访问！");
        }
    }

    @Override
    public void upgrade() {
        if(isProxy()){
            System.out.println("升级！");
        }else {
            System.out.println("使用指定的代理访问！");
        }
    }

    @Override
    public void killBoss() {
        if(isProxy()){
            System.out.println("打boss！");
        }else {
            System.out.println("使用指定的代理访问！");
        }
    }

    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayProxy(this);
        return this.proxy;
    }

    private boolean isProxy(){
//        if(this.proxy == null){
//            return false;
//        }else {
//            return true;
//        }
        return this.proxy != null;
    }

}
