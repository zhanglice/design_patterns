package build_01;

public class Client {
    //生产一个产品的两个型号
    public static void main(String[] args) {
        Director director = new Director();

        Product aProduct = director.getAProduct();
        MiniProduct bMiniProduct = director.getBMiniProduct();

        aProduct.doSomething();
        bMiniProduct.doSomething();
    }
}
