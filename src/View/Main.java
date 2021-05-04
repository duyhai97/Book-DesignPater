package View;

import Controller.FactoryBook;
import Controller.ManagerBook;
import Model.Book;
import Model.FictionBook;
import Model.ProgrammingBook;
import Model.TypeOfBook;
import Storage.DataBook;
import Storage.FileBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();



        FileBook dataBook = FileBook.getINSTANCE();

        bookList = dataBook.getData();
        ManagerBook hai = new ManagerBook(bookList);




        while (true){
            System.out.println("moi nhap lua chon: ");
            System.out.println("1: them moi");
            System.out.println("2: hien thi: ");
            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    System.out.println("nhap a de them sach Fiction");
                    System.out.println("nhap b de them sach programming");
                    Scanner s = new Scanner(System.in);
                    String type = s.nextLine();
                    switch (type){
                        case "a" :
                            System.out.println("moi nhap id: ");
                            Scanner scanner1 = new Scanner(System.in);
                            int id = scanner1.nextInt();
                            System.out.println("moi nhap name: ");
                            Scanner scanner2 = new Scanner(System.in);
                            String name = scanner2.nextLine();
                            System.out.println("moi nhap author: ");
                            Scanner scanner3 = new Scanner(System.in);
                            String author = scanner3.nextLine();
                            System.out.println("moi nhap price: ");
                            Scanner scanner4 = new Scanner(System.in);
                            int price = scanner4.nextInt();
                            System.out.println("moi nhap category: ");
                            Scanner scanner5 = new Scanner(System.in);
                            String category = scanner5.nextLine();
                            Book book = FactoryBook.getBook(TypeOfBook.Fiction, id, name, author, price);
                            ((FictionBook) book).setCategory(category);
                            hai.addNewBook(book);
                            break;
                        case "b" :
                            System.out.println("moi nhap id: ");
                            Scanner scanner6 = new Scanner(System.in);
                            int id1 = scanner6.nextInt();
                            System.out.println("moi nhap name: ");
                            Scanner scanner7 = new Scanner(System.in);
                            String name1 = scanner7.nextLine();
                            System.out.println("moi nhap author: ");
                            Scanner scanner8 = new Scanner(System.in);
                            String author1 = scanner8.nextLine();
                            System.out.println("moi nhap price: ");
                            Scanner scanner9 = new Scanner(System.in);
                            int price1 = scanner9.nextInt();
                            System.out.println("moi nhap language: ");
                            Scanner scanner10 = new Scanner(System.in);
                            String language = scanner10.nextLine();
                            System.out.println("moi nhap framework: ");
                            Scanner scanner11 = new Scanner(System.in);
                            String framework = scanner11.nextLine();
                            Book book1 = FactoryBook.getBook(TypeOfBook.Programming, id1, name1, author1, price1);
                            ((ProgrammingBook) book1).setLanguage(language);
                            ((ProgrammingBook) book1).setFramework(framework);
                            hai.addNewBook(book1);
                            break;
                    }
                    break;
                case 2:
                    hai.showBook();



            }
        }

    }
}
