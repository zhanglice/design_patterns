package factory_01.factory;

import factory_01.human.Human;

//抽象工厂
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}
