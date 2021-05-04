package Controller;

import Model.Book;
import Model.FictionBook;
import Model.ProgrammingBook;
import Model.TypeOfBook;

public class FactoryBook {
    private FactoryBook(){}

    public static Book getBook(TypeOfBook typeOfBook, int id, String name, String author, int price){
        Book book;
        switch (typeOfBook){
            case Fiction:
                book = new FictionBook(id, name, price, author);
                break;
            case Programming:
                book = new ProgrammingBook(id, name, price, author);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + typeOfBook);
        }
        return book;
    }
}
