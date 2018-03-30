import java.util.ArrayList;

/**
 * Created by Kondratov on 29.03.2018.
 *
 * @see #calculate(ArrayList)
 * @see #getList()
 * @see #setList(ArrayList)
 */
public class Division implements Operation {
    private ArrayList list;

    Division(ArrayList list) {
        this.list = list;
    }

    /**
     * Method takes an collection to divide numbers
     *
     * @param args is collection with numbers that will be divided
     */
    public double calculate(ArrayList args) {
        double delenie = Double.parseDouble(args.get(1).toString());
        for (int i = 2; i < args.size(); i++) {
            delenie /= Double.parseDouble(args.get(i).toString());
        }
        return delenie;
    }

    public ArrayList getList() {
        return list;
    }

    public void setList(ArrayList list) {
        this.list = list;
    }
}
