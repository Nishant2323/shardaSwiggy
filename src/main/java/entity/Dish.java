package entity;

public class Dish {



    public int id;
    public String name;
   public int price;
    public Dish(int id,String name, int price){
        this.id=id;
        this.name = name;
        this.price= price;
    }
    @Override
    public String toString() {
        return "" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                "";
    }

}
