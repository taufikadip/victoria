public class Main {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator(4, 2); //Creating an Object
//        myCalc.a = 1;
//        myCalc.b = 2;
        System.out.println(myCalc.add()); // Calling a method
        System.out.println(myCalc.substract());
        System.out.println(myCalc.multiply());
        System.out.println(myCalc.divide());
    }
}