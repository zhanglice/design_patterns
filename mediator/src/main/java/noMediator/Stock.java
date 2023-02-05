package noMediator;

public class Stock {
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
        Purchase purchase = new Purchase();
        Sale sale = new Sale();

        System.out.println("需要清理库存：" + COMPUTER_NUMBER);
        sale.offSale();
        purchase.refuseBuy();
    }
}
