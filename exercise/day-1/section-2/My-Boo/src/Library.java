import java.util.ArrayList;

public class Library {
    private ArrayList<LibraryItem> items;

    public Library(){
        items = new ArrayList<LibraryItem>();
    }

    void addItem(LibraryItem item){
        //menambahkan item ke arraylist
        items.add(item);
        System.out.println("tambah satu item");
    }

    void removeItem(String id){
        for(LibraryItem item : items){
            if(id == item.itemId){
                items.remove(item);
                System.out.println("item berhasil dihapus");
            }
        }
        System.out.println("item tidak ditemukan");
    }

    void listAllitem(){
        for (LibraryItem item : items){
            item.printDetails();
            System.out.println("test");
        }
    }

    void checkoutItem(String id){
        for(LibraryItem item : items){
            if(id == item.itemId){
                items.remove(item);
                System.out.println("item berhasil dicheckout");
            }
        }
        System.out.println("item tidak ditemukan");
    }

    void returnItem(String id){
        for(LibraryItem item : items){
            if(id == item.itemId){
                items.remove(item);
                System.out.println("item berhasil dikembalikan");
            }
        }
        System.out.println("item tidak ditemukan");
    }
}
