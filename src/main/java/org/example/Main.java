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
