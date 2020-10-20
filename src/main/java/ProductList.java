import java.util.Arrays;

public class ProductList {
    private final String [] productList = {"1. Футболка", "2. Трусы", "3. Шорты", "4. Джинсы", "5. Пальто"};

    public String[] getProductList() {
        return productList;
    }

    @Override
    public String toString() {
        return " " + Arrays.toString(productList);
    }
}
