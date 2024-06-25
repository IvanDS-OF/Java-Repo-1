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

    Set<IProduct> getProductos();

    ContainerType getType();

    boolean meter(IProduct product);

    boolean resists(IProduct product);





}
