import java.util.Random;
import java.util.Scanner;

public class Los
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random los = new Random();
        int[][] tab = new int[11][11];
//        for (int i=0;i<tab.length;i++)
//        {
//            for(int j=0;j<tab[i].length;j++)
//            {
//                tab[i][j]=los.nextInt(11)-5;
//            }
//        }
        for (int k = 0; k < tab.length; k++)
        {
            for (int l = 0; l < tab[k].length; l++)
            {
                if(k+l==0)
                {
                    System.out.print("    ");
                }
                else if (l== 0 && k<10 )
                {
                    System.out.print(" "+(k + l) + "  ");
                }
                else if (k == 0 && k<=10)
                {
                    System.out.print(k + l + " ");
                }
                else if (l== 0 && k==10 )
                {
                    System.out.print((k + l) + "  ");
                }
                else if((l+1)%2==0 || (k+1)%2==0)
                {
                    System.out.print("+ ");
                }
                else
                {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }


    }
}

