import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int firstSales[] = {1, 2, 3, 4, 5};
        SalesManager manager = new SalesManager(firstSales);

        int x;
        x = manager.max();
        System.out.println(x);
    }
}