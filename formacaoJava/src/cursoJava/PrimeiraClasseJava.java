package cursoJava;

import javax.swing.JOptionPane;

import cursoJava.classes.Aluno;
import cursoJava.classes.Disciplina;

public class PrimeiraClasseJava {
    public static void main(String[] args) {

        /*
         * - new Aluno() é uma INSTÂNCIA (Criação de OBJETO)
         * - aluno1 é uma referência para o OBJETO aluno
         */

        String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
        String idade = JOptionPane.showInputDialog("Digite a sua idade:");
        String dataNascimento = JOptionPane.showInputDialog("Digite sua data de nascimento: ");
        String registroGeral = JOptionPane.showInputDialog("Digite o número de sua identidade: ");
        String cpf = JOptionPane.showInputDialog("Digite o número do seu CPF: ");
        String nomeMae = JOptionPane.showInputDialog("Digite o nome de sua mãe: ");
        String nomePai = JOptionPane.showInputDialog("Digite o nome de seu pai: ");
        String dataMatricula = JOptionPane.showInputDialog("Digite a data de sua matrícula: ");
        String serieMatriculado = JOptionPane.showInputDialog("Digite a série em que o aluno(a) está matriculado: ");
        String nomeEscola = JOptionPane.showInputDialog("Digite o nome da escola: ");

        Aluno aluno1 = new Aluno(); // Aqui será o João

        aluno1.setNome(nome);
        aluno1.setIdade(Integer.valueOf(idade));
        aluno1.setDataNascimento(dataNascimento);
        aluno1.setRegistroGeral(registroGeral);
        aluno1.setNumeroCpf(cpf);
        aluno1.setNomeMae(nomeMae);
        aluno1.setNomePai(nomePai);
        aluno1.setDataMatricula(dataMatricula);
        aluno1.setSerieMatriculado(serieMatriculado);
        aluno1.setNomeEscola(nomeEscola);

        for (int posicao = 1; posicao <= 4; posicao++) {
            String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina " + posicao + ": ");
            String notaDisciplina = JOptionPane.showInputDialog("Digite a nota " + posicao + ": ");

            Disciplina disciplina = new Disciplina();
            disciplina.setDisciplina(nomeDisciplina);
            disciplina.setNota(Double.valueOf(notaDisciplina));

            aluno1.getDisciplinas().add(disciplina);
        }

        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Data de Nascimento: " + aluno1.getDataNascimento());
        System.out.println("Idade: " + aluno1.getIdade());
        System.out.println("Nº da identidade: " + aluno1.getRegistroGeral());
        System.out.println("CPF: " + aluno1.getNumeroCpf());
        System.out.println("Nome da mãe: " + aluno1.getNomeMae());
        System.out.println("Nome do pai: " + aluno1.getNomePai());
        System.out.println("Data da matrícula: " + aluno1.getDataMatricula());
        System.out.println("Série matriculado: " + aluno1.getSerieMatriculado());
        System.out.println("Colégio: " + aluno1.getNomeEscola());
        System.out.printf("Média do aluno: %.2f\n", aluno1.getMediaNota());
        System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
        System.out.println("Resultado: " + aluno1.getAlunoAprovado2());

        System.out.println(aluno1.toString()); // Descrição do objeto na memória.
        System.out.println("Média do aluno: " + aluno1.getMediaNota());
        System.out.println("Resultado: " + aluno1.getAlunoAprovado2());

        /*
         * 
         * // EQUALS e HASHCODE (Diferenciar e comparar objetos)
         * 
         * Aluno aluno1 = new Aluno();
         * aluno1.setNome("Rodrigo");
         * 
         * Aluno aluno2 = new Aluno();
         * aluno2.setNome("Rodrigo");
         * 
         * if (aluno1.equals(aluno2)) {
         * System.out.println("Alunos são iguais.");
         * }else {
         * System.out.println("Alunos não são iguais.");
         * }
         */

    }
}
