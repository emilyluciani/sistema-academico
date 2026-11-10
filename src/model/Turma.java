package model;

public class Turma {
    private String codigo;
    private int semestre;
    private String curso;

    public Turma (String codigo, int semestre, String curso){
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

    public void setCurso(String curso){
        this.curso = curso;
    }
}

