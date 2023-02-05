package singleton_01;

/**
 * 使用场景：
 *  1、要求生成唯一序列号
 *  2、要求一个共享访问点或者共享数据
 *  3、创建一个对象对于资源消耗过多，或防止对资源的多重占用(读写等)
 */

public class Emperor {
    private static final Emperor emperor = new Emperor();
    private Emperor(){}

    public static Emperor getInstance(){
        return emperor;
    }

    public static void say(){
        System.out.println("我就是皇帝xxx...");
    }

}
