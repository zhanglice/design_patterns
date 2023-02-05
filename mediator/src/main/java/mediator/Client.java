package mediator;

public class Client {
    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();

        System.out.println("================采购电脑================");
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMComputer(100);
        System.out.println("\n================销售电脑================");
        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(3);
        System.out.println("\n================清理库存================");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
