 package za.co.makro.company;
 
import za.co.makro.inventory.Product;
 import za.co.makro.company.Company;
import za.co.makro.inventory.Inventory;
import java.util.Scanner;

 public class Supplier extends Company{
    
 private long supplierNumber;
    public static int add = 0;
 Scanner sc = new Scanner(System.in);

 
public Supplier( Product product,long supplierNumber){

this.supplierNumber = supplierNumber;


}

public Supplier(){


}

public void setSupplierNumber(long supplierNumber){
this.supplierNumber=supplierNumber;
}


 public long getSupplierNumber(){
 return supplierNumber;
}




public void supply(){

System.out.println("Enter number of products u want");
 add= sc.nextInt();

Inventory inventory = new Inventory();
System.out.println("Supplying goods");
sc.nextLine();

Inventory.products = new Product[add]; 

for(int a=0; a< add; a++){

Product product1 = new Product();

sc.nextLine();

System.out.println("Enter product name");
String name = sc.nextLine();
product1.setProductName(name);

sc.nextLine();

System.out.println("Enter barcode");
long barcode = sc.nextLong();
product1.setBarcode(barcode);
System.out.println(product1.getBarcode());

sc.nextLine();

System.out.println("Enter manufacture date");
String manufacturedDate = sc.nextLine();
product1.setManufacturedDate(manufacturedDate);

sc.nextLine();

System.out.println("Enter expiry date");
String expiryDate = sc.nextLine();
product1.setExpiryDate(expiryDate);

sc.nextLine();

System.out.println("Enter price");
double price = sc.nextDouble();

double generatePrice = price + (100 /20);

product1.setPrice(generatePrice);
System.out.println(product1.getPrice());

 Inventory.products[a] = product1;

}
 //Inventory.setProducts(products);
}


public void displayProduct(){

System.out.println("Displaying product");
for(int a = 0; a<1;a++){
System.out.println("<i am in");
System.out.println(Inventory.getProducts()[a].getProductName());
System.out.println(Inventory.getProducts()[a].getBarcode());
System.out.println(Inventory.getProducts()[a].getQuantity());
System.out.println(Inventory.getProducts()[a].getPrice());
System.out.println(Inventory.getProducts()[a].getManufacturedDate());
System.out.println(Inventory.getProducts()[a].getExpiryDate());

} 


}

}

