import java.util.ArrayList;

public class Battle extends InputScanner {
    public static void main(String[] args) {
        System.out.println("Enter name for robot #1");
        Robot robot_1 = new Robot(getLetterFromConsole());
        System.out.println("Enter name for robot #2");
        Robot robot_2 = new Robot(getLetterFromConsole());

        ArrayList<Robot> robotList = new ArrayList<>();
        robotList.add(robot_1);
        robotList.add(robot_2);

        BattlePhase battlePhase = new BattlePhase();
        do {
            String value = battlePhase.prepareForHit(robotList.get(0));
            if (value.equals("P")) {
                break;
            }
            if (robotList.get(1).getUsedLetter().get(value)) {
                System.out.println("Key is not active");
            } else {
                battlePhase.hitAction(value, robotList.get(1), robotList.get(0));
                if (robotList.get(0).getHealth() <= 0) {
                    System.out.printf("'%s' - was killed!\n'%s' - win!!!\n", robotList.get(0).getName(), robotList.get(1).getName());
                    break;
                }
            }
            battlePhase.printRobotsHealth(robotList);
            battlePhase.swapRobotsInList(robotList);
        } while (true);
        System.out.println("\nGoodbye!");
    }
}