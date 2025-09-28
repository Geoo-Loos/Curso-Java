package entity;

public abstract class taxPayer {
    private String name;
    private Double anualIncome;
    
    public taxPayer(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }

    public Double tax(){
         
        return anualIncome;
    }
    public String toString(){
        return name+": $ "+String.format("%.2f",tax());
    }
}
