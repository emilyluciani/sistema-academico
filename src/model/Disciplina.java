package model;
import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String codigoDisciplina;
    private String nome;
    private String ementa;
    private int cargaHoraria;
    private String curso;
    private List<String> matricula;

    public Disciplina (String codigoDisciplina, String nome, String ementa, int cargaHoraria, String curso, List<String> matricula){
        this.codigoDisciplina = codigoDisciplina;
        this.nome = nome;
        this.ementa = ementa;
        this.cargaHoraria = cargaHoraria;
        this.curso = curso;
        this.matricula = new ArrayList<>(matricula);
    }

    public String getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public String getNome() {
        return nome;
    }

    public String getEmenta() {
        return ementa;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String getCurso() {
        return curso;
    }

    public List<String> getMatricula() {
        return matricula;
    }

    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }

    public void setCurso (String curso){
        this.curso = curso;
    }

    public void setMatricula (List<String> matricula){
        this.matricula = new ArrayList<>(matricula);
    }
}

