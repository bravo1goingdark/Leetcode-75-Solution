import java.util.HashSet;
import java.util.Set;

class SmallestInfiniteSet {
    private Set<Integer> removedNumbers;
    private int nextSmallest;

    public SmallestInfiniteSet() {
        removedNumbers = new HashSet<>();
        nextSmallest = 1;
    }

    public int popSmallest() {
        int smallest = nextSmallest;
        removedNumbers.add(smallest);
        nextSmallest = findNextSmallest();
        return smallest;
    }

    public void addBack(int num) {
        if (removedNumbers.contains(num)) {
            removedNumbers.remove(num);
            if (num < nextSmallest) {
                nextSmallest = num;
            }
        }
    }

    private int findNextSmallest() {
        int next = nextSmallest;
        while (removedNumbers.contains(next)) {
            next++;
        }
        return next;
    }
}