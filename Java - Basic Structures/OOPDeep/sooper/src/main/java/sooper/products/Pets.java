package sooper.products;

import sooper.IProduct;
import sooper.enums.CategoryType;

public class Pets extends Product {

    public Pets(String reference, int volume, int weight) {
        super(reference, volume, weight);
    }

    @Override
    public CategoryType getCategory() {
        return CategoryType.PETS;
    }

    @Override
    public boolean isCompatible(IProduct p) {
        return !CategoryType.DRUGS.equals(p.getCategory());
    }

    
}
