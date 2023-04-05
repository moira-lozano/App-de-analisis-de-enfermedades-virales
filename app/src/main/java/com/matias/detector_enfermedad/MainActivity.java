package com.matias.detector_enfermedad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int i;
    int MAX;
    TextView text;
    Button prueba; //Boton para iniciar la prueba
    Button Si_B;
    Button No_B;
    Button Resultado_B;
    Button Existe_B;
    boolean[] Sintoma; //Array de los sintomas capturados
    String[] AllSintomas;  //Array de los todos los sintomas
    Enfermedades1 Enfermedad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text =(TextView)  findViewById(R.id.text);
        MAX=30;
        prueba=(Button)  findViewById(R.id.prueba);
        Si_B=(Button)  findViewById(R.id.Si_B);
        No_B=(Button)  findViewById(R.id.No_B);
        Resultado_B=(Button)  findViewById(R.id.Resultado_B);
        Existe_B=(Button)  findViewById(R.id.Existe_B);


        prueba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Enfermedad = new Enfermedades1(10);
                Toast.makeText(getBaseContext(), "Iniciando Test", Toast.LENGTH_SHORT).show();
                Enfermedad.insertarEnfermedad("DENGUE");                //1
                Enfermedad.insertarEnfermedad("COVID 19");                 //2
                Enfermedad.insertarEnfermedad("GRIPE");                 //3
                Enfermedad.insertarEnfermedad("VIRUELA DEL MONO");      //4
                Enfermedad.insertarEnfermedad("DIABETES");              //5
                Enfermedad.insertarEnfermedad("FIEBRE AMARILLA");       //6
                Enfermedad.insertarEnfermedad("NEUMONÍA");              //7
                Enfermedad.insertarEnfermedad("RINITIS");               //8
                Enfermedad.insertarEnfermedad("CONJUNTIVITIS");         //9
                Enfermedad.insertarEnfermedad("GASTRITIS");             //10

                i=1;
                AllSintomas=new String[MAX+1];
                AllSintomas[1]="Fiebre";
                AllSintomas[2]="Dolor abdominal";
                AllSintomas[3]="Nauseas y vomito";
                AllSintomas[4]="Diarrea";
                AllSintomas[5]="Escalofrios";
                AllSintomas[6]="Sangre en heces";
                AllSintomas[7]="Ojos rojos y ardor";
                AllSintomas[8]="Lagrimeo y Parpados pegados";
                AllSintomas[9]="Congestion nasal";   //1
                AllSintomas[10]="tos o tos con flema";
                AllSintomas[11]="Dolor y picazon de la garganta";
                AllSintomas[12]="Dolor de pecho";
                AllSintomas[13]="Fatiga";
                AllSintomas[14]="Delirio";
                AllSintomas[15]="Falta de apetito";
                AllSintomas[16]="Piel y ojos amarillos";
                AllSintomas[17]="Dolor de cabeza";
                AllSintomas[18]="Úlceras que no cicatrizan";
                AllSintomas[19]="Visión borrosa";
                AllSintomas[20]="Aumento del apetito";
                AllSintomas[21]="Entumecimiento u hormigueo en las manos o pies";
                AllSintomas[22]="Aumento de la sed y ganas de orinar";
                AllSintomas[23]="Pérdida de peso sin razón aparente";
                AllSintomas[24]="Sarpullido";
                AllSintomas[25]="Pérdida del gusto y olfato";
                AllSintomas[26]="Dolor muscular";
                AllSintomas[27]="Dolor en los huesos o en las articulaciones";
                AllSintomas[28]="Sangrado";
                AllSintomas[29]="Sensivilidad en los ojos";
                AllSintomas[30]="Lagañas";


                //------------DENGE---------------------------//
                Enfermedad.insertarSintomaXEnfermedad(1,29,5);
                Enfermedad.insertarSintomaXEnfermedad(1,26,5);
                Enfermedad.insertarSintomaXEnfermedad(1,27,10);
                Enfermedad.insertarSintomaXEnfermedad(1,28,15);
                Enfermedad.insertarSintomaXEnfermedad(1,1,30);
                Enfermedad.insertarSintomaXEnfermedad(1,6,10);
                Enfermedad.insertarSintomaXEnfermedad(1,3,19);
                Enfermedad.insertarSintomaXEnfermedad(1,25,6);

                //---------------COVID-----------------------//
                Enfermedad.insertarSintomaXEnfermedad(2,29,5);
                Enfermedad.insertarSintomaXEnfermedad(2,11,10);
                Enfermedad.insertarSintomaXEnfermedad(2,1,18);
                Enfermedad.insertarSintomaXEnfermedad(2,24,40);
                Enfermedad.insertarSintomaXEnfermedad(2,14,12);
                Enfermedad.insertarSintomaXEnfermedad(2,6,15);

                //---------------GRIPE-----------------------//
                Enfermedad.insertarSintomaXEnfermedad(3,11,2);
                Enfermedad.insertarSintomaXEnfermedad(3,10,4);
                Enfermedad.insertarSintomaXEnfermedad(3,13,5);
                Enfermedad.insertarSintomaXEnfermedad(3,6,6);
                Enfermedad.insertarSintomaXEnfermedad(3,12,4);
                Enfermedad.insertarSintomaXEnfermedad(3,27,3);
                Enfermedad.insertarSintomaXEnfermedad(3,14,3);

                //------------VIRUELA DEL MONO----------------//
                Enfermedad.insertarSintomaXEnfermedad(4,14,6);
                Enfermedad.insertarSintomaXEnfermedad(4,6,10);
                Enfermedad.insertarSintomaXEnfermedad(4,5,15);
                Enfermedad.insertarSintomaXEnfermedad(4,1,19);
                Enfermedad.insertarSintomaXEnfermedad(4,25,20);
                Enfermedad.insertarSintomaXEnfermedad(4,11,30);

                //----------------DIABETES-------------------// ////yooo
                Enfermedad.insertarSintomaXEnfermedad(5,18,7);
                Enfermedad.insertarSintomaXEnfermedad(5,13,8);
                Enfermedad.insertarSintomaXEnfermedad(5,19,12);
                Enfermedad.insertarSintomaXEnfermedad(5,20,14);
                Enfermedad.insertarSintomaXEnfermedad(5,21,15);
                Enfermedad.insertarSintomaXEnfermedad(5,22,18);
                Enfermedad.insertarSintomaXEnfermedad(5,23,26);

                //----------------FIEBRE AMARILLA--------------//
                Enfermedad.insertarSintomaXEnfermedad(6,1,20);
                Enfermedad.insertarSintomaXEnfermedad(6,14,6);
                Enfermedad.insertarSintomaXEnfermedad(6,17,7);
                Enfermedad.insertarSintomaXEnfermedad(6,5,12);
                Enfermedad.insertarSintomaXEnfermedad(6,13,11);
                Enfermedad.insertarSintomaXEnfermedad(6,3,9);
                Enfermedad.insertarSintomaXEnfermedad(6,15,10);
                Enfermedad.insertarSintomaXEnfermedad(6,16,18);
                Enfermedad.insertarSintomaXEnfermedad(6,28,7);

                //------------*----NEUMONÍA--------------------//
                Enfermedad.insertarSintomaXEnfermedad(7,3,40);//uno de los primeros
                Enfermedad.insertarSintomaXEnfermedad(7,4,10);
                Enfermedad.insertarSintomaXEnfermedad(7,1,15);
                Enfermedad.insertarSintomaXEnfermedad(7,12,5);
                Enfermedad.insertarSintomaXEnfermedad(7,13,5);
                Enfermedad.insertarSintomaXEnfermedad(7,5,25);

                //----------------RINITIS--------------------//
                Enfermedad.insertarSintomaXEnfermedad(8,9,42);
                Enfermedad.insertarSintomaXEnfermedad(8,10,3);
                Enfermedad.insertarSintomaXEnfermedad(8,11,25);
                Enfermedad.insertarSintomaXEnfermedad(8,12,30);

                //------------CONJUNTIVITIS------------------//
                Enfermedad.insertarSintomaXEnfermedad(9,7,40);
                Enfermedad.insertarSintomaXEnfermedad(9,8,25);
                Enfermedad.insertarSintomaXEnfermedad(9,29,15);
                Enfermedad.insertarSintomaXEnfermedad(9,30,20);

                //------------GASTRITIS----------------------//
                Enfermedad.insertarSintomaXEnfermedad(10,2,35);
                Enfermedad.insertarSintomaXEnfermedad(10,3,10);
                Enfermedad.insertarSintomaXEnfermedad(10,4,9);
                Enfermedad.insertarSintomaXEnfermedad(10,5,7);
                Enfermedad.insertarSintomaXEnfermedad(10,17,14);
                Enfermedad.insertarSintomaXEnfermedad(10,6,25);

                Sintoma=new boolean[MAX+1];

                view =findViewById(R.id.prueba);
                view.setVisibility(View.GONE); //hacer invisible un boton

                // Desaparece la animacion al precionar iniciar prueba
                view =findViewById(R.id.lottieAnimationView);
                view.setVisibility(View.GONE);

                view =findViewById(R.id.Si_B);
                view.setVisibility(View.VISIBLE); //hacer visible un boton

                view =findViewById(R.id.No_B);
                view.setVisibility(View.VISIBLE);

                // hacer visible el lottie de sintomas en las preguntas
                view =findViewById(R.id.sintomas);
                view.setVisibility(View.VISIBLE);

                // Desabilita animacion de lottie para sugerirle q vaya al doctor al reiniciar el diagnostico
                view =findViewById(R.id.MostrarResult);
                view.setVisibility(View.GONE);
                // Desabilita texto de la sugetencia al reiniciar el diagnostico
                view =findViewById(R.id.sugerencia);
                view.setVisibility(View.GONE);


                text.setText("¿Usted tiene "+AllSintomas[i]+"?");
            }

        });
        Si_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i<MAX) {
                    Sintoma[i]=true;
                    if(!(i==MAX)) {
                        i++;
                        text.setText("¿Usted tiene "+AllSintomas[i]+"?");
                    }
                }
                if(i==MAX)
                {
                    view =findViewById(R.id.Resultado_B);
                    view.setVisibility(View.VISIBLE);

                    view =findViewById(R.id.Si_B);
                    view.setVisibility(View.GONE);

                    view =findViewById(R.id.No_B);
                    view.setVisibility(View.GONE);

                    view =findViewById(R.id.Existe_B);
                    view.setVisibility(View.GONE);
                }
                if(Enfermedad.existeDiagnostico(Sintoma))
                {
                    view =findViewById(R.id.Existe_B);
                    view.setVisibility(View.VISIBLE);


                }
            }
        });

        No_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i<MAX) {
                    Sintoma[i]=false;
                    if(!(i==MAX)) {
                        i++;
                        text.setText("¿Usted tiene "+AllSintomas[i]+"?");
                    }
                }
                if(i==MAX)
                {
                    view =findViewById(R.id.Resultado_B);
                    view.setVisibility(View.VISIBLE);

                    view =findViewById(R.id.Si_B);
                    view.setVisibility(View.GONE);

                    view =findViewById(R.id.No_B);
                    view.setVisibility(View.GONE);

                    view =findViewById(R.id.Existe_B);
                    view.setVisibility(View.GONE);
                }
                if(Enfermedad.existeDiagnostico(Sintoma))
                {
                    view =findViewById(R.id.Existe_B);
                    view.setVisibility(View.VISIBLE);



                }
            }
        });

        // boton de mostrar resultados
        Resultado_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(Enfermedad.preguntaListaDeEnfermedades(Sintoma));

                view =findViewById(R.id.Si_B);
                view.setVisibility(View.GONE);

                view =findViewById(R.id.No_B);
                view.setVisibility(View.GONE);

                view =findViewById(R.id.prueba);
                view.setVisibility(View.VISIBLE);

                view =findViewById(R.id.Existe_B);
                view.setVisibility(View.GONE);

                view =findViewById(R.id.Resultado_B);
                view.setVisibility(View.GONE);

                // habilitar animacion de lottie para sugerirle q vaya al doctor
                view =findViewById(R.id.MostrarResult);
                view.setVisibility(View.VISIBLE);
                // habilitar texto de la sugetencia
                view =findViewById(R.id.sugerencia);
                view.setVisibility(View.VISIBLE);

                // ocultar lottie de sintomas
                view =findViewById(R.id.sintomas);
                view.setVisibility(View.GONE);


            }
        });
         // btn de ya existe resultado
        Existe_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(Enfermedad.preguntaListaDeEnfermedades(Sintoma));

                view =findViewById(R.id.Si_B);
                view.setVisibility(View.GONE);

                view =findViewById(R.id.No_B);
                view.setVisibility(View.GONE);

                view =findViewById(R.id.Existe_B);
                view.setVisibility(View.GONE);

                view =findViewById(R.id.prueba);
                view.setVisibility(View.VISIBLE);
                // habilitar animacion de lottie para sugerirle q vaya al doctor
                view =findViewById(R.id.MostrarResult);
                view.setVisibility(View.VISIBLE);
                // habilitar texto de la sugetencia
                view =findViewById(R.id.sugerencia);
                view.setVisibility(View.VISIBLE);

                // ocultar lottie de sintomas
                view =findViewById(R.id.sintomas);
                view.setVisibility(View.GONE);

            }
        });
    }
}