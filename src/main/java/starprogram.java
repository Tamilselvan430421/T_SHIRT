import java.util.Scanner;

public class starprogram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size:");
        int num = 1;
        for(int i = 0; i < 3; i++) {
            for(int j = 3 - 1; j > i; j--) {
                System.out.print(" ");
            }
            for(int j = 0; j < num; j++) {
                System.out.print("*");
            }
            num += 2;
            System.out.println();
        }
    }
}





