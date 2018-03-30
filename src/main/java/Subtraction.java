import java.util.ArrayList;

/**
 * Created by Kondratov on 29.03.2018.*
 *
 * @see #calculate(ArrayList)
 * @see #getList()
 * @see #setList(ArrayList)
 */
public class Subtraction implements Operation {
    private ArrayList list;

    Subtraction(ArrayList list) {
        this.list = list;
    }

    /**
     * Method takes an collection to sudstract numbers
     *
     * @param args is collection with numbers that will be sudstracted
     */
    public double calculate(ArrayList args) {
        double proizv = Double.parseDouble(args.get(1).toString());
        for (int i = 2; i < args.size(); i++) {
            proizv -= Double.parseDouble(args.get(i).toString());
        }
        return proizv;
    }

    public ArrayList getList() {
        return list;
    }

    public void setList(ArrayList list) {
        this.list = list;
    }
}
