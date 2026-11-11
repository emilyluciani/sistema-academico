package model;
import java.util.ArrayList;

public class Coordenador extends Professor {
    private Curso cursoCordenado;

    public Coordenador(String cpf, String nome, String email, String codigoRH, Curso cursoCordenado) {
        super(cpf, nome, email, new ArrayList<>(), new ArrayList<>());
        this.cursoCordenado = cursoCordenado;
    }

    public Curso getCursoCordenado() {
        return cursoCordenado;
    }

    public void setCursoCordenado(Curso cursoCordenado) {
        this.cursoCordenado = cursoCordenado;
    }
}
