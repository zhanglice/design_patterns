package strategy_01;

public class ZhaoYun {
    //赵云实施计策
    public static void main(String[] args) {
        Context context1;
        Context context2;
        Context context3;

        context1 = new Context(new BackDoor());
        context2 = new Context(new GivenGreenLight());
        context3 = new Context(new BlockEnemy());

        System.out.println("-------刚到吴国，拆第一个锦囊-------");
        context1.operate();

        System.out.println("-------乐不思蜀，拆第二个锦囊-------");
        context2.operate();

        System.out.println("-------后有追兵，拆第一个锦囊-------");
        context3.operate();
    }
}
