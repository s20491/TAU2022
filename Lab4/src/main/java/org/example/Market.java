package org.example;
import org.example.intefaces.IItemService;
import java.util.List;

public class Market {

    public Market(IItemService itemService) {
        this.itemService = itemService;
    }
    private final IItemService itemService;
    private List<Item> items;
    public void setItems(List<Item> items) {
        this.items = items;
    }

    public double getMarketValue() {
        double marketValue = 0.0;
        for (Item item : items) {
            marketValue += itemService.getPrice(item) * item.getQuantity();
        }
        return marketValue;
    }
}
