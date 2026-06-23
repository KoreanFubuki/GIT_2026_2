package tbc;

public class Main {
    public static void main(String[] args) {
        IO.println(String.format("Hello and welcome!"));
        String result = someNewFunction("MESSAGE");
    }

    private static String someNewFunction(String message){
        return  message;
    }
}