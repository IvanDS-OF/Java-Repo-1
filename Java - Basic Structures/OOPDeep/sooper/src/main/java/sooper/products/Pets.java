package sooper.products;

import sooper.IContainer;
import sooper.IProduct;

public class Pets extends Product {

    public Pets(String reference, int volume, int weight) {
        super(reference, volume, weight);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String getCategory() {
        return "Pets";
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
