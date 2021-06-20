/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.dei.esoft.pot.model;

/**
 *
 * @author gbarros
 */
public class Seriacao {
    private String data;
    private String hora;
    private String nota;
    private String tipoRegimento;


    public void Anuncio(String data, String hora, String nota, String tipoRegimento) {
        this.data = data;
        this.hora = hora;
        this.nota = nota;
        this.tipoRegimento = tipoRegimento;
    }
}
