public class T_model extends T_shirt {
    int Count;
    String Colour;
    char Size;

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

    public static void main(String[] args) {
        //object has an identity, a behavior and a state.
        T_model mod=new T_model(50,"Black", 'm');
mod.scanner();


    }







}
