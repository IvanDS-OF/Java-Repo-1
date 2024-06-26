package sooper.products;

import sooper.IProduct;
import sooper.enums.CategoryType;

public class Feeding extends Product{

    public Feeding(String reference, int weight, int volume) {
        super(reference, volume, weight);
    }


    @Override
    public CategoryType getCategory() {
        return CategoryType.FEEDING;
    }

    @Override
    public boolean isCompatible(IProduct p) {
        return CategoryType.FEEDING.equals(p.getCategory());
    }

    
}
