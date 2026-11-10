package model;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String codigo;
    private String nome;
    private String coordenador;
    private List<String> disciplina;
    private List<String> turma;

   public Curso(String codigo, String nome, String coordenador, List<String> disciplina, List<String> turma){
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

    public List<String> getDisciplina() {
        return disciplina;
    }

    public List<String> getTurma() {
        return turma;
    }

    public void setDisciplina(List<String> disciplina) {
       this.disciplina = new ArrayList<>(disciplina);
    }

    public void setTurma(List<String> turma){
       this.turma = new ArrayList<>(turma);
    }
}
