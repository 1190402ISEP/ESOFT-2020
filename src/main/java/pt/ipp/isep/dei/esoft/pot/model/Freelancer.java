/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.dei.esoft.pot.model;

/**
 *
 * @author anton
 */
public class Freelancer {

    private String nome;
    private String nif;
    private String enderecoPostal;
    private String contacto;
    private String email;

    private Freelancer(String nome, String NIF, String enderecoPostal, String contacto, String email) {
        this.nome = nome;
        this.nif = nif;
        this.enderecoPostal = enderecoPostal;
        this.contacto = contacto;
        this.email = email;
    }

    void addListaHabilitacaoAcademica(HabilitacaoAcademica ha) {
        listaHabilitacoes.add(ha);
    }

    void addListaReconhecimento(ReconhecimentoCompetencias rCT) {
        listaReconhecimento.add(rCT);
    }

}
