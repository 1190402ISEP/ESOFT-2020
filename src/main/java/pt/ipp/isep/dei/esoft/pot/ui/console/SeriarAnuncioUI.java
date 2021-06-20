/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.dei.esoft.pot.ui.console;

import pt.ipp.isep.dei.esoft.pot.ui.console.utils.Utils;

public class SeriarAnuncioUI {
    private SeriarAnuncioController m_controller;

    public SeriarAnuncioUI() {
        m_controller = new SeriarAnuncioController();
    }

    public void run() {
        System.out.println("\nSeriarAnuncio:");

        if (introduzDados()) {
            apresentaDados();

            if (Utils.confirma("Confirma os dados introduzidos? (S/N)")) {
                if (m_controller.registaSeriacao()) {
                    System.out.println("Registo efetuado com sucesso.");
                } else {
                    System.out.println("Não foi possivel concluir o registo com sucesso.");
                }
            }
        } else {
            System.out.println("Ocorreu um erro. Operação cancelada.");
        }
    }

    private boolean introduzDados() {
        String descricao = Utils.readLineFromConsole("Descrição: ");
    }

    private void apresentaDados() {
        System.out.println("\nSeriarAnuncio:\n" + m_controller.getSeriarAnuncioString());
    }
}
