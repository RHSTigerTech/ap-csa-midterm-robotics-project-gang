package MidTerm;

import edu.cmu.ri.createlab.hummingbird.HummingbirdRobot;

import java.util.Scanner;

public class Robot1 extends HummingbirdRobot {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        KillerBot Jason = new KillerBot();
        System.out.println("What is your name?");
        Jason.startUp(scan.nextLine());
        Jason.search();



        Jason.disconnect();
    }
}