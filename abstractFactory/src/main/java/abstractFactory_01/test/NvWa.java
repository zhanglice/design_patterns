package abstractFactory_01.test;

import abstractFactory_01.abstractHuman.Human;
import abstractFactory_01.factory.FemaleFactory;
import abstractFactory_01.factory.MaleFactory;

public class NvWa {
    public static void main(String[] args) {
        MaleFactory maleFactory = new MaleFactory();
        FemaleFactory femaleFactory = new FemaleFactory();

        Human maleYellowHuman = maleFactory.creatYellowHuman();
        Human femaleYellowHuman = femaleFactory.creatYellowHuman();

        femaleYellowHuman.getColor();
        femaleYellowHuman.talk();
        femaleYellowHuman.getSex();

        maleYellowHuman.getSex();
    }
}
