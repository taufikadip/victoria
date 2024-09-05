public class Calculator {
    int a;
    int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    //penjumlahan
    Integer add(){
        return a + b;
    }

    //substract
    Integer substract(){
        return a - b;
    }

    Integer multiply(){
        return a * b;
    }

    Integer divide() {
        return a / b;
    }
}
