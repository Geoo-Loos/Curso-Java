package entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    private String nome;
    private String email;
    private Date birtDate;
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public Client(String nome, String email, Date birtDate) {
        this.nome = nome;
        this.email = email;
        this.birtDate = birtDate;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirtDate() {
        return birtDate;
    }

    public void setBirtDate(Date birtDate) {
        this.birtDate = birtDate;
    }

    public String toString(){
        return "Name"+nome+"( "+sdf.format(birtDate) +" )- "+email;
    }
    
}
