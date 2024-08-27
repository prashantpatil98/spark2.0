package JavaCollections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {


        //Vector <Integer> elements = new Vector();    //Integer specific
        Vector v = new Vector();
        v.addElement(90);
        v.addElement(10);
        v.addElement(20);

        System.out.println(v);
        Enumeration elements = v.elements();
        while(elements.hasMoreElements())
        {
            Integer data = (Integer) elements.nextElement();
            System.out.println(data);
        }

    }
}
