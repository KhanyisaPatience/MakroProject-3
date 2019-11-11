 package za.co.Makro.Company;
 import  za.co.Makro.Company.Supplier;
 import za.co.Makro.inventory.Product;
 import za.co.Makro.company.Company;

 public class Supplier extends Company{
    private String supplierNumber;
    private Product product[]; 

 
Supplier(String name,String registrationNumber,String branch,String address,long telephone,String emailAddress,String supplierNumber, Product product []){
super(name,registrationNumber,branch,address,telephone,emailAddress);
this.supplierNumber = supplierNumber;
this.product = product;
}

 public void setSupplierNumber(String supplierNumber){
 this.supplierNumber = supplierNumber;
}

 public String getSupplierNumber(){
 return supplierNumber;
}


public void setProduct(Product product[]){
this.product = product;
}

public  Product[] getProduct(){
return product;
}

public void supply(){
System.out.println("Supplying goods");

System.out.println("Enter number of product u want");
int number= scanner.nextInt();
product = new product(number);
int count = 0;

for(int a = 0;a < number;a++){

System.out.println("number of product");
product product = new product();
scanner.nextLine();

System.out.println("Enter product name");
product.name = scanner.nextLine();

scanner.nextLine();
System.out.println("Enter barcode");
product.barcode = scanner.nextInt();

System.out.println("Enter manufacture date");
product.manufacturedate = scanner.nextInt();

System.out.println("Enter expire date");
product.expiredate = scanner.nextInt();

System.out.printLn("Enter price");
product.price = scanner.nextDouble();

 products[a]= product;
}
}

public void display(){
System.out.println("lists of products");

Products [] products = {"Rice","Sugar","Tea","Salt","Juice"}

for(int i = 0;i < products.length;i++)
System.out.println(products[i]);

System.out.println(products[i].name);
System.out.println(products[i].barcode);
System.out.println(product[i].manufacturedate);
System.out.println(product[i].expiredate);
System.out.println(product[i].price);
System.out.println(product[i].quantity);
System.out.println(product[i].totalAmount);

}
}
}
}

