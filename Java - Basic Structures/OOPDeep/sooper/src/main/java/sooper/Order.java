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
    public IContainer addProduct(IProduct product) {
        //Instructions logic. We have to know if there is a container with avaliable space
        //then if there are space, we can add the product. 

        for (IContainer container : containers) {
            if (container.putInside(product)) {
                return container;
            }
        }
        //It is necesary to create docimentation about this Null value
        return null;
    }

    
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
        //This class helps us to build string did with concatentations of different things
		sb.append("Order: " + reference + "\n");
		for (IContainer container : containers) {
			sb.append("\t" + container + "\n");
		}
		return sb.toString();
	}
    
}
