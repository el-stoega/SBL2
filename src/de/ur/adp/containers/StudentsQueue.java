package de.ur.adp.containers;


import de.ur.adp.linkedlist.Node;

public class StudentsQueue<T> implements Queue<T> {

    protected Node<T> anchor;
    protected int numOfNodes;

    public StudentsQueue() {
        this.anchor = null;
        this.numOfNodes = 0;

    }

    @Override
    public void put(T t) {
        Node temp = anchor;

        if (anchor == null){
            anchor = new Node(t);
        } else {
            while (temp.getNextNode() != null) {
                temp = temp.getNextNode();
            }
            temp.setNextNode(new Node(t));
        }
        numOfNodes++;

    }

    @Override
    public T get() {
        Node temp = anchor;
        if (anchor.getNextNode() != null){

                anchor = anchor.getNextNode();
                temp.setNextNode(null);
            }



        if(numOfNodes > 0){
            numOfNodes--;
            return  (T) temp.getContent();
        } else {
            temp = null;
            anchor = null;
            return null;

        }


    }

    @Override
    public boolean isEmpty() {
        return (numOfNodes == 0);
    }

    @Override
    public int size() {
        return numOfNodes;
    }
}
