package without_srp;
public class Main {
    public static void main(String[] args) {
        Robot myRobot = new Robot("RoboHelper");
        myRobot.speak("Hello, I am here to help!");
        myRobot.walk(10);
        myRobot.charge();
    }
}