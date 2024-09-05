public class Main {

    public static void main(String[] args) {

        // Hello World
        System.out.println("Hello world!");

        //Data type
        String name;
        name = "Adi";

        long num;
        num = 21;

        int suhu;
        suhu = 7;

        float phi;
        phi = 3.14f;

        char grade;
        grade = 'A';

        boolean isJavaFun;
        isJavaFun = true;

        System.out.println(name);
        System.out.println(num);
        System.out.println(suhu);
        System.out.println(phi);
        System.out.println(grade);
        System.out.println(isJavaFun);

        //Luas lingkaran
        final float myPhi = 3.14f;

        int r1 = 5;
        float luaslingkaran1 = myPhi * r1 * r1;

        int r2 = 10;
        float luaslingkaran2 = myPhi * r2 * r2;

        System.out.println(luaslingkaran1);
        System.out.println(luaslingkaran2);

        //bilangan ganji genap
        int modulus = 61 % 2;
        System.out.println(modulus);
        System.out.println("Apakah 61 genap? " + false);

        //if else bilangan ganjil genap
        int myNumber = 10;
//
//        //cek apakah angka lebih besar dari 50 dan even
//        if (myNumber > 50 && myNumber % 2 == 0) {
//            System.out.println("angka lebih besar dari 50 dan even");
//            //cek apakah angka lebih besar dari 50 dan odd
//        } else if (myNumber > 50 && myNumber % 2  == 1) {
//            System.out.println("angka lebih besar dari 50 dan odd");
//            //cek apakah angka lebih kecil dari 50 dan even
//        } else if (myNumber < 50 && myNumber % 2 == 0) {
//            System.out.println("angka lebih besar dari 50 dan even");
//            //cek apakah angka lebih kecil dari 50 dan odd
//        } else if (myNumber < 50 && myNumber % 2 == 1) {
//            System.out.println("angka lebih besar dari 50 dan odd");

//        if (myNumber > 50){
//            System.out.println("Angka lebih besar dari 50");
//            if (myNumber%2 == 0){
//                System.out.println();
//            }

        //day nya 1,2,3,5
        Integer [] day = {1,2,3,5};

        String dayName;
        for (Integer myNum : day){
            switch (myNum) {
                case 1: dayName = "Sunday"; break;
                case 2: dayName = "Monday"; break;
                case 3: dayName = "Tuesday"; break;
                default: dayName = "Invalid day"; break;
            }
        System.out.println(dayName);
        }
    }
}