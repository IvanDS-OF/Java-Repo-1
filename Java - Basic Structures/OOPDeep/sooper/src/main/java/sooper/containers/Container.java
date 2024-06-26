package sooper.containers;

import java.util.HashSet;
import java.util.Set;

import sooper.IContainer;
import sooper.IProduct;
import sooper.enums.ContainerType;

public abstract class Container implements IContainer {

    //Remember that *Implements is the way to create a class from one interfaces
    //There are 2 ways to start the process of creation of this clase, one is 
    //convert it to Abstract, and the other one is by adding all the methos of the Super Class
    //We chouse do the last option

    //To do this fast, we can use the combination on the keyboard "Crtl+," (comma) and **Add methods


    //We should create all the atributes of our class **all in private, because we have cerated the methos 
    //to call the value of them
    private String reference;
    private int height;
    private int resistance;

    private Set<IProduct> products;


    public Container(String reference, int height){
        this.reference = reference;
        this.height = height;
        products = new HashSet<IProduct>();

    }


    @Override
    public String getReference() {
        return reference;
    }

    //If we implement this class as Abstract, it is not necesary ti call all the methods
    //we have created in the SuperClass, if we dont know how to fill some method in this stage
    //that work will be done by the final SubClasses

    @Override
    public int getVolume() {
        return height * getSurface();
    }

    @Override
    public int getResistance() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Set<IProduct> getProductos() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean putInside(IProduct product) {
        boolean resistanceOk = resists(product);
        boolean volumeOk = product.haveSpace(this);
        boolean compatibilityOk = true;

        //To know the answer of conpatibleOk we need to loop through the 
        //products inside the current container 

        for (IProduct p : products) {
            boolean compatibleOk = product.isCompatible(p);
            compatibilityOk = compatibilityOk && compatibleOk; 
        }

        boolean acceptance = resistanceOk && volumeOk && compatibilityOk;

        if (acceptance) {
            products.add(product);
            product.putInside(this);

        }
        return false;
    }

    @Override
    public boolean resists(IProduct product) {
        return resistance > product.getWeight();
    }



    @Override
	public String toString() {

		StringBuilder sb = new StringBuilder("Contenedor " + reference + " [" + getType() +
				"] (sup " + getSurface() + "cm2 - vol " + getVolume() + "cm3 - resistencia " + getResistance() + " g).\n");
		if (products.isEmpty()) {
			sb.append("\t\tvacío\n");
		}
		for (IProduct p : products) {
			sb.append("\t\t" + p + "\n");
		}
		sb.append("\t\t>> Disponible vol " + avaliableVolume() + "cm3");
		return sb.toString();
	}



    private int takenVolume(){
        int res = 0;
        for (IProduct p : products) {
            res = res + p.getVolume();
        }
        return res;
    }

    @Override
    public int avaliableVolume() {
        return getVolume() - takenVolume();
    }



    
 


}
