package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        System.out.println("Press 1 to get List BasketballTeam ordered by points");
        System.out.println("Press 2 to get List  FootballTeam ordered by points");
        System.out.println("Press 3 to get  updated list of BasketballTeam");
        System.out.println("Press 4 to get  updated list of FootballTeam");

        while (flag) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter Your Choice : ");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    BasketballTeam b=new BasketballTeam();
                    b.getBasketballTeam();
                    break;
                case 2:
                    FootballTeam f=new FootballTeam();
                    f.getFootballTeam();
                    break;
                case 3:
                     BasketballTeam b1=new BasketballTeam();
                     b1.updatePoints();
                    break;
                case 4:
                    FootballTeam f1=new FootballTeam();
                    f1.updatePoints();
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Please enter valid choice");
                    break;
            }
        }

    }
}

