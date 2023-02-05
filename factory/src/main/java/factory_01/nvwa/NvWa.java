package factory_01.nvwa;

import factory_01.factory.HumanFactory;
import factory_01.human.BlackHuman;
import factory_01.human.WhiteHuman;

public class NvWa {
    public static void main(String[] args) {
        HumanFactory factory = new HumanFactory();

        System.out.println("创建一波白人");
        WhiteHuman whiteHuman = factory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        System.out.println("创建黑人");
        BlackHuman blackHuman = factory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
    }
}
