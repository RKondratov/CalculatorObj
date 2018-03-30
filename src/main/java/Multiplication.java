import java.util.ArrayList;

/**
 * Created by Kondratov on 29.03.2018.
 *
 * @see #calculate(ArrayList)
 * @see #getList()
 * @see #setList(ArrayList)
 */
public class Multiplication implements Operation {
    private ArrayList list;

    Multiplication(ArrayList list) {
        this.list = list;
    }

    /**
     * Method takes an collection to multiplicat numbers
     *
     * @param args is collection with numbers that will be multiplied
     */
    public double calculate(ArrayList args) {
        double raznost = Double.parseDouble(args.get(1).toString());
        for (int i = 2; i < args.size(); i++) {
            raznost *= Double.parseDouble(args.get(i).toString());
        }
        return raznost;
    }

    public ArrayList getList() {
        return list;
    }

    public void setList(ArrayList list) {
        this.list = list;
    }
}

