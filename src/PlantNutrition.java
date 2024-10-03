
public enum PlantNutrition {

    MINERAL_WATER ("Mineralvatten"),
    TAP_WATER ("Kranvatten"),
    PROTEIN_DRINK("Proteindryck");

    private final String fluid;

    PlantNutrition(String fluid) {
        this.fluid = fluid;
    }

    public String getFluid() {
        return fluid;
    }
}
