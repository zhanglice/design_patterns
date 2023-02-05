package singleton_03;

public class Minister {
    public static void main(String[] args) {
        int misterNum = 5;
        for (int i=0; i<misterNum; ++i){
            Emperor emperor = Emperor.getInstance();
            System.out.print("第"+(i+1)+"个大臣拜见：");
            emperor.say();
        }
    }
}
