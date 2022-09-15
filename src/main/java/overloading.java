public class overloading {

    public void add(int num,String name){
        System.out.println("Welcome");
    }
    void add1(int num){
        System.out.println("Hello");
    }
    void add2(int num1, int num2,int num3){
        int sum=num1+num2+num3;
        System.out.println("count="+sum);

    }

    public static void main(String[] args) {
        overloading ov=new overloading();
        ov.add(1,"Tamil");
        ov.add1(2);
        ov.add2(1,2,3);
    }

}
