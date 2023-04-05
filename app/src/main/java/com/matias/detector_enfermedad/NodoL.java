package com.matias.detector_enfermedad;


public class NodoL {
    private NodoL sig;  //RECORRER LA LISTA
    private Arbol A;    //ES EL ARBOL SE GUARDAN LOS SINTOMAS
    private int n;      //NUMERO DEL SINTOMAS
    private String Enferm;

    public NodoL(String Enfermedad,int numE)
    {
        n=numE;
        Enferm=Enfermedad;
        A=new Arbol();
        sig=null;
    }
    // ENLAZAR AL SIGUIENTE NODO DE LA LISTA
    public void setSig(NodoL siguiente)
    {
        sig=siguiente;
    }
    //RETORN EL SIGUIENTE NODO DE LA LISTA
    public NodoL getSig()
    {
        return sig;
    }
    //RETORNA DEL ARBOL
    public Arbol getArbol()
    {
        return A;
    }
    // RETORNA EL EL NOMBRE DE LA ENFERMEDAD EN FORMATO CADENA
    public String getEnfermedad()
    {
        return Enferm;
    }
    // RETORNA EL NUMERO DE LA ENFERMEDAD
    public int getNEnfermedad()
    {
        return n;
    }
}
