import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Size size;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ListOrders status = new ListOrders();
        while (true) {
            System.out.println("Привет! Добро пожаловать в магазин одежды! Ниже указан список возможных товаров: ");
            ProductList productList = new ProductList();
            BasketProduct basket = new BasketProduct();
            while (true) {
                System.out.println("Выбери действия, который ты хочешь выполнить или введи 0 для выхода:");
                System.out.println("1. Добавить продукт в Корзину");
                System.out.println("2. Удалить продукт из корзины");
                System.out.println("3. Перейти в корзину");
                System.out.println("4. Сформировать заказ и внести оплату");
                try {
                    int input = Integer.parseInt(reader.readLine());
                    if (input == 0) {
                        break;
                    } else if (input == 4) {
                        System.out.println("Заказ cформирован и оплата внесена!");
                        status.getListOrders().add(basket.getList());
                        break;
                    } else {
                        switch (input) {
                            case 1:
                                System.out.println("Введи номер продукта");
                                System.out.println(productList);
                                String inputProduct = productList.getProductList()[Integer.parseInt(reader.readLine()) - 1];
                                System.out.println("Отлично! Теперь выбери размер -  S, XS, L, M или XL");
                                String inputSize = reader.readLine();
                                size = sizeConverter(inputSize);
                                basket.getList().add(inputProduct + " " + size);
                                break;
                            case 2:
                                System.out.println("Выберите продукт, который Вы хотите удалить, например 1. Футболка S");
                                String inputDeleteItem = reader.readLine();
                                if (basket.getList().contains(inputDeleteItem)) {
                                    basket.getList().remove(inputDeleteItem);
                                } else {
                                    System.out.println("Такого продукта в корзине нет, либо вы не верно ввели данные");
                                }
                                break;
                            case 3:
                                System.out.println(basket);
                                break;
                        }
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Неверный ввод, проверь правильность ввода!");
                }
            }
            System.out.println("Введите 1 если хотите, просмотреть статус " +
                    "ваших заказов или 0 для выхода из программы!");
            int inputStatus = Integer.parseInt(reader.readLine());
            if (inputStatus == 0) {
                break;
            } else if (inputStatus == 1) {
                System.out.println(status);
            } else {
                System.out.println("Ты ввел не 0 и не 1...");
            }
        }
    }


    public static Size sizeConverter(String inputSize) {
        switch (inputSize) {
            case "S":
                return Size.S;
            case "M":
                return Size.M;
            case "XS":
                return Size.XS;
            case "L":
                return Size.L;
            case "XL":
                return Size.XL;
            default:
                throw new NumberFormatException();
        }
    }
}



