package task5;

public class Main {
    static BookPair[] bookPairs = new BookPair[3];

    public static void main(String[] args) {
        bookPairs[0] = new BookPair("Анна каренина", "Л.Н. Толстой");
        bookPairs[1] = new BookPair("Мастер и Маргарита", "М.А. Булгаков");
        bookPairs[2] = new BookPair("Преступление и Наказание", "Ф.М. Достоевский");
        printBooks();
    }

    static void printBooks() {
        for (BookPair bookPair : bookPairs) {
            System.out.println(bookPair);
        }
    }

}