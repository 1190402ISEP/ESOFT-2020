package pt.ipp.isep.dei.esoft.pot.model;

public class Categoria {

    private String id;
    private String descricao;

    public void CategoriaDeTarefa(String catId, String descricao) {
        this.id = catId;
        this.descricao = descricao;
    }

    public void setAT(AreaAtividade at) {
    }

    public void addCaraterCT(CompetenciaTecnica ct, boolean ob) {
    }
    
    public void validaCaraterCT(CaraterCT ctt) {
    }
    
    public void addCaraterCT(CaraterCT ctt) {
    }
    
    public void valida() {
    }
}
