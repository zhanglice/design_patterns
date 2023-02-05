package build_01;

public class ConcreteProduct extends Builder{
    private final Product product =  new Product();
    private final MiniProduct miniProduct = new MiniProduct();
    @Override
    public void setAPart() {
        //产品逻辑设置
        System.out.println("先油门，再换挡！");
    }

    @Override
    public void setBPart() {
        System.out.println("直接换挡！");
    }

    @Override
    public Product buildProduct() {
        return product;
    }

    @Override
    public MiniProduct buildMiniProduct() {
        return miniProduct;
    }
}
