package task5;

public class BookPair {
    private String name;
    private String autor;

    public BookPair(String name, String autor) {
        this.name = name;
        this.autor = autor;
    }

    public String getName() {
        return name;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Книга:" +
                "Название - " + name + '.' +
                "Автор - " + autor +
                '.';
    }
}
