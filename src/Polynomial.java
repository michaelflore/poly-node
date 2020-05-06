public class Polynomial implements PolynomialADT {

    private PolyNodeClass firstNode;

    //Default constructor
    public Polynomial() {
        firstNode = null;
    }

    //Overloaded constructor
    public Polynomial(PolyNodeClass fn) {
        firstNode = fn;
    }

    //Copy constructor
    public Polynomial(Polynomial pdsc) {
        firstNode = pdsc.firstNode;
    }

    //Returns true if firstNode is null, false otherwise
    public boolean isEmpty() {
        return firstNode == null;
    }

    //Setters and getters
    public void setFirstNode(PolyNodeClass fn) {
        firstNode = fn;
    }

    public PolyNodeClass getFirstNode() {
        return firstNode;
    }

    //Add node to front
    public void addPolyNodeFirst(int coeff, int exp) {
        if(isEmpty()) {
            firstNode = new PolyNodeClass(coeff, exp, null);
        }
        else {
            firstNode = new PolyNodeClass(coeff, exp, firstNode);
        }
    }

    //Add node to end
    public void addPolyNodeLast(int coeff, int exp) {
        if(isEmpty()) {
            firstNode = new PolyNodeClass(coeff, exp, null);
        }
        else {
            PolyNodeClass node = firstNode;

            while(node.getNext() != null) {
                node = node.getNext();
            }

            node.setNext(new PolyNodeClass(coeff, exp, null));
        }
    }

    //Adds node to end
    public void addPolyNode(int coeff, int exp) {
        addPolyNodeLast(coeff, exp);
    }

    //Adds two linked lists together
    public Polynomial addPolynomials(Polynomial pdsc) {
        int a = 0;
        int b = 0;
        PolyNodeClass currentNode = this.firstNode;
        PolyNodeClass otherNode = pdsc.firstNode;
        Polynomial newPoly = new Polynomial();

        while(currentNode != null && otherNode != null) {
            if(currentNode.getExponent() == otherNode.getExponent()) {
                a = currentNode.getCoefficient() + otherNode.getCoefficient();
                b = currentNode.getExponent();
                currentNode = currentNode.getNext();
                otherNode = otherNode.getNext();
            }
            else if(currentNode.getExponent() > otherNode.getExponent()) {
                a = currentNode.getCoefficient();
                b = currentNode.getExponent();
                currentNode = currentNode.getNext();
            }
            else {
                a = otherNode.getCoefficient();
                b = otherNode.getExponent();
                otherNode = otherNode.getNext();
            }
            newPoly.addPolyNodeLast(a, b);
        }
        if(currentNode != null && otherNode == null) {
            while(currentNode != null) {
                a = currentNode.getCoefficient();
                b = currentNode.getExponent();
                newPoly.addPolyNodeLast(a, b);
                currentNode = currentNode.getNext();
            }
        }
        if(otherNode != null && currentNode == null) {
            while(otherNode != null) {
                a = otherNode.getCoefficient();
                b = otherNode.getExponent();
                newPoly.addPolyNodeLast(a, b);
                otherNode = otherNode.getNext();
            }
        }
        return newPoly;
    }

    //Overridden toString() method
    public String toString() {
        PolyNodeClass current = firstNode;
        String poly = "";
        while(!isEmpty() && current.getNext() != null) {
            if(current.getExponent() == 0) {
                poly += Math.abs(current.getCoefficient());
                if(current.getNext().getCoefficient() >= 0) {
                    poly += " + ";
                }
                else if(current.getNext().getCoefficient() < 0) {
                    poly += " - ";
                }
            }
            else if(current.getExponent() == 1) {
                if(current.getCoefficient() == 1 || current.getCoefficient() == -1) {
                    poly += "x ";
                }
                else {
                    poly += Math.abs(current.getCoefficient()) + "x ";
                }

                if(current.getNext().getCoefficient() >= 0) {
                    poly += "+ ";
                }
                else if(current.getNext().getCoefficient() < 0) {
                    poly += "- ";
                }
            }
            else {
                if(current.getCoefficient() == 1 || current.getCoefficient() == -1) {
                    poly += "x^" + current.getExponent();
                }
                else {
                    poly += Math.abs(current.getCoefficient()) + "x^" + current.getExponent();
                }

                if(current.getNext().getCoefficient() >= 0) {
                    poly += " + ";
                }
                else if(current.getNext().getCoefficient() < 0) {
                    poly += " - ";
                }
            }

            current = current.getNext();
        }

        if(current.getExponent() == 0) {
            poly += Math.abs(current.getCoefficient());
        }
        else if(current.getExponent() == 1) {
            if(current.getCoefficient() == 1 || current.getCoefficient() == -1) {
                poly += "x";
            }
            else {
                poly += Math.abs(current.getCoefficient()) + "x";
            }
        }
        else {
            if(current.getCoefficient() == 1 || current.getCoefficient() == -1) {
                poly += "x^" + current.getExponent();
            }
            else {
                poly += Math.abs(current.getCoefficient()) + "x^" + current.getExponent();
            }
        }

        return poly;
    }
}
