
import java.util.*;
import java.util.ArrayList;
import java.util.TreeMap;

public class Computer {

    public static Map<Integer, Computer> input = new TreeMap<>();
    private int id;
    private int type;
    private int price;
    private int stock;

    public Computer(int id, int type, int price, int stock) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Computer{" + "id=" + id + ", type=" + type + ", price=" + price + ", stock=" + stock + '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public int getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("This is  a N ");
        int N = in.nextInt();
        System.out.println("COM..");
        for (int i = 0; i < N; i++) {
            int id1 = in.nextInt();
            int type1 = in.nextInt();
            int price1 = in.nextInt();
            int stock1 = in.nextInt();
            input.put(id1, new Computer(id1, type1, price1, stock1));

        }

        for (Map.Entry entry : input.entrySet()) {
            System.out.println(entry.getValue());
        }
        System.out.println("You enter... K ");
        // System.out.println(input.get(4).getId());
        int K = in.nextInt();

        for (int i = 0; i < K; i++) {
            int sum = 0;
            int R1 = in.nextInt();
            int R2 = in.nextInt();
            int R3 = in.nextInt();

            if (input.get(R1).getType() != input.get(R2).getType() && input.get(R1).getType() != input.get(R3).getType() && input.get(R2).getType() != input.get(R3).getType()) {

                if (input.get(R1).getStock() >0 && input.get(R2).getStock() > 0 && input.get(R3).getStock() > 0) {
                    sum += input.get(R1).getPrice();
                    sum += input.get(R2).getPrice();
                    sum += input.get(R3).getPrice();

                    input.get(R1).setStock(input.get(R1).getStock() - 1);
                    input.get(R2).setStock(input.get(R2).getStock() - 1);
                    input.get(R3).setStock(input.get(R3).getStock() - 1);
                    System.out.println(sum + " "+ input.get(R2).getStock() +" "+input.get(R3).getStock()+" "+input.get(R2).getStock());
                } else {
                    System.out.println("out of stock");
                }

            } else {
                System.out.println("invalid order");
            }
        }

    }

}
