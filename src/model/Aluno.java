package model;
import java.util.ArrayList;

public class Aluno extends Pessoa{
    private int registroAcademico;
    private Curso curso;
    private Turma turma;
    private ArrayList<Disciplina> disciplinas;

    public Aluno (String cpf, String nome, String email, Curso curso, Turma turma, int registroAcademico) {
        super(cpf, nome, email);

        this.registroAcademico = registroAcademico;
        this.curso = curso;
        this.turma = turma;
        this.disciplinas = new ArrayList<>();
    }

    public int getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(int registroAcademico) {
        this.registroAcademico = registroAcademico;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    public boolean matricular(Turma turma) {
        if (turma == null || turmas.contains(turma)) {
            return false;
        }
        if (!curso.equals(turma.getCurso())) {return false;
        }
        turmas.add(turma);
        return true;
    }
}
