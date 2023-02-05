package chain_01.client;

import chain_01.handler.Father;
import chain_01.handler.Husbend;
import chain_01.handler.Son;
import chain_01.women.IWomen;
import chain_01.women.Women;

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

        for(IWomen women : arrayList){
            if(women.getType() == 1){
                System.out.println("==========女儿->父亲===========");
                father.HandleMessage(women);
            } else if (women.getType() == 2) {
                System.out.println("==========妻子->丈夫===========");
                husbend.HandleMessage(women);
            } else if (women.getType() == 3) {
                System.out.println("==========母亲->儿子===========");
                son.HandleMessage(women);
            }else {
                //doNothing
            }
        }
    }
}
