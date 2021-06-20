/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.dei.esoft.pot.model;;

import java.util.Objects;
/**
 *
 * @author pokem
 */
public class CompTecnica {
    private String m_cod;
    private String m_dsBreve;
    private String m_dsDet;
    private AreaAtividade m_atc;
    
    public CompTecnica(String cod, String dsBreve, String dsDet, AreaAtividade atc){
        if ( (cod == null) || (dsBreve == null) || (dsDet == null) ||
                (atc == null) || (cod.isEmpty())|| (dsBreve.isEmpty()) || (dsDet.isEmpty()))
            throw new IllegalArgumentException("Nenhum dos argumentos pode ser nulo ou vazio.");
        
        this.m_cod = cod;
        this.m_dsBreve = dsBreve;
        this.m_dsDet = dsDet;
        m_atc = atc;
    }
    
    
    public boolean hasId(String strId){
        return this.m_cod.equalsIgnoreCase(strId);
    }

    @Override
    public int hashCode(){
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.m_cod);
        return hash;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null)
            return false;

        if (getClass() != o.getClass())
            return false;

        CompTecnica obj = (CompTecnica) o;
        return (Objects.equals(m_cod, obj.m_cod));
    }
    
    @Override
    public String toString(){
        return String.format("%s - %s - %s  - Área Atividade: %s", this.m_cod, this.m_dsBreve, this.m_dsDet, this.m_atc);
    }
}
