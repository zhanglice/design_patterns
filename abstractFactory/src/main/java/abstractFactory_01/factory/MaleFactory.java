package abstractFactory_01.factory;

import abstractFactory_01.abstractHuman.Human;
import abstractFactory_01.human.MaleYellowHuman;

public class MaleFactory implements HumanFactory{
    @Override
    public Human creatYellowHuman() {
        return new MaleYellowHuman();
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
