public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        LibraryItem book1 = new Book("Buku 1", "BU1", "Andrea", 100);
        LibraryItem dvd1 = new DVD("DVD 1", "DV1", "DVR", 50);

        library.addItem(book1);
        library.addItem(dvd1);
        library.listAllitem();
        library.checkoutItem("BU1");
        library.listAllitem();
        library.returnItem("BU1");
        library.removeItem("1");
        library.listAllitem();
    }
}