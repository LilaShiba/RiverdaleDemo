package helloClass;
// debug mismatched names, e.g., helloClass vs. HelloClass
public class helloClass {

    public int velocity = 0;
    public String name = "sandwich class";

    // Static Method
    // Debug via Main Not public
    static void staticMethod(){
        System.out.println("call me without creating an object");
    };

    public void publicMethod(){
        System.out.println("Only class objects can use me");

    };
    
}
