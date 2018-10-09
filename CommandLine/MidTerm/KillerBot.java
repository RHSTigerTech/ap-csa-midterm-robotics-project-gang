package MidTerm;

import edu.cmu.ri.createlab.hummingbird.HummingbirdRobot;

public class KillerBot {

    HummingbirdRobot Jason = new HummingbirdRobot();

    int eye = 0;

    public KillerBot () {

    }

    public void lights () {
        Jason.setLED(1, 255);
        Jason.setLED(2, 255);
    }

    public void lightsOff () {
        Jason.setLED(1, 0);
        Jason.setLED(2, 0);
    }

    public int see () {
        if (Jason.getSensorValue(1) > 30) {
            eye = 1;
        }
        else if (Jason.getSensorValue(2) > 30) {
            eye = 0;
        }
        else {
            eye = -1;
        }
        return  eye;
    }

    public void move() {
        if(eye > 0) {
            Jason.setMotorVelocity(1, 255);
            Jason.setMotorVelocity(2, 150);
        }
        else if (eye == 0) {
            Jason.setMotorVelocity(1, 255);
            Jason.setMotorVelocity(2, 255);
        }
        else {
            Jason.setMotorVelocity(1, 150);
            Jason.setMotorVelocity(2, 255);
        }
    }
}
