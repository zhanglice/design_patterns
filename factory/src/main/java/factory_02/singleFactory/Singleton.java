package factory_02.singleFactory;

public class Singleton {
    //私有构造器，无法new一个对象，通过反射获取
    private Singleton(){}

    public void doSomething(){
        //业务处理
    }
}
