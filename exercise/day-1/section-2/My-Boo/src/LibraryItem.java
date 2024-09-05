abstract class LibraryItem {
    // inisialisasi atribut
    protected String title;
    protected String itemId;
    protected boolean isCheckout;

    //construct
    public LibraryItem(String title, String itemId){
        this.title = title;
        this.itemId = itemId;
        this.isCheckout = false;
    }

    //method
    public String getTitle(){
        return title;
    }

    public String getItemId(){
        return itemId;
    }

    public boolean isCheckOut(){
        return isCheckout;
    }

    // abstract method
    abstract void checkout();
    abstract void returnItem();
    abstract void printDetails();
}
