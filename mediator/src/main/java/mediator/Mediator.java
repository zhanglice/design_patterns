package mediator;

public class Mediator extends AbstractMediator{
    @Override
    public void execute(String str, Object... Objects) {
        if(str.equals("purchase.buy")){
            this.buyComputer((Integer)Objects[0]);
        }else if(str.equals("sale.sell")){
            this.sellComputer((Integer)Objects[0]);
        }else if(str.equals("sale.offSell")){
            this.offSell();
        }else if (str.equals("stock.clear")){
            this.clearStock();
        }
    }

    private void buyComputer(int number) {
        int saleStatus = super.sale.getSaleStatus();
        if (saleStatus > 80) {
            System.out.println("购买" + number + "台电脑！");
            stock.increase(number);
        } else {
            int buyNumber = number / 2;
            System.out.println("购买" + buyNumber + "台电脑！");
            stock.increase(buyNumber);
        }
    }
    private void sellComputer(int number){
        if(super.stock.getStockNumber()<number){
            super.purchase.buyIBMComputer(number);
        }
        super.stock.decrease(number);
    }
    private void offSell(){
        System.out.println("打折销售"+stock.getStockNumber()+"台电脑");
    }
    private void clearStock(){
        super.sale.offSale();
        super.purchase.refuseBuy();
    }

}
