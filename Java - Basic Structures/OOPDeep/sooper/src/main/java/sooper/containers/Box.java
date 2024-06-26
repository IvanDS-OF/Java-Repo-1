package sooper.containers;

import sooper.IContainer;
import sooper.enums.ContainerType;

public class Box extends Container{

    //We need to create the constructor
    //All the arguments that we need to create correctly the object of this class

    private int length;
    private int width;

    public Box(String reference, int height, int length, int width){
        //Remember, to call the variables of our SuperClass we should call in this way;
        super(reference, height); //This could return an error because we havent defined this 
        //constructor within our SuperClass -- Container
        this.length = length;
        this.width = width;
    }

    @Override
    public int getSurface() {
        return width * length;
    }

    @Override
    public ContainerType getType() {
        return ContainerType.BOX;
    }

    @Override
    public void add(IContainer containers) {
        // TODO Auto-generated method stub
        containers.add(containers);
    }
    
}