public class PolyNodeClass {
    //Fields
    private int coefficient;
    private int exponent;
    private PolyNodeClass next;

    //Default constructor
    public PolyNodeClass() {
        coefficient = 0;
        exponent = 1;
        next = null;
    }

    //Overloaded constructor
    public PolyNodeClass(int coeff, int exp, PolyNodeClass n) {
        coefficient = coeff;
        exponent = exp;
        next = n;
    }

    //Copy constructor
    public PolyNodeClass(PolyNodeClass pnc) {
        coefficient = pnc.coefficient;
        exponent = pnc.exponent;
        next = pnc.next;
    }

    //Sets coefficient value for PolyNodeClass obj
    public void setCoefficent(int coeff) {
        coefficient = coeff;
    }

    //Sets exponent value for PolyNodeClass obj
    public void setExponent(int exp) {
        exponent = exp;
    }

    //Sets next value for PolyNodeClass obj
    public void setNext(PolyNodeClass n) {
        next = n;
    }

    //Returns coefficient
    public int getCoefficient() {
        return coefficient;
    }

    //Returns exponent
    public int getExponent() {
        return exponent;
    }

    //Returns next node
    public PolyNodeClass getNext() {
        return next;
    }
}