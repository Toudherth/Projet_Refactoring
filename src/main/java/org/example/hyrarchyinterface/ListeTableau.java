package org.example.hyrarchyinterface;

public class ListeTableau implements IListTableau {
    @Override
    public boolean add(Object o) {return true;}
    @Override
    public boolean isEmpty() {return true;}
    @Override
    public Object get(int i) {return null;}

    private void secretLT(){}
    public static void staticLT() {}
    int nbLT;
}
