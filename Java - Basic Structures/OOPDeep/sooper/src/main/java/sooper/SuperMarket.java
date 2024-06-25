package sooper;

import sooper.containers.Bag;
import sooper.containers.Box;
import sooper.products.Fresh;
import sooper.products.Frozen;
import sooper.products.Hygiene;

public class SuperMarket {
    public static void main(String[] args) {
        //Now er are creating objects
        //using all the clases before created

        //Lets to create all the required
        Order myOrder = new Order("Pedido 001");

        IContainer bag1 = new Bag("B001", 40, 25);
        IContainer box1 = new Box("C001", 30, 50, 75);
        
        myOrder.addContainter(bag1);
        myOrder.addContainter(box1);

        System.out.println("Mi pedido es: " + myOrder);


        IProduct apples = new Fresh("APLL", 100, 1500);
        IProduct iceCream = new Frozen("ICR", 800, 1000);
        IProduct wcPaper = new Hygiene("WCP", 500, 2500);
        IProduct pears = new Fresh("PEAR", 800, 1200);


        IContainer contApples = myOrder.addProduct(apples);
        IContainer contIceCream = myOrder.addProduct(iceCream);
        IContainer contPaper = myOrder.addProduct(wcPaper);
        IContainer contPears = myOrder.addProduct(pears);

        System.out.println("Mi pedido con productos; " + myOrder);


 


    }

}
