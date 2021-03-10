package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {

        checkWinner();

        LinkedHashMap<String,String> map = new LinkedHashMap<>();
        System.out.println(map);

    }

    public static int checkWinner() {
        // WRITE YOUR CODE HERE


        List<String> finalList = Arrays.asList("A", "A", "B", "X", "B");
        List<String> shoppingCart = Arrays.asList("O", "A", "A", "B", "X", "B");
        int diff = shoppingCart.size() - finalList.size();
        if (finalList.size() != shoppingCart.size()) {
            int m = 0;
            int n = 0;
            if (diff > 0) {
                while (!finalList.get(m).equalsIgnoreCase(shoppingCart.get(n))) {
                    n++;
                    if (n > diff) {
                        return 0;
                    }
                }
            }


        }

        for (int i = 0; i < finalList.size(); i++) {

            if (!(finalList.get(i).equalsIgnoreCase("anything") ||
                    finalList.get(i).equalsIgnoreCase(shoppingCart.get(diff + i)))) {
                return 0;
            }
        }
        return 1;
    }
}
