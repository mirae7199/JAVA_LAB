package ch18;

public class BookArrayTest {
    public static void main(String[] args) {

        Book[] libaray = new Book[5];


        libaray[0] = new Book("태백산맥1", "조정래");
        libaray[1] = new Book("태백산맥2", "조정래");
        libaray[2] = new Book("태백산맥3", "조정래");
        libaray[3] = new Book("태백산맥4", "조정래");
        libaray[4] = new Book("태백산맥5", "조정래");

        for(Book book : libaray){
            book.showBookInfo();
            System.out.println(book);
        }
    }
}
