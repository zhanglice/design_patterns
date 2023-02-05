package mediator;

public class Purchase extends AbstractColleague{
    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }
    public void buyIBMComputer(int number){
       super.mediator.execute("purchase.buy",number);
    }
    public void refuseBuy(){
        System.out.println("不买电脑！");
    }
}
