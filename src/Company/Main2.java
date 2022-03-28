package Company;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        System.out.println("please enter the string and number of times");

        Scanner sc= new Scanner(System.in);
        String str;

        int n;
        str= sc.next();

        n=sc.nextInt();

        System.out.println("result : " +Repeater(str,n));
    }
    public static String Repeater(String str,int n)
    {
        if (n==1)
            return str;
        else
            return str+Repeater(str,(n-1));
    }

}
