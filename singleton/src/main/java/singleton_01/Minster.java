package singleton_01;

public class Minster {
    public static void main(String[] args) {
        for(int day=0; day<3; ++day) {
            Emperor emperor = Emperor.getInstance();
            emperor.say();
        }
    }
}
