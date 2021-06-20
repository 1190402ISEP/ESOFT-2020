package pt.ipp.isep.dei.esoft.pot.ui.console;

import pt.ipp.isep.dei.esoft.pot.controller.DefinirCategoriaController;
import pt.ipp.isep.dei.esoft.pot.ui.console.utils.Utils;

public class DefinirCategoriaUI {

    private DefinirCategoriaController m_controller;

    public DefinirCategoriaUI() {
        m_controller = new DefinirCategoriaController();
    }

    public void run() {
        System.out.println("\nDescrever A Categoria (de tarefa):");

        if (introduzDados()) {
            apresentaDados();

            if (Utils.confirma("Confirma os dados introduzidos? (S/N)")) {
                if (m_controller.registaDefinirCategoria()) {
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
        return m_controller.novaAreaAtividade(strCodigo, strDescricaoBreve, strDescricaoDetalhada);
    }

    private void apresentaDados() {
        System.out.println("\nCategoria de Tarefa:\n" + m_controller.getCategoriaDeTarefaString());
    }
}
