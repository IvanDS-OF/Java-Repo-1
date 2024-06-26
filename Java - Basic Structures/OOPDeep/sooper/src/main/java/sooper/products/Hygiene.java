package sooper.products;

import sooper.IContainer;
import sooper.IProduct;
import sooper.enums.CategoryType;

public class Hygiene extends Product{

    public Hygiene(String reference, int volume, int weight) {
        super(reference, volume, weight);
        //TODO Auto-generated constructor stub
    }

    @Override
    public CategoryType getCategory() {
        return CategoryType.HYGIENE;
    }

    @Override
    public boolean isCompatible(IProduct p) {
        return CategoryType.HYGIENE.equals(p.getCategory());
    }

    @Override
    public boolean haveSpace(IContainer container) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
