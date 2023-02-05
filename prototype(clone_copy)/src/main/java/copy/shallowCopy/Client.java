package copy.shallowCopy;

/**
 * 对于对象内部数组和引用对象都不做拷贝
 * 指向原址，叫做浅拷贝
 */
public class Client {
    public static void main(String[] args) {
        Thing thing = new Thing();
        thing.setValue("protoThing");

        Thing cloneThing = (Thing) thing.clone();
        cloneThing.setValue("cloneThing");

        System.out.println(thing.getValue());
    }
}
