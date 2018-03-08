import java.util.*;


//program umożliwiający wyliczenie wysokości miesięcznej raty za zakupiony sprzęt

public class Towar
{
    public static void main(String[] args)
    {
    Scanner scaner = new Scanner(System.in);
    System.out.print("Podaj cenę towaru: ");

    double cena = scaner.nextDouble();

    double rata;
    while (cena > 10000 || cena < 100)
    {
        if (cena > 10000)
        {
            System.out.println("Cena za wysoka. Podaj jeszcze raz.");
            cena = scaner.nextDouble();
        }
        if (cena < 100)
        {
            System.out.println("Cena za niska. Podaj jeszcze raz.");
            cena = scaner.nextDouble();
        }
    }
    System.out.print("Podaj ilość rat: ");
    int liczbaRat = scaner.nextInt();

    while (liczbaRat > 48 || liczbaRat < 6)
    {
        if (liczbaRat > 48)
        {
            System.out.println("Rata za wysoka. Podaj jeszcze raz.");
            liczbaRat = scaner.nextInt();
        }
        if (liczbaRat < 6)
        {
        System.out.println("Rata za niska. Podaj jeszcze raz.");
        liczbaRat = scaner.nextInt();
        }
    }

    double q;
    if (liczbaRat >= 6 && liczbaRat <= 12)
    {
        q = 1 + (0.025 / 12);
        rata = (float) (cena * Math.pow(q, liczbaRat) * (q - 1)) / (Math.pow(q, liczbaRat) - 1);
        System.out.format("Podatek wynosi: %.2f", rata);
    }
    else if (liczbaRat >= 13 && liczbaRat <= 24)
    {
        q = 1 + (0.005 / 12);
        rata = (float) (cena * Math.pow(q, liczbaRat) * (q - 1)) / (Math.pow(q, liczbaRat) - 1);
        System.out.format("Podatek wynosi: %.2f", rata);
    }
    else if (liczbaRat >= 25 && liczbaRat <= 48)
    {
        q = 1 + (0.01 / 12);
        rata = (float) (cena * Math.pow(q, liczbaRat) * (q - 1)) / (Math.pow(q, liczbaRat) - 1);
        System.out.format("Podatek wynosi: %.2f", rata);
    }
    }
}

