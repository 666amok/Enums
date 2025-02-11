public enum Company {
    AUDI_DE("Audi Deutschland"),
    AUDI_IT("Audi Italy"),
    AUDI_FR("Audi France");

    private final String value;

    Company(final String s) {
        this.value = s;
    }

    public String value(){
        return value;
    }
}
