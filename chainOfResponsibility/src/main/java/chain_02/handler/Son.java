package chain_02.handler;

import chain_02.women.IWomen;

public class Son extends Handler{
    public Son() {
        super(Handler.SON_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("=====儿子=====");
        System.out.println(women.getRequest());
    }
}
