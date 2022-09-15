import java.util.Scanner;

public class T_shirt {
int a=0;

    public void scanner(){
        System.out.println("next bussiness");
        Scanner sc=new Scanner(System.in);
for(int i=0; i<50; ){

    int count= sc.nextInt();

    String colour= sc.next();

    char size=sc.next().charAt(0);

    int a= i+count;
    i=a;
    if(i<=50) {
        System.out.println(" count= " + count + " colour= "+ colour + " size " + size);
    }else{
        i=i-count;

    }

}







    }






}
