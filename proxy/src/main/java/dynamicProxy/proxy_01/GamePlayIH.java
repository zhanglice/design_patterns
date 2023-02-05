package dynamicProxy.proxy_01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayIH implements InvocationHandler {
//    Class cls = null;   //被代理者

    Object obj;  //被代理实例
    public GamePlayIH(Object obj){  //我要代理谁
        this.obj = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //用来测试,同时也是AOP面向横切面编程的原理
        System.out.println("调用了invoke！");

        return  method.invoke(this.obj, args);
    }
}
