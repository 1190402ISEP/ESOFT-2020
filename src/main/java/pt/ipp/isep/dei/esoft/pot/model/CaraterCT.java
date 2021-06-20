/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.dei.esoft.pot.model;


public class CaraterCT {
    private boolean obrigatoria;
    private Categoria ct;

    public void CaraterCT(Categoria ct, boolean ob) {
        this.obrigatoria = ob;
        this.ct = ct;
    }

    public void addGrauProficiencia(Categoria ct, int grau, String grauDes) {
    }
    
    public void validaGrauProficiencia(GrauProficiencia gp) {
    }
    
    public void addGrauProficiencia(GrauProficiencia gp) {
    }
}
