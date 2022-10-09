import java.util.ArrayList;
import java.util.Random;
public class PuzzlesTest {
    
    public static void main(String[] args){
        Puzzles generator = new Puzzles();
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println(randomRolls);
    }
}
