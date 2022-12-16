package sportsApp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SportAppMain {

    Scanner sc = new Scanner(System.in);


    HashMap<String,SportPlayer> sportlist = new HashMap<String,SportPlayer>();


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        SportAppMain sportAppMain = new SportAppMain();

        System.out.println();
        System.out.println(" ********  welcome sports players app  ******** ");

        while (true) {
            System.out.println(" press 1 to add player name ");
            System.out.println(" press 2 to  display player list ");

            int input = sc.nextInt();
            switch (input) {
                case 1:
                    sportAppMain.addSportPlayers();
                    break;
                case 2:
                    sportAppMain.display();
                    break;
                default:
                    break;
            }
        }
    }

    public void addSportPlayers() {
        SportPlayer sportPlayer = new SportPlayer();
        System.out.println(" enter player name ");
        sportPlayer.setName(sc.next());
        System.out.println(" Sport name ");
        sportPlayer.setSportName(sc.next());
        System.out.println(" current status active or not ");
        sportPlayer.setCurrentStatus(sc.next());

        System.out.println("add sucessfully ");
        sportlist.put(sportPlayer.getSportName(), sportPlayer);
    }

    public void display() {
        System.out.println(" display sports list ");

        for (Map.Entry m : sportlist.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }
        //System.out.println(sportlist);

    }
}
