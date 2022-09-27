package Practice;

import java.util.Scanner;

//Class is a object and methodds
public class Leafyear {
    public static void main(String[] args) {
// leap year has 366 days
        System.out.println("Enter the any year");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        if((n%400==0) || ((n%100 !=0)&&(n%4==0)))
            System.out.println("it is a leap yeaar");
        else
            System.out.println("it is not leap year");
    }
}
