/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.dei.esoft.pot.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anton
 */
public class RegistoDeFreelancer {

    private static Freelancer freelanceralpha = new Freelancer(nome, NIF, codPostal, contacto, email);
    private static List<Freelancer> registoFreelancers = new ArrayList<Freelancer>();

    public static void novoFreelancer(String nome, String NIF, String codPostal, String contacto, String email) {
        Freelancer freelanceralpha = new Freelancer(nome, NIF, codPostal, contacto, email);
    }

    public static void criarHabilitacaoAcademica(String grau, String designacao, String instituicao, double media) {
        HabilitacaoAcademica ha = new HabilitacaoAcademica(grau, designacao, instituicao, media);
        freelanceralpha.addListaHabilitacaoAcademica(ha);
    }

    public static void criarReconhecimentoParaFreelancer(CompTecnica ct, int grau, String designacao, String data) {
        ReconhecimentoCompetencias rCT = new ReconhecimentoCompetencias(ct, grau, designacao, data);
        freelanceralpha.addListaReconhecimento(rCT);
    }

    public void registarFreelancerComoUtilizador(Freelancer freelanceralpha) {
        registoFreelancers.add(freelanceralpha);
    }

    public Freelancer getFreelancerById(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
