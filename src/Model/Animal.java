
package Model;


public class Animal {
    String Raca, Cor, Tamanho, Nascimento, Nome, Obs;
    int idAnimal;

    public Animal(String Raca, String Cor, String Tamanho, String Nascimento, String Nome, String Obs, int idAnimal) {
        this.Raca = Raca;
        this.Cor = Cor;
        this.Tamanho = Tamanho;
        this.Nascimento = Nascimento;
        this.Nome = Nome;
        this.Obs = Obs;
        this.idAnimal = idAnimal;
    }

   

    public String getRaca() {
        return Raca;
    }

    public void setRaca(String Raca) {
        this.Raca = Raca;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public String getTamanho() {
        return Tamanho;
    }

    public void setTamanho(String Tamanho) {
        this.Tamanho = Tamanho;
    }

    public String getNascimento() {
        return Nascimento;
    }

    public void setNascimento(String Nascimento) {
        this.Nascimento = Nascimento;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getObs() {
        return Obs;
    }

    public void setObs(String Obs) {
        this.Obs = Obs;
    }

    public int getidAnimal() {
        return idAnimal;
    }

    public void setidAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }
    
    
}
