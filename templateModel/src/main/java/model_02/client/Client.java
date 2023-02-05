package model_02.client;

import model_02.model.HummerH1Model;
import model_02.model.HummerH2Model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {

    public static void main(String[]args) throws IOException {

        System.out.println("=========h1型号悍马==========");
        System.out.println("悍马是否响铃? 1-是 0-否");
        String type = (new BufferedReader(new InputStreamReader(System.in))).readLine();

        HummerH1Model h1 = new HummerH1Model();
        if(type.equals("0")){
            h1.setAlarm(false);
        }
        h1.run();

        System.out.println("=========h2型号悍马==========");
        HummerH2Model h2 = new HummerH2Model();
        h2.run();
    }
}
