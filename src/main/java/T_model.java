//Extend used to inherited the class
// class is a group of objects and methods 
public class T_model extends T_shirt {
    int Count;
    String Colour;
    char Size;
//The static keyword in Java is used to share the same variable or method of a given class without object creation
    static {
        System.out.println("Welcome RTB brothers");
    }
    T_model(int Count, String Colour,char Size ){
            this.Count = Count;
            this.Colour = Colour;
            this.Size = Size;
        System.out.println("Initial buissness");
            System.out.println("T shirt count="+Count);
        System.out.println("T shirt color="+Colour);
        System.out.println("T shirt size="+Size);
    }
// main method
    public static void main(String[] args) {
        //object has an identity, a behavior and a state.
        T_model mod=new T_model(50,"Black", 'm');
mod.scanner();


    }







}
