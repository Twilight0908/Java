package product;

import java.util.Comparator;

public class ProductComparatorASC implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getQuantity() > o2.getQuantity()) {
            return 1;
        } else if (o1.getQuantity() == o2.getQuantity()) {
            return 0;
        } else {
            return -1;
        }
    }
}
