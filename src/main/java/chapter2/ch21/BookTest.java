package chapter2.ch21;

public class BookTest {

    public static void main(String[] args) {
        Book[] library = new Book[3];

        library[0] = new Book("해리포터", "J.K 롤링");
        library[1] = new Book("홍길동전", "허균");
        library[2] = new Book("빨간망토", "미상");

        for(Book book : library) {
            System.out.println(book);
            book.showInfo();
        }
    }
}
