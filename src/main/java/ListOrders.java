import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListOrders implements SetRandomDeliveryStatus { //Open-closed principle класс расширен функционалом
    private final List<List> listOrders = new ArrayList<>();   //интерфейса

    public List<List> getListOrders() {
        return listOrders;
    }

    public List<String> getListOfPossibleStatuses() {
        return listOfPossibleStatuses;
    }

    public String selectRandomStatus (List<String> list) { //Dependency inversion principle - т.к. мы сможем
        Random rand = new Random();                       //например написать еще один метод, устанавливающий
        int randomIndex = rand.nextInt(list.size());   //не случайную, а вполне конкретную логику статусов
        return list.get(randomIndex);                   //random здесь только для примеров
    }

    @Override
    public String toString() {
        for (int i = 0; i < listOrders.size(); i++) { //избегаем магических чисел!
            System.out.println("Заказ" + listOrders.get(i) + ". Статус заказа: " + selectRandomStatus(getListOfPossibleStatuses()));
        }
        return "Спасибо что выбрали нас!";
    }
}
