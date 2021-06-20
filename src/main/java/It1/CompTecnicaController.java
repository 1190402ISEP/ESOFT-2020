/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package It1;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pt.ipp.isep.dei.esoft.pot.model.AreaAtividade;
import pt.ipp.isep.dei.esoft.pot.model.Constantes;
import pt.ipp.isep.dei.esoft.pot.model.Plataforma;
import pt.ipp.isep.dei.esoft.pot.model.CompetenciaTecnica;
import pt.ipp.isep.dei.esoft.pot.ui.console.utils.Utils;

/**
 *
 * @author pokem
 */
public class CompTecnicaController {
    private Plataforma m_oPlataforma;
    private CompetenciaTecnica m_oCompetencia;
        
    public CompTecnicaController(){
        if(!AplicacaoPOT.getInstance().getSessaoAtual().isLoggedInComPapel(Constantes.PAPEL_ADMINISTRATIVO))
            throw new IllegalStateException("Utilizador não Autorizado");
        this.m_oPlataforma = AplicacaoPOT.getInstance().getPlataforma();
    }
    
    public List<AreaAtividade> getAreasAtividade(){
        return this.m_oPlataforma.getAreasAtividade();
    }
    
    public boolean novaCompTecnica(String cod, String dsBreve, String dsDet, String at){
        try
        {
            AreaAtividade area = this.m_oPlataforma.getAreaAtividadeById(areaAtividadeId);
            this.m_oCompetencia = this.m_oPlataforma.novaCompetenciaTecnica(strId, strDescricaoBreve,strDescricaoDetalhada,area);
            return this.m_oPlataforma.validaCompetenciaTecnica(this.m_oCompetencia);
        }
        catch(RuntimeException ex)
        {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
            this.m_oCompetencia = null;
            return false;
        }
    }
   
    
    public boolean registaCompTecnica(){
        return this.m_oPlataforma.registaCompetenciaTecnica(this.m_oCompetencia);
    }
    
    public String getCompTecnicaString(){
        return this.m_oCompetencia.toString();
    }
}