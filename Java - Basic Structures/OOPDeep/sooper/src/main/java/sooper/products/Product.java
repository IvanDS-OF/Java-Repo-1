package sooper.products;

import sooper.IContainer;
import sooper.IProduct;
import sooper.containers.Container;
import sooper.enums.CategoryType;

public abstract class Product implements IProduct{

    //Create the atributes of the methods to use them 
    private String reference;
    private int weight;
    private int volume; 

    private IContainer container;


    //Creation of a constructor
    public Product(String reference, int volume, int weight){
        this.reference = reference;
        this.volume = volume;
        this.weight = weight;
    }


    //Dont forget to modify the *return sentence of each auto-generated method stub

    @Override
    public String getReference() {
        return reference;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public int getVolume() {
        return volume;
    }


    @Override
    public boolean haveSpace(IContainer container) {   
        return container.avaliableVolume() > volume;
    }


    @Override
    public void putInside(IContainer container) {
        this.container = container;
    }
}
