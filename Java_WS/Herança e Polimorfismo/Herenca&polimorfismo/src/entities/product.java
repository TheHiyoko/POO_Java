package entities;

public class product {
    
    protected String name;
    protected Double price;

    //builders
    public product(){

    }

    public product (String name, Double price){
        this.name = name;
        this.price = price;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    //price tag
    public String price_tag(){
        //show the product name and price
        return name + " $ " + String.format("%.2f", price);
    }
}
