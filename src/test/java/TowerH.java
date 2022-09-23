public class TowerH {
    // Java recursive function to solve tower of hanoi puzzle
    static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod)
    {
        if (n == 1)
        {
            System.out.println("Move disk 1 from rod " +  from_rod + " to rod " + to_rod);
            return;
        }
        towerOfHanoi(n-1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk " + n + " from rod " +  from_rod + " to rod " + to_rod);
        towerOfHanoi(n-1, aux_rod, to_rod, from_rod);
    }

    //  Driver method
    public static void main(String args[])
    {
        int n = 4; // Number of disks
        char a = 'A';
        char b = 'b';
        char c = 'c';
        towerOfHanoi(n,  'a', 'b', 'c' );  // A, B and C are names of rods
    }
}
