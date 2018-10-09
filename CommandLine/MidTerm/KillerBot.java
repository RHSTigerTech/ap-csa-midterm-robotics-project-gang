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
            sensor1 = getSensorValue(1);
            sensor2 = getSensorValue(2);
            sensor3 = getSensorValue(3);
            if ((sensor1 > 50) && (sensor2 <= 50))) {
                    left();
            }
            if ((sensor3 > 50) && (sensor2 <= 50)) {
                    forward();
            }
            if ((sensor2 > 50) && (sensor1 <= 50) && (sensor3 <= 50)) {
                    right();
            }
        }
    }

    public void left() {
        setMotorVelocity(1, 255);
        setMotorVelocity(2, 0);
    }

    public void forward() {
        setMotorVelocity(1, 255);
        setMotorVelocity(2, 255);
    }

    public void right() {
        setMotorVelocity(1, 0);
        setMotorVelocity(2, 255);
    }
}
