import java.util.Scanner;
import java.util.*;


public class Tablica
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę pól: ");
        Random losowaLiczba=new Random();

        int liczbaPol=scanner.nextInt();
        int [] tab=new int[liczbaPol];
        for (int i=0;i<tab.length;i++)
        {
            tab[i]=losowaLiczba.nextInt(201)-100;
        }
        for(int j=0;j<tab.length;j++)
        {
            System.out.print(tab[j]+ " ");
        }
        System.out.format("\nTa tablica składa się z %h elementów\n",tab.length);

        int[] tab2={1,2,12,55};
        for(int k:tab2)
        {
            System.out.print(k+ " ");
        }
        System.out.format("\nTab2 składa się z %d elementów\n", tab2.length);

        //tablice dwuwymiarowe

        int[][]tab3=new int[4][3];
        for(int i=0;i<tab3.length;i++)
        {
            for(int j=0;j<tab3[i].length;j++)
            {
                if (i==0 ||j==0){
                    System.out.print((i+j)+" ");}//tab[i][j]
                else
                {
                    System.out.print(losowaLiczba.nextInt(10)+" ");
                }
            }
            System.out.println();
        }


    }

}