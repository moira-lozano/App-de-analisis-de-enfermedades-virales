package com.matias.detector_enfermedad;
public class Arbol{
    private Nodo raiz;

    public Arbol() {
        raiz = null;
    }
    private boolean esHoja(Nodo pr) {
        return pr.getHI() == null && pr.getHD() == null;
    }

    public void insertar(int x, int porcentaj)
    {
        Nodo q = new Nodo(x);
        q.setPorc(porcentaj);
        if (raiz == null){
            raiz = q;
            return;
        }
        Nodo pr=raiz;
        Nodo ant=null;
        while (pr != null){
            ant=pr;
            if (x < pr.getElem())
                pr = pr.getHI();
            else
            if (x > pr.getElem())
                pr = pr.getHD();
            else
                return ;
        }

        if (x < ant.getElem())
            ant.setHI(q);
        else
            ant.setHD(q);
    }
    private void preOrden(Nodo pr)
    {
        if (pr != null) {
            System.out.println(pr.getElem());
            preOrden(pr.getHI());
            preOrden(pr.getHD());
        }
    }
    private int porcie(Nodo p,int x)
    {
        if(p==null)
        {
            return 0;
        }
        if(p.getElem()==x)
        {
            return p.getPorc();
        }
        int HI = porcie(p.getHI(),x);
        int HD = porcie(p.getHD(),x);
        return HI+HD;

    }
    public int porcie(int x)
    {
        return porcie(raiz,x);
    }

    public void preOrden() {
        preOrden(raiz);
    }

    private String InOrden(Nodo pr)
    {
        String S="";
        if (pr != null)  {
            S+=InOrden(pr.getHI());
            S+=pr.getElem() + "  ";
            S+=InOrden(pr.getHD());
        }
        return S;
    }

    public String InOrden()
    {
        return InOrden(raiz);
    }

    public boolean existe(int dato) {
        if (raiz == null) {
            return false;
        }
        Nodo nodoActual = this.raiz;
        while(nodoActual != null){
            if (dato == nodoActual.getElem()) {
                return true;
            }
            if (dato < nodoActual.getElem()) {
                nodoActual = nodoActual.getHI();
            }else if(dato > nodoActual.getElem()){
                nodoActual = nodoActual.getHD();
            }
        }
        return false;
    }
}


