public class Main {
    public static void main(String[] args) {
        MyEmployee myEmployee = new MyEmployee();
        myEmployee.nama = "Adi";
        myEmployee.npk = "68776";
        myEmployee.salary = 999;
        myEmployee.address = "Bintaro";
        myEmployee.age = 24;

        myEmployee.sayHello();
        System.out.println("Nama Karyawan = " + myEmployee.nama);
        System.out.println("NPK Karyawan = " + myEmployee.npk);
        System.out.println("Salary Karyawan = " + myEmployee.salary);
        System.out.println("Alamat Karyawan = " + myEmployee.address);
        System.out.println("Usia Karyawan = " + myEmployee.age);

        MyEmployee myEmployee2 = new MyEmployee();
        myEmployee2.nama = "Kevin";
        myEmployee2.npk = "68777";
        myEmployee2.salary = 1000;
        myEmployee2.address = "Cilincing";
        myEmployee2.age = 25;

        myEmployee.sayHello();
        System.out.println("Nama Karyawan = " + myEmployee2.nama);
        System.out.println("NPK Karyawan = " + myEmployee2.npk);
        System.out.println("Salary Karyawan = " + myEmployee2.salary);
        System.out.println("Alamat Karyawan = " + myEmployee2.address);
        System.out.println("Usia Karyawan = " + myEmployee2.age);
    }
}