   package za.ca.MakroProject-3; 
   import Company.Supplier;
   import java.util.scanner;

    public class Supplier extends Company{

    private String supplierNumber;

 private Product  product [];
  public void setProduct(product products[]);
  this.product = products;
int number = 5;

Supplier(){};
Supplier(long supplierNumber){
this.supplierNumber = supplierNumber;
}

public void supply(){
Scanner sc = new Scanner(System.in);
}
public void setSupplierNumber(long supplierNumber){
this.registrationNumber = registrationNumber;
}
public long getSupplierNumber(){
return supplierNumber;
}


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

l products[a]= product;
}
}

public void display(){
System.out.println("lists of products");

for(int i = 0;i < products.length;i++){
System.out.println(products[i].name);
System.out.println(products[i].barcode);
System.out.println(product[i].manufacturedate);
System.out.println(product[i].expiredate);
System.out.println(product[i].price);
System.out.println(product[i].quantity);
System.out.println(product[i].totalamount);
}
}
}
}
}
