package pizzaBillGenerator;


public class Main{
public static void main(String[] args) {
    
  /*  Pizza basePizza = new Pizza(false); 
    basePizza.getPizzaPrice();
    basePizza.addExtraToppings();
    basePizza.addExtraCheese();
    basePizza.takeAway();
    basePizza.getBill();
    */
    
    DeluxePizza dp = new DeluxePizza(true);
    dp.getBill();}
    
    @Override
    public void addExtraCheese() {}
    
    @Override
    public void addExtraToppings() {}
}