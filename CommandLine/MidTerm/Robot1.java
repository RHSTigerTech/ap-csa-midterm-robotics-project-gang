package MidTerm;

import edu.cmu.ri.createlab.hummingbird.HummingbirdRobot;

public class Robot1 extends HummingbirdRobot {
    public static void main(String[] args) throws InterruptedException{
        HummingbirdRobot bob = new HummingbirdRobot();

        bob.wait();

        bob.disconnect();
    }
}