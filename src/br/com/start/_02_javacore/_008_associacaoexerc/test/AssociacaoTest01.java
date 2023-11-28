package br.com.start._02_javacore._008_associacaoexerc.test;

import br.com.start._02_javacore._008_associacaoexerc.model.Aluno;
import br.com.start._02_javacore._008_associacaoexerc.model.Local;
import br.com.start._02_javacore._008_associacaoexerc.model.Professor;
import br.com.start._02_javacore._008_associacaoexerc.model.Seminario;

public class AssociacaoTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras");
        Aluno aluno1 = new Aluno("Luffy", 17);
        Aluno aluno2 = new Aluno("Jerry", 15);
        Aluno aluno3 = new Aluno("Robert", 16);
        Aluno[] alunos = {aluno1, aluno2, aluno3};

        Seminario seminario1 = new Seminario("Onde achar One Piece", alunos, local);
        Seminario[] seminarios = {seminario1};

        Professor professor = new Professor("Barba Branca", "História", seminarios);

        professor.imprime();
    }
}
