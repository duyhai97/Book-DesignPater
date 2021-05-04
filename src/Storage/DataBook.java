package Storage;

import Model.Book;

import java.util.List;

public interface DataBook {
    List<Book> getData();
    void setData(List<Book> books);
}
