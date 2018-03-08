import java.util.Random;
import java.util.Scanner;


//Program, który wypisze najmniejszą i największą liczbę w danej kolumnie

public class Table
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random los=new Random();
        int[][]tab=new int[5][5];
        for (int i=0;i<tab.length;i++)
        {
            for(int j=0;j<tab[i].length;j++)
            {
                tab[i][j]=los.nextInt(11)-5;
            }
        }
        for (int k=0;k<tab.length;k++)
        {
            for(int l=0;l<tab[k].length;l++)
            {
                if(tab[k][l]>=0)
                {
                    System.out.print(" "+tab[k][l]+" ");
                }
                else if (tab[k][l]<0)
                {
                    System.out.print(tab[k][l]+" ");
                }

            }
            System.out.println();
        }
        int min=6,min1=6,min2=6,min3=6,min4=6;
        int max=-6,max1=-6,max2=-6,max3=-6,max4=-6;
        for (int m=0;m<tab.length;m++)
        {
            for(int n=0;n<tab[m].length;n++)
            {
                if(tab[m][0]<min){min=tab[m][0];}
                if(tab[0][n]>max){max=tab[0][n];}
                if(tab[m][1]<min1){min1=tab[m][1];}
                if(tab[1][n]>max1){max1=tab[1][n];}
                if(tab[m][2]<min2){min2=tab[m][2];}
                if(tab[2][n]>max2){max2=tab[2][n];}
                if(tab[m][3]<min3){min3=tab[m][3];}
                if(tab[3][n]>max3){max3=tab[3][n];}
                if(tab[m][4]<min4){min4=tab[m][4];}
                if(tab[4][n]>max4){max4=tab[4][n];}
            }

        }
        System.out.println("\n"+min+" "+min1+" "+min2+" "+min3+" "+min4);
        System.out.println(" "+max+"  "+max1+"  "+max2+"  "+max3+"  "+max4);


    }
}


