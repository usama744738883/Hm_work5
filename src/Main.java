public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(15);
        boss.setHealth(250);
        boss.setDefence("Kinetic");
        System.out.println("damage: " + boss.getDamage() + "\nHealth:" + boss.getHealth() + "\nDefence: " + boss.getDefence());
        createHeroes();
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getDamage());
            System.out.println(createHeroes()[i].getHealth());
            System.out.println(createHeroes()[i].getSuperPower());

        }
    }

    public static Hero[] createHeroes() {
        Hero ironman = new Hero(150, 45, "fly");
        Hero chrome = new Hero(59, 34, "Will evaporate");
        Hero Usama = new Hero(1000, 9999, "Immortality");
        Hero allheroes[] = new Hero[]{ironman, chrome, Usama};
        return allheroes;
    }
}
