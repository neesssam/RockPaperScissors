//importing necessary classes
import java.util.Random;
import java.util.Scanner;

public class RPSGameSrc {
    public static void main(String[] args) {
        //calling necessary classes
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Rock... Paper... Scissors!");
        System.out.println(" ");
        System.out.println("Y to play         N to exit"); //asks user to continue or exit

        while (true) { //loop that will allow infinite amounts of play until exit

            try { // quick pause before prompt to start
                Thread.sleep(2000); // pause for 2000 milliseconds (1 second)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //check for user input
            String input = scanner.nextLine();

            //check for "Y" key
            if (input.equalsIgnoreCase("y")) { //enter requires no characters, so it is empty
                System.out.println("Let's Play!!! You got..."); //code to run when user presses "Y"


                //2 second pause while it generates
                try {
                    Thread.sleep(2000); // pause for 2000 milliseconds (1 second)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                int randomNumber = random.nextInt(3); // generates a random number between 0 and 2

                // Selects rock, paper or scissors based on the random number
                switch (randomNumber) {
                    case 0:
                        System.out.println("Rock");
                        break;
                    case 1:
                        System.out.println("Paper");
                        break;
                    case 2:
                        System.out.println("Scissors");
                        break;
                }

                //check for "N" key
            } else if (input.equalsIgnoreCase("n")){
                System.out.println("Sorry to see you go :( Come again Next time!");
                break; //exits the loop and terminates the program
            }
        }
    }
}
