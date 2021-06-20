/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.dei.esoft.pot.model;

import java.util.Date;

/**
 *
 * @author anton
 */
public class Candidatura {

    private Freelancer freelancer;
    private Date dataCand;
    private double valorPrt;
    private int nrDias;
    private String txtApresentacao;
    private String txtMotivacao;

    public Candidatura(Freelancer freel, Date dataCand, double valorPrt, int nrDias, String txtApresentacao, String txtMotivacao) {
        this.freelancer = freel;
        this.dataCand = dataCand;
        this.valorPrt = valorPrt;
        this.nrDias = nrDias;
        this.txtApresentacao = txtApresentacao;
        this.txtMotivacao = this.txtMotivacao;
    }

    /**
     * @return the valorPrt
     */
    public double getValorPrt() {
        return valorPrt;
    }

    /**
     * @return the nrDias
     */
    public int getNrDias() {
        return nrDias;
    }

    /**
     * @return the txtApresentacao
     */
    public String getTxtApresentacao() {
        return txtApresentacao;
    }

    /**
     * @return the txtMotivacao
     */
    public String getTxtMotivacao() {
        return txtMotivacao;
    }

    /**
     * @param valorPrt the valorPrt to set
     */
    public void setValorPrt(double valorPrt) {
        this.valorPrt = valorPrt;
    }

    /**
     * @param nrDias the nrDias to set
     */
    public void setNrDias(int nrDias) {
        this.nrDias = nrDias;
    }

    /**
     * @param txtApresentacao the txtApresentacao to set
     */
    public void setTxtApresentacao(String txtApresentacao) {
        this.txtApresentacao = txtApresentacao;
    }

    /**
     * @param txtMotivacao the txtMotivacao to set
     */
    public void setTxtMotivacao(String txtMotivacao) {
        this.txtMotivacao = txtMotivacao;
    }

    public void atualizarCandidatura(double valorPrt, int nrDias, String txtApres, String txtMotiv) {
        if (valorPrt > 0) {
            this.setValorPrt(valorPrt);
        }
        if (nrDias > 0) {
            this.setNrDias(nrDias);
        }
        if (txtApres != null && !txtApres.trim().isEmpty()) {
            this.txtApresentacao = txtApres;
        }
        if (txtMotiv != null && !txtMotiv.trim().isEmpty()) {
            this.txtMotivacao = txtMotiv;
        }
    }

    public Date getDataCandidatura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double getValorRemunetorio(Freelancer freel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Date getPeriodo(Freelancer freel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
