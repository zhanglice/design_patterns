package chain_02.client;

import chain_02.handler.Father;
import chain_02.handler.Husbend;
import chain_02.handler.Son;
import chain_02.women.IWomen;
import chain_02.women.Women;

import java.util.ArrayList;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<>();
        for(int i=0; i<5; ++i){
            arrayList.add(new Women(rand.nextInt(4),"我要去逛街"));
        }
        Father father = new Father();
        Son son = new Son();
        Husbend husbend = new Husbend();

        father.setNext(husbend);
        husbend.setNext(son);

        for (IWomen women : arrayList) {
            father.HandlerMessage(women);
        }
    }
}
