package Aug17HW;
interface IPhoneActions {
    public void ringNumber(int phonenumber);
    public boolean isRinging();
    public void setGreetingMessage(String message);
    public boolean isGreetingSet();
}

class Phone implements IPhoneActions{
    private String name;
    private String color;
    private String carrier;
    private int gigStorage;
    private String welcomeMessage;

    public Phone(String name, String color, String carrier, int gigStorage) {
        this.name = name;
        this.color = color;
        this.carrier = carrier;
        this.gigStorage = gigStorage;
        this.welcomeMessage = null;
            }
    @Override
    public void ringNumber(int phonenumber) {
        System.out.println("Ringing phone number: " + phonenumber);
    }
    @Override
    public boolean isRinging() {
        return false;  //further functionality
    }
    @Override
    public void setGreetingMessage(String message) {
        this.welcomeMessage = message;
    }

    @Override
    public boolean isGreetingSet() {
        return (this.welcomeMessage != null) ? true : false;
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }
}

public class Main {
    public static void main(String[] args) {
        Phone iphone = new Phone("Iphone6", "Space Gray", "Sprint", 64);
        Phone android = new Phone("Pixel 3", "Sky Blue", "AT&T", 128);
        Phone nokia = new Phone("Lively Flip", "Red", "Verizon", 32);

        nokia.setGreetingMessage("Hello World");
        System.out.println((nokia.isRinging()) ? "Phone is ringing" : "Phone is not ringing");
        nokia.ringNumber(64587);
        System.out.println((nokia.isGreetingSet()) ? "Your welcome greeting is set to " + nokia.getWelcomeMessage() : "Sorry, you have not set your welcome greeting");

    }
}
