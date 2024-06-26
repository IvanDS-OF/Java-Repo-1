package sooper;

import java.util.Set;

public interface IOrder {
    //We create first one intereface to organize the next clases. 

    //In this part,usually we should call all the references of our final products
    //or the information from our final objects. to do this we use this commands

    String getReference(); //This returns a string of the product

    Set<IProduct> getProducts(); //This returns a list of products

    Set<IContainer> getContainers(); // This returns a list con Containters

    void addContainter(IContainer container); 
    //We want to add Containers to our Order
    //We dont put acctions, because we are just declaring the method, not the actions. 

    IContainer addProduct (IProduct product);
    //We eant to add products, and wach container should have this information.







}
