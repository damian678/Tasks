import java.util.*;

public class Dzialania
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        int max;
        int min;
        max = liczba;
        min = liczba;
        int sumal = 0, ilosc = 0;
        while (liczba != 0)
        {
            if (max < liczba) {max = liczba;}
            if (min > liczba) {min = liczba;}
            sumal += liczba;
            ilosc++;
            liczba = scanner.nextInt();
        }
        int suma = min + max;
        float srednia = (float) sumal / ilosc;
        System.out.println("Suma liczb: " + sumal);
        System.out.println("Ilość liczb: " + ilosc);
        System.out.println("Suma parzystych: "+suma);
        System.out.println("Stednia: "+ srednia);
    }
}
