package Practice;
// class is a methods and variables
// sorted array
public class Sortedarray<ar>
{
    public static void main(String[] args) {
        int[] ar = {60, 30, 20, 80};
for (int i=0; i<ar.length;i++){
    System.out.print(ar[i]+" ");
}


        for (int i = 0; i < ar.length-1; i++) {
            if (ar[i] > ar[i + 1]) {
                int temp = ar[i];
                ar[i] = ar[i + 1];
                ar[i + 1] = temp;

            }

        }
        for (int i = 0; i < ar.length-2; i++) {
            if (ar[i] > ar[i + 1]) {
                int temp = ar[i];
                ar[i] = ar[i + 1];
                ar[i + 1] = temp;

            }

        }
        for (int i = 0; i < ar.length-3; i++) {
            if (ar[i] > ar[i + 1]) {
                int temp = ar[i];
                ar[i] = ar[i + 1];
                ar[i + 1] = temp;

            }

        }
        System.out.println("After swapping");
        for (int i=0; i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }

    }
}
