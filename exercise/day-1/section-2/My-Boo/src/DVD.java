public class DVD extends LibraryItem{
    //atributes
    public String director;
    public int duration;

    //Construct
    public DVD(String title, String itemId, String author, int pages){
        super(title, itemId);
        this.director = director;
        this.duration = duration;
    }

    @Override
    public void checkout(){
        if(isCheckout == false){
            isCheckout = true;
            System.out.println("DVD berhasil dipinjam");
        } else {
            System.out.println("DVD sedang tidak ada");
        }
    }

    @Override
    public void returnItem(){
        if(isCheckout == true){
            isCheckout = false;
            System.out.println("DVD berhasil dikembalikan");
        } else {
            System.out.println("DVD masih ada");
        }
    }

    @Override
    public void printDetails(){
        System.out.println("Nama DVD = " + title);
        System.out.println("ID DVD = " + itemId);
        System.out.println("Director = " + director);
        System.out.println("Durasi = " + duration);
        System.out.println("Apakah DVD sedang dipinjam = " + (isCheckout ? "Dipinjam" : "Tersedia"));
    }
}
