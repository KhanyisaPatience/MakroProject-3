 
public class Cart{
private String productName;
private int quantity;
private double totalAmount;


public Cart(String productName,int quantity,double totalAmount){
this.productName = productName;
this.quantity = quantity;
this.totalAmount = totalAmount;
}

public String getProductName(){
return productName; 
}

public void setProductName(String productName){
this.productName = productName;
}

public int getQuantity(){
return quantity;
}

public void setQuantity(int quantity){
this.quantity = quantity;
}

public double getTotalAmount(){
return totalAmount;
}

public void setTotalAmount(double totalAmount){
this.totalAmount = totalAmount;
}
}
