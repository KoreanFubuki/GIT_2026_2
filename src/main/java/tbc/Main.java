package tbc;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi");
        int number = someIntegerFunction();
    }

    private  static  void someNewFunction(){
        System.out.println("Hi but new");
    }

    private static int someIntegerFunction(){
        return 1;
    }
}