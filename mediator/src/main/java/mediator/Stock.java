package mediator;

public class Stock extends AbstractColleague{
    public Stock(AbstractMediator mediator) {
        super(mediator);
    }

    private static int COMPUTER_NUMBER = 100;

    public void increase(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER + number;
        System.out.println("电脑库存：" + COMPUTER_NUMBER);
    }

    public void decrease(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
        System.out.println("电脑库存：" + COMPUTER_NUMBER);
    }

    public int getStockNumber(){
        return COMPUTER_NUMBER;
    }

    public void clearStock(){
        System.out.println("需要清理电脑"+COMPUTER_NUMBER+"台!");
        super.mediator.execute("stock.clear");
    }
}
