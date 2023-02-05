package noMediator;

public class Purchase {
    public void buyIBMComputer(int number){
        Stock stock = new Stock();
        Sale sale = new Sale();

        int saleStates = sale.getSaleStatus();
        if(saleStates>80){  //销售情况良好！
            System.out.println("购买"+number+"台电脑！");
            stock.increase(number);
        }else{
            int buyNumber = number/2;
            System.out.println("购买"+buyNumber+"台电脑！");
            stock.increase(buyNumber);
        }
    }

    public void refuseBuy(){
        System.out.println("不买电脑！");
    }
}
