package with_srp;
public class Main {
    public static void main(String[] args) {
        Robot myRobot = new Robot("RoboHelper");
        SpeechModule speech = new SpeechModule();
        MovementModule movement = new MovementModule();
        ChargingModule charging = new ChargingModule();

        speech.speak(myRobot, "Hello, I am here to help!");
        movement.walk(myRobot, 10);
        charging.charge(myRobot, movement);
    }
}