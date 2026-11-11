package model;
import java.util.ArrayList;

public class Professor extends Pessoa{
    private String codigoRH;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Turma> turmas;

    public Professor (String cpf, String nome, String email, String codigoRH,  ArrayList<Disciplina> disciplinas,
                      ArrayList<Turma> turmas) {
        super(cpf, nome, email);
        this.codigoRH = codigoRH;
        this.disciplinas = disciplinas;
        this.turmas = turmas;
    }

    public String getCodigoRH() {
        return codigoRH;
    }

    public void setCodigoRH(String codigoRH) {
        this.codigoRH = codigoRH;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }
}
