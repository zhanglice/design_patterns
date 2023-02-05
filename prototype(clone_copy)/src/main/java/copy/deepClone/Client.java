package copy.deepClone;

public class Client {
    public static void main(String[] args) {
        Thing thing = new Thing();
        thing.setValue("protoThing");

        Thing cloneThing = (Thing) thing.clone();
        cloneThing.setValue("cloneThing");

        System.out.println(thing.getValue());
        System.out.println(cloneThing.getValue());
    }
}
