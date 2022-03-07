package entities;

public class imported_product extends product{

    protected Double custom_fee;


    //builders 
    public imported_product(){
        super();
    }
    public imported_product(String name, Double price,Double custom_fee){
        super(name, price);
        this.custom_fee = custom_fee;
    }
    
    //Getters and setters
    public Double getCustom_fee() {
        return custom_fee;
    }

    public void setCustom_fee(Double custom_fee) {
        this.custom_fee = custom_fee;
    }

    //method
    public Double new_price(){
        return price + custom_fee;
    }

    @Override
    public String price_tag(){
        //show the product name and price
        return name 
            + " $ "
            + custom_fee 
            + String.format("%.2f", new_price()); 
            

    }
}
