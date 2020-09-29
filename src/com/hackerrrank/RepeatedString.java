package com.hackerrrank;

import java.util.ArrayList;
import java.util.List;

public class RepeatedString {

    public static void main(String[] args) {

        String s = "81 : (1,53.38,$45) (2,88.62,$98) (3,78.48,$3) (4,72.30,$76) (5,30.18,$9) (6,46.34,$48)";
        String[] arr = s.split(":");
        Integer max_weight = Integer.parseInt(arr[0].trim());
        System.out.println(max_weight);
        String data = arr[1].trim();
        data = data.substring(1,data.length()-1);
        System.out.println(data);
        String[] dataArr  = data.split("\\) \\(");
        System.out.println(dataArr);

        List<Item> items = new ArrayList<>();
        for (String item: dataArr) {
           String[] itemArray = item.split(",");
           items.add(new Item(Integer.parseInt(itemArray[0]),Float.parseFloat(itemArray[1]),Float.parseFloat(itemArray[2].substring(1))));
        }
        System.out.println(items);
    }

    public int solution(String s, int length){

        //char arr arr = new char[length];

        return 0;
    }
}
class Item{

    private int id;
    private float weight;
    private float price;

    public Item(int id, float weight, float price) {
        this.id = id;
        this.weight = weight;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public float getWeight() {
        return weight;
    }

    public float getPrice() {
        return price;
    }
}