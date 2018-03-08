import java.util.Scanner;


//Program wyznaczający średnią, ilość liczb podzielnych przez 3 oraz sumę liczb do momentu podania liczby 150.

public class Liczby
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int liczbas=0, suma=0,sumaLiczbapp3=0;


        int liczba=scanner.nextInt();
        while (liczba!=150)
        {
            liczbas+=liczba;
            suma++;
            if (liczba%3==0)
            {
                sumaLiczbapp3++;
            }
            liczba=scanner.nextInt();

        }

        float srednia=(float)liczbas/suma;
        System.out.format("Suma liczb wynosi %d, a średnia %f, a liczb podzielnych przez 3 jest %d.",liczbas,srednia,sumaLiczbapp3);
    }

}