import java.util.ArrayList;
import java.util.List;

public class BasketProduct { //принцип единой ответственности, класс выполняет только роль корзины
    private final List<String> list = new ArrayList<>();

    public List<String> getList() {
        return list;
    }

    @Override
    public String toString() {
        return " " + list;
    }
}
