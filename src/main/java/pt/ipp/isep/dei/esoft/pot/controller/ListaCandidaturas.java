/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.dei.esoft.pot.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import pt.ipp.isep.dei.esoft.pot.model.Candidatura;
import pt.ipp.isep.dei.esoft.pot.model.Freelancer;

/**
 *
 * @author anton
 */
public class ListaCandidaturas {

    public static void novaCandidatura(Freelancer freel, Date dataCand, double valorPrt, int nrDias, String txtApres, String txtMotiv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    List<Candidatura> listaCandidatura;
    
    public ListaCandidaturas(){
        this.listaCandidatura=new ArrayList<>();
    }
    
    
        /**
     * @return the listaCandidatura
     */
    public List<Candidatura> getListaCandidatura() {
        return listaCandidatura;
    }

    /**
     * @param listaCandidatura the listaCandidatura to set
     */
    public void setListaCandidatura(List<Candidatura> listaCandidatura) {
        this.listaCandidatura = listaCandidatura;
    }
}
