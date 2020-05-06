public interface PolynomialADT {
    boolean isEmpty();
    void setFirstNode(PolyNodeClass fn);
    PolyNodeClass getFirstNode();
    void addPolyNodeFirst(int coeff, int exp);
    void addPolyNodeLast(int coeff, int exp);
    void addPolyNode(int coeff, int exp);
    Polynomial addPolynomials(Polynomial pdsc);
}