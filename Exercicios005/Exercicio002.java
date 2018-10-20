import java.util.Scanner;

public class Exercicio002 {

	public static void main(String[] args) {
		Scanner teclado =  new Scanner(System.in);
		double[] notas = new double[10];
		double media = 0;	
		for(int x = 0 ; x < notas.length;x++){
			System.out.println("Informe a nota");
			notas[x] = Double.parseDouble(teclado.nextLine());
			media += notas[x];
		}
		System.out.printf("Média: %f \n",(media / 10));
		System.out.println("Notas igual ou a cima da média");
		for(int x = 0 ; x < notas.length;x++){
			if(notas[x] >=  (media / 10)){
				System.out.println(notas[x]);
			}
		}
		teclado.close();
	}

}
