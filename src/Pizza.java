public class Pizza {
    private String name;
    private String description;
    private double price;


    public String toString(){
        return  getName() + getDescription() + getPrice() + ",-";
    }


    public Pizza(String pizzaName, String pizzaDescription ,double pizzaPrice ){
        this.name = pizzaName;
        this.description = pizzaDescription;
        this.price = pizzaPrice;


    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice (double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setDescription(String description){
        this.description = description;

    }

    public String getDescription(){
        return description;
    }


}





