import java.util.Random;

public class CaraCoroa
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        int n = rand.nextInt(2);
        if (n == 1)
        {
            System.out.print("n\tCARA\nt");
        }else {
            System.out.print("\n\tCOROA\n\t");
        }
    }
}