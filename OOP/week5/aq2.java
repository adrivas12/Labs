import java.util.*;

//lab5 aq2
class p14
{
    static void count(String s1, String s2)
    {
        int count = 1; 
        if(s1.contains(s2))
        {
            count++;
        }
        System.out.println("Count: "+(count));
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str1 = sc.next();
        System.out.println("Enter a substring: ");
        String str2 = sc.next();
        count(str1, str2);
    }
}
