package org.example;
import entity.*;
import entity.Kichen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Locale;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        ArrayList<Kichen> k = new ArrayList<>();
//        Kichen Ha= new Kichen("Halidiram","indian",4);
//        Ha.addDish("Pizza",20);
//        Ha.addDish("Buger",40);
//        Ha.addDish("momos",40);
//        k.add(Ha);
//
//        Kichen Hi= new Kichen("herasweet","indian",5);
//        Hi.addDish("Pizza",20);
//        Hi.addDish("Buger",40);
//        Hi.addDish("momos",40);
//        k.add(Hi);
        BufferedReader restro = Files.newBufferedReader(Paths.get("C:\\sharda_swiggy\\data\\restro.csv.txt"));
        BufferedReader dishes = Files.newBufferedReader(Paths.get("C:\\sharda_swiggy\\data\\dishes.csv.txt"));

        String line="";
        for( int i=0; (line= restro.readLine())!=null;i++){

            String[] p = line.split(",");
            k.add(new Kichen(p[0],p[1],p[2]));
        }
        for( int i=0; (line= dishes.readLine())!=null;i++){

            String[] p = line.split(",");
            for(Kichen g : k){

                if(g.id.equals(p[0])){
                    g.addDish(Integer.parseInt(p[1]),p[2],Integer.parseInt(p[3]));
                }
            }
        }


        System.out.println("Welcome to Sharda swiggy");
        System.out.println("*************************************************");
        System.out.println("enter you user id");
        BufferedReader input8 = new BufferedReader(new InputStreamReader(System.in));
        String w3 = input8.readLine();
        BufferedReader user = Files.newBufferedReader(Paths.get("C:\\sharda_swiggy\\data\\user.csv.txt"));
        String line1="";
     user n =null;
        for( int i=0; (line1= user.readLine())!=null;i++){

            String[] p = line1.split(",");
            if(w3.equals(p[0])){
                user u = new user(Integer.parseInt(p[0]),p[1],Integer.parseInt(p[2]));

            }
        }
        if(n==null){
            System.out.println("user not found so you can access as guest");
        }
        if(n!=null){
            System.out.println("welcome " + n.name);
        }
        System.out.println("enter 1 to see menu or 2 for search");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String w = input.readLine();
        switch ( Integer.parseInt(w) ){
            case 1: {
                for (Kichen j : k) {

                    System.out.println(j);
                    for (Dish f : j.d) {
                        System.out.println(f);
                    }
                    System.out.println("*************************************************");
                }
            }
            break;
            case 2 :System.out.println("under maintaines");
        }
        int bill = 0;
      System.out.println("Here to take your order ");
        System.out.println("Enter the order as follow first resto id , then dish id , then quantity ");
        String check = "yes";
        while(check.equals("yes")){

            BufferedReader input1 = new BufferedReader(new InputStreamReader(System.in));
            String w1 = input.readLine();
            String[] p = w1.split(",");
            order or = new order(Integer.parseInt(p[0]),Integer.parseInt(p[1]),Integer.parseInt(p[2]));
            int b =or.bill(k);
            bill = bill+b;
            System.out.println("enter yes to add more or no to not");
            BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));
            String w2 = input.readLine();
            check=w2;
        }

        System.out.println("your bill is = "+bill);
        if(n!=null){
            int t= n.payment(bill);
            while(t==-1)
            {
                System.out.println("insuffient balance");
                System.out.println("enter the amount you want to add");
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in) );
                String s = in.readLine();
                n.addamount(Integer.parseInt(s));

                t= n.payment(bill);
            }
            System.out.println("your balance now is = " + t + "you will recive  your order at 10 mins");
        }
        else{
            System.out.println("you have guest account you have only cash on dilvery option your order will reach in 10 mins");
        }




//        int i=0;
//        for(Kichen f : k){
//            System.out.println(i);
//            System.out.println(f);
//            System.out.print("Dishes"+" ");
//            for(Dish r : f.d){
//                int j=0;
//                 System.out.println(r);
//                 j++;
//            }
//            i++;
//        }


        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
        }
    }
