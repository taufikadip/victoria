public class Main {

    public static void main(String[] args) {

//        // Hello World
//        System.out.println("Hello world!");
//
//        //Data type
//        String name;
//        name = "Adi";
//
//        long num;
//        num = 21;
//
//        int suhu;
//        suhu = 7;
//
//        float phi;
//        phi = 3.14f;
//
//        char grade;
//        grade = 'A';
//
//        boolean isJavaFun;
//        isJavaFun = true;
//
//        System.out.println(name);
//        System.out.println(num);
//        System.out.println(suhu);
//        System.out.println(phi);
//        System.out.println(grade);
//        System.out.println(isJavaFun);
//
//        //Luas lingkaran
//        final float myPhi = 3.14f;
//
//        int r1 = 5;
//        float luaslingkaran1 = myPhi * r1 * r1;
//
//        int r2 = 10;
//        float luaslingkaran2 = myPhi * r2 * r2;
//
//        System.out.println(luaslingkaran1);
//        System.out.println(luaslingkaran2);
//
//        //bilangan ganji genap
//        int modulus = 61 % 2;
//        System.out.println(modulus);
//        System.out.println("Apakah 61 genap? " + false);
//
//        //if else bilangan ganjil genap
////        Integer [] myNumber = {10,75,76,47};
////
////        for (Integer myNum : myNumber) {
////            //cek apakah angka lebih besar dari 50 dan even
////            if (myNum > 50 && myNum % 2 == 0) {
////                System.out.println("angka lebih besar dari 50 dan even");
////                //cek apakah angka lebih besar dari 50 dan odd
////            } else if (myNum > 50 && myNum % 2 == 1) {
////                System.out.println("angka lebih besar dari 50 dan odd");
////                //cek apakah angka lebih kecil dari 50 dan even
////            } else if (myNum < 50 && myNum % 2 == 0) {
////                System.out.println("angka lebih besar dari 50 dan even");
////                //cek apakah angka lebih kecil dari 50 dan odd
////            } else if (myNum < 50 && myNum % 2 == 1) {
////                System.out.println("angka lebih besar dari 50 dan odd");
////            }
////        }
//
////        if (myNumber > 50){
////            System.out.println("Angka lebih besar dari 50");
////            if (myNumber%2 == 0){
////                System.out.println();
////            }
//
//        //day nya 1,2,3,5
//        Integer [] day = {1,2,3,5};
//
//        String dayName;
//        for (Integer myNum : day){
//            switch (myNum) {
//                case 1: dayName = "Sunday"; break;
//                case 2: dayName = "Monday"; break;
//                case 3: dayName = "Tuesday"; break;
//                default: dayName = "Invalid day"; break;
//            }
//        System.out.println(dayName);
//        }
//
//        //Switch case odd even
//        Integer [] angka = {10,75,76,47};
//
//        String checkAngka;
//        for (Integer myAngka : angka){
//            switch (myAngka % 2){
//                case 0: checkAngka = "Genap"; break;
//                case 1: checkAngka = "Ganjil"; break;
//                default: checkAngka = "Invalid Number"; break;
//            }
//            System.out.println(checkAngka);
//        }

//        //print 1 - 50 jika ada odd print angkanya
//        for (int i = 1; i <= 50; i++){
//            if (i % 2 == 1) {
//                System.out.println(i );
//            } else {
//                System.out.println("even ");
//            }
//        }

        //while loops odd even
//        int i = 1;
//        while (i <= 50){
//            if (i % 2 == 1) {
//                System.out.println(i );
//            } else {
//                System.out.println("even ");
//            }
//            i++;
//        }

        //do while loops
//        int i = 1;
//        do {
//            if (i % 2 == 1) {
//                System.out.println(i );
//            } else {
//                System.out.println("even ");
//            }
//            i++;
//        } while (i <= 50);

        //break
//        for (int i = 1; i <= 50; i++){
//            if (i % 15 == 0) {
//                break;
//            } else {
//                System.out.println(i);
//            }
//        }

        //continue
//        for (int i = 1; i <= 30 ; i++) {
//            if (i % 2 == 0){
//                continue;
//            }
//            System.out.println(i);
//        }

        //faktorial
        int myNum = 8;
        int result = 1;
        for (int i = 1; i <= myNum ; i++) {
            result = result*i;
        }
        System.out.println(result);
    }
}