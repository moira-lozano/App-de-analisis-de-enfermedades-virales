
package com.matias.detector_enfermedad;
public class Nodo
{
    private Nodo hijoIzq;
    private int elem;
    private int porc;
    private Nodo hijoDer;

    public Nodo(int ele ) {
        hijoIzq=null;
        elem = ele;
        hijoDer=null;
    }
    public void setHI(Nodo izq){
        hijoIzq = izq;
    }
    public void setElem(int e) {
        elem = e;
    }
    public void setHD(Nodo der) {
        hijoDer = der;
    }
    public Nodo getHI() {
        return hijoIzq;
    }
    public int getElem() {
        return elem;
    }
    public Nodo getHD() {
        return hijoDer;
    }
    public void setPorc(int porcentaje)
    {
        porc = porcentaje;
    }
    public int getPorc(){
        return porc;
    }

}//end class