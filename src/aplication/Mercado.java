package aplication;
 
import entity.OrderItem;
import entity.Product;
import entity.order;
import entity.Enum.OrderStatus;
import entity.Client;
 
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Mercado {
   public static void main(String[] args) throws ParseException {
    Scanner sc=new Scanner(System.in);
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

System.out.println("Dados cliente: ");

System.out.println("\nNome:");
String nameC=sc.nextLine();
 
System.out.println("\nEmail:");
String email=sc.nextLine();

  

System.out.println("\nData de aniversario:");
Date birtDate=(Date) sdf.parse(sc.next());

 Client client = new Client(nameC, email, birtDate);

System.out.println("Dados de pedido:");
System.out.println("Status:");
OrderStatus orderStatus=OrderStatus.valueOf(sc.next());
 
order order=new order(new Date(0), orderStatus, client);

 System.out.println("Quantos pedidos serão cadastrados?");
    Integer n=sc.nextInt();
   sc.nextLine();

    for(int i=0;i<n;i++){
  System.out.println("Entre com os dados do pedido de número #"+i);
System.out.println("\nNome do produto:");
String name=sc.nextLine();
 
System.out.println("\nPreço:");
Double Price=sc.nextDouble();

Product product=new Product(name, Price);
System.out.println("Quantidade:");
Integer quantity=sc.nextInt();
 
OrderItem orderItem=new OrderItem(quantity, Price, product);
 order.addItem(orderItem);
    }

 

System.out.println();
System.out.println("Resumo pedido:");
System.out.println(order);

 sc.close();  
} 
}
