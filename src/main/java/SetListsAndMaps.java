import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class SetListsAndMaps {
    public static HashMap<String, Boolean> setUsedLetter() {
        HashMap<String, Boolean> usedLetterMap = new HashMap<>();
        usedLetterMap.put("Q", false);
        usedLetterMap.put("W", false);
        usedLetterMap.put("E", false);
        usedLetterMap.put("A", false);
        usedLetterMap.put("S", false);
        usedLetterMap.put("D", false);
        usedLetterMap.put("Z", false);
        usedLetterMap.put("X", false);
        usedLetterMap.put("C", false);
        return usedLetterMap;
    }

    public static HashMap<String, Boolean> setHitLetter() {
        HashMap<String, Boolean> hitLetter = setUsedLetter();

        HashMap<Integer, String> randomLetter = new HashMap<>();
        randomLetter.put(0, "Q");
        randomLetter.put(1, "W");
        randomLetter.put(2, "E");
        randomLetter.put(3, "A");
        randomLetter.put(4, "S");
        randomLetter.put(5, "D");
        randomLetter.put(6, "Z");
        randomLetter.put(7, "X");
        randomLetter.put(8, "C");

        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        while (numbers.size() < 5) {
            int randomInt = random.nextInt(9);
            if (!numbers.contains(randomInt)) {
                numbers.add(randomInt);
            }
        }
        for (Integer number : numbers) {
            hitLetter.put(randomLetter.get(number), true);
        }
        return hitLetter;
    }

    public static ArrayList<String> setArrayList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Q");
        list.add("W");
        list.add("E");
        list.add("A");
        list.add("S");
        list.add("D");
        list.add("Z");
        list.add("X");
        list.add("C");
        list.add("P");
        return list;
    }
}