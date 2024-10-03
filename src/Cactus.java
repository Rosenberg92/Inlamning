
public class Cactus extends Plants {

    private static final double fluidNeeded = 0.2;

    public Cactus(double height, String name) {
        super(height, name);
    }


    @Override
    public double getFluidAmount() {
        return fluidNeeded;
    }

    @Override
    public PlantNutrition getTypeOfPlantNutrition(){
        return PlantNutrition.MINERAL_WATER;
    }
}