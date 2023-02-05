package chain_01.handler;

import chain_01.women.IWomen;

public class Son implements IHandler{
    @Override
    public void HandleMessage(IWomen women) {
        System.out.println("母亲的请示是："+women.getRequest());
        System.out.println("儿子回答：同意");
    }
}
