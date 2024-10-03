import javax.swing.*;
import java.util.ArrayList;


public class PlantHotel {

    public PlantHotel() {
        //polymorfism, använder klassen Plants som referens men objekten är olika subtyper
        ArrayList<Plants> plants = new ArrayList<>();

        plants.add(new Cactus(0.2, "Igge"));
        plants.add(new Palm(5, "Laura"));
        plants.add(new Carnivorousplant(0.7, "Meatloaf"));
        plants.add(new Palm(1, "Olof"));

        String inputPlant = JOptionPane.showInputDialog(null, "Vilken växt ska få vätska?");

        Plants plantFound = null;

        for (Plants plant : plants) {
            if (plant.getName().equalsIgnoreCase(inputPlant)) {
                plantFound = plant;

                break;
            }
        }
        if (plantFound != null) {
            JOptionPane.showMessageDialog(null, plantFound.getName()
                    + " ska få " + plantFound.getFluidAmount()
                    + " liter av " + plantFound.getTypeOfPlantNutrition().getFluid()
                    + " per dag");

        } else {
            JOptionPane.showMessageDialog(null, "Växten du letar efter finns inte");
        }
    }

    public static void main(String[] args) {

        PlantHotel p = new PlantHotel();
        }
    }






