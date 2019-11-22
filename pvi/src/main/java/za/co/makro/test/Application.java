package za.co.makro.test; 

import za.co.makro.company.Supplier;
import za.co.makro.person.Cashier;
import za.co.makro.person.Manager;
import za.co.makro.person.Customer;
import za.co.makro.person.Employee;
import za.co.makro.inventory.Product;
import za.co.makro.receipt.Receipt;
import za.co.makro.company.Company;
import za.co.makro.inventory.Inventory;
import java.util.*;


public class Application{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

Supplier s1 = new Supplier();
Customer c1 = new Customer();
Manager m1 = new Manager();
Cashier ch1 = new Cashier();
Product p1 = new Product();
Receipt r1 = new Receipt();
Employee em = new Employee();
Inventory inventory = new Inventory();
//Employee em = new Employee();
Company c = new Company();

c.registerEmployee();
c.displayEmployee();


m1.login(s1);
//s1.supply();
//s1.displayProduct();
ch1.login(s1);





/*System.out.println("**********Welcome to Makro Silver Lakes************");
System.out.println("*************BIG on life***************************");

System.out.println("Please select an option");
System.out.println(" 1 to register employee 2 l, 3 cancel, 4 exit ");

int choose = sc.nextInt();

if(choose ==1){
System.out.println("purchase");
}else if (choose == 2){
System.out.println("return");
}else if(choose == 3){
System.out.println("cancel");
}else if("exit");


System.out.println(".......Does The Customer have a Makro card.........");

input.nextLine();

System.out.print("Enter yes or No");
String question = input.nextLine();

if(question.equals(y)){
System.out.println("Kindly Swip Customer Card To Proceed");

s1.displayProduct(p1);
}
for(int a = 0; a < 3; a++){
System.out.println("would you like to add more product ...Y/N");
}
if(question1.equals(yes)){
s1.displayProduct(p1);
}
if(question1.equals(no)){
ch1.recievePayment();
ch1.printReceipt(r1);
}
*/
}
}




