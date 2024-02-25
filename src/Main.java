import java.util.Scanner;
import java.util.Random; //Importing the random generator and scanner
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random rnd = new Random(); //naming random to rnd
        Scanner in = new Scanner(System.in); //naming scanner
        boolean going = true; //boolean variable that will start the loop
        do {
            System.out.println("*You roll the dice...*"); //telling user they rolled the dice
            int die1 = rnd.nextInt(5) + 1; //getting random value for die1
            System.out.println("The first die reads '" + die1 + "'"); //telling user what the random number is for die 1
            int die2 = rnd.nextInt(5) + 1; //getting random value for die 2
            System.out.println("The second die reads '" + die2 + "'"); //telling user what the random number is for die 2
            if (die1 + die2 == 2 || die1 + die2 == 3 || die1 + die2 == 12){
                System.out.println("The sum of the die is " + (die1 + die2) + " resulting in craps. You lose! Would you like to play again? (Y to play again)"); //player lost
                String again = in.next(); //variable for if player wants to play again
                if (again.equals("Y")){ //user entered 'Y'
                    System.out.println("Let's play again!");
                }
                else { //user did not enter Y
                    System.out.println("Bye Bye!");
                    going = false; //stops the loop
                }
            }
            else if (die1 + die2 == 7 || die1 + die2 == 11){
                System.out.println("The sum of the die is " + (die1 + die2) + " resulting in a natural! You win! Would you like to play again? (Y to play again)"); //player lost
                String again = in.next(); //variable for if player wants to play again
                if (again.equals("Y")){ //user entered 'Y'
                    System.out.println("Let's play again!");
                }
                else { //user did not enter Y
                    System.out.println("Bye Bye!");
                    going = false; //stops the loop
                }
            }
            else {
                int point = die1 + die2; //setting the point
                System.out.println("You rolled a " + (die2 + die1) + ", which is the 'the point' that you need to get to win. If you roll a seven, it's game over."); //informing user about the point
                boolean going2 = true; //setting variable for another play again loop
                do {
                    System.out.println("*You roll the dice...*"); //telling user they rolled the dice
                    die1 = rnd.nextInt(5) + 1; //getting random value for die1
                    System.out.println("The first die reads '" + die1 + "'"); //telling user what the random number is for die 1
                    die2 = rnd.nextInt(5) + 1; //getting random value for die 2
                    System.out.println("The second die reads '" + die2 + "'"); //telling user what the random number is for die 2
                    if (die1 + die2 == 7) {
                        System.out.println("You rolled a total of " + (die1 + die2) + " which means you lose. Sorry! Play again? (Y for yes)"); // Telling user they lost and asking if they want to play again
                        String again2 = in.next(); //variable for if player wants to play again
                        if (again2.equals("Y")){
                            System.out.println("Let's play again!");
                        }
                        else {
                            System.out.println("Bye Bye!");
                            going = false; //stops the loop
                            going2 = false;//stops the loop
                            return;
                        }
                    }
                    else if (die1 + die2 == point) {
                        System.out.println("You rolled a total of " + (die1 + die2) + " which means you win because you got point! Great job! Play again? (Y for yes)"); // Telling user they lost and asking if they want to play again
                        String again2 = in.next(); //variable for if player wants to play again
                        if (again2.equals("Y")){
                            System.out.println("Let's play again!");
                        }
                        else {
                            System.out.println("Bye Bye!");
                            going = false; //stops the loop
                            going2 = false; //stops the loop
                            return;
                        }
                    }
                    else {
                        System.out.println("You got a " + (die1 + die2) + ", roll again!");
                    }
                } while (going2 = true); //loop continues while going2 = true
            }
        } while (going); //loop continues while going = true
    }
}
