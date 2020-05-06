public class PolyDemo {
    public static void main(String[] args) {
        Polynomial p1, p2, p3, p4, sum12, sum34;

        p1 = new Polynomial();
        p1.addPolyNodeLast(4, 3);
        p1.addPolyNodeLast(3, 2);
        p1.addPolyNodeLast(-5, 0);
        System.out.println("First Polynomial: \n" + p1);

        p2 = new Polynomial();
        p2.addPolyNodeLast(3, 5);
        p2.addPolyNodeLast(4, 4);
        p2.addPolyNodeLast(1, 3);
        p2.addPolyNodeLast(-4, 2);
        p2.addPolyNodeLast(4, 1);
        p2.addPolyNodeLast(2, 0);
        System.out.println("\nSecond Polynomial: \n" + p2);

        sum12 = p1.addPolynomials(p2);
        System.out.println("\nSum of first and second polynomials: \n" + sum12);

        p3 = new Polynomial();
        p3.addPolyNodeLast(-5, 0);
        p3.addPolyNodeLast(3, 2);
        p3.addPolyNodeLast(4, 3);
        System.out.println("\nThird Polynomial: \n" + p3);

        p4 = new Polynomial();
        p4.addPolyNodeLast(-4, 0);
        p4.addPolyNodeLast(4, 3);
        p4.addPolyNodeLast(5, 4);
        System.out.println("\nFourth Polynomial: \n" + p4);

        sum34 = p3.addPolynomials(p4);
        System.out.println("\nSum of third and fourth polynomials: \n" + sum34);
    }
}
