package without_srp;
public class Robot {
    private String name;
    private int batteryLevel;

    public Robot(String name) {
        this.name = name;
        this.batteryLevel = 100;
    }

    public void speak(String message) {
        System.out.println(name + " says: " + message);
    }

    public void walk(int distance) {
        batteryLevel -= distance * 2; 
        System.out.println(name + " walked " + distance + " meters. Battery: " + batteryLevel + "%");
    }

    public void charge() {
        batteryLevel = 100;
        System.out.println(name + " is now fully charged.");
    }
}