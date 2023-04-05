package com.matias.detector_enfermedad;

public class Enfermedades_Sintomas {
    private String[] AllSintomas;

    public Enfermedades_Sintomas() {
        AllSintomas=new String[31];
        AllSintomas[1] = "Fiebre";
        AllSintomas[2] = "Dolor abdominal";
        AllSintomas[3] = "Nauseas y vomito";
        AllSintomas[4] = "Diarrea";
        AllSintomas[5] = "Escalofrios";
        AllSintomas[6] = "Sangre en heces";
        AllSintomas[7] = "Ojos rojos y ardor";
        AllSintomas[8] = "Lagrimeo y Parpados pegados";
        AllSintomas[9] = "Congestion nasal";   //1
        AllSintomas[10] = "tos o tos con flema";
        AllSintomas[11] = "Dolor y picazon de la garganta";
        AllSintomas[12] = "Dolor de pecho";
        AllSintomas[13] = "Fatiga";
        AllSintomas[14] = "Delirio";
        AllSintomas[15] = "Falta de apetito";
        AllSintomas[16] = "Piel y ojos amarillos";
        AllSintomas[17] = "Dolor de cabeza";
        AllSintomas[18] = "Úlceras que no cicatrizan";
        AllSintomas[19] = "Visión borrosa";
        AllSintomas[20] = "Aumento del apetito";
        AllSintomas[21] = "Entumecimiento u hormigueo en las manos o pies";
        AllSintomas[22] = "Aumento de la sed y ganas de orinar";
        AllSintomas[23] = "Pérdida de peso sin razón aparente";
        AllSintomas[24] = "Sarpullido";
        AllSintomas[25] = "Pérdida del gusto y olfato";
        AllSintomas[26] = "Dolor muscular";
        AllSintomas[27] = "Dolor en los huesos o en las articulaciones";
        AllSintomas[28] = "Sangrado";
        AllSintomas[29] = "Senciilidad en los ojos";
        AllSintomas[30] = "Lagañas";
    }
    public String retSintoma(int pos)
    {
        return AllSintomas[pos];
    }
}
