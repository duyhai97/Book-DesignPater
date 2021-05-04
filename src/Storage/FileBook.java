package Storage;

import Model.Book;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileBook implements DataBook {

    private FileBook(){}

    private static FileBook INSTANCE;

    public static FileBook getINSTANCE(){
        if (INSTANCE == null) INSTANCE = new FileBook();
        return INSTANCE;
    }

    @Override
    public List<Book> getData() {
        File file = new File("list.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (file.length() > 0){
            FileInputStream fileInputStream = null;
            try {
              fileInputStream = new FileInputStream(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            ObjectInputStream objectInputStream = null;
            try {
                objectInputStream = new ObjectInputStream(fileInputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Object obj = null;
            try {
                obj = objectInputStream.readObject();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            List<Book> bookList = (List<Book>) obj;
            return bookList;
        }
        return new ArrayList<>();
    }

    @Override
    public void setData(List<Book> books) {
        File file = new File("list.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            objectOutputStream.writeObject(books);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
