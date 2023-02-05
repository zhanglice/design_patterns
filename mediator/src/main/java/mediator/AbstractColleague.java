package mediator;

public abstract class AbstractColleague {
    protected AbstractMediator mediator;

    //同事类都需要和中介交互，用中介构造
    public AbstractColleague(AbstractMediator mediator){
        this.mediator = mediator;
    }
}
