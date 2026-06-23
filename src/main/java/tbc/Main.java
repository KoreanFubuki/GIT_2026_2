package tbc;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi");
        boolean booleanValue = someBooleanFunction();
    }

    private  static  void someNewFunction(){
        System.out.println("Hi but new");
    }

     private static boolean someBooleanFunction(){
        return true;
    }
}
