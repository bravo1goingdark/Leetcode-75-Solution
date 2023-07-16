import java.util.ArrayList;
import java.util.List;

class candies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    List<Boolean> list = new ArrayList<>();

    int maxCandies = 0;
    for (int candy : candies) {
        maxCandies = Math.max(maxCandies, candy);
    }

    for (int candy : candies) {
        list.add(candy + extraCandies >= maxCandies);
    }

    return list;
}
}