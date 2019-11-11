package za.co.Makro;
import za.co.Makro.Person;
import za.co.Makro.Employee;


public class Cashier extends Employee{
private int cashierNo;


public Cashier(long employeeNumber,String position,String username,String password,int cashierNo){
super(employeeNumber,position,username,password);
this.cashierNo = cashierNo;
}
public void setCashierNo(int cashierNo){
this.cashierNo = cashierNo;
}

public int getCashierNo(){
return cashierNo;
}

public void setCashierNo(int cashierNo){
this.cashierNo = cashierNo;

}
public void removeItem(){

}
public void printReceipt(){
System.out.println("shopName: " + shopName);
System.out.println("cardNumber: " + cardNumber);
System.out.println("date: " + date);
System.out.println("time: " + time);
System.out.println("tellerNo: " + tellerNo);
System.out.println("quantity: " + quantity);
System.out.println("productName: " + productName);
System.out.println("price: " + price);
System.out.println("amountDue: " + amountDue);
System.out.println("VAT: " + VAT);
System.out.println("totalBalance: " + totalBalance);
System.out.println("typeOfPayment: " + typeOfPayment);

}
public void giveChange(){
System.out.println("No change");
}
}
