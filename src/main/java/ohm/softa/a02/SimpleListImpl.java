package ohm.softa.a02;

import java.util.Iterator;

/**
 * @author Peter Kurfer
 * Created on 10/6/17.
 */
public class SimpleListImpl implements SimpleList, Iterable<Object> {

    Element head;
    int size = 0;

    public SimpleListImpl(){
        this.head = null;
    }

    @Override
    public void add(Object o) {
        Element e = new Element(o);
        Element tmp = head;
        if(tmp != null){
            while(tmp.getNext() != null){
                tmp = tmp.getNext();
            }

            tmp.setNext(e);
        }else{
            head = e;
        }

        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public SimpleList filter(SimpleFilter filter) {
        return null;
    }


    @Override
    public Iterator<Object> iterator() {
        return new SimplIteratorImpl();
    }

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

    }

    private class SimplIteratorImpl implements Iterator<Object> {

        Element e = head;

        @Override
        public boolean hasNext() {
            return e != null;
        }

        @Override
        public Object next() {
            Object tmp = e.getObj();
            e = e.getNext();
            return tmp;
        }
    }


}
