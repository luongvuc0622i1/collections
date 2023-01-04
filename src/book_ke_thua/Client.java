package book_ke_thua;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Book book1 = new ProgrammingBook(001, "a", 154, "dshav", "Java", "ds");
        Book book2 = new ProgrammingBook(002, "b", 54, "dshav", "Java", "ds");
        Book book3 = new ProgrammingBook(003, "c", 104, "dshav", "Javas", "ds");
        Book book4 = new ProgrammingBook(004, "d", 84, "dshav", "Java", "ds");
        Book book5 = new ProgrammingBook(005, "e", 75, "dshav", "Javax", "ds");
        Book book6 = new FictionBook(006, "f", 48, "ddv", "Vien tuong 1");
        Book book7 = new FictionBook(007, "g", 438, "ddv", "Vien tuong 1");
        Book book8 = new FictionBook(010, "h", 98, "ddv", "Vien tuong 2");
        Book book9 = new FictionBook(011, "i", 118, "ddv", "Vien tuong 2");
        Book book10 = new FictionBook(012, "k", 348, "ddv", "Vien tuong 3");

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);
        bookList.add(book7);
        bookList.add(book8);
        bookList.add(book9);
        bookList.add(book10);

        int sum = 0;
        for (Book book : bookList) {
            sum += book.getPrice();
        }
        System.out.println(sum);

        int countJava = 0;
        for (Book book : bookList) {
            if (book instanceof ProgrammingBook && ((ProgrammingBook) book).getLanguage().equals("Java")) {
                countJava++;
            }
        }
        System.out.println(countJava);

        int countVT = 0;
        for (Book book : bookList) {
            if (book instanceof FictionBook && ((FictionBook) book).getCategory().equals("Vien tuong 1")) {
                countVT++;
            }
        }
        System.out.println(countVT);

        for (Book book : bookList) {
            if (book instanceof FictionBook && book.getPrice() < 100) {
                System.out.println(book.getName());
            }
        }
    }
}
