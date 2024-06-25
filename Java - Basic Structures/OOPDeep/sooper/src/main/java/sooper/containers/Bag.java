package sooper.containers;

public class Bag extends Container {

    //First we write the variaables to create correctly our cinstructor
    private static int length;
    private static int width;

    public Bag(String reference, int height, int length, int width){
        //Initialize the extern constructor
        super(reference, height);

        //Then we define the internal cariavles within this constructor
        this.length = length;
        this.width = width;

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
    public String getType() {
        return "Bag";
    }
    


}
