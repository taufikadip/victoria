abstract class Animal {
//    public String name;
//    public String species;
//
//    public Animal(String name, String species){
//        this.name = name;
//        this.species = species;
//    }

//    void makesound(){
//        System.out.println("Some generic animal sound.");
//    }
//
//    void eat(){
//        System.out.println("This animal eats food.");
//    }

    abstract void sound(); //abstract method

    void sleep(){
        System.out.println("This animal is sleeping");
    }
}