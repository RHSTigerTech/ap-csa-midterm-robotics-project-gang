import edu.cmu.ri.createlab.hummingbird.HummingbirdRobot;

public class Robot1 extends HummingbirdRobot {
    public static void main(String[] args) throws InterruptedException{
        HummingbirdRobot bob = new HummingbirdRobot();


        bob.setMotorVelocity(1,0);
        int x = 1;
        while(x<100000) {
            int s = bob.getSensorValue(1);
            System.out.println("Sensor: " + s);
        }


        bob.disconnect();
    }
}