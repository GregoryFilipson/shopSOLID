import java.util.Arrays;
import java.util.List;

public interface SetRandomDeliveryStatus { //Interface segregation principle
    List<String> listOfPossibleStatuses = Arrays.asList("PAID", "AWAITING PAYMENT", "CANCELED", "DELIVERED");

    String selectRandomStatus(List<String> list);
}
