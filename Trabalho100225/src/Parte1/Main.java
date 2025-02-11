package Parte1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Problema "retangulo"
        Retangulo ret = new Retangulo();
        System.out.println("Entre com a largura e altura do retângulo:");
        ret.largura = sc.nextDouble();
        ret.altura = sc.nextDouble();
        System.out.printf("AREA = %.2f\n", ret.area());
        System.out.printf("PERIMETRO = %.2f\n", ret.perimetro());
        System.out.printf("DIAGONAL = %.2f\n", ret.diagonal());

        // Problema "funcionarios"
        Funcionario func = new Funcionario();
        System.out.println("Nome:");
        sc.nextLine(); // Limpa buffer
        func.nome = sc.nextLine();
        System.out.println("Salário bruto:");
        func.salarioBruto = sc.nextDouble();
        System.out.println("Imposto:");
        func.imposto = sc.nextDouble();
        System.out.printf("Funcionário: %s, $ %.2f\n", func.nome, func.salarioLiquido());
        System.out.println("Qual a porcentagem para aumentar o salário?");
        double percentual = sc.nextDouble();
        func.aumentarSalario(percentual);
        System.out.printf("Dados atualizados: %s, $ %.2f\n", func.nome, func.salarioLiquido());

        // Problema "alunos"
        Student aluno = new Student();
        System.out.println("Nome do aluno:");
        sc.nextLine(); // Limpa buffer
        aluno.nome = sc.nextLine();
        System.out.println("Notas:");
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();
        System.out.printf("NOTA FINAL = %.2f\n", aluno.notaFinal());
        if (aluno.aprovado()) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("FALTARAM %.2f PONTOS\n", aluno.pontosFaltando());
        }

        sc.close();
    }
}