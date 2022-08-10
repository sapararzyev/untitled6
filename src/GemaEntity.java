public class GemaEntity {
    private int health;
    private int demage;
    private String typeAtak;

    public GemaEntity(int health, int demage, String typeAtak) {
        this.health = health;
        this.demage = demage;
        this.typeAtak = typeAtak;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDemage() {
        return demage;
    }

    public void setDemage(int demage) {
        this.demage = demage;
    }

    public String getTypeAtak() {
        return typeAtak;
    }

    public void setTypeAtak(String typeAtak) {
        this.typeAtak = typeAtak;
    }
}
