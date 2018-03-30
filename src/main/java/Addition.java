import java.util.ArrayList;

/**
 * Created by Kondratov on 29.03.2018.
 *
 * @see #calculate(ArrayList)
 * @see #getList()
 * @see #setList(ArrayList)
 */
public class Addition implements Operation {
    private ArrayList list;

    Addition(ArrayList list) {
        this.list = list;
    }

    /**
     * Method takes an collection to add numbers
     *
     * @param args is collection with numbers that will be added
     */
    public double calculate(ArrayList args) {
        double sum = 0;
        for (int i = 1; i < args.size(); i++) {
            sum += Double.parseDouble(args.get(i).toString());
        }
        return sum;
    }

    public ArrayList getList() {
        return list;
    }

    public void setList(ArrayList list) {
        this.list = list;
    }
}
