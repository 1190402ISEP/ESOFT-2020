/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.dei.esoft.pot.ui.console;

import pt.ipp.isep.dei.esoft.pot.controller.RegistarFreelancerController;
import pt.ipp.isep.dei.esoft.pot.ui.console.utils.Utils;

public class RegistarFreelancerUI
{
 
public void registarFreelancer(String nome, String NIF, String codPostal, String contacto,String  email){
RegistarFreelancerController.novoFreelancer(nome, NIF, codPostal, contacto, email);
}    
  public void criarHabilitacaoAcademica(String grau,String designacaoCurso, String instituicao,Double media){
RegistarFreelancerController.criarHabilitacaoAcademica(grau,designacaoCurso, instituicao,media);
}   
  public void criarReconhecimentoDeCompetencia(CompetenciaTecnica ct,int grau,String designacao,String data){
RegistarFreelancerController.criarReconhecimentoParaFreelancer(ct,grau,designacao,data);
}    
   
  public void registaFreelancer(Freelancer frelancealpha ){
RegistarFreelancerController.registaFreelancer(frelancealpha);
}    




}
