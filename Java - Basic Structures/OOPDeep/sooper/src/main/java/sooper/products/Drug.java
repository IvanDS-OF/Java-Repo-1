package sooper.products;

import sooper.enums.CategoryType;

import sooper.IProduct;

public class Drug extends Product {

    public Drug(String reference, int weight, int volume) {
        super(reference, volume, weight);
    }

    @Override
    public CategoryType getCategory() {
        return CategoryType.DRUGS;
    }

    @Override
    public boolean isCompatible(IProduct p) {
        return !CategoryType.FEEDING.equals(p.getCategory()) && !CategoryType.PETS.equals(p.getCategory());
    }
    
    
}
