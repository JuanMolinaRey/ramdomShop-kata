# KataFizz
## Kata description:
### 
- Magic card modification. The age of Magic cards can influence their price. 
Blue and red cards cost half as much when they are over 10 years old. Black and green cards cost 20% more when they are over 20 years old.
  
- They want to add pet spiders to the store, for each leg they ask for 1.20 euros and depending 
on the spider, 2 euros will be added for being red and 3 euros for being golden, a 50% discount will also be applied if the spider is stinky

## Test description:
###
- We had to create several tests to calculate the price of each Magic card according to its color, apart from the Black Lotus category.
- We also create other tests so that depending on the age of each card.
- We added tests to calculate the value of the spider according to its legs, depending on what color they are and whether it is stinky or not.
- We add two tests to calculate the value of the fish depending on what color it is.
- We added a couple of tests to calculate the value of cheese and wine according to their age

## Project description:
### 
- To calculate the color of the brown card, we add a cause brown plus its base value.
- To calculate the value of the cards according to their age, we use an if accompanied by getAge to limit the age in the first case from 10 to 19 years and the second from older to 20, accompanied by a return switch with get.color for each color and so we add its base value multiplied by the decimal of the discount to get its price.
- To calculate the value of the spider, we use an if with getName.StartsWith so that when it starts with "The Spider" the value of each leg is 1.2 euros
- In the case of the spider color, we did the same as with the cards, if with switch.getColor to calculate the price by adding the base value multiplied by the decimal of the discount.

