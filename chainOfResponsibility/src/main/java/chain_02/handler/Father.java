package chain_02.handler;

import chain_02.women.IWomen;

public class Father extends Handler{
    public Father() {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("=====父亲！=====");
        System.out.println(women.getRequest());
    }
}
