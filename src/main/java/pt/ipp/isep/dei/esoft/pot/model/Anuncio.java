/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.dei.esoft.pot.model;

import java.util.ArrayList;
import java.util.Date;
import pt.ipp.isep.dei.esoft.pot.controller.ListaCandidaturas;

/**
 *
 * @author pokem
 */
public class Anuncio {

    private String perPublicacao;
    private String perApresentacao;
    private String perSeriacao;
    private String tipoRegimento;
    private String regAp;
    private ListaCandidaturas listaDeCandidaturaDoAnuncio;

    public void Anuncio(String perPublicacao, String perApresentacao, String perSeriacao, String tipoRegimento, String regAp) {
        this.setPerPublicacao(perPublicacao);
        this.setPerApresentacao(perApresentacao);
        this.setPerSeriacao(perSeriacao);
        this.setTipoRegimento(tipoRegimento);
        this.setRegAp(regAp);
        setListaDeCandidaturaDoAnuncio(new ArrayList<>());
    }

    public boolean aceitaCandidatura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    public boolean éFreelancerElegivel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    public Candidatura getCandidaturaAoAnuncio(Freelancer freel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void atualizarCandidatura(Freelancer freel, Date dataCand, double valorPrt, int nrDias, String txtApres, String txtMotiv) {
        if (aceitaCandidatura() && éFreelancerElegivel()) {
            ListaCandidaturas.novaCandidatura(freel, dataCand, valorPrt, nrDias, txtApres, txtMotiv);

        }

    }
    
    private void atribuir(AtribuirAnuncio atrAnuncio){
        
    }

    /**
     * @return the perPublicacao
     */
    public String getPerPublicacao() {
        return perPublicacao;
    }

    /**
     * @return the perApresentacao
     */
    public String getPerApresentacao() {
        return perApresentacao;
    }

    /**
     * @return the perSeriacao
     */
    public String getPerSeriacao() {
        return perSeriacao;
    }

    /**
     * @return the tipoRegimento
     */
    public String getTipoRegimento() {
        return tipoRegimento;
    }

    /**
     * @return the regAp
     */
    public String getRegAp() {
        return regAp;
    }

    /**
     * @return the listaDeCandidaturaDoAnuncio
     */
    public ListaCandidaturas getListaDeCandidaturaDoAnuncio() {
        return listaDeCandidaturaDoAnuncio;
    }

    /**
     * @param perPublicacao the perPublicacao to set
     */
    public void setPerPublicacao(String perPublicacao) {
        this.perPublicacao = perPublicacao;
    }

    /**
     * @param perApresentacao the perApresentacao to set
     */
    public void setPerApresentacao(String perApresentacao) {
        this.perApresentacao = perApresentacao;
    }

    /**
     * @param perSeriacao the perSeriacao to set
     */
    public void setPerSeriacao(String perSeriacao) {
        this.perSeriacao = perSeriacao;
    }

    /**
     * @param tipoRegimento the tipoRegimento to set
     */
    public void setTipoRegimento(String tipoRegimento) {
        this.tipoRegimento = tipoRegimento;
    }

    /**
     * @param regAp the regAp to set
     */
    public void setRegAp(String regAp) {
        this.regAp = regAp;
    }

    /**
     * @param listaDeCandidaturaDoAnuncio the listaDeCandidaturaDoAnuncio to set
     */
    public void setListaDeCandidaturaDoAnuncio(ListaCandidaturas listaDeCandidaturaDoAnuncio) {
        this.listaDeCandidaturaDoAnuncio = listaDeCandidaturaDoAnuncio;
    }
}
