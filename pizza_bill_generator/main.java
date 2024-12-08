class Pizza {
    private int price;
    private Boolean veg;

    private int cheese = 100;
    private int toppings = 150;
    private int packingCharge = 20;
    private int basePizzaPrice;

    private Boolean isCheeseAdded = false;
    private Boolean isToppingsAdded = false;
    private Boolean isOptedForTakeaway = false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese() {
        if (!isCheeseAdded) {
            isCheeseAdded = true;
            this.price += cheese;
        }
    }

    public void addExtraToppings() {
        if (!isToppingsAdded) {
            isToppingsAdded = true;
            this.price += toppings;
        }
    }

    public void takeaway() {
        if (!isOptedForTakeaway) {
            isOptedForTakeaway = true;
            this.price += packingCharge;
        }
    }

    public void getBill() {
        StringBuilder bill = new StringBuilder();
        bill.append("Base Pizza Price: Rs.").append(basePizzaPrice).append("\n");
        if (isCheeseAdded) {
            bill.append("Extra Cheese Added: Rs.").append(cheese).append("\n");
        }
        if (isToppingsAdded) {
            bill.append("Extra Toppings Added: Rs.").append(toppings).append("\n");
        }
        if (isOptedForTakeaway) {
            bill.append("Takeaway Charge: Rs.").append(packingCharge).append("\n");
        }
        bill.append("Total Bill: Rs.").append(this.price);
        System.out.println(bill);
    }
}

class DelxuePizza extends Pizza{
    public DelxuePizza(Boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }
    public void addExtraCheese(){}
    public void addExtraToppings(){}
}

public class main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza(false);
        DelxuePizza dp = new DelxuePizza(true);


        pizza.addExtraCheese();      
        pizza.addExtraToppings();       
        pizza.takeaway();               
        pizza.getBill();        
        
        
        
        // dp.addExtraCheese();
        // dp.addExtraToppings();
        dp.takeaway();
        dp.getBill();
    }
}
