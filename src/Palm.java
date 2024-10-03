
public class Palm extends Plants {

    private static final double fluidNeeded = 0.5;

    public Palm(double height, String name) {
    super(height, name);
    }

    // polymorfism
    @Override
    public double getFluidAmount() {
        return getHeight() * fluidNeeded;
    }

    @Override
    public PlantNutrition getTypeOfPlantNutrition(){
        return PlantNutrition.TAP_WATER;
    }
}




