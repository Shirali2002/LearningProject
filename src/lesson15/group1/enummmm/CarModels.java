package src.lesson15.group1.enummmm;

public enum CarModels {

    MERCEDES_BENZ(15, new String[]{"C class", "E class"}),
    BMW(13, new String[]{"M5", "M3"}),
    OPEL(10, new String[]{"Astra", "Corsa"});

    private final int modelSayi;
    private final String[] modeller;

    CarModels(int modelSayi, String[] modeller) {
        this.modelSayi = modelSayi;
        this.modeller = modeller;
    }

    public int getModelSayi() {
        return modelSayi;
    }

    public String[] getModeller() {
        return modeller;
    }
}
