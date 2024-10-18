package cursoJava;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursoJava.classes.Aluno;
import cursoJava.classes.Disciplina;

public class PrimeiraClasseJava {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 2; qtd++) {

			/*
			 * - new Aluno() é uma INSTÂNCIA (Criação de OBJETO) - aluno1 é uma referência
			 * para o OBJETO aluno
			 */

			String nome = JOptionPane.showInputDialog("Digite o nome do aluno " + qtd + ":");
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

			for (int posicao = 1; posicao <= 3; posicao++) {
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

		for (Aluno aluno : alunos) {

			// (aluno.percorraLista().quandoNomeFor("Rodrigo")
			if (aluno.getNome().equalsIgnoreCase("Rodrigo")) {
				alunos.remove(aluno);
				break; // Pare
			} else {
				System.out.println(aluno); // Descrição do objeto na memória
				System.out.println("Média do aluno: " + aluno.getMediaNota());
				System.out.println("Resultado: " + aluno.getAlunoAprovado2());
				System.out.println("----------------------------------------------------------------------------");
			}

			/*
			 * System.out.println("Nome: " + aluno.getNome());
			 * System.out.println("Data de Nascimento: " + aluno.getDataNascimento());
			 * System.out.println("Idade: " + aluno.getIdade());
			 * System.out.println("Nº da identidade: " + aluno.getRegistroGeral());
			 * System.out.println("CPF: " + aluno.getNumeroCpf());
			 * System.out.println("Nome da mãe: " + aluno.getNomeMae());
			 * System.out.println("Nome do pai: " + aluno.getNomePai());
			 * System.out.println("Data da matrícula: " + aluno.getDataMatricula());
			 * System.out.println("Série matriculado: " + aluno.getSerieMatriculado());
			 * System.out.println("Colégio: " + aluno.getNomeEscola());
			 * System.out.printf("Média do aluno: %.2f\n", aluno.getMediaNota());
			 * System.out.println("Resultado: " + (aluno.getAlunoAprovado() ? "Aprovado" :
			 * "Reprovado")); System.out.println("Resultado: " + aluno.getAlunoAprovado2());
			 * 
			 * System.out.println(aluno.toString()); // Descrição do objeto na memória.
			 * System.out.println("Média do aluno: " + aluno.getMediaNota());
			 * System.out.println("Resultado: " + aluno.getAlunoAprovado2());
			 */

		}

		for (Aluno aluno : alunos) {
			System.out.println("Alunos que sobraram na lista:");
			System.out.println(aluno.getNome());
			System.out.println("Suas disciplinas são: ");

			for (Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println(disciplina.getDisciplina());
			}
		}

		/*
		 *
		 * // EQUALS e HASHCODE (Diferenciar e comparar objetos)
		 *
		 * Aluno aluno1 = new Aluno(); aluno1.setNome("Rodrigo");
		 *
		 * Aluno aluno2 = new Aluno(); aluno2.setNome("Rodrigo");
		 *
		 * if (aluno1.equals(aluno2)) { System.out.println("Alunos são iguais."); }else
		 * { System.out.println("Alunos não são iguais."); }
		 */

	}
}
