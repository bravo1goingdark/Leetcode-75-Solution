import java.util.Arrays;

public class spellsAndPotion {

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
    Arrays.sort(potions);
    int[] pairs = new int[spells.length];

    for (int i = 0; i < spells.length; i++) {
        pairs[i] = getSuccess(potions, spells[i], success);
    }

    return pairs;
}

public static int getSuccess(int[] potions, int spell, long success) {
    int low = 0;
    int high = potions.length - 1;
    int count = 0;


    while (low <= high) {
        int mid = low + (high - low) / 2;
        if ((long) spell * potions[mid] >= success) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }
    count = potions.length - low;
    return count;
}
}
