import org.example.Market;
import org.example.Item;
import org.example.services.ItemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ItemMockTest {
    @Mock
    ItemService itemService;
    @InjectMocks
    Market market;

    @Test
    public void the_value_of_items_should_be_equal_4299_57() {
        List<Item> items = new ArrayList<Item>();
        Item shirt = new Item("1", "Shirt", 43);
        items.add(shirt);
        market.setItems(items);
        when(itemService.getPrice(shirt)).thenReturn(99.99);

        double marketValue = market.getMarketValue();
        assertEquals(4299.57, marketValue, 0);
    }
}