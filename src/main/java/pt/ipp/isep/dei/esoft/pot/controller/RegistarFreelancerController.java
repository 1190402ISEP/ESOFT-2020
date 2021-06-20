/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.dei.esoft.pot.controller;

import pt.ipp.isep.dei.esoft.pot.model.Freelancer;
import pt.ipp.isep.dei.esoft.pot.model.Plataforma;
import pt.ipp.isep.dei.esoft.pot.model.RegistoDeFreelancer;
import pt.ipp.isep.dei.esoft.pot.model.CompTecnica;
import pt.ipp.isep.dei.esoft.pot.model.ReconhecimentoCompetencias;
/**
 *
 * @author anton
 */
public class RegistarFreelancerController {
  
    public void novoFreelancer(String nome,String NIF,String codPostal, String contacto, String email){
        Plataforma.getListaRegistoFreelancer();
        RegistoDeFreelancer.novoFreelancer(nome, NIF, codPostal, contacto, email);
    }

public void criarHabilitacaoAcademica(String grau, String designacao , String instituicao,double media){
   RegistoDeFreelancer.criarHabilitacaoAcademica(grau,designacao, instituicao,media); 
}


public void getListaCT(){
Plataforma.getListaCT();
}
public void getListaGrausDeProficiencia(){
Plataforma.getListaGrausDeProficiencia();   
}

public void getCT (int id ){
  Plataforma.getCT(id);  
}
public void getGrauDeProficienciaByID(int idgrau){
    Plataforma.getGrauDeProficienciaByID(idgrau); 
}




public void criarReconhecimentoParaFreelancer(CompTecnica ct, int grau, String designacao, String data){
   RegistoDeFreelancer.criarReconhecimentoParaFreelancer(ct,grau,designacao,data);

}

public void registaFreelancer(Freelancer frelancealpha)   {
    registaFreelancer(frelancealpha);
}
   
}
