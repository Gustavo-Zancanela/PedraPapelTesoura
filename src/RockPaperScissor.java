
import java.util.Random;


public class RockPaperScissor {

    public static void main(String[] args) {
        
        Random rnd = new Random();
        
        int numRnd = rnd.nextInt(3);
        
        System.out.println(numRnd);
        
        if (numRnd == 0)
        {
            System.out.println("Pedra");
        }
        else if(numRnd == 1)
        {
            System.out.println("Papel");
        }
        else if(numRnd == 2)
        {
            System.out.println("Tesoura");
        }
    }
}
