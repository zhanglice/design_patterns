package chain_01.handler;

import chain_01.women.IWomen;

public class Father implements IHandler{
    @Override
    public void HandleMessage(IWomen women) {
        System.out.println("女儿的请示是："+women.getRequest());
        System.out.println("父亲回答：同意");
    }
}
