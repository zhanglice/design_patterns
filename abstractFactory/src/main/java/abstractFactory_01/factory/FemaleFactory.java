package abstractFactory_01.factory;

import abstractFactory_01.abstractHuman.Human;
import abstractFactory_01.human.FemaleYellowHuman;

public class FemaleFactory implements HumanFactory{
    @Override
    public Human creatYellowHuman() {
        return new FemaleYellowHuman();
    }

    @Override
    public Human creatWhiteHuman() {
        return null;
    }

    @Override
    public Human creatBlackHuman() {
        return null;
    }
}
