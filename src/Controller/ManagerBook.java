package Controller;

import Model.Book;
import Storage.DataBook;
import Storage.FileBook;

import java.util.ArrayList;
import java.util.List;

public class ManagerBook {
    List<Book> bookList = new ArrayList<>();

    FileBook dataBook = FileBook.getINSTANCE();

    public ManagerBook(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void addNewBook(Book book){
        bookList.add(book);
        dataBook.setData(bookList);
    }
    public void showBook(){
        for (Book b: bookList
             ) {
            System.out.println(b);
        }
    }
}
