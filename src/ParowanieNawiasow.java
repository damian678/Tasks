public class ParowanieNawiasow
{

    //program, który sprawdzi, czy w podanym przez użytkownika wyrażeniu
    //arytmetycznym nawiasy są poprawnie sparowane

    public static void main(String[] args)
    {
        String tekst="2 * (3.4 - (-7)/2)*(a-2)/(b-1)))";
        String tekst2="2 * (3.4 - (-7)/2)*(a-2)/(b-1)";
        int nawiasl = 0;
        int nawiasp = 0;
        for (int i = 0; i < tekst.length(); i++)
        {
            String l = "" + tekst.charAt(i);
            if (l.equals("(")) {nawiasl++;}
            if (l.equals(")")) {nawiasp++;}
        }
        if (nawiasl == nawiasp) {System.out.println("OK");}
        else {System.out.println("Błędne sparowanie nawiasów");}
    }
}
