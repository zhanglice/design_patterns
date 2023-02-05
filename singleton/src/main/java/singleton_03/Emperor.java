package singleton_03;

import java.util.ArrayList;
import java.util.Random;

//多个单例生成
public class Emperor {
    private static final int maxNumOfEmperor = 2;

    private static final ArrayList<String> nameList = new ArrayList<>();

//    private Emperor(){}
    private Emperor(String name){
        nameList.add(name);
    }

    private static final ArrayList<Emperor> emperorList= new ArrayList<>();

    private static int countNumOfEmperor = 0;

    static {
        for (int i=0; i<maxNumOfEmperor; i++){
            emperorList.add(new Emperor("皇帝"+(i+1)));
        }
    }

    public static Emperor getInstance(){
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return emperorList.get(countNumOfEmperor);
    }

    public static void say(){
        System.out.println(nameList.get(countNumOfEmperor));
    }

}
