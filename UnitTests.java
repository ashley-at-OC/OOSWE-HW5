import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class UnitTests {
    @Test
    public void totalCostTest() {

        // Arrange
        Item item1 = mock(Item.class);
        Item item2 = mock(Item.class);
        when(item1.getCost()).thenReturn(5.0);
        when(item2.getCost()).thenReturn(10.0);
        OnlineOrder onlineOrder1 = new OnlineOrder();
        onlineOrder1.shoppingCart = new Item[] { item1, item2 };

        // Act
        onlineOrder1.totalCost();
        double result = onlineOrder1.totalCost;

        // Assert
        assertEquals(15.0, result, 0.1);
        verify(item1, times(1)).getCost();
        verify(item2, times(1)).getCost();
    };

    @Test
    public void freeShippingTest() {
        // Arrange
        Item item1 = mock(Item.class);
        Item item2 = mock(Item.class);
        when(item1.getCost()).thenReturn(90.0);
        when(item2.getCost()).thenReturn(20.0);
        OnlineOrder onlineOrder1 = new OnlineOrder();
        onlineOrder1.shoppingCart = new Item[] { item1, item2 };

        // Act
        onlineOrder1.totalCost();
        onlineOrder1.freeShipping(onlineOrder1.totalCost);
        boolean result = onlineOrder1.hasFreeShipping;

        // Assert
        assertEquals(true, result);
    }

    @Test
    public void addItemDiscountTest() {
        // Arrange
        Manager manager = new Manager();
        Item item1 = mock(Item.class);
        when(item1.getCost()).thenReturn(30.0);
        double discount = 0.3;

        // Act
        manager.addItemDiscount(item1, discount);
        double result1 = item1.discountedCost;
        boolean result2 = item1.isOnDiscount;

        // Assert
        assertEquals(21.0, result1, 0.1);
        assertEquals(true, result2);

    }
}