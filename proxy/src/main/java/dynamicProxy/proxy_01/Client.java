package dynamicProxy.proxy_01;

import staticProxy.gamePlay.GamePlayer;
import staticProxy.gamePlay.IGamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

//调用staticProxy.gamePlay
public class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");  //玩家定义
        InvocationHandler handler = new GamePlayIH(player); //定义一个handler

        ClassLoader cl = player.getClass().getClassLoader();    //获取class loader
        /**
         * public static Object newProxyInstance(
         *     ClassLoader loader,
         *     @NotNull Class<?>[] interfaces,
         *     @NotNull java.lang.reflect.InvocationHandler h )
         */
        //生成代理者
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[]{IGamePlayer.class}, handler);
        //game测试
        proxy.login("zhangsan","password");
        proxy.killBoss();
        proxy.upgrade();
    }
}
