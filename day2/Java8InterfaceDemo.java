// Java 8 Inteface Changes
class Java8InterfaceDemo{
    static public void main(String args[]){
        Notification notification=new Sms();
        Notification.costPerNotification();//static method 
        notification.send();
        notification.successful();
        Notification pushNotification=new Notification(){// an
            public void send() {
                System.out.println("Before Java 8");
            };
        };
        pushNotification.send();
        Notification push=()-> System.out.println("PushNotification");
        push.send();
    }
    
}
@FunctionalInterface
interface Notification { // Functional 
    default void successful() {
        System.out.println("Notification Send Successfully");
    }

    static void costPerNotification() {
        System.out.println("Cost is 1 INR");
    }

    void send();
    
}

class Sms implements Notification {
    public void send() {
        System.out.println("Sms Send ");
    }
}

class Email implements Notification {
    public void send() {
        System.out.print("Email Send ");
    }
}