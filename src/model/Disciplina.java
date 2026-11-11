package model;
import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String codigoDisciplina;
    private String nome;
    private String ementa;
    private int cargaHoraria;
    private Curso curso;
    private List<Matricula> matriculas;

    public Disciplina (String codigoDisciplina, String nome, String ementa, int cargaHoraria, Curso curso, List<Matricula> matriculas){
        this.codigoDisciplina = codigoDisciplina;
        this.nome = nome;
        this.ementa = ementa;
        this.cargaHoraria = cargaHoraria;
        this.curso = curso;
        this.matriculas = new ArrayList<>(matriculas);
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

    public Curso getCurso() {
        return curso;
    }

    public List<Matricula> getMatriculas() {
        return new ArrayList<>(matriculas);
    }

    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }

    public void setCurso (Curso curso){
        this.curso = curso;
    }

    public void setMatriculas (List<Matricula> matriculas){
        this.matriculas = new ArrayList<>(matriculas);
    }

    public int consultarCargaHoraria(){
        return cargaHoraria;
    }

    public String consultarEmenta(){
        return ementa;
    }

}

