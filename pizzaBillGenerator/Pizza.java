package pizzaBillGenerator;

public class Pizza {
    private int price;
    private Boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingPrice =100;
    private int backPack=20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded=false;
    private boolean isExtraToppingsAdded=false;
    private boolean isOptedForTakeAway=false;
   
    public Pizza(Boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void getPizzaPrice() {
        System.out.println(this.price);
    }

   public void addExtraCheese() {
	   isExtraCheeseAdded=true;
	  
	   this.price += extraCheesePrice; 
	   
	   
   }
   
   public void addExtraToppings() {
	   isExtraToppingsAdded=true;
	   
	   this.price += extraToppingPrice; 
	   
   }
   
   public void takeAway() {
	   isOptedForTakeAway=true;
	   
	   this.price += backPack; 
	   
   }
   public void getBill() {
	   String bill = "";
	   System.out.println("Pizza:" + basePizzaPrice);
	   if(isExtraCheeseAdded) {
		   bill += "Extra Cheese Added:"+  extraCheesePrice+ "\n";
	   }
	   if(isExtraToppingsAdded) {
		   bill += "Extra Toppings Added:"+  extraToppingPrice+ "\n";
	   }
	   if(isOptedForTakeAway) {
		   bill += "Extra Bag Added:"+backPack  + "\n";
	   }
	   bill += "Total Bill :" +this.price + "\n";
	   System.out.println(bill);
	   
	   
   }
   
}
