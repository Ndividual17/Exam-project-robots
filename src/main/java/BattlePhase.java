import java.util.ArrayList;

public class BattlePhase extends InputScanner {
    private final ArrayList<String> list = SetListsAndMaps.setArrayList();

    public String prepareForHit(Robot robotTarget) {

        System.out.println("\nFor exit press P");
        System.out.println("A shot at '" + robotTarget.getName() + "'. Press only one key from (QWEASDZXC)");
        do {
            String value = getLetterFromConsole();
            value = value.trim().toUpperCase();
            if (list.contains(value)) {
                return value;
            } else {
                System.out.println("Wrong input. Use only (QWEASDZXC) or \"P\" keys");
            }
        } while (true);
    }

    public void hitAction(String hitLetter, Robot robot_attacker, Robot robot_target) {
        if (robot_attacker.getHitLetter().get(hitLetter)) {
            System.out.printf("Good shot! The health of '%s' is decreased for 20hp\n", robot_target.getName());
            robot_target.damagedHealth();
            robot_attacker.getUsedLetter().put(hitLetter, true);
        } else {
            System.out.println("Key does no damage");
            robot_attacker.getUsedLetter().put(hitLetter, true);
        }
    }

    public void swapRobotsInList(ArrayList<Robot> list) {
        Robot value = list.get(0);
        list.remove(0);
        list.add(value);
    }

    public void printRobotsHealth(ArrayList<Robot> list) {
        System.out.printf("Robot \"%s\" - %s hp left\n", list.get(0).getName(), list.get(0).getHealth());
        System.out.printf("Robot \"%s\" - %s hp left\n", list.get(1).getName(), list.get(1).getHealth());
    }
}