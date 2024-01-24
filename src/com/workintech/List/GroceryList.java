package com.workintech.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class GroceryList {
    private List <String> items;


    public GroceryList() {
        this.items=new ArrayList<>();
    }

    public boolean checkItemIsInList (String item){
        return items.contains(item);
    }

  public void addItem(String items){
        String[] splitItem= splitItems(items);
        for (String item:splitItem){
            String trimmedItem= item.trim();
            if(!checkItemIsInList(trimmedItem)){
                this.items.add(trimmedItem);
            }
        }
        Collections.sort(this.items);
      System.out.println("Items başarıyla eklendi");

  }

    private static String[] splitItems(String items) {
        String[] splitItems=items.split(",");
        return splitItems;
    }

    public void removeItem(String items){
        String[] splitItems= splitItems(items);
        for (String item:splitItems){
            String trimmedItem=item.trim();
            if (!checkItemIsInList(trimmedItem)){
                System.out.println(item + "zaten mevcut değil.");
            }else {
                this.items.remove(trimmedItem);
            }
        }

    }

    @Override
    public String toString() {
        return "GroceryList{" +
                "items=" + items +
                '}';
    }

    public void printSorted(){
        System.out.println("Sıralı pazar arabası şu şekildedir:");
        for (String item:this.items){
            System.out.println(item);
        }


    }


    public void addItems(String itemsToAdd) {
    }

    public void removeItems(String itemsToRemove) {
    }
}
