import java.util.Scanner;

public class EightBall {
    public static void main(String[] args) {

        System.out.print("What is your name? ");
        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();
        System.out.println();
        System.out.print("Hello " + userName + "! What is your question? ");
        String userQuestion = input.nextLine();
        System.out.println();

        String eightBall = "";

        int randomNumber = (int) Math.floor(Math.random() * 8);

        switch(randomNumber){
            case 0:
                eightBall = "It is certain";
                break;
            case 1:
                eightBall = "Cannot predict now";
                break;
            case 2:
                eightBall = "On lunch, try again later";
                break;
            case 3:
                eightBall = "It is written. So it shall be.";
                break;
            case 4:
                eightBall = "Outlook not so good";
                break;
            case 5:
                eightBall = "My sources say no";
                break;
            case 6:
                eightBall = "You have reached my voicemail";
                break;
            case 7:
                eightBall = "Do not count on it";
                break;
            default:
                eightBall = "Try again";
                break;
        }

        System.out.println(eightBall);
    }
}
