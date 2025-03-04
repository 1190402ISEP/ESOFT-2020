/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.dei.esoft.pot.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import pt.ipp.isep.dei.esoft.autorizacao.AutorizacaoFacade;

/**
 *
 * @author pokem
 */
public class Plataforma {

    public static void getListaRegistoFreelancer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void getCT(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void getGrauDeProficienciaByID(int idgrau) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void getListaGrausDeProficiencia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void getListaCT() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String m_strDesignacao;
    private final AutorizacaoFacade m_oAutorizacao;
    private final Set<Organizacao> m_lstOrganizacoes;
    private final Set<AreaAtividade> m_lstAreasAtividade;
    private final Set<CompetenciaTecnica> m_lstCompetencias;
    private String designacao;
    private static int regcod = 0;

    public Plataforma(String strDesignacao) {
        if ((strDesignacao == null)
                || (strDesignacao.isEmpty())) {
            throw new IllegalArgumentException("Nenhum dos argumentos pode ser nulo ou vazio.");
        }

        this.m_strDesignacao = strDesignacao;

        this.m_oAutorizacao = new AutorizacaoFacade();

        this.m_lstOrganizacoes = new HashSet<>();
        this.m_lstAreasAtividade = new HashSet<>();
        this.m_lstCompetencias = new HashSet<>();
    }

    public AutorizacaoFacade getAutorizacaoFacade() {
        return this.m_oAutorizacao;
    }

    // Organizações
    // <editor-fold defaultstate="collapsed">
    public Organizacao novaOrganizacao(String strNome, String strNIF, String strWebsite, String strTelefone, String strEmail, EnderecoPostal oMorada, Colaborador oGestor) {
        return new Organizacao(strNome, strNIF, strWebsite, strTelefone, strEmail, oMorada, oGestor);
    }

    public boolean registaOrganizacao(Organizacao oOrganizacao, String strPwd) {
        if (this.validaOrganizacao(oOrganizacao, strPwd)) {
            Colaborador oGestor = oOrganizacao.getGestor();
            String strNomeGestor = oGestor.getNome();
            String strEmailGestor = oGestor.getEmail();
            if (this.m_oAutorizacao.registaUtilizadorComPapeis(strNomeGestor, strEmailGestor, strPwd,
                    new String[]{Constantes.PAPEL_GESTOR_ORGANIZACAO, Constantes.PAPEL_COLABORADOR_ORGANIZACAO})) {
                return addOrganizacao(oOrganizacao);
            }
        }
        return false;
    }

    private boolean addOrganizacao(Organizacao oOrganizacao) {
        return m_lstOrganizacoes.add(oOrganizacao);
    }

    public boolean validaOrganizacao(Organizacao oOrganizacao, String strPwd) {
        boolean bRet = true;

        // Escrever aqui o código de validação
        if (this.m_oAutorizacao.existeUtilizador(oOrganizacao.getGestor().getEmail())) {
            bRet = false;
        }
        if (strPwd == null) {
            bRet = false;
        }
        if (strPwd.isEmpty()) {
            bRet = false;
        }
        //

        return bRet;
    }

    // </editor-fold>
    // Competências Tecnicas
    // <editor-fold defaultstate="collapsed">
    public CompetenciaTecnica getCompetenciaTecnicaById(String strId) {
        for (CompetenciaTecnica oCompTecnica : this.m_lstCompetencias) {
            if (oCompTecnica.hasId(strId)) {
                return oCompTecnica;
            }
        }

        return null;
    }

    public CompetenciaTecnica novaCompetenciaTecnica(String strId, String strDescricaoBreve, String strDescricaoCompleta, AreaAtividade oArea) {
        return new CompetenciaTecnica(strId, strDescricaoBreve, strDescricaoCompleta, oArea);
    }

    public boolean registaCompetenciaTecnica(CompetenciaTecnica oCompTecnica) {
        if (this.validaCompetenciaTecnica(oCompTecnica)) {
            return addCompetenciaTecnica(oCompTecnica);
        }
        return false;
    }

    private boolean addCompetenciaTecnica(CompetenciaTecnica oCompTecnica) {
        return m_lstCompetencias.add(oCompTecnica);
    }

    public boolean validaCompetenciaTecnica(CompetenciaTecnica oCompTecnica) {
        boolean bRet = true;

        // Escrever aqui o código de validação
        //
        return bRet;
    }
    // </editor-fold>

    // Areas de Atividade 
    // <editor-fold defaultstate="collapsed">
    public AreaAtividade getAreaAtividadeById(String strId) {
        for (AreaAtividade atc : this.m_lstAreasAtividade) {
            if (atc.hasId(strId)) {
                return atc;
            }
        }

        return null;
    }

    public AreaAtividade novaAreaAtividade(String strCodigo, String strDescricaoBreve, String strDescricaoDetalhada) {
        return new AreaAtividade(strCodigo, strDescricaoBreve, strDescricaoDetalhada);
    }

    public boolean registaAreaAtividade(AreaAtividade oArea) {
        if (this.validaAreaAtividade(oArea)) {
            return addAreaAtividade(oArea);
        }
        return false;
    }

    private boolean addAreaAtividade(AreaAtividade oArea) {
        return m_lstAreasAtividade.add(oArea);
    }

    public boolean validaAreaAtividade(AreaAtividade oArea) {
        boolean bRet = true;

        // Escrever aqui o código de validação
        //
        return bRet;
    }

    public List<AreaAtividade> getAreasAtividade() {
        List<AreaAtividade> lc = new ArrayList<>();
        lc.addAll(this.m_lstAreasAtividade);
        return lc;
    }

    public CompTecnica novaCompTecnica(String cod, String dsBreve, String dsDet, AreaAtividade atc) {
        return new CompTecnica(cod, dsBreve, dsDet, atc);
    }

    public boolean validaCompTecnica(CompTecnica comp) {
        boolean bRet = true;

        return bRet;
    }

    public boolean registaCompTecnica(CompTecnica comp) {
        if (this.validaCompTecnica(comp)) {
            return addCompTecnica(comp);
        }
        return false;
    }

    private boolean addCompTecnica(CompTecnica comp) {
        return m_lstCompetencias.add(comp);
    }

//-------------------------------------------------------
    public void getRegistoCategoria() {
        RegistoCategoria rcat = getRegistoCategoria();
    }
    
    public void getRegistoAnuncio(){
    }

    public int criarIdInterno() {
        regcod++;
        return regcod;
    }

    public List<GrausDeProficiencia> getListaGrausDeProficiencia() {
        return new ArrayList<GrausDeProficiencia>();
    }

    public void getGrauDeProficienciaByID(int idgrau) {
        Plataforma.getGrauDeProficienciaByID(idgrau);
    }

    public String getAlgoritmoGeradorPwd() {
        return AlgoritmoGeradorPwd.getClass().getName();
    }

    public AutorizacaoFacade getAutorizacaoFacade() {

    }

    public List<Anuncio> getAnunciosElegiveisDoFreelancer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static RegistoDeFreelancer getRegistoFreelancers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Freelancer getFreelancerByEmail(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static  RegistoAnuncio getRegistoAnuncios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void getRegistoOrganizacao(){
        
    }
    
    private void getListaAnuncio(){
        
    }
}
