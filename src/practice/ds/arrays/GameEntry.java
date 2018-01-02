package practice.ds.arrays;

/**
 * Created by mahbubalam on 30.12.17.
 */
public class GameEntry {
    private int score;
    private String name;

    public GameEntry(int s, String n) {
        score = s;
        name = n;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "(" + name + ", " + score + ")";
    }
}
