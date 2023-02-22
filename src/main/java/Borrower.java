import java.util.ArrayList;

public class Borrower {
    private ArrayList<Books> borrowerCollection;

    public Borrower (){
        this.borrowerCollection = new ArrayList<>();
    }

    public void addBorrowerBook(Books book) {
        this.borrowerCollection.add(book);
    }

    public int getBorrowerBookCount() {
        return this.borrowerCollection.size();
    }

    public void pickUpBookFromLibrary(Library library1) {
        Books book1 = library1.removeBook();
        this.addBorrowerBook(book1);
    }
}
