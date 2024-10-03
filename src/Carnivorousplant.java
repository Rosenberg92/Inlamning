
public class Carnivorousplant extends Plants {

    private static final double fluidNeeded = 0.1;
    private static final double fluidNeededFactor = 0.2;

    public Carnivorousplant(double height, String name) {
        super(height, name);
    }


    @Override
    public double getFluidAmount(){
        return fluidNeeded + (fluidNeededFactor * getHeight());
    }

    @Override
    public PlantNutrition getTypeOfPlantNutrition(){
        return PlantNutrition.PROTEIN_DRINK;
    }
}
