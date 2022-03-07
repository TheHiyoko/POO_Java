package entities;



public class used_product extends product{

    protected String manufacture;


    //builders
    public used_product(){
        super();
    }

    public used_product(String name, Double price ,String manufacture){
        super(name,price);
        this.manufacture = manufacture;
    }

    //getters and setters
    public String getManufacture(){
        return manufacture;
    }

    public void setManufacture(String manufacture){
        this.manufacture = manufacture;
    }

    @Override
    public String price_tag(){
        //show the product name and price
        return name 
            + "(used)"
            + manufacture
            + " $ " 
            + String.format("%.2f", price);
            
    }
}
