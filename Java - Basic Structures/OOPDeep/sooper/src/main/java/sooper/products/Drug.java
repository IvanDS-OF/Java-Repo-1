package sooper.products;

import sooper.enums.CategoryType;

import sooper.IContainer;
import sooper.IProduct;

public class Drug extends Product {

    public Drug(String reference, int volume, int weight) {
        super(reference, volume, weight);
        //TODO Auto-generated constructor stub
    }

    @Override
    public CategoryType getCategory() {
        return CategoryType.DRUGS;
    }

    @Override
    public boolean isCompatible(IProduct p) {
        return CategoryType.DRUGS.equals(p.getCategory());
    }

    @Override
    public boolean haveSpace(IContainer container) {
        // TODO Auto-generated method stub
        return false;
    }

    
    
}
