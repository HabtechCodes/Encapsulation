public class EnhancedPlayer {
    private String fullName;
    private int heathPercentage;
    private String weapon;

    public EnhancedPlayer(String fullName) {
        this(fullName,100,"Sword");
    }

    public EnhancedPlayer(String fullName, int health, String weapon) {
        this.fullName = fullName;
        if (health < 0) {
                   this.heathPercentage = 1;
        }else if (health > 100){
            this.heathPercentage = 100;
        }else {
            this.heathPercentage = health;
        }

        this.weapon = weapon;
    }
    public void looseHealth(int damage) {
        heathPercentage -= damage;
        String s = "";
        s = (heathPercentage < 0) ? "Player knocked out the game" : s;
    }
    public int healthRemaining() {
        return heathPercentage;
    }
    public void restoreHealth(int health) {
        this.heathPercentage += health;

        if (health > 100) {
            System.out.println("Player restored to 100%");
            health = 100;
        }

    }
}
