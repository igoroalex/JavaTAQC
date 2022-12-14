package hw6;

import java.util.*;

public class PracticalTask1 {
    private ArrayList<Integer> myCollection;

    public PracticalTask1(int numberValues) {
        ArrayList<Integer> res = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < numberValues; i++) {
            res.add(r.nextInt(50));
        }
        setMyCollection(res);
    }

    public ArrayList<Integer> getMyCollection() {
        return myCollection;
    }

    public void setMyCollection(ArrayList<Integer> myCollection) {
        this.myCollection = myCollection;
    }

    public ArrayList<Integer> getNewCollection() {
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0;
        for (int x : myCollection) {
            if (x > 20) {
                res.add(i);
            }
            i++;
        }
        return res;
    }

    public void remove20() {
        myCollection.removeIf(x -> x > 20);
    }

    public void cheat() {
        myCollection.set(2, -1);
        myCollection.set(8, -3);
        myCollection.set(5, -4);
    }

    public List<Integer> sort() {
        List<Integer> res = new ArrayList<>(myCollection);
        Collections.sort(res);
        return res;
    }

}
