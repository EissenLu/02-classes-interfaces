package ohm.softa.a02;

import java.util.Iterator;

/**
 * @author Peter Kurfer
 * Created on 10/6/17.
 */
public class SimpleListImpl implements SimpleList {

	private static class Element{
        Object o;
        Element next;
        Element(Object o){
            this.o = o;
            this.next = null;
        }

        Element getNext() {return this.next; }
        void setNext(Element e) {this.next = e; }
        Object getObj() {return this.o;}
        void setObj(Object o) {this.o = o;}

    }

    public class SimplIteratorImpl implements Iterator {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }
    }


}
