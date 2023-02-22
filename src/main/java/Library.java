import java.util.ArrayList;

public class Library {

    private ArrayList<Books> bookCollection;
    private Integer capacity;

    public Library (ArrayList<Books> bookCollection, Integer capacity){
        this.bookCollection = bookCollection;
        this.capacity = capacity;
    }

    public int getBookCount() {
        return this.bookCollection.size();
    }

    public void addBook(Books book) {
        this.bookCollection.add(book);
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String checkIfStockFull(){
        if(getBookCount() < getCapacity()){
            return "You can add a book";
        }
        else {
            return "The library is full";
        }
    }

    public Books removeBook() {
        return this.bookCollection.remove(0);

    }
}
