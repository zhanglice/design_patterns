package abstractFactory_01.factory;

import abstractFactory_01.abstractHuman.Human;

public interface HumanFactory {
    //鉴于情况相同只实现第一个
    Human creatYellowHuman();

    Human creatWhiteHuman();

    Human creatBlackHuman();
}
