/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.dei.esoft.pot.controller;

import pt.ipp.isep.dei.esoft.pot.model.Candidatura;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import pt.ipp.isep.dei.esoft.pot.model.Anuncio;
import pt.ipp.isep.dei.esoft.pot.model.Freelancer;
import pt.ipp.isep.dei.esoft.pot.model.Plataforma;
import pt.ipp.isep.dei.esoft.pot.model.RegistoAnuncio;
import pt.ipp.isep.dei.esoft.pot.model.RegistoDeFreelancer;

/**
 *
 * @author anton
 */
public class EfetuarCandidaturaController {
       private List<Anuncio> listaAnu;
       private RegistoAnuncio ranu;
       private Freelancer freel;
       private Candidatura cand;
       private Date dataCand;
    
   public EfetuarCandidaturaController(){
       listaAnu=new ArrayList <> ();
       dataCand=new Date();
       
   }
    
    public  void getAnunciosElegiveisDoFreelancer(String email){
        RegistoDeFreelancer rfree =Plataforma.getRegistoFreelancers();
        freel=RegistoFreelancer.getFreelancerByEmail(email);
        ranu=Plataforma.getRegistoAnuncios();
        listaAnu=ranu.getAnunciosElegiveisDoFreelancer();
    }
    
    public void novaCandidatura(Freelancer freel1, Date dataCand1, double valorPrt, int nrDias, String anuncioId, String txtApresentacao, String txtMotivacao){
        Anuncio anu=ranu.getAnuncioByID(anuncioId);
        cand=Anuncio.novaCandidatura(freel,dataCand,valorPrt,nrDias,txtApresentacao,txtMotivacao);
        
    }
    public void registaCandidatura(){
        Anuncio.registaCandidatura(cand);
    }
}
