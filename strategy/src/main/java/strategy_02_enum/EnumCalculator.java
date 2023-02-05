package strategy_02_enum;

public enum EnumCalculator {
    ADD("+"){
        public int exec(int a, int b){
            return a+b;
        }
    },               //注意是","号!!!
    SUB("-"){
        public int exec(int a, int b){
            return a-b;
        }
    };              //";"号

    public abstract int exec(int a, int b);  //枚举变量必须实现该方法

    private final String value;

    EnumCalculator(String value) { //构造方法默认私有
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
