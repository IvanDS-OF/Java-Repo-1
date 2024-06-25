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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isCompatible'");
    }

    @Override
    public boolean haveSpace(IContainer container) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'haveSpace'");
    }
    
}
