package build_01;

public abstract class Builder {
    //设置产品型号（内部实现不同）
    public abstract void setAPart();
    public abstract void setBPart();
    //建造两类产品
    public abstract Product buildProduct();
    public abstract MiniProduct buildMiniProduct();
}
