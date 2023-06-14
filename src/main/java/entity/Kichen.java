package entity;

import java.util.ArrayList;

public class Kichen {
     public String name;
     public String id;
     public String loc;
   public ArrayList<Dish> d;



    public Kichen(String c , String name , String r ){
        this.name = name;
        this.id= c;
        this.loc=r;
        d = new ArrayList<>();
    }
    public void addDish(int id,String name , int price){


            Dish di = new Dish(id,name,price);
            d.add(di);

    }
    @Override
    public String toString() {
        return "Kichen" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", location=" + loc +

                "";
    }

}
