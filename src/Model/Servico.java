package Model;


public class Servico {
    String Nome, Descricao;
    int id ; 

    public Servico(String Nome, String Descricao, int id) {
        this.Nome = Nome;
        this.Descricao = Descricao;
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}