// introduce after building class
// touches on encapsulation
import helloClass.helloClass;

public class Main {
    public static void main(String []args){
        // must have object init
        helloClass objectOne = new helloClass();
        objectOne.publicMethod();

        // no object init
        // let ide suggest creating class to public
        //helloClass.staticMethod();
    }
 }
