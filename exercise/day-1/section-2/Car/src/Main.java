public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(); //Creating an Object
        myCar.model = "Toyota";
        myCar.year = 2020;
        myCar.drive(); // Calling a method

        Motorbike myMotor1 = new Motorbike("Honda", 2024);
        System.out.println(myMotor1.model + " " + myMotor1.year);
        Motorbike myMotor2 = new Motorbike("Yamaha", 2015);
        System.out.println(myMotor2.model + " " + myMotor2.year);

        Bicycle myBike = new Bicycle();
        System.out.println(myBike.model + " " + myBike.year);
    }
}