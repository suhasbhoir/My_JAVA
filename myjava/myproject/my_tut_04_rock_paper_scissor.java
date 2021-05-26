package myjava.myproject;
import java.util.Random;
import java.util.Scanner;

public class my_tut_04_rock_paper_scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("We are Playing Rock Paper Scissor game");
        System.out.println("here you have three choices select '1' for ROCK, " +
                            "select '2' for PAPER, select '3' for SCISSOR,");
        System.out.print("Enter you choice here: ");
        int attempt = 1;
        int mymove = sc.nextInt();
        if (mymove != 1 && mymove != 2 && mymove != 3 ){
            System.out.println("You have entered invalid input. Enter 1, 2 or 3");

            }
        else if (mymove == 1){
            System.out.println("You Enter 'ROCK'");
        }
        else if (mymove == 2){
            System.out.println("You Enter 'PAPER'");
        }
        else{
            System.out.println("You Enter 'SCISSOR'");
        }
        int systemmove = rd.nextInt(3) + 1;

        if (systemmove == 1){
            System.out.println("Computer entered for 'ROCK'");
        }
        else if (systemmove == 2){
            System.out.println("Computer entered for 'PAPER'");
        }
        else{
            System.out.println("Computer entered for 'SCISSOR'");
        }
        if (mymove == 1 && systemmove == 1 || mymove == 2 && systemmove == 2
                || mymove == 3 && systemmove == 3 ){
            System.out.println("You Tied");
        }
        else if (mymove == 1 && systemmove == 3 || mymove == 2 && systemmove == 1
                || mymove == 3 && systemmove == 2) {
            System.out.println("You WIN!!!!");
        }

        else if (mymove != 1 && mymove != 2 && mymove != 3) {
            System.out.println("Hence Computer Enter correct match but you entered Invalid Input, " +
                    "so there is no any result for this move");
        }
        else {
            System.out.println("You LOST!!!!");
        }
    }
}
