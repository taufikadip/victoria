public class Book extends LibraryItem {
    //atributes
    public String author;
    public int pages;

    //Construct
    public Book(String title, String itemId, String author, int pages){
        super(title, itemId);
        this.author = author;
        this.pages = pages;
    }

    @Override
    public void checkout(){
        if(isCheckout == false){
            isCheckout = true;
            System.out.println("Buku berhasil dipinjam");
        } else {
            System.out.println("Buku sedang tidak ada");
        }
    }

    @Override
    public void returnItem(){
        if(isCheckout == true){
            isCheckout = false;
            System.out.println("Buku berhasil dikembalikan");
        } else {
            System.out.println("Buku masih ada");
        }
    }

    @Override
    public void printDetails(){
        System.out.println("Judul Buku = " + title);
        System.out.println("ID Buku = " + itemId);
        System.out.println("Author = " + author);
        System.out.println("Jumlah Halaman = " + pages);
        System.out.println("Apakah buku sedang dipinjam = " + (isCheckout ? "Iya" : "Tidak"));
    }
}
