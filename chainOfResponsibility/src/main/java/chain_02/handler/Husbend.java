package chain_02.handler;

import chain_02.women.IWomen;

public class Husbend extends Handler{
    public Husbend() {
        super(Handler.HUSBEND_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("=====丈夫=====");
        System.out.println(women.getRequest());
    }
}
