/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.dei.esoft.pot.model;

/**
 *
 * @author pokem
 */
public class GrauProficiencia {
    private int grau;
    private String grauDesc;
    private Categoria ct;

    public void GrauProficiencia(Categoria ct, int grau, String grauDesc) {
        this.grau = grau;
        this.grauDesc = grauDesc;
        this.ct = ct;
    }
}
