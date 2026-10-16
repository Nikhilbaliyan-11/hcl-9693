package Singleton;

public class singleObject {
    // make constructor private
    private singleObject( ){}
    // create a single obj which is final and static
   static final singleObject obj = new singleObject();

   public static singleObject create(){
        return obj;
    }
}
