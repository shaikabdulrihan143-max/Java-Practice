abstract class Notification{

    public void sendNotification(){
        System.out.println("Notification sented successfully");
    }
}

class EmailNotification extends Notification{

    public void sendNotification(){
        System.out.println("Email Notification Sent\n");
    }
}

class SMSNotification extends Notification{

    public void sendNotification(){
        System.out.println("SMS Notification Sent\n");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args){

        EmailNotification e1=new EmailNotification();

        e1.sendNotification();

        SMSNotification s1=new SMSNotification();

        s1.sendNotification();
    }
}
