package entity;

public class App {
    private String nome;
    private Double salario;
    private Double taxa;

    

    public App() {
    }

    public App(String nome, Double salario, Double taxa) {
        this.nome = nome;
        this.salario = salario;
        this.taxa = taxa;
    }

    public App(String nome, Double salario, Double taxa, Double extra) {
        this.nome = nome;
        this.salario = salario;
        this.taxa=taxa;
        aumento(extra);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

     public double Salariototal(){
    
     return salario-taxa;
    }

    public void aumento(Double aumentodesalario){
        salario+=((aumentodesalario/100)*salario);
    }

    @Override
    public String toString() {
        return "App [nome= " + nome + ", salario= " +Salariototal() + "]";
    }

     
    

    
}
