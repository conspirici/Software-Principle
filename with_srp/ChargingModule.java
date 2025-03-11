package with_srp;
class ChargingModule {
    public void charge(Robot robot, MovementModule movement) {
        movement.walk(robot, 0); 
        System.out.println(robot.getName() + " is now fully charged.");
    }
}