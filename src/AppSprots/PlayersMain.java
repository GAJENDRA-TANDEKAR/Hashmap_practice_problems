package AppSprots;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PlayersMain {
    Scanner sc = new Scanner(System.in);
   static ArrayList<Players> list = new ArrayList<>();
 // List<Players>players = new ArrayList<>();


    public static void main(String[] args) {
       // List<Players>players = new ArrayList<>();
        Players p1 = new Players("sachin  ", "cricket   ", "non active");
        Players p2 = new Players("virat   ", "cricket   ", "non active");
        Players p3 = new Players("yuraj   ", "cricket   ", "non active");
        Players p4 = new Players("pardeep ", " kabaddi  ", "    active");
        Players p5 = new Players("anup    ", "kabaddi   ", "    active");
        Players p6 = new Players("lakshya ", "badminton ", "non active");
        Players p7 = new Players("saina   ", "badminton ", "    active");
        Players p8 = new Players("rakesh  ", "kabaddi   ", "    active");
        Players p9 = new Players("deepak  ", "kabaddi   ", "    active");
        Players p10 = new Players("pawan   ", "kabaddi   ", "    active");
        Players p11 = new Players("gautam  ", "cricket   ", "non active");
        Players p12 = new Players("rohit   ", "cricket   ", "non active");


        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        list.add(p7);
        list.add(p8);
        list.add(p9);
        list.add(p10);
        list.add(p11);
        list.add(p12);



        Scanner sc = new Scanner(System.in);


        PlayersMain playersMain = new PlayersMain();

        System.out.println("****  welcome to sports app  ****");

        while (true) {
            System.out.println();
            System.out.println(" enter  1  for add players in list ");
            System.out.println("  enter 2 display all players");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    playersMain.addplayers();
                    break;
                case 2:
                    playersMain.displayplayers();
                    break;
                default:
                    break;
            }
        }


    }

    public void addplayers() {
        Players players = new Players();

        System.out.println();
        System.out.println("enter player name");
        players.setName(sc.next());
        System.out.println(" enter sport name");
        players.setSportname(sc.next());
        System.out.println(" current status active or non active");
        players.setStatus(sc.next());
        System.out.println("Add successfully");

        list.add(players);
        System.out.println(players);

    }

    public void displayplayers() {
        // Getting Iterator
        Iterator itr = list.iterator();
        //traversing elements of ArrayList object
        while (itr.hasNext()) {
            Players st = (Players) itr.next();
            System.out.println(st.name + " " + st.sportname + " " + st.status);
        }
//              for (Players sportplayers : players){
//           System.out.println(sportplayers);
//       }
      // System.out.println(players);

    }

    public void filtersportplayers(){
        System.out.println("for cricket");


    }


}






