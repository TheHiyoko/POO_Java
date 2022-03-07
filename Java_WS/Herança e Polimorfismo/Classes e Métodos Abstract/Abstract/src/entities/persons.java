package entities;


public abstract class persons {
//classe abstrada generica    
    private String name;
    private Double anualC;

    //constructors
    public persons() {
    }
    
    public persons(String name, Double anualC) {
        this.name = name;
        this.anualC = anualC;
    }
    
   
    //getters and settert
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualC() {
        return anualC;
    }

    public void setAnualC(Double anualC) {
        this.anualC = anualC;
    }


     //generic method
     public abstract Double txa();
}
