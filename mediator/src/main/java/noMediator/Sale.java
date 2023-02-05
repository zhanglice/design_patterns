package noMediator;

import java.util.Random;

public class Sale {

    public void sellIBMComputer(int number){
        Stock stock = new Stock();
        Purchase purchase = new Purchase();

        if(stock.getStockNumber()<number){ //库存告急
            purchase.buyIBMComputer(number);
        }
        System.out.println("销售电脑"+number+"台");
        stock.decrease(number);
    }

    public int getSaleStatus(){
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);
        System.out.println("电脑销售情况:"+saleStatus);
        return saleStatus;
    }

    public void offSale(){
        Stock stock = new Stock();
        System.out.println("打折促销电脑"+stock.getStockNumber()+"台！");
    }
}
