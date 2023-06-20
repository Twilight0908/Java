package product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductManager {
    private List<Product> productList;

    public ProductManager() {
        productList = new ArrayList<>();
    }

    public void add(Product product) {
        productList.add(product);
    }

    public void edit(int id, Product product) {
        int index = findIndexById(id);
        if (index != 0) {
            productList.set(index, product);
        } else {
            System.out.println("Khong co san pham voi id: " + id);
        }
    }

    public void delete(int id) {
        int index = findIndexById(id);
        if (index != -1) {
            productList.remove(index);
        } else {
            System.out.println("Khong co san pham voi id: " + id);
        }
    }

    public int findIndexById(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getIdProduct() == id) {
                return i;
            }
        }
        return -1;
    }

    public List<Product> findAll() {
        return productList;
    }

    public void sortASC() {
        ProductComparatorASC comparator = new ProductComparatorASC();
        Collections.sort(productList, comparator);
    }

    public void sortDEC() {
        ProductComparatorDEC comparator = new ProductComparatorDEC();
        Collections.sort(productList, comparator);
    }
}
