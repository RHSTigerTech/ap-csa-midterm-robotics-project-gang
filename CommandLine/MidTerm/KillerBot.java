package MidTerm;

import edu.cmu.ri.createlab.hummingbird.HummingbirdRobot;

public class KillerBot extends HummingbirdRobot {


    private int sensor1;
    private int sensor2;
    private int sensor3;
    private int operation;
    private String user;
    private String spookyUser;
    private int x = 1;


    public KillerBot() {
        super();
    }

    public void startUp(String input){
        setLED(1,50);
        setLED(2,50);
        System.out.println("Its spooky time " + vowelReplace() + "!");
        speak("Hello there I am the killer bot");
        user = input;
    }

    public String vowelReplace(){
        spookyUser.replace( "a", "\uD83C\uDF83" );
        spookyUser.replace( "e", "\uD83C\uDF83" );
        spookyUser.replace( "i", "\uD83C\uDF83" );
        spookyUser.replace( "o", "\uD83C\uDF83" );
        spookyUser.replace( "u", "\uD83C\uDF83" );
        return(spookyUser);
    }



    public void search() {
        speak("Kill mode activated, Im coming for you" + user);
        setLED(1,255);
        setLED(2,255);
        operation = 1;
        while (operation == 1) {
            sensor1 = getSensorValue(1);
            sensor2 = getSensorValue(2);
            sensor3 = getSensorValue(3);
            if ((sensor1 > 40) && (sensor2 <= 60)) {
                    left();
            }
            if ((sensor3 > 40) && (sensor2 <= 60)) {
                    right();
            }
            if ((sensor2 > 40) && (sensor1 <= 60) && (sensor3 <= 60)) {
                    forward();
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
        setMotorVelocity(1, -255);
        setMotorVelocity(2, 255);
    }
}
