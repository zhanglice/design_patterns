package noMediator;

public class Client {
    public static void main(String[] args) {
        System.out.println("================采购电脑================");
        Purchase purchase = new Purchase();
        purchase.buyIBMComputer(100);
        System.out.println("\n================销售电脑================");
        Sale sale = new Sale();
        sale.sellIBMComputer(1);
        System.out.println("\n================清理库存================");
        Stock stock = new Stock();
        stock.clearStock();
    }
}
