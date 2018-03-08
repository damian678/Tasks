import java.util.*;

//program obliczający należny podatek dochodowy od osób fizycznych

public class Podatek
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj dochód: ");
        double dochod = scanner.nextDouble();
        double podatek;
        if (dochod < 85.524)
        {
            podatek = dochod * 0.18 - 556.02;
            System.out.format("Podatek wynosi: %.2f", podatek);
        }
        else
            {
            podatek = 14839.02 + 0.32 * (dochod - 85.528);
            System.out.format("Podatek wynosi: %.2f", podatek);
        }
    }
}
