import java.util.Comparator;

public class OrderPageNumberComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2){
        return b1.getPageNumber() - b2.getPageNumber();
    }
}
