package bookManagement.management;

import bookManagement.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookManage implements Management<Book> {
    private ArrayList<Book> bookArrayList;

    public BookManage() {
        bookArrayList = new ArrayList<>();
    }

    @Override
    public void add(Book book) {
        bookArrayList.add(book);
    }

    @Override
    public void delete(int id) {
        int index = findIndexById(id);
        if (index != -1) {
            bookArrayList.remove(index);
        } else {
            System.out.println("Khong co id muon xoa");
        }
    }

    @Override
    public void edit(int id, Book book) {
        int index = findIndexById(id);
        if (index != -1) {
            bookArrayList.set(index, book);
        } else {
            System.out.println("Khong co id muon sua");
        }
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < bookArrayList.size(); i++) {
            if (bookArrayList.get(i).getDocumentId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public List<Book> findAll() {
        return bookArrayList;
    }
}
