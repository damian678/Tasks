import java.util.*;


//Maksimum, minimum wylosowanych liczb i stosunek liczb dodatnich do ujemnych

public class Ratio
{
    public static void main(String[] args)
    {
        Random los = new Random();
        int liczba;
        int liczbyDodatnie = 0, liczbyUjemne = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ile liczb mam wylosować? ");
        int ile = scanner.nextInt();
        int i = 1;
        int max = -101;
        int min = 101;
        while(i<=ile)
        {
            liczba = los.nextInt(201) - 100;
            System.out.println(liczba);
            if (liczba > 0) {
                liczbyDodatnie++;
            } else if (liczba < 0) {
                liczbyUjemne++;
            }
            if (liczba > max) {
                max = liczba;
            }
            if (liczba < min) {
                min = liczba;
            }
            i++;
        }
        System.out.format("Liczb dodatnich jest %d, a liczb ujemnych %d.",liczbyDodatnie,liczbyUjemne);
        float stosunek = (float) liczbyDodatnie / liczbyUjemne;
        System.out.println("Stosunek wynosi: "+stosunek);
        System.out.println("\nMaximum wynosi: "+max+", a minimum: "+min);
    }
}
