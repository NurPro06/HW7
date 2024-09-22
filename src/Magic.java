public class Magic  extends Hero {
    public Magic(int health, int damage) {
        super(health, damage, "MAGICAL BOOST");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил суперспособность: " + getSuperAbilityType());
    }
}
