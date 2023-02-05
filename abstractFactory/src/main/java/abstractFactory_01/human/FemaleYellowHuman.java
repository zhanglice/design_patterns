package abstractFactory_01.human;

import abstractFactory_01.abstractHuman.AbstractYellowHuman;

public class FemaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("黄种女性！");
    }
}
