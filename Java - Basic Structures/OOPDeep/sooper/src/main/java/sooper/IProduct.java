package sooper;

import sooper.enums.CategoryType;

public interface IProduct {
    //What do we whant to know about the product? 
    //Remember all the notes that we wrote before by analyzing the whole requeriment 

    String getReference();

    int getWeight();

    int getVolume();

    CategoryType getCategory();

    boolean isCompatible(IProduct p);

    boolean haveSpace(IContainer container);

    void putInside(IContainer container);


}
