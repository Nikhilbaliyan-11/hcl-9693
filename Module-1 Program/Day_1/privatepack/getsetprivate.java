package privatepack;

public class getsetprivate {
   private int number = 10;
   private void study() {
       System.out.println(number);
   }
   
    public void setnumber(int number) {
        this.number = number;
    }
    public int getnumber() {
        return number;
    }
}
