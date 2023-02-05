package facade_01;
/* 封装手段
 * 优点：减少依赖
 *      灵活
 *      安全
 * 缺点：不符合开闭原则
 */

public class Facade {
    private ClassA a = new ClassA();
    private ClassB b = new ClassB();
    private ClassC c = new ClassC();
    public void methodA(){
        this.a.doSomethingA();
    }
    public void methodB(){
        this.b.doSomethingB();
    }
    public void methodC(){
        this.c.doSomethingC();
    }
}
