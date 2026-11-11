package model;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String codigo;
    private String nome;
    private Coordenador coordenador;
    private List<Disciplina> disciplinas;
    private List<Turma> turmas;

    public Curso(String codigo, String nome, Coordenador coordenador, List<Disciplina> disciplinas, List<Turmas> turmas) {
        this.codigo = codigo;
        this.nome = nome;
        this.coordenador = coordenador;
        this.disciplina = new ArrayList<>(disciplina);
        this.turma = new ArrayList<>(turma);
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCoordenador() {
        return coordenador;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplina;
    }

    public List<Turma> getTurmas() {
        return turma;
    }

    public void setDisciplina(List<Disciplina> disciplinas) {
        this.disciplina = new ArrayList<>(disciplinas);
    }

    public void setTurma(List<Turma> turmas) {
        this.turma = new ArrayList<>(turma);
    }

    public void adicionarDisciplina(Disciplina disciplina) {

    }

    public void removerDisciplina(Disciplina disciplina) {

    }

    public void adicionarTurma(Turma turma) {

    }

    public List<Disciplina> consultarDisciplina() {

    }

    public void definirCoordenador(Coordenador coordenador) {

    }
}


