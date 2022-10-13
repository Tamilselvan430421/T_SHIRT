package Practice;

public class Reverse {
    public static void main(String[] args) {

        System.out.println(reverse("reverse"));
        System.out.println(reverse("reverse",true));
    }
    //Reverse a string without loops
    public static String reverse(String s)
    {
        StringBuilder sb = new StringBuilder(s);
        return(sb.reverse().toString());

    }

    //Reverse a string using recursion

    public static String reverse(String s, boolean useRecursion)
    {
        return reversal(s,0,"");
    }

    private static String reversal(String s, int index, String currRev)
    {
        if (index==s.length())
        {
            return currRev;
        }
        currRev=currRev + s.charAt(s.length()-index-1);
        return reversal(s, index+1, currRev);

    }

}
