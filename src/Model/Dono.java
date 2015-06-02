
package Model;



public class Dono {
    String CPF, Nascimento, Endereco, Telefone, Nome;
    int id;

    public Dono(String CPF, String Nascimento, String Endereco, String Telefone, String Nome, int id) {
        this.CPF = CPF;
        this.Nascimento = Nascimento;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
        this.Nome = Nome;
        this.id = id;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNascimento() {
        return Nascimento;
    }

    public void setNascimento(String Nascimento) {
        this.Nascimento = Nascimento;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
        
}