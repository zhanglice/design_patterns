package abstractFactory_01.human;

import abstractFactory_01.abstractHuman.AbstractYellowHuman;

public class MaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("黄种男性！");
    }
}
