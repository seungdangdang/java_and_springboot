package chapter2.ch21;

public class BookTest {

    public static void main(String[] args) {
        Book[] library = new Book[3];
        Book[] copyLibrary = new Book[3];

        library[0] = new Book("해리포터", "J.K 롤링");
        library[1] = new Book("홍길동전", "허균");
        library[2] = new Book("빨간망토", "미상");

        for(Book book : library) {
            System.out.println(book);
            book.showInfo();
        }

        System.arraycopy(library, 0, copyLibrary, 0, 3);

        System.out.println("======copy library=========");
        for(Book book : copyLibrary) {
            book.showInfo();
        }

        library[0].setTitle("Harry Potter");
        library[0].setAuthor("J.K Rowling");

        System.out.println("======origin library=========");
        for(Book book : library) {
            book.showInfo();
        }

        System.out.println("======copy library=========");
        for(Book book : copyLibrary) {
            book.showInfo();
        }
    }
}
