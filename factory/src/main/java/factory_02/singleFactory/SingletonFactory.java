package factory_02.singleFactory;

import java.lang.reflect.Constructor;

//工厂创建单例模式
public class SingletonFactory {
    private static final Singleton singleton;
    static {
        try {
            Class cl = Class.forName(Singleton.class.getName());
            Constructor constructor = cl.getDeclaredConstructor();
            constructor.setAccessible(true);
            singleton = (Singleton)constructor.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Singleton getSingleton(){
        return singleton;
    }
}
