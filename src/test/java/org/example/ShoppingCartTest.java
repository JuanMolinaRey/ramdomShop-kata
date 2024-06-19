package org.example;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
    @Test
    void calculatePriceForMagicCards_red() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "red", null, "Magic: The Gathering - Mage Red", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 3.5);

    }
    @Test
    void calculatePriceForMagicCards_green() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "green", null, "Magic: The Gathering - Mage Green", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 4.4);

    }
    @Test
    void calculatePriceForMagicCards_default() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false,"null" , null, "Magic: The Gathering - Mage", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 2.0);

    }

    @Test
    void calculatePriceForMagicCards_black_lotus() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, null, null, "Magic: The Gathering - Black Lotus", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 40000.0);

    }

    @Test
    void calculatePriceForMagicCards_blue() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "blue", null, "Magic: The Gathering - Mage Blue", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 5.0);

    }

    @Test
    void calculatePriceForMagicCards_black() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "black", null, "Magic: The Gathering - Mage Black", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 6.80);

    }

    @Test
    void calculatePriceForWine() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, false, null, null, "el tio juanillo", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 100.0);

    }

    @Test
    void calculatePriceForCheese() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, true, null, null, "French Camembert", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 50.0);

    }
    @Test
    void calculatePriceForNumberOfLegs() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(4, null, false, null, null, "Dog", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 16.8);

    }

    @Test
    void calculatePriceForBlueFish() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "blue", BigDecimal.valueOf(0), "Paquito", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(),(0.1));

    }
    @Test
    void calculatePriceForGoldFish() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "Gold", BigDecimal.valueOf(0), "Brillantin", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), (0));

    }
}