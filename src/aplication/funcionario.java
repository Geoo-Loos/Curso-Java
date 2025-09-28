package aplication;

import java.util.Scanner;
import entity.App;
public class funcionario {
    public static void main(String[] args) {
 
    Scanner s=new Scanner(System.in);

    System.out.println("Quantos funcionarios serao cadastrados?");
    int n=s.nextInt();
 
   App[] vect=new App[n];
 
    for(int i=0;i<vect.length;i++){
    s.nextLine();
    System.out.println("Nome:");
    String nome=s.nextLine();

    System.out.println("Salário:");
    Double salario=s.nextDouble();

    System.out.println("Taxa:");
    Double taxa=s.nextDouble();

    vect[i]=new App(nome, salario,taxa);
     
    
  for(int j=0;j<vect.length;j++){
    System.out.println( vect[j] );}
 
    for(int k=0;k<vect.length;k++){
 System.out.println("Valor do aumento:");
 Double extra=s.nextDouble();
 
 vect[k]=new App(nome,salario,taxa,extra);

    }}

    for(int j=0;j<vect.length;j++){
    System.out.println( vect[j] );}
s.close();
    }
}
