package chain_01.handler;

import chain_01.women.IWomen;

public class Husbend implements IHandler{
    @Override
    public void HandleMessage(IWomen women) {
        System.out.println("妻子的请示是："+women.getRequest());
        System.out.println("丈夫回答：同意");
    }
}
