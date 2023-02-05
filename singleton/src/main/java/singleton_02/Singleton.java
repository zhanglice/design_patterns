package singleton_02;

//线程不安全，可以使用synchronized
//但是最好使用01中的方法，初始化一个私有对象

public class Singleton {
    private static  Singleton singleton = null;
    private Singleton(){ }
    public  static Singleton getSingleton(){
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
