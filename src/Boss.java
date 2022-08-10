public class Boss extends GemaEntity{
    private String TypeWeapon;
    private String nemaofWeapon;

    public Boss(int health, int demage, String typeAtak) {
        super(health, demage, typeAtak);
    }

    public String getTypeWeapon() {
        return TypeWeapon;
    }

    public void setTypeWeapon(String typeWeapon) {
        TypeWeapon = typeWeapon;
    }

    public String getNemaofWeapon() {
        return nemaofWeapon;
    }

    public void setNemaofWeapon(String nemaofWeapon) {
        this.nemaofWeapon = nemaofWeapon;
    }
}
