import java.util.*;

public class Anagram
{
    public static void main(String[] args)
    {

    String tekstl = "Gregory House";
    String tekst0 = tekstl.replace(" ", "");
    String tekst = tekst0.toLowerCase();
    String tekst2 = "Huge ego sorry";
    String tekst3 = tekst2.trim();
    String tekst4 = tekst3.toLowerCase();
    String tekst5 = tekst4.replace(" ", "");
    System.out.println(tekst5);

    String a, t;

    ArrayList<String> list = new ArrayList<String>();
    for (int i = 0;i<tekst.length();i++)
    {
        a = "" + tekst.charAt(i);
        list.add(a);
    }
    System.out.println(list);
    int p = list.indexOf("b");
    int liczba = 0;
    for(int j = 0;j<tekst5.length();j++)
    {
        t = "" + tekst5.charAt(j);
        if (list.indexOf(t) >= 0) {liczba++;}
        else{liczba--;}
    }
    System.out.println(liczba);
    if(liczba==list.size()) {System.out.println("Jest to Anagram");}
    else{System.out.println("Nie jest to anagram");}
    }
}



