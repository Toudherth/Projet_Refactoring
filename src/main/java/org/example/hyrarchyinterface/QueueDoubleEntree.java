package org.example.hyrarchyinterface;

public class QueueDoubleEntree  implements IQueueDoubleEntree {
    @Override
    public boolean add(Object o) {return true;}
    @Override
    public boolean isEmpty() {return true;}
    @Override
    public Object peek() {return null;}
    @Override
    public Object poll() {return null;}
    private void secretQDE(){}

}
