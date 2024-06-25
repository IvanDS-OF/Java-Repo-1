package sooper.products;

import sooper.IProduct;

public abstract class Product implements IProduct{

    //Create the atributes of the methods to use them 
    private String reference;
    private int weight;
    private int volume; 


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

}
