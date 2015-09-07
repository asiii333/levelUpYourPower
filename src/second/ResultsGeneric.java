package second;

/**
 * Created by Asia on 2015-08-26.
 */
public class ResultsGeneric {
    static SquereGeneric<Integer> sqrInt = new SquereGeneric<Integer>(2,3);
    static SquereGeneric<Double> sqrDouble = new SquereGeneric<Double>(2.5d,4d);

    public static void main(String[] args) {
        System.out.print("integer: ");
        int resInt = sqrInt.getX()*sqrInt.getY();
        System.out.println(resInt);
        System.out.print("double: ");
        double resDub = sqrDouble.getX()*sqrDouble.getY();
        System.out.println(resDub);
    }
}
