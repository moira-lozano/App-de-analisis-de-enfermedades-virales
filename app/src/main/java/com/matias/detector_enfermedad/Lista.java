package com.matias.detector_enfermedad;


public class Lista {
    private NodoL inicio;
    private NodoL fin;
    private int cant;  //cantidad de elementos de la lista
    private Enfermedades_Sintomas S;
    //CONSTRUCTOR
    public Lista()
    {
        inicio=null;
        fin=null;
        cant=0;
        S= new Enfermedades_Sintomas();
    }
    public void insertar(String enfermedad)
    {
        cant++;
        NodoL p= new NodoL(enfermedad,cant);
        if(inicio==null)
        {
            inicio=p;
            fin=p;
        }else
        {
            fin.setSig(p);
            fin=p;
        }
    }
    // RETORNA LA ENFERMEDAD DE ACUERDO A SU POSICION
    public NodoL getEnfermedad(int enferm)
    {
        NodoL p=inicio;
        while(p!=null)
        {
            if(p.getNEnfermedad()==enferm)
                return p;
            p=p.getSig();
        }
        return null;
    }
    // METODOS AUXILIARES
    public String mostrarSintomasDeE(int enfermedad)
    {
        NodoL p=inicio;
        String S="";
        while(p!=null)
        {
            if(p.getNEnfermedad()==enfermedad) {
                Arbol A = p.getArbol();
                S += p.getEnfermedad() + "  ";
                p = p.getSig();
            }
        }
        return S;
    }
    // MUESTRA POR ENFERMEDAD SUS SINTOMAS
    public String mostrarEnfermedadYsintomas()
    {
        NodoL p=inicio;
        String S="";
        while(p!=null)
        {
            Arbol A=p.getArbol();
            S+=("ENFERMEDAD: "+p.getEnfermedad()+"\n"+"SINTOMAS:  "+A.InOrden()+"\n");
            p=p.getSig();
        }
        return S;
    }

}
