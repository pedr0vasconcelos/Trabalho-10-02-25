// Classe Student
package Parte1;

public class Student {
    public String nome;
    public double nota1, nota2, nota3;

    public double notaFinal() {
        return nota1 + nota2 + nota3;
    }

    public boolean aprovado() {
        return notaFinal() >= 60.0;
    }

    public double pontosFaltando() {
        return aprovado() ? 0.0 : 60.0 - notaFinal();
    }
}