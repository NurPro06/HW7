public class Main {

    public static void main(String[] args) {
        Hero[] heroes = {
                new Warrior(300, 50),
                new Magic(250, 40),
                new Medic(200, 10, 100)
        };

        for (Hero hero : heroes) {
            hero.applySuperAbility();

            if (hero instanceof Medic) {
                Medic medic = (Medic) hero;
                medic.increaseExperience();
            }
        }
    }
}