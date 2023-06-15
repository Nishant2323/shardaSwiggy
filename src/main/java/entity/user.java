package entity;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class user {
    public int id;
     public String name;
    public int wallet;

    public user(int id, String name, int wallet) {
        this.id = id;
        this.name = name;
        this.wallet = wallet;
    }
    public int addamount(int add){
        this.wallet= this.wallet+add;
        return this.wallet;
    }
    public int payment(int bill) throws IOException {
        int ans = 0;
        if(bill>this.wallet){
            return -1;


        }
        else{
            ans  = this.wallet-bill;
        }
        return ans;
    }
}
