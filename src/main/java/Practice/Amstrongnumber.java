package Practice;

import java.util.Scanner;

public class Amstrongnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
      int orginal=s;
        int temp;
        int arm=0;
        while(s>0){
            temp=s%10;
            arm=arm+(temp*temp*temp);
            s=s/10;
        }
        if(orginal==arm){
            System.out.println("it is armstrong number");
        }
        else{
            System.out.println("it is not amstrong number");
        }
    }

}
