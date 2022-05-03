package ObjectOrientedDesign.V1;

public class FindGuitarTester {
    public static void main(String[] args){
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar whatErinLikes = new Guitar("", 0, "fender", "stratocator",
                "electric", "Alder","Alder");

        Guitar guitar = inventory.search(whatErinLikes);
        // the problem with above code is that in search builder, model, type backwood and topwood
        // are case sensitive.
        if(guitar != null){
            System.out.println("Erin, you might like this " +
                    guitar.getBuilder() + "" + guitar.getModel() + "" + guitar.getModel() +
                    " " + guitar.getType() + "guitar:\n " + guitar.getBackWood() +
                    "back and sides,\n " + guitar.getTopWood() +
                    "top.\n You can have it for only $" + guitar.getPrice() + "!");
        }else{
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    public static void initializeInventory(Inventory inventory){
        // Add guitars to the inventory...
        inventory.addGuitar("V95693", 1499.95, "Fender", "Stratocator",
                "electric", "Alder", "Alder");
    }
}
