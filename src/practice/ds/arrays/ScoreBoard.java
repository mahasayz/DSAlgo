package practice.ds.arrays;

/**
 * Created by mahbubalam on 30.12.17.
 */
public class ScoreBoard {

    private int numEntries = 0;
    private GameEntry[] scores;

    public ScoreBoard(int capacity) {
        scores = new GameEntry[capacity];
    }

    public void add(GameEntry score) {
        if (numEntries > 0 && score.getScore() > scores[numEntries - 1].getScore()) {
            int idx = 0;
            for (; idx<numEntries; idx++) {
                if (scores[idx].getScore() > score.getScore())
                    continue;
                else
                    break;
            }
            int i = numEntries < scores.length ? numEntries : scores.length - 1;
            for (; i > idx; i--) {
                scores[i] = scores[i-1];
            }
            scores[idx] = score;
            if (numEntries < scores.length)
                numEntries++;
        } else {
            if (numEntries < scores.length) {
                scores[numEntries] = score;
                numEntries++;
            }
        }
        debug();
    }

    public boolean remove(int i) {
        if (numEntries != 0 || i < numEntries) {
            GameEntry temp = scores[i];
            for (int j=i; j<numEntries-1; j++)
                scores[j] = scores[j+1];
            scores[numEntries - 1] = null;
            numEntries--;
            debug();
            return true;
        }
        return false;
    }

    public void debug() {
        for (int i=0; i<numEntries; i++) {
            System.out.println(scores[i].toString());
        }
        System.out.println("=================");
    }

    public static void main(String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard(5);

        scoreBoard.add(new GameEntry(2, "John"));
        scoreBoard.add(new GameEntry(2, "Dave"));
        scoreBoard.add(new GameEntry(2, "Rico"));
        scoreBoard.add(new GameEntry(2, "Mahbub"));
        scoreBoard.add(new GameEntry(2, "Jumbo"));
        scoreBoard.add(new GameEntry(5, "Coco"));

        scoreBoard.remove(0);

    }

}
