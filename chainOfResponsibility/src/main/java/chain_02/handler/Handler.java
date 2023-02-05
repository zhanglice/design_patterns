package chain_02.handler;

import chain_02.women.IWomen;

public abstract class Handler {
    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBEND_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;

    private int level = 0;
    private Handler nextHandler;

    public Handler(int level){
        this.level = level;
    }

    public final void HandlerMessage(IWomen women){
        if(women.getType() == this.level){
            this.response(women);
        }else {
            if (this.nextHandler != null){
                this.nextHandler.HandlerMessage(women);  //递归调用！
            }else {
                System.out.println("---无人可以请示！孤寡之人---");
            }
        }
    }
    public void setNext(Handler handler){
        this.nextHandler = handler;
    }
    protected abstract void response(IWomen women);

}
