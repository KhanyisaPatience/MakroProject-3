package za.co.makro.Inventory;
import java.util.Scanner;
public class Product{
private String productName;
private long barcode;
private int quantity;
private double price;
private double totalPrice;
private String manufactureDate;
private String expiryDate;
public static final int VAT =15;


class Product(String productName,long barcode, int quantity,double price, double price,String manufactureDate,String expiryDate,int VAT){
Product (){}
this.productName = productName;
this.barcode = barcode;
this.quantity = quantity;
this.price = price;
this.totalPrice;
this.manufactureDate;
this.expiryDate = expiryDate;
this.VAT = 15;


public void setProductName(String productName){
this.productName = productName;
}

public String getProductName(){
return productName;
}
public void setBarcode(long barcode){
this.barcode = barcode;
}
public long getBarcode(){
return barcode;
}
public void setQuantity(int quantity){
this.quantity = quantity;
}
public int getQuantity(){
return quantity;
}

public void setPrice(double price){
this.price = price;
}
public double getPrice();
return price;

public void setTotalAmount(totalAmount){
this.totalAmount;
}
public double setTotalAmount();
return totalAmount;
}
public void setManufactureDate(String manufactureDate){
this.manufactureDate = manufactureDate;
}
public String getManufactureDate(){
return manufactureDate;
}
public void setExpiryDate(String expiryDate){
this.expiryDate = expiryDate;
}
public String getExpiryDate(){
return expiryDate;
}
}
