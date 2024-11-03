package cursoJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursoJava.classes.Aluno;
import cursoJava.classes.Disciplina;
import cursoJava.constantes.StatusAluno;

public class PrimeiraClasseJava {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();
		
		// HashMap é uma lista que dentro dela temos uma chave que identifica uma sequência de valores também.
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

		for (int qtd = 1; qtd <= 5; qtd++) {

			/*
			 * - new Aluno() é uma INSTÂNCIA (Criação de OBJETO) - aluno1 é uma referência
			 * para o OBJETO aluno
			 */

			String nome = JOptionPane.showInputDialog("Digite o nome do aluno " + qtd + ":");
			/*
			String idade = JOptionPane.showInputDialog("Digite a sua idade:");
			String dataNascimento = JOptionPane.showInputDialog("Digite sua data de nascimento: ");
			String registroGeral = JOptionPane.showInputDialog("Digite o número de sua identidade: ");
			String cpf = JOptionPane.showInputDialog("Digite o número do seu CPF: ");
			String nomeMae = JOptionPane.showInputDialog("Digite o nome de sua mãe: ");
			String nomePai = JOptionPane.showInputDialog("Digite o nome de seu pai: ");
			String dataMatricula = JOptionPane.showInputDialog("Digite a data de sua matrícula: ");
			String serieMatriculado = JOptionPane
					.showInputDialog("Digite a série em que o aluno(a) está matriculado: ");
			String nomeEscola = JOptionPane.showInputDialog("Digite o nome da escola: ");
			*/

			Aluno aluno1 = new Aluno(); // Aqui será o João

			aluno1.setNome(nome);
			/*
			aluno1.setIdade(Integer.valueOf(idade));
			aluno1.setDataNascimento(dataNascimento);
			aluno1.setRegistroGeral(registroGeral);
			aluno1.setNumeroCpf(cpf);
			aluno1.setNomeMae(nomeMae);
			aluno1.setNomePai(nomePai);
			aluno1.setDataMatricula(dataMatricula);
			aluno1.setSerieMatriculado(serieMatriculado);
			aluno1.setNomeEscola(nomeEscola);
			*/

			for (int posicao = 1; posicao <= 1; posicao++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina " + posicao + ": ");
				String notaDisciplina = JOptionPane.showInputDialog("Digite a nota " + posicao + ": ");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

			if (escolha == 0) { // A opção SIM é igual a zero

				int continuarRemover = 0;
				int posicao = 1;

				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
				}

			}

			alunos.add(aluno1);
		}
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

		for (Aluno aluno : alunos) {
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			}else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			}else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)){
				maps.get(StatusAluno.REPROVADO).add(aluno);
			}
		}
		
		System.out.println("----------------- Lista dos Aprovados -----------------");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("Nome do aluno: " + aluno.getNome());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
		}
		
		System.out.println("----------------- Lista dos Reprovados -----------------");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Nome do aluno: " + aluno.getNome());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
		}
		
		System.out.println("----------------- Lista de Recuperação -----------------");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Nome do aluno: " + aluno.getNome());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
		}

	}
}
