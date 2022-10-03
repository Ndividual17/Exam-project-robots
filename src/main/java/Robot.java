import java.util.HashMap;

public class Robot {
    private final String name;
    private int health = 100;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void damagedHealth() {
        this.health = this.health - 20;
    }

    private HashMap<String, Boolean> usedLetter = SetListsAndMaps.setUsedLetter();
    private HashMap<String, Boolean> hitLetter = SetListsAndMaps.setHitLetter();

    public HashMap<String, Boolean> getHitLetter() {
        return hitLetter;
    }

    public HashMap<String, Boolean> getUsedLetter() {
        return usedLetter;
    }
}