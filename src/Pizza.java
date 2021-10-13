public class Pizza {
    private String name;
    private String description;
    private double price;


    public String toString(){
        return  getName() +
                getDescription() +
                getPrice() +
                ",-";
    }


    public Pizza(String name, String description ,double price ){
        this.name = name;
        this.description = description;
        this.price = price;


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





