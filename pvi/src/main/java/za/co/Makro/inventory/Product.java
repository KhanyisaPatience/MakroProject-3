package za.co.Makro.inventory;
import za.co.Makro.company.Company;
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

Product (){}


public Product(String productName,long barcode, int quantity,double price,String manufactureDate,String expiryDate,int VAT){
this.productName = productName;
this.barcode = barcode;
this.quantity = quantity;
this.price = price;
this.totalPrice = price;
this.manufactureDate = manufactureDate;
this.expiryDate = expiryDate;
}

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
public double getPrice(){
return price;
}
public void setTotalPrice(double totalPrice){
this.totalPrice = totalPrice;
}
public double setTotalPrice(){
return totalPrice;
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
