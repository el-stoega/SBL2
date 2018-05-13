package de.ur.adp.containers;


import de.ur.adp.linkedlist.Node;

public class CircularQueue<T> extends StudentsQueue<T> {
    
    int ringsize;




    public CircularQueue(int ringsize){
        super();
        this.ringsize = ringsize;
    }


    @Override
    public void put(T t) {
        boolean closed = false;
        Node temp = anchor;
        if(super.numOfNodes < ringsize ) {
            super.put(t);
        } else {
            if(closed == false) {
                temp.setNextNode(anchor);
                closed = true;
            } else {
                temp.setNextNode((Node) t);
                t = (T) anchor;
            }
        }
    }
}
