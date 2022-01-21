package pojo;

public class Library {
    public static void main(String[] args) {
        Book galaxy = new Book("The Hitchhiker’s Guide to the Galaxy", 650);
        Book cleanCode = new Book("Clean code", 300);
        Book harry = new Book("Harry Potter and the Goblet of Fire", 523);
        Book lr = new Book("The Lord of the Rings", 793);
        Book[] book = new Book[4];
        book[0] = galaxy;
        book[1] = cleanCode;
        book[2] = harry;
        book[3] = lr;
        for (int i = 0; i < book.length; i++) {
            Book rsl = book[i];
            System.out.println("Book name: " + rsl.getBook() + " all pages: " + rsl.getPages());
        }
        System.out.println("Swap book 1 with book 2");
        Book swp;
        swp = book[3];
        book[3] = book[0];
        book[0] = swp;
        for (int i = 0; i < book.length; i++) {
            Book rsl = book[i];
            System.out.println("Book name: " + rsl.getBook() + " all pages: " + rsl.getPages());
        }
        System.out.println("Show CleanCode");
        for (int i = 0; i < book.length; i++) {
            Book rsl = book[i];
            if  ("Clean code".equals(rsl.getBook())) {
            System.out.println("Book name: " + rsl.getBook() + " all pages: " + rsl.getPages());
        }
    }
}
}
