import edu.cmu.ri.createlab.hummingbird.HummingbirdRobot;

public class Robot1 extends HummingbirdRobot {
    public static void main(String[] args) throws InterruptedException{
        HummingbirdRobot bob = new HummingbirdRobot();



        int x = 1;
        while(x<100000) {
            bob.speak("Don't touch my beans nigga");
            Thread.sleep(2000);

        }

//?
        bob.disconnect();
    }
}