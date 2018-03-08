import java.util.*;

public class Losowanie
{
    public static void main(String[] args)
    {
        Random los=new Random();
        int liczba=-151;
        int ileliczb=0;
        int sumaLiczbParzystychDodatnich=0;
        while (liczba!=0)
        {
            liczba=los.nextInt(301)-150;
            ileliczb++;
            System.out.println(liczba);
            if (liczba>0 && liczba%2==0)
            {
                sumaLiczbParzystychDodatnich++;
            }
        }
        System.out.println("Suma: "+sumaLiczbParzystychDodatnich);
        int i=1;
        int liczba2;
        long iloczynLiczbNieparzystychUjemnych=1;
        while (i<=ileliczb)
        {
            liczba2=los.nextInt(21)-10;
            System.out.println(liczba2);
            if (liczba2<0 && liczba2%2!=0)
            {
                iloczynLiczbNieparzystychUjemnych=iloczynLiczbNieparzystychUjemnych*liczba2;
            }
            i++;
        }
        System.out.println("Iloczyn: "+iloczynLiczbNieparzystychUjemnych);
        System.out.println("Suma: "+sumaLiczbParzystychDodatnich);
        float stosunek=(float)sumaLiczbParzystychDodatnich/iloczynLiczbNieparzystychUjemnych;
        System.out.println("Stosunek sumy do iloczynu wynosi: "+stosunek);


    }

}