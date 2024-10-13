public class Player {
    public String name;
    public int health;
    public String weapon;

    public void looseHealth(int damage) {
        health -= damage;
        String s = "";
        s = (health < 0) ? "Player knocked out the game" : s;
    }
    public int healthRemaining() {
        return health;
    }
    public void restoreHealth(int health) {
        this.health  += health;

        if (health > 100) {
            System.out.println("Player restored to 100%");
            health = 100;
        }
    }
}
