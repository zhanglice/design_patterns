package build_01;

public class Director {
    private Builder builder = new ConcreteProduct();
    public Product getAProduct(){
        builder.setAPart();
        return builder.buildProduct();
    }

    public Product getBProduct(){
        builder.setBPart();
        return builder.buildProduct();
    }

    public MiniProduct getAMiniProduct(){
        builder.setAPart();
        return builder.buildMiniProduct();
    }
    public MiniProduct getBMiniProduct(){
        builder.setBPart();
        return builder.buildMiniProduct();
    }
}
