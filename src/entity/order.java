package entity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
   
import java.util.Date;
import java.util.List;

import entity.Enum.OrderStatus;

public class order {
    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> order=new ArrayList<>();
   private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    
    public Date getMoment() {
        return moment;
    }


    public void setMoment(Date moment) {
        this.moment = moment;
    }


    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getOrder() {
        return order;
    }

     public void addItem(OrderItem item){
        order.add(item);
     }

     public void RemoveItem(OrderItem item){
        order.remove(item);
     }

     public Double total(){
        Double Total=0.0;
      
        for(OrderItem item: order){
       
         Total+=item.SubTotal();
        }
        return Total;
     }
    
    public String toString(){
      StringBuilder sb=new StringBuilder();
      sb.append("Order moment: ");
      sb.append(sdf.format(moment)+"\n");
      sb.append("Order status: ");
      sb.append(status+"\n");
      sb.append("Cliente:");
      sb.append(client+"\n");
      sb.append("Order items:\n");
      for(OrderItem item:order){
        sb.append(item+"\n");
      }
      sb.append("Total price: $");
      sb.append(String.format("%.2f",total()));
      return sb.toString();
  
    }
}
