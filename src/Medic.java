public class Medic extends Hero {
    private int healPoints;

    public Medic(int health, int damage, int healPoints) {
        super(health, damage, "HEALING");
        this.healPoints = healPoints;
    }
    public int getHealPoints() {
        return healPoints;
    }
    public void increaseExperience() {
        this.healPoints += healPoints * 0.1;
        System.out.println("Medic увеличил опыт лечения, новые очки лечения: " + healPoints);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность: " + getSuperAbilityType());
    }
}
