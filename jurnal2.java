import java.util.ArrayList;

class items<T> {
    private ArrayList<T> dataList;

    public items() {
        this.dataList = new ArrayList<>();
    }

    public void addData(T data) {
        dataList.add(data);
    }

    public void removeData(T data) {
        dataList.remove(data);
    }

    public void editData(int index, T newData) {
        dataList.set(index, newData);
    }

    public void displayData() {
        for (T data : dataList) {
            System.out.println(data.toString());
        }
    }
}

class ATK {
    private String KodeBarang;
    private String JenisBarang;
    private String NamaBarang;
    private int Stok;

    public ATK(String KodeBarang, String JenisBarang, String NamaBarang, int Stok) {
        this.KodeBarang = KodeBarang;
        this.JenisBarang = JenisBarang;
        this.NamaBarang = NamaBarang;
        this.Stok = Stok;
    }
    public String toString() {
        return "Kode: " + KodeBarang + ", Jenis: " + JenisBarang + ", Nama: " + NamaBarang + ", Stok: " + Stok;
    }
}
class Bag {
    private String KodeBarang;
    private String JenisBarang;
    private String NamaBarang;
    private int Stok;

    public Bag(String KodeBarang, String JenisBarang, String NamaBarang, int Stok) {
        this.KodeBarang = KodeBarang;
        this.JenisBarang = JenisBarang;
        this.NamaBarang = NamaBarang;
        this.Stok = Stok;
    }
    public String toString() {
        return "Kode: " + KodeBarang + ", Jenis: " + JenisBarang + ", Nama: " + NamaBarang + ", Stok: " + Stok;
    }
}
public class jurnal2 {
    public static void main(String[] args) {
        items<ATK> atkInventory = new items<>();
        atkInventory.addData(new ATK("A001", "Pulpen", "Snowman Board Marker Hitam", 50));
        atkInventory.addData(new ATK("A002", "Pensil", "Faber Castell 2B", 30));
        atkInventory.addData(new ATK("A003", "Spidol", "Sharpie Permanent Marker", 40));
        atkInventory.addData(new ATK("A004", "Pulpen", "Pilot G-2 0.5mm", 60));
        atkInventory.addData(new ATK("A005", "Pensil", "Staedtler Noris 2B", 20));

        System.out.println("ATK Data:");
        atkInventory.displayData();
        atkInventory.toString();

        items<Bag> bagInventory = new items<>();
        bagInventory.addData(new Bag("C001", "Tempat Pensil", "Tas Pensil Oxford", 10));
        bagInventory.addData(new Bag("C002", "Tempat Pensil", "Pouch Pensil Kanvas", 20));
        bagInventory.addData(new Bag("C003", "Tas", "Tas Ransel Laptop", 15));
        bagInventory.addData(new Bag("C004", "Tas", "Tas Selempang", 25));
        bagInventory.addData(new Bag("C005", "Tempat Pensil", "Kotak Pensil Kayu", 30));

        System.out.println("\nBAG Data:");
        bagInventory.displayData();
        bagInventory.toString();
    }
}