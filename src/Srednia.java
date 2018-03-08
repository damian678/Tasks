import java.util.Random;
import java.util.Scanner;

public class Srednia
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random los=new Random();
        int[] tab=new int[10];
        int suma=0;
        int max=-11;
        int min=11;
        int plussrednia=0;
        int minussrednia=0;
        for (int i=0;i<tab.length;i++)
        {
            tab[i]=los.nextInt(21)-10;
        }
        for(int j=0;j<tab.length;j++)
        {
            System.out.print(tab[j]+ " ");
            suma+=tab[j];
            if(tab[j]<min){min=tab[j];}
            if(tab[j]>max){max=tab[j];}
        }
        System.out.format("\nNajwiększym elementem tablicy jest %d, a namniejszym %d.\n",max,min);
        float srednia=(float)suma/10;
        System.out.println("Srednia wynosi: " + srednia);
        for(int k=0;k<tab.length;k++)
        {
            if(tab[k]>srednia)
            {
                plussrednia++;
            }
            if(tab[k]<srednia)
            {
                minussrednia++;
            }
        }
        System.out.format("Jest %d elementów większych niż średnia i %d elementów mniejszych niż średnia.\n",plussrednia,minussrednia);

        //Odwrócony ciąg liczb

        for(int l=tab.length-1;l>=0;l--)
        {
            System.out.print(tab[l]+" ");
        }

    }
}
