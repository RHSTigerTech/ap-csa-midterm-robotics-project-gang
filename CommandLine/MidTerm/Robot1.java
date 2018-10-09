package MidTerm;

import edu.cmu.ri.createlab.hummingbird.HummingbirdRobot;

public class Robot1 extends HummingbirdRobot {
    public static void main(String[] args) throws InterruptedException{

        KillerBot Jason = new KillerBot();

        Jason.search();



        Jason.disconnect();
    }
}