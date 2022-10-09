import java.util.ArrayList;
import java.util.Random;

public class Puzzles {
    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> rolls = new ArrayList<Integer>();
        Random rand = new Random();
        for(int i = 0; i < 10; i++){
            int diceRoll = rand.nextInt(20);
            System.out.println(diceRoll);
            rolls.add(diceRoll);
        }
        return(rolls);
    }
}
