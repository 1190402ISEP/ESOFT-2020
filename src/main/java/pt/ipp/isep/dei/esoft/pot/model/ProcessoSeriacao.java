/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.dei.esoft.pot.model;

import java.util.Date;

/**
 *
 * @author pokem
 */
public class ProcessoSeriacao {
    public Date dataRealizacao;
    
    public ProcessoSeriacao(Date dataRealizacao){
        this.dataRealizacao = dataRealizacao;
    }
    
    private Freelancer getfreelancerMaisAdequado(Anuncio anuncio){
        throw new UnsupportedOperationException("Not supported yet.");
    } 
}
