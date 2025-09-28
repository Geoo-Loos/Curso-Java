package entity;

 

public class OrderItem {
  private  Integer quantity;
  private  Double Price;
  private  Product product;
 
    public OrderItem(Integer quantity, Double price, Product product) {
    this.quantity = quantity;
    Price = price;
    this.product = product;
}



    public Integer getQuantity() {
        return quantity;
    }



    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }



    public Double getPrice() {
        return Price;
    }



    public void setPrice(Double price) {
        Price = price;
    }



    public Product getProduct() {
        return product;
    }



    public void setProduct(Product product) {
        this.product = product;
    }



    public Double SubTotal(){
        
        return Price*quantity;
    }
@Override
   public String toString(){
    return product.getName()+
     ", $"+String.format("%.2f",Price)
     +", subtotal: "+String.format("%.2f",SubTotal());
   }
  
    
}
