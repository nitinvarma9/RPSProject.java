import java.util.Scanner;

public class RPSProject
{

    Scanner userInput=new Scanner(System.in);
    String playAgain;

    public void StartGame(String playerAmove,String playerBmove)
    {
        if(playerAmove.equals("R")||playerAmove.equals("r"))
        {
            if(playerBmove.equals("S")||playerBmove.equals("s"))
            {
                System.out.println("Rock breaks Scissors");
                System.out.println("player A wins");
            }
            else if(playerBmove.equals("R")||playerBmove.equals("r"))
                System.out.println("Rock vs Rock it's a Tie! ");

            else
            {
                System.out.println("Paper covers Rock");
                System.out.println("player B wins");
            }
        }
        else if(playerAmove.equals("P")||playerAmove.equals("p"))
        {
            if(playerBmove.equals("R")||playerBmove.equals("r"))
            {
                System.out.println("Paper covers Rock");
                System.out.println("player A wins");
            }
            else if(playerBmove.equals("P")||playerBmove.equals("p"))
                System.out.println("Paper vs Paper it's a Tie! ");

            else
            {
                System.out.println("Scissors cuts Paper\n");
                System.out.println("player B wins");
            }
        }
        else
        {
            if(playerBmove.equals("P")||playerBmove.equals("p"))
            {
                System.out.println("Scissors cuts Paper");
                System.out.println("player A wins");
            }
            else if(playerBmove.equals("S")||playerBmove.equals("s"))
                System.out.println("Scissors vs Scissors it's a Tie! ");
            else
            {
                System.out.println("Rock breaks Scissors");
                System.out.println("player B wins");
            }
        }



    }
    public void playerMove()
    {
        String playerAmove,playerBmove;

        for(;;)
        {

            for(;;)
            {
                System.out.println("Enter Move for player A");
                playerAmove=userInput.next();

                if(playerAmove.equals("R")||playerAmove.equals("P")||playerAmove.equals("S")
                        ||playerAmove.equals("r")||playerAmove.equals("p")||playerAmove.equals("s"))
                    break;
                else
                {
                    System.out.println("Enter a valid input(R or P or S or r or p or s");
                }
            }
            for(;;)
            {
                System.out.println("Enter Move for player B");
                playerBmove=userInput.next();

                if(playerBmove.equals("R")||playerBmove.equals("P")||playerBmove.equals("S")
                        ||playerBmove.equals("r")||playerBmove.equals("p")||playerBmove.equals("s"))
                    break;
                else
                {
                    System.out.println("Enter a valid input(R or P or S or r or p or s");
                }
            }
            StartGame(playerAmove,playerBmove);

            System.out.println("Do you like to play again(Y/N)");
            playAgain=userInput.next();

            if(!playAgain.equals("Y"))
                break;
        }
    }
    public static void main(String[] args)
    {


        new RPSProject().playerMove();


    }

}