package with_srp;

class MovementModule {
    private int batteryLevel = 100; // Separate battery management

    public void walk(Robot robot, int distance) {
        batteryLevel -= distance * 2; // Walking consumes battery
        System.out.println(robot.getName() + " walked " + distance + " meters. Battery: " + batteryLevel + "%");
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }
}