
package Model;


public class Agenda {
    int Horario, id ; 

    public Agenda(int Horario, int id) {
        this.Horario = Horario;
        this.id = id;
        
    }

    

    public int getHorario() {
        return Horario;
    }

    public void setHorario(int Horario) {
        this.Horario = Horario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}