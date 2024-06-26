package sooper.products;

import sooper.IProduct;
import sooper.enums.CategoryType;

public class Hygiene extends Product{

    public Hygiene(String reference, int weight, int volume) {
        super(reference, volume, weight);
    }

    @Override
    public CategoryType getCategory() {
        return CategoryType.HYGIENE;
    }

    @Override
    public boolean isCompatible(IProduct p) {
        return !CategoryType.FEEDING.equals(p.getCategory());
    }
    
}
