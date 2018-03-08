import java.util.Scanner;

public class Palindrom
{
    public static void main(String[] args)
    {
        System.out.print("Podaj słowo: ");
        Scanner scanner = new Scanner(System.in);
        String tekst=scanner.next();
        String slowo=tekst.toLowerCase();
        String b="";
        String tekst2="";
        for(int i=slowo.length()-1;i>=0;i--)
        {b+=tekst2.concat(""+slowo.charAt(i));}

        if(b.equals(slowo)){System.out.println("To jest palindrom");}
        else {System.out.println("To nie jest palindrom");}
    }

}
