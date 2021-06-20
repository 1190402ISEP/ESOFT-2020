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
public class AtribuirAnuncio {
    public String descTarefa;
    public Date dtInicioPeriodo;
    public Date dtFimPeriodo;
    public Double valorRemuneratorio;
    public String codigo;
    public Date dtatribuicao;
    
    private AtribuirAnuncio(Anuncio anuncio, Freelancer freelancer, Date dataInicioTar, Date dataFimTar, double valorRem){
        this.descTarefa = anuncio.getRegAp();
        this.dtInicioPeriodo = dataInicioTar;
        this.dtFimPeriodo = dataFimTar;
        this.valorRemuneratorio = valorRem;
    }
}
