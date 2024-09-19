import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
         //Kitap ismine göre sıralamak için
         /*TreeSet<Book> books = new TreeSet<>(new OrderNameComparator());*/

        // Kitap sayfa sayısına göre listelemek için
        TreeSet<Book> books = new TreeSet<>(new OrderPageNumberComparator());

        books.add(new Book("Ince Memed", 374, "Yaşar Kemal", "1955"));
        books.add(new Book("Kuyucaklı Yusuf", 192, "Sabahattin Ali", "1937"));
        books.add(new Book("Mai ve Siyah", 407, "Halit Ziya Uşaklıgil", "1897"));
        books.add(new Book("Yaban", 218, "Yakup Kadri Karaosmanoğlu", "1932"));
        books.add(new Book("Anayurt Oteli", 105, "Yusuf Atılgan", "1973"));


        System.out.printf("%-20s %-10s %-25s %-10s\n", "Kitap İsmi", "Sayfa", "Yazar", "Yıl");

        System.out.printf("%-20s %-10s %-25s %-10s\n", "--------------------", "--------", "-------------------------", "--------");

        for (Book b : books) {
            System.out.printf("%-20s %-10d %-25s %-10s\n", b.getName(), b.getPageNumber(), b.getAuthorName(), b.getPublicationDate());
        }
    }
}
