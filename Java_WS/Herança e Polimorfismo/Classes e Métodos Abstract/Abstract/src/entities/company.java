package entities;

public class company extends persons {

    private Integer e_number;

    //constructors
    public company() {
        super();
    }

    public company(Integer e_number, String name, Double anualC) {
        super(name, anualC);
        this.e_number = e_number;
    }

    //getters and setters
    public Integer getE_number() {
        return this.e_number;
    }

    public void setE_number(Integer e_number) {
        this.e_number = e_number;
    }

    //overrider of the generic method
    @Override
    public Double txa() {
        if(e_number <10){
            return getAnualC() * 0.14;
        }
        else{
            return getAnualC() * 0.16;
        }
    }
    
}
