package sooper.products;

import sooper.IContainer;
import sooper.IProduct;
import sooper.enums.CategoryType;

public class Feeding extends Product{

    public Feeding(String reference, int volume, int weight) {
        super(reference, volume, weight);
        //TODO Auto-generated constructor stub
    }


    @Override
    public CategoryType getCategory() {
        return CategoryType.FEEDING;
    }

    @Override
    public boolean isCompatible(IProduct p) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean haveSpace(IContainer container) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
