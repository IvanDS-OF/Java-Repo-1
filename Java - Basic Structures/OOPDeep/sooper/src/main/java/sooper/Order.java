package sooper;

import java.util.HashSet;
import java.util.Set;


public class Order implements IOrder{

    //This is the class of IOrder, it is necesary to modify some stuff. 
    private String reference;
    private Set<IContainer> containers;

    //And add a constructor
    public Order(String reference){
        this.reference = reference;
        this.containers = new HashSet<IContainer>();
    }

    @Override
    public String getReference() {
        return reference;
    }

    @Override
    public Set<IProduct> getProducts() {
        return null;
    }

    @Override
    public Set<IContainer> getContainers() {
        return containers;
    }

    @Override
    public void addContainter(IContainer container) {
        containers.add(container);
    }

    @Override
    public IContainer addProduct(IProduct producto) {
        return null;
    }

    @Override
    public String toString(){
        return super.toString();
    }
    
}
