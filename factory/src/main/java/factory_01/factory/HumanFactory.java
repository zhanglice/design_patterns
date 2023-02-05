package factory_01.factory;

import factory_01.human.Human;

public class HumanFactory extends AbstractHumanFactory{
    public <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try{
            human = (T)Class.forName(c.getName()).getDeclaredConstructor().newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return (T) human;
    }
}
