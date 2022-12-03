package org.example;

public class Item {
    private String itemId;
    private String name;
    private int quantity;

    public Item(String itemId, String name, int quantity) {
        this.itemId = itemId;
        this.name = name;
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }
}
