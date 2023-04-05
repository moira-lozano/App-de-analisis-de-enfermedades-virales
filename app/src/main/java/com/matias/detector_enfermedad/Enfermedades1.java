package com.matias.detector_enfermedad;
public class Enfermedades1 {
    private int cant; //Contador de cantidad de enfermedades
    private int max;   // Cantidad de Enfermedades
    private Lista E;  //LISTA DE LAS ENFERMEDADES
    //CONSTRUCTOR
    public Enfermedades1(int cantidadE) {
        max = cantidadE;
        E = new Lista();
        cant = 0;
    }
    // INSETAR ENFERMEDAD
    public void insertarEnfermedad(String enfermedad) {
        if (cant < max) {
            E.insertar(enfermedad);
            cant++;
        } else {
            System.out.println("Ah alcanzado el maximo de enfermedades");
        }
    }
    // INSERTA LOS SINTOMAS EN LA ENFERMEDAD DESEADA

    public void insertarSintomaXEnfermedad(int enfermedad, int sintoma, int porcentaje) {
        NodoL s = E.getEnfermedad(enfermedad);
        if (s != null) {
            Arbol A = s.getArbol();
            A.insertar(sintoma, porcentaje);
        } else {
            System.out.println("La enfermedad NO EXISTE");
        }
    }
    // METODO PARA VERIFICAR SI YA TENEMOS UN RESULTADO
    public boolean existeDiagnostico(boolean[] sintomas)
    {
        int PEnfermedad=0;
        NodoL e=E.getEnfermedad(1);
        do
        {
            Arbol A=e.getArbol();
            int sum=0;
            for(int j=1;j<sintomas.length;j++)
            {
                if(sintomas[j]==true){
                    if(A.existe(j))
                        sum+=A.porcie(j);
                }
            }
            if(sum>PEnfermedad && sum>=60){
                PEnfermedad=sum;
            }
            e=e.getSig();
        }while(e!=null);
        if(PEnfermedad>=60) {
            return true;
        }else{
            return false;
        }
    }
    //FUNCION PRINCIPAL PARA DEVOLVER EL DIAGNOSTICO
    public String Diagnostico(boolean[] sintomas)
    {
        int PEnfermedad=0; //VARIABLE AUX PARA GUARDAR LA PORCENTAJE DE LA ENFERMEDAD
        String Enfermedad=""; //  // VARIABLE PARA GUARDAR EL NOMBRE DE LA ENFERMEDAD
        String S="";  // VARIABLE AUX PARA MOSTRAR LA CADENA O EL DIAGNOSTICO
        NodoL e=E.getEnfermedad(1);
        do
        {
            Arbol A=e.getArbol();
            int sum=0;   // GUARDAR LA SUMA DE LOS SINTOMAS
            for(int j=1;j<sintomas.length;j++)
            {
                if(sintomas[j]==true){
                    if(A.existe(j))
                        sum+=A.porcie(j);
                }
            }
            if(sum>PEnfermedad && sum>=60){
                PEnfermedad=sum;
                Enfermedad=e.getEnfermedad();
            }
            e=e.getSig();
        }while(e!=null);
        if(PEnfermedad>=60) {
            S = ("TIENE UNA PROBABILIDAD DEL: " + PEnfermedad + "%" + "\n" + "DE TENER  " + Enfermedad);
        }else{
            S="NO HAY DATOS SUFICIENTES PARA TENER UN DIAGNOSTICO";
        }
        return S;
    }

    public String mostrarSintomasDe(int enfermedad)
    {

        return E.mostrarSintomasDeE(enfermedad);
    }

    public String mostrarEnfYSintomas(){
        return E.mostrarEnfermedadYsintomas();
    }
    public String preguntaListaDeEnfermedades(boolean[] sintomas)
    {
        String enfer="";
        NodoL enfermedad=E.getEnfermedad(1);

        while(enfermedad != null) {
            Arbol Arbolito = enfermedad.getArbol();
            int sumaDeEnfer = 0;   int cont = 1;
            while(cont < sintomas.length){
                if (sintomas[cont] == true) {
                    if (Arbolito.existe(cont))
                        sumaDeEnfer += Arbolito.porcie(cont);
                }
                cont++;
            }
            if (sumaDeEnfer > 0) {
                enfer+= enfermedad.getEnfermedad() +"  "+ sumaDeEnfer+"%"+"\n"   ;
            }
            enfermedad = enfermedad.getSig();
        }
        return enfer;
    }
}


