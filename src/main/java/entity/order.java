package entity;

import java.util.ArrayList;

public class order {


   public int restoId;
    public int dishId;
   public int qua;
    public order(int restoId, int dishId, int qua) {
        this.restoId = restoId;
        this.dishId = dishId;
        this.qua = qua;
    }
    public int bill(ArrayList<Kichen> e){
        Kichen a= null;
//        String i = this.restoId+"";
        for(Kichen f : e){
            if(f.id.equals(String.valueOf(restoId))){
                 a = f;
                break;
            }
        }
        Dish dis = null;
        for(Dish d : a.d){
            if(this.dishId==d.id){
                dis=d;
            }
        }
        int bill = dis.price*this.qua;
        return bill;
    }
}
