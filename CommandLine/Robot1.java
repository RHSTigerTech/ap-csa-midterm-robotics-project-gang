import edu.cmu.ri.createlab.hummingbird.HummingbirdRobot;

public class Robot1 extends HummingbirdRobot {
    public static void main(String[] args) throws InterruptedException{
        HummingbirdRobot cheesyBob = new HummingbirdRobot();

        for(int i = 10000; i >=  1; i--) {
            int r = (int) (Math.random()*256);
            int g = (int) (Math.random()*256);
            int b = (int) (Math.random()*256);
            int s = cheesyBob.getSensorValue(1);
            cheesyBob.setMotorVelocity(1,s);
            Thread.sleep(1);
            cheesyBob.setLED(1,g);
            Thread.sleep(1);
            cheesyBob.setFullColorLED(1,r,g,b);
            Thread.sleep(1);
        }

        cheesyBob.disconnect();
    }
}
