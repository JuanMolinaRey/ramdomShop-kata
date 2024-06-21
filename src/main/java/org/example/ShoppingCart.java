package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public Double getTotalPrice() {
        return  products.stream()
                .map(this::calculatePrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .doubleValue();
    }

    private BigDecimal calculatePrice(Product product) {
        if (product.getNumberOfLegs() != null){
            return petOfLegs(product);
        }
        if (product.getName() != null) {
            return cards(product);
        }
        if (product.getAge()!=null){
            return  gourmet(product);
        }
        if (product.getColor()!=null){
            return calculateFish(product);
        }

        return product.getSellPrice();
    }

    private BigDecimal petOfLegs(Product product){
        if (product.getNumberOfLegs() != null) {
            if (product.getName().startsWith("The Spider:")){

                BigDecimal price = BigDecimal.valueOf(1.2 * product.getNumberOfLegs());

                if (product.isStinky() && product.getColor()!=null){
                    switch (product.getColor()) {
                        case "red" -> price = price.add(BigDecimal.valueOf(2.0)).multiply(BigDecimal.valueOf(0.50));
                        case "gold" -> price = price.add(BigDecimal.valueOf(3.0)).multiply(BigDecimal.valueOf(0.50));
                    }
                }else if (product.isStinky()){
                    price=BigDecimal.valueOf(1.2 * product.getNumberOfLegs()).multiply(BigDecimal.valueOf(0.50));
                }else if(product.getColor()!=null) {
                    switch (product.getColor()) {
                        case "red" -> price = price.add(BigDecimal.valueOf(2.0));
                        case "gold" -> price = price.add(BigDecimal.valueOf(3.0));
                    }
                }
                return price;
            }
            return BigDecimal.valueOf(4.2 * product.getNumberOfLegs());
        }
        return null;
    }

    private BigDecimal cards(Product product){
            if (product.getAge() != null && product.getAge() >= 10) {
                return switch (product.getColor()) {
                    case "blue" -> BigDecimal.valueOf(5.0).multiply(BigDecimal.valueOf(0.50));
                    case "red" -> BigDecimal.valueOf(3.5).multiply(BigDecimal.valueOf(0.50));
                    default -> BigDecimal.valueOf(2.0);
                };
            }
            if (product.getAge() != null && product.getAge() >= 20) {
                return switch (product.getColor()) {
                    case "green" ->
                            BigDecimal.valueOf(4.40).multiply(BigDecimal.valueOf(0.20)).add(BigDecimal.valueOf(4.40));
                    case "black" ->
                            BigDecimal.valueOf(6.80).multiply(BigDecimal.valueOf(0.20)).add(BigDecimal.valueOf(6.80));
                    default -> BigDecimal.valueOf(2.0);
                };
            }
        if (product.getName().equals("Magic: The Gathering - Black Lotus")) {
            return BigDecimal.valueOf(40000.0);
        } else if (product.getName().startsWith("Magic: The Gathering")) {
            return switch (product.getColor()) {
                case "blue" -> BigDecimal.valueOf(5.0);
                case "red" -> BigDecimal.valueOf(3.5);
                case "green" -> BigDecimal.valueOf(4.40);
                case "black" -> BigDecimal.valueOf(6.80);
                case "brown" -> BigDecimal.valueOf(2.0);
                default -> BigDecimal.valueOf(2.0);
            };
        }

        return null;
    }

    private BigDecimal gourmet(Product product){

        if (product.getAge() != null) {
            if (product.isStinky()) {
                return BigDecimal.valueOf(10.0 * product.getAge());
            } else {
                return BigDecimal.valueOf(20.0 * product.getAge());
            }
        }
        return null;
    }

    private BigDecimal calculateFish (Product product){

        if (product.getColor() != null && product.getBasePrice() != null) {
            return switch (product.getColor()) {
                case "blue" -> product.getBasePrice().add(BigDecimal.valueOf(0.1));
                case "gold" -> product.getBasePrice().multiply(BigDecimal.valueOf(100.0));
                default -> product.getBasePrice();
            };
        }
        return null;
    }


    }


