package za.co.makro.person;

import za.co.makro.person.Customer;
import za.co.makro.person.Employee;
import za.co.makro.receipt.Receipt;
import za.co.makro.inventory.Inventory;
import java.util.Scanner;
import za.co.makro.company.Supplier;
import za.co.makro.company.Company;
public class Cashier extends Employee{
private int cashierNo;
Scanner sc = new Scanner(System.in);

public Cashier(){}
public Cashier(String firstName,String lastName,String address,String emailAddress,long phoneNumber,long employeeNumber,String position,String userName,String password,int cashierNo){
super(firstName,lastName,address,emailAddress,phoneNumber,employeeNumber,position,userName,password);
this.cashierNo = cashierNo;
}

public void setCashierNo(int cashierNo){
this.cashierNo = cashierNo;
}

public int getCashierNo(){
return cashierNo;
}

public void sellProduct(){
Scanner sc = new Scanner(System.in);
double price =0.0, total = 0.0, grandTotal = 0.0;
int quantity = 0, a = 0;
for(int i = 0; i < 100; i++){
System.out.println("Press 1 to add to cart");
System.out.println("Press 2 to exit");
int button = sc.nextInt();

switch(button){

case 1:





System.out.println("Enter barcode");
long barcode = sc.nextLong();
sc.nextLine();

for(a = 0; a < Supplier.add; a++){

if(barcode == Inventory.getProducts()[a].getBarcode()){

System.out.println(Inventory.getProducts()[a].getProductName());
System.out.println(Inventory.getProducts()[a].getBarcode());
System.out.println(Inventory.getProducts()[a].getQuantity());
System.out.println(Inventory.getProducts()[a].getPrice());
System.out.println(Inventory.getProducts()[a].getManufacturedDate());
System.out.println(Inventory.getProducts()[a].getExpiryDate());
price = Inventory.getProducts()[a].getPrice();
}

}

System.out.println("Enter quantity");
quantity = sc.nextInt();

total = quantity * price;

grandTotal = grandTotal + total;

System.out.println("Total: "+ grandTotal);


break;
case 2:

System.out.println("Total:"+grandTotal);
i = 200;
a = 200;
}
}
}

public void login(Supplier supplier){

System.out.println("Employee Login Details");
System.out.print("Username: ");
String username = sc.nextLine();

System.out.println("Password: ");
String password = sc.nextLine();

for(int a = 0;  a < Company.getEmployees().length;a++){

if(Company.getEmployees()[a].getUsername().equals(username) &&  Company.getEmployees()[a].getPassword().equals(password)

 && Company.getEmployees()[a].getPosition().equalsIgnoreCase("CASHIER")){
System.out.println("Login successful");


sellProduct();

}

}
}


public void printReceipt(Receipt receipt){
System.out.println("shopName: " +receipt.getShopName());
System.out.println("cardNumber: " + receipt.getCardNumber());
System.out.println("date: " + receipt.getDate());
System.out.println("time: " + receipt.getTime());
System.out.println("tellerNo: " + receipt.getTellerNo());
System.out.println("quantity: " + receipt.getQuantity());
System.out.println("productName: " + receipt.getProductName());
System.out.println("price: " + receipt.getPrice());
System.out.println("amountDue: " + receipt.getAmountDue());
System.out.println("VAT: " + receipt.getVAT());
System.out.println("totalBalance: " + receipt.getTotalBalance());
System.out.println("typeOfPayment: " + receipt.getTypeOfPayment());
}

public void giveChange(){
System.out.println("No change");
}
}
