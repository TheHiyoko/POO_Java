package entities;

public class incividual extends persons{

    private Double helth;

    //constructors 

    public incividual() {
        super();
    }

    public incividual(Double helth, String name, Double anualC) {
        super(name, anualC);
        this.helth = helth;
    }

    //getters and settters
    public Double getHelth() {
        return this.helth;
    }

    public void setHelth(Double helth) {
        this.helth = helth;
    }
    
    //overrider of the generic method
    @Override
    public Double txa() {
        if(getAnualC() < 2000.0){
            return getAnualC() * 0.15 - helth * 0.5;
        }
        else{
            return getAnualC() * 0.25 - helth * 0.5;
        }
        }
      
        
    }

