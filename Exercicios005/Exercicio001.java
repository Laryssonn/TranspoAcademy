import java.util.Scanner;

public class Exercicio001 {

	public static void main(String[] args) {
		Scanner teclado =  new Scanner(System.in);
		double[] notas = new double[10];int indiceMaior = 0,indiceMenor = 0;
		String[] alunos = new String[10];
		
		for(int x = 0;x < notas.length;x++){
			System.out.println("Informe o nome do Aluno");
			alunos[x] = teclado.nextLine();
			System.out.println("Informe a nota do Aluno");
			notas[x] = Double.parseDouble(teclado.nextLine());
			
			if(x == 0 || notas[x] < notas[indiceMenor]){
				indiceMenor = x;
			}
			if(x == 0 || notas[x] > notas[indiceMaior]){
				indiceMaior = x;
			}
		}
		System.out.println("*******************************************");
		System.out.println("Aluno com a maior nota");
		System.out.printf("Aluno: %s \n",alunos[indiceMaior]);
		System.out.printf("Nota: %.2f \n",notas[indiceMaior]);
		System.out.println("*******************************************");
		System.out.println("Aluno com a menor nota");
		System.out.printf("Aluno: %s \n",alunos[indiceMenor]);
		System.out.printf("Nota: %.2f",notas[indiceMenor]);
				
		teclado.close();

	}

}
