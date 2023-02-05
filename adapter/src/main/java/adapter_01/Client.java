package adapter_01;

public class Client {
    public static void main(String[] args) {
        IUserInfo youngGirl = new UserInfo();
        for(int i=0; i<5; ++i){
            youngGirl.getUserName();
        }
        IUserInfo outYoungGirl = new Adapter();  //注意实现的谁的接口！！！
        for (int j=0; j<4; j++){
            outYoungGirl.getUserName();
        }
    }
}
