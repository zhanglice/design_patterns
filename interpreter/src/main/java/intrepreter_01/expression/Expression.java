package intrepreter_01.expression;

import java.util.HashMap;

public abstract class Expression {
    //key是公式中的参数，value是数值
    public abstract int interpreter(HashMap<String,Integer> var);
}
