package sooper.containers;

import sooper.enums.ContainerType;

public class Bag extends Container {

    //First we write the variaables to create correctly our cinstructor
    private int length;

    public Bag(String reference, int height, int length){
        //Initialize the extern constructor
        super(reference, height);

        //Then we define the internal cariavles within this constructor
        this.length = length;
    }

    @Override
    public int getSurface() {
        int radio = getDiamater() / 2;
        return (int)(Math.PI * radio * radio);
    }

    private int getDiamater(){
        return (int)((2 * length) / Math.PI);
    }

    @Override
    public ContainerType getType() {
        return ContainerType.BAG;
    }
    


}
