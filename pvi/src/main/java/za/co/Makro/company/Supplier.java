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
}


public void display(){
System.out.println("lists of products");
}
}




