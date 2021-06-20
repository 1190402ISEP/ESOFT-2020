
import java.util.List;


public class DefinirCategoriaController {

    public void novaCategoria(desc) {
        la = RegistaCategoria.novaCategoria(desc);
    }

    public List<CompetenciaTecnica> setAT(atCod) {
        lct = RegistaCategoria.setAT(atCod);
    }

    public void addGrauCaraterCT(CategoriaDeTarefa ctCod, boolean ob, int grau, String grauDesc) {
        RegistaCategoria.getCategoriaDeTarefabyID(ctCod);
        RegistaCategoria.criarCTparaaCategoria(compt, tipoescolhido);
        RegistaCategoria.validarCategoriaDeTarefa(TpCT);
    }

    public void registaCategoria() {
        RegistaCategoria.registaCategoriaTarefa();
    }

}
