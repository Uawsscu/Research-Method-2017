
/**
 *
 * @author tong_Uawsscu
 */
import java.util.*;
import java.util.ArrayList;

public class Quiz3Bidding {

    ArrayList<ProductBid> t = new ArrayList<>();
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Quiz3Bidding b = new Quiz3Bidding();
        for (;;) {
            String type = in.next();
            if (type.equals("exit")) {
                break;
            } else if (type.equals("new")) {
                b.news();
            } else if (type.equals("viewall")) {
                b.viewAll();
            } else if (type.equals("bid")) {
                b.bid(in.next(), in.next(), in.nextInt());
            } else if (type.equals("delete")) {
                b.delete(in.next());
            }else if (type.equals("view")) {
                b.view(in.next());
            }
        }

    }

    void news() {
        t.add(new ProductBid(in.next(), in.next(), in.next(), in.nextInt(), null));
    }

    void view(String id) {
        for (int i = 0; i < t.size(); i++) {
            if (id.equals(t.get(i).getId())) {
                System.out.println("view " + t.get(i).getId() + " " + t.get(i).getNameProduct() + " "+t.get(i).getStartPrice()+" " + t.get(i).getNameBitHigh() + " ");
            }
        }
    }

    void viewAll() {
        System.out.println("viewall " + t.size() + " items");
        for (ProductBid arr : t) {
            System.out.println(arr.getId() + " " + arr.getNameProduct() + " " + arr.getStartPrice() + " " + arr.getNameBitHigh());
        }
        System.out.println("==========");
    }

    void bid(String id, String nameBid, int priceBid) {
        for (int i = 0; i < t.size(); i++) {
            if (id.equals(t.get(i).getId()) && priceBid > t.get(i).getStartPrice()) {
                t.get(i).setStartPrice(priceBid);
                t.get(i).setNameBitHigh(nameBid);
            }
        }
    }

    void delete(String id) {
        for (int i = 0; i < t.size(); i++) {
            if (id.equals(t.get(i).getId())) {
                t.remove(i);
            }
        }
    }
}

class ProductBid {

    private String id;
    private String nameProduct;
    private String nameOwner; //เจ้าของสินค้า
    private int startPrice;
    private String nameBidHigh;

    public ProductBid(String id, String nameProduct, String nameOwner, int startPrice, String nameBidHigh) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.nameOwner = nameOwner;
        this.startPrice = startPrice;
        this.nameBidHigh = nameBidHigh;
    }

    public String getId() {
        return id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public int getStartPrice() {
        return startPrice;
    }

    public String getNameBitHigh() {
        return nameBidHigh;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public void setStartPrice(int startPrice) {
        this.startPrice = startPrice;
    }

    public void setNameBitHigh(String nameBidHigh) {
        this.nameBidHigh = nameBidHigh;
    }
}
