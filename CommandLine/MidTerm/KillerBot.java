package MidTerm;

import com.sun.speech.freetts.en.us.FeatureProcessors;
import edu.cmu.ri.createlab.hummingbird.HummingbirdRobot;

public class KillerBot extends HummingbirdRobot {


    private int sensor1;
    private int sensor2;
    private int sensor3;
    private int operation;
    private int x = 1;


    public KillerBot() {
        super();

    }

    public void search() {
        operation = 1;
        while (operation == 1) {
            if (sensor1 > 50) {
                while (sensor2 < 50) { System.out.println("Sensor 2 detection");
                    setMotorVelocity(1, 225);
                }
            }
            if (sensor3 > 50) {
                while (sensor2 < 50) {
                    System.out.println("Sensor 3 detection");
                    setMotorVelocity(2, 225);
                }
            }
        }
    }
}
