package ch06;

import java.util.*;

class GameCharacter {
    private class GameItem {
        private String name;
        private int type;
        private int price;

        public int getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "GameItem [name = " + name + ", type = " + type + ", price = " + price + "]";
        }
    }

    private ArrayList<GameItem> list = new ArrayList<>();

    public void add(String name, int type, int price) {
        GameItem item = new GameItem();
        item.name = name;
        item.type = type;
        item.price = price;
        list.add(item);
    }

    public void print() {
        int total = 0;

        for(GameItem item : list) {
            System.out.println(item);
            total += item.getPrice();
        }
        System.out.println(total);
    }
}

public class GameCharacterTest {
    public static void main(String[] args) {
        GameCharacter gcc = new GameCharacter();
        gcc.add("Sword", 1, 100);
        gcc.add("Gun", 2, 50);
        gcc.print();
    }
}
