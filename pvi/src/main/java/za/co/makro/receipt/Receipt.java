
package za.co.makro.receipt;

public class Receipt{

 private String shopName;
 private int cardNumber;
 private String date;
 private String time;
 private int tellerNo;
 private int quantity;
 private String productName;
 private double price;
 private double amountDue;
 private static final int VAT = 15;
 private double totalBalance;
 private String typeOfPayment;

 public void setShopName(String shopName){
 this.shopName = shopName;
}

 public String getShopName(){
return shopName;
}

public void setCardNumber(int cardNumber){
this.cardNumber = cardNumber;
}

public int getCardNumber(){
return cardNumber;
}

public void setDate(String date){
 this.date = date;
}

 public String getDate(){
 return date;
}

public void setTime(String time){
 this.time = time; 
}

public String getTime(){
return time;
}

public void setTellerNo(int tellerNo){
 this.tellerNo = tellerNo;
}

 public int getTellerNo(){
 return tellerNo;
}

 public void setQuantity(int quantity){
 this.quantity = quantity;
}

 public int getQuantity(){
return quantity;
}

public void setProductName(String productName){
this.productName = productName;
}

public String getProductName(){
return productName;
}

public void setPrice(double price){
this.price = price;
}

public double getPrice(){
return price;
}

public void setAmountDue(double amountDue){
this.amountDue = amountDue;
}

public double getAmountDue(){
return amountDue;
}


public int getVAT(){
return VAT;
}

public void setTotalBalance(double totalBalance){
this.totalBalance = totalBalance;
}

public double getTotalBalance(){
return totalBalance;
}

public void setTypeOfPayment(String typeOfPayment){
this.typeOfPayment = typeOfPayment;
}

public String getTypeOfPayment(){
return typeOfPayment;
}
}




















