package prototype_01;

import java.util.Random;

public class Client {
    private static int MAX_COUNT = 6;

    public static void main(String[] args) {
        int i=0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("xx银行，版权所有！");
        while(i<MAX_COUNT){
            Mail cloneMail = mail.clone();   //拷贝对象是在堆内存拷贝，不执行构造方法！
            cloneMail.setAppellation(getRandomString(8)+"先生（女士）");
            cloneMail.setReceiver(getRandomString(8)+"@"+getRandomString(3)+".com");
            sendMail(cloneMail);
            i++;
        }
    }
    public static void sendMail(Mail mail){
        System.out.println("标题："+mail.getSubject()+"\t收件人："+mail.getReceiver()+"\t发送成功！");
    }
    public static String getRandomString(int maxLength){
        String source = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for(int i=0; i<maxLength; i++){
            sb.append(source.charAt(random.nextInt(source.length())));
        }
        return sb.toString();
    }
}
