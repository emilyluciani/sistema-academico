package model;

public class Turma {
    private String codigo;
    private int semestre;
    private Curso curso;

    public Turma (String codigo, int semestre, Curso curso){
        this.codigo = codigo;
        this.semestre = semestre;
        this.curso = curso;
    }

    public String getCodigo(){
        return codigo;
    }

    public int getSemestre() {
        return semestre;
    }

    public String getCurso() {
        return curso;
    }

    public void setSemestre(int semestre){
        this.semestre = semestre;
    }

    public void setCurso(Curso curso){
        this.curso = curso;
    }

}

