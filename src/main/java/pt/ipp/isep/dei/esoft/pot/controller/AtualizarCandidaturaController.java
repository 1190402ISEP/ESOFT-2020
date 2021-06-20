/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.dei.esoft.pot.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import pt.ipp.isep.dei.esoft.pot.model.Anuncio;
import pt.ipp.isep.dei.esoft.pot.model.Candidatura;
import pt.ipp.isep.dei.esoft.pot.model.Freelancer;
import pt.ipp.isep.dei.esoft.pot.model.Plataforma;
import pt.ipp.isep.dei.esoft.pot.model.RegistoAnuncio;
import pt.ipp.isep.dei.esoft.pot.model.RegistoDeFreelancer;

/**
 *
 * @author António Fernandes 1190402
 */
public class AtualizarCandidaturaController {

    private List<Anuncio> listaAnu;
    private Candidatura cand;
    private Anuncio anuncio;
    private RegistoAnuncio ranu;
    private Freelancer freel;
    private Date dataCand;
    private Candidatura candNova;

    public AtualizarCandidaturaController() {
        this.listaAnu = new ArrayList<>();
    }

    /**
     *
     * @return
     */
    public List<Anuncio> getListaDeAnunciosFreelancerElegivel(String email) {
        RegistoDeFreelancer rfree = Plataforma.getRegistoFreelancers();
        this.freel = rfree.getFreelancerById(email);
        RegistoAnuncio ranu = Plataforma.getRegistoAnuncios();
        listaAnu = RegistoAnuncio.getAnunciosElegiveisDoFreelancer(freel);
        return listaAnu;

    }
    public void corrigirLista(){
        throw new UnsupportedOperationException();
    }

    public void getAnunciobyID(String id) {
        anuncio = ranu.getAnuncioById(id);
        cand = anuncio.getCandidaturaAoAnuncio(freel);
        dataCand = cand.getDataCandidatura();
    }

    public void atualizarCandidatura(double valorPrt, int nrDias, String txtApres, String txtMotiv) {
        anuncio.atualizarCandidatura(freel, dataCand, valorPrt, nrDias, txtApres, txtMotiv);
    }

    public void registarCandidatura(double valorPrt, int nrDias, String txtApres, String txtMotiv) {
        candNova = new Candidatura(freel, dataCand, (int) valorPrt, nrDias, txtApres, txtMotiv);
        anuncio.registaCandidatura(candNova);
    }

}
