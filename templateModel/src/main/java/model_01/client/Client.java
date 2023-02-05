package model_01.client;

import model_01.model.HummerH1Model;
import model_01.model.HummerH2Model;

public class Client {

    public static void main(String[]args){
        HummerH1Model h1 = new HummerH1Model();
        HummerH2Model h2 = new HummerH2Model();
        h1.run();
        h2.run();
    }
}
