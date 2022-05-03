package ObjectOrientedDesign.V3;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {
    public static void main(String[] args){
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        // Note we need to change the signature also
        Guitar whatErinLikes = new Guitar("", 0, Builder.FENDER, "stratocator",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

        // now the requirement got change
        // the seller wants to display more than one guitar to the seller.
        List matchingGuitars = inventory.search(whatErinLikes);
        if(!matchingGuitars.isEmpty()){
            System.out.println("Erin, you might like these guitars:");
            for(Iterator i = matchingGuitars.iterator(); i.hasNext();){
                Guitar guitar = (Guitar) i.next();
                System.out.println("We have a " +
                        guitar.getBuilder() + " " + guitar.getModel() + " "+
                        " " + guitar.getType() + " guitar:\n " + guitar.getBackWood() + " " +
                        "back and sides,\n " + guitar.getTopWood() + " " +
                        "top.\n You can have it for only $" + guitar.getPrice() + "!\n\n");
            }
        }else{
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    public static void initializeInventory(Inventory inventory){
        // Add guitars to the inventory...
        inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocator",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("V9512", 1549.95, Builder.FENDER, "Stratocator",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
    }
}
