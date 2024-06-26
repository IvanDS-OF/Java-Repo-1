package sooper;

import java.util.Set;

import sooper.enums.ContainerType;

public interface IContainer {
    
    //I this phase we should name all the this that we can obtain from our final object
    //In this case, it will be these ones. 

    String getReference();

    //Declase all the methods 
    int getVolume();

    int getSurface();

    int avaliableVolume();

    int getResistance();

    Set<IProduct> getProducts();

    ContainerType getType();

    boolean putInside(IProduct product);

    boolean resists(IProduct product);





}
