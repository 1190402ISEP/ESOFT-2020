/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.dei.esoft.pot.model;

import java.util.ArrayList;
import java.util.List;

public class RegistoCategoria {
    
    public Categoria novaCategoriaTarefa(descricao) {
        cat = novaCategoria(desc);
    }
    
    public void geraCategoriaid(){
        catid = geraCategoriaid();
    }    
    
    public List<AreaDeAtividades> getListaAT() {

        la = new ArrayList<>();

        return la;
    }
    
    public AreaDeAtividade getAT(String atCod) {
        at = getAT(atCod);
        return at;
    }
    
    public List<CompetenciaTecnica> getListaCT(at) {
        lct = getListaCT(at);
        return lct;
    }

    public CategoriaDeTarefa getCT(ctCod) {
        ct = getCT(ctCod);
        return ct;
    }

    public boolean registaCategoria(CategoriaDeTarefa cat) {
        if (this.validaCategoriaTarefa(cat)) {
            return addCategoriaTarefa(cat);
        }
        return false;
    }
    
    public boolean validaCategoria(cat) {
    }
    
    private boolean addCategoria(CompTecnica cat) {
        return m_CategoriaTarefa.add(cat);
    }
}
